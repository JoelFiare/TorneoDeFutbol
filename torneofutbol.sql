-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-12-2023 a las 02:23:52
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torneofutbol`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `titulares` int(11) DEFAULT NULL,
  `suplentes` int(11) DEFAULT NULL,
  `directorTecnico` varchar(100) DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  `partidosJugados` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`id`, `nombre`, `titulares`, `suplentes`, `directorTecnico`, `puntos`, `partidosJugados`) VALUES
(1, 'Boca Juniors', 11, 7, 'Miguel Ángel Russo', 0, 0),
(2, 'River Plate', 11, 7, 'Marcelo Gallardo', 0, 0),
(3, 'Independiente', 11, 7, 'Julio César Falcioni', 0, 0),
(4, 'Racing Club', 11, 7, 'Juan Antonio Pizzi', 0, 0),
(5, 'San Lorenzo', 11, 7, 'Juan Antonio Pizzi', 0, 0),
(6, 'Vélez Sarsfield', 11, 7, 'Mauricio Pellegrino', 0, 0),
(7, 'Estudiantes de La Plata', 11, 7, 'Ricardo Zielinski', 0, 0),
(8, 'Huracán', 11, 7, 'Israel Damonte', 0, 0),
(9, 'Argentinos Juniors', 11, 7, 'Gabriel Milito', 0, 0),
(10, 'Newell\'s Old Boys', 11, 7, 'Frank Kudelka', 0, 0),

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipos`
--
ALTER TABLE `equipos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
