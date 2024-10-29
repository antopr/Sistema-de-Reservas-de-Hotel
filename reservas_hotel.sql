-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2024 a las 02:00:33
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reservas_hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `id` int(11) NOT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `numeroDeHabitacion` varchar(255) DEFAULT NULL,
  `piso` varchar(255) DEFAULT NULL,
  `precio` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajero`
--

CREATE TABLE `pasajero` (
  `id` int(11) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `documento` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pasajero`
--

INSERT INTO `pasajero` (`id`, `apellido`, `ciudad`, `direccion`, `documento`, `email`, `nombre`, `pais`, `telefono`) VALUES
(5, 'Dominguez', 'Buenos Aires', 'Juncal 2356', 4555666, 'carlosD@gmail.com', 'Carlos', 'Argentina', '12546247795'),
(9, 'Garcia', 'Mar del Plata', 'Una Calle Mas 9', 34900345, 'juanag@gmail.com', 'Juana', 'Argentina', '2335797979'),
(13, 'Lopez', 'Mar del Plata', 'Alguna Calle 45', 30900500, 'romilp@gmail.com', 'Romina', 'Argentina', '2236789065');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id` int(11) NOT NULL,
  `fechaDeIngreso` date DEFAULT NULL,
  `fechaDeSalida` date DEFAULT NULL,
  `fechaReserva` date DEFAULT NULL,
  `SENIA` varchar(255) DEFAULT NULL,
  `idPasajero` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservashabitaciones`
--

CREATE TABLE `reservashabitaciones` (
  `habitacionId` int(11) NOT NULL,
  `reservaId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `telefono` (`telefono`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_reserva_idPasajero` (`idPasajero`);

--
-- Indices de la tabla `reservashabitaciones`
--
ALTER TABLE `reservashabitaciones`
  ADD PRIMARY KEY (`habitacionId`,`reservaId`),
  ADD KEY `FK_reservasHabitaciones_reservaId` (`reservaId`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `FK_reserva_idPasajero` FOREIGN KEY (`idPasajero`) REFERENCES `pasajero` (`id`);

--
-- Filtros para la tabla `reservashabitaciones`
--
ALTER TABLE `reservashabitaciones`
  ADD CONSTRAINT `FK_reservasHabitaciones_habitacionId` FOREIGN KEY (`habitacionId`) REFERENCES `habitacion` (`id`),
  ADD CONSTRAINT `FK_reservasHabitaciones_reservaId` FOREIGN KEY (`reservaId`) REFERENCES `reserva` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
