-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-12-2025 a las 00:33:10
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
-- Base de datos: `telep_app_jdbc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_campanias`
--

CREATE TABLE `cat_campanias` (
  `id_campania` int(11) NOT NULL,
  `nombre_campania` varchar(100) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT 1,
  `orden` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cat_campanias`
--

INSERT INTO `cat_campanias` (`id_campania`, `nombre_campania`, `descripcion`, `activo`, `orden`) VALUES
(1, 'Nexus Prime Solutions', 'Consultoría Estratégica', 1, 0),
(2, 'AlphaStream Digital', 'Tecnología y Software', 1, 0),
(3, 'Marea Gráfica Estudio', 'Diseño y Creatividad', 1, 0),
(4, 'Vértice Capital Group', 'Finanzas / Inversión', 1, 0),
(5, 'Impulso 360 Agency', 'Marketing Digital', 1, 0),
(8, 'Ruta Cero Express', 'Logística y Distribución', 1, 0),
(9, 'Armonía Integral Center', 'Servicios de Bienestar', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_causas_repeticion`
--

CREATE TABLE `cat_causas_repeticion` (
  `id_causa` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `activo` tinyint(1) DEFAULT 1,
  `orden` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cat_causas_repeticion`
--

INSERT INTO `cat_causas_repeticion` (`id_causa`, `descripcion`, `activo`, `orden`) VALUES
(1, 'Problemas logisticos', 1, 0),
(2, 'Daño del equipo', 1, 0),
(3, 'Usuario requiere otro equipo', 1, 0),
(4, 'Cambio de campaña', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_discos`
--

CREATE TABLE `cat_discos` (
  `id_disco` int(11) NOT NULL,
  `Disco_GB` varchar(255) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT 1,
  `orden` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cat_discos`
--

INSERT INTO `cat_discos` (`id_disco`, `Disco_GB`, `descripcion`, `activo`, `orden`) VALUES
(1, '120_GB', '120_GB', 1, 0),
(2, '250_GB', '250_GB', 1, 0),
(3, '500_GB', '500_GB', 1, 0),
(4, '1_TB', '1_TB', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_modelos`
--

CREATE TABLE `cat_modelos` (
  `id_modelo` int(11) NOT NULL,
  `nombre_modelo` varchar(100) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT 1,
  `orden` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cat_modelos`
--

INSERT INTO `cat_modelos` (`id_modelo`, `nombre_modelo`, `descripcion`, `activo`, `orden`) VALUES
(1, 'ThinkPad X1', 'Carbon, Yoga, Nano', 1, 0),
(2, 'ThinkPad X1', 'Carbon, Yoga, Nano', 1, 0),
(3, 'ThinkPad P', 'Workstations', 1, 0),
(4, 'Legion Pro', 'Pro 5i/5, Pro 7i/7', 1, 0),
(5, 'ThinkCentre Serie M', 'Tower, Small Form Factor, Tiny, Nano, All-in-One', 1, 0),
(6, 'ThinkCentre Neo', 'Small Form Factor, All-in-One', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_procesadores`
--

CREATE TABLE `cat_procesadores` (
  `id_procesador` int(11) NOT NULL,
  `nombre_procesador` varchar(100) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT 1,
  `orden` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cat_procesadores`
--

INSERT INTO `cat_procesadores` (`id_procesador`, `nombre_procesador`, `descripcion`, `activo`, `orden`) VALUES
(1, 'Intel Core i5-14400F / 13400F', 'Gama Media / Consumo', 1, 0),
(2, 'AMD Ryzen 5 7600 / 7600X', 'Gama Media / Gaming', 1, 0),
(3, 'AMD Ryzen 7 7800X3D', 'Gaming de Alto Rendimiento', 1, 0),
(4, 'Intel Core i7-14700K / 13700K', 'Gama Alta / Multitarea', 1, 0),
(5, 'AMD Ryzen 5 5600 / 5600X', 'Gama Media Antigua (AM4)', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_ram`
--

CREATE TABLE `cat_ram` (
  `id_ram` int(11) NOT NULL,
  `nombre_ram` varchar(50) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT 1,
  `orden` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cat_ram`
--

INSERT INTO `cat_ram` (`id_ram`, `nombre_ram`, `descripcion`, `activo`, `orden`) VALUES
(1, '8 GB', 'Entrada y Ofimática', 1, 0),
(2, '12 GB', 'Entrada y Ofimática', 1, 0),
(3, '16 GB', 'El Nuevo Estándar', 1, 0),
(4, '32 GB', 'Punto Dulce para Avanzados', 1, 0),
(5, '64 GB', 'Profesional Extremo', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_tipos_contrasena`
--

CREATE TABLE `cat_tipos_contrasena` (
  `id_tipo_contrasena` int(11) NOT NULL,
  `nombre_tipo_contrasena` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT 1,
  `orden` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cat_tipos_contrasena`
--

INSERT INTO `cat_tipos_contrasena` (`id_tipo_contrasena`, `nombre_tipo_contrasena`, `descripcion`, `activo`, `orden`) VALUES
(1, 'Generica_0', 'Generica_0', 1, 1),
(2, 'Generica_1', 'Revisar archivo de contraseñas', 1, 0),
(3, 'Generica_2', 'Revisar archivo de contraseñas', 1, 0),
(4, 'Generica_3', 'Revisar archivo de contraseñas', 1, 0),
(5, 'Generica_4', 'Revisar archivo de contraseñas', 1, 0),
(6, 'Personalizada', 'Revisar archivo de contraseñas', 1, 0),
(7, 'N/A', 'Cuando no aplica', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros_analistas`
--

CREATE TABLE `registros_analistas` (
  `id_registro` int(11) NOT NULL,
  `id_usuario_final` int(11) NOT NULL,
  `analista_configuracion_id` int(11) NOT NULL,
  `analista_calidad_id` int(11) DEFAULT NULL,
  `id_modelo` int(11) DEFAULT NULL,
  `id_ram` int(11) DEFAULT NULL,
  `id_procesador` int(11) DEFAULT NULL,
  `id_disco` int(11) DEFAULT NULL,
  `tipo_disco` enum('HDD','SSD','N/A') DEFAULT 'N/A',
  `dual_monitor` enum('SI','NO','N/A') DEFAULT 'N/A',
  `foto` enum('SI','NO','N/A') DEFAULT 'N/A',
  `id_activo` varchar(50) DEFAULT NULL,
  `serial` varchar(50) DEFAULT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date DEFAULT NULL,
  `estado_registro` enum('pendiente','revisado','aprobado','rechazado') DEFAULT 'pendiente',
  `causa_repeticion_id` int(11) DEFAULT NULL,
  `justificacion_repeticion` text DEFAULT NULL,
  `imagen_path` varchar(255) DEFAULT NULL,
  `creado_en` timestamp NOT NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `id_rol` int(11) NOT NULL,
  `nombre_rol` varchar(50) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id_rol`, `nombre_rol`, `descripcion`) VALUES
(1, 'Administrador', 'Usuario con todos los permisos del sistema'),
(2, 'Analista_calidad', 'Analista que realizara y garantizara la calidad  de la confuguracion en los equipos. Perfil usuario norna.'),
(3, 'Analista_configuracion', 'Analista que realizara la configuracion  de los equipos. Perfil usuario norna.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `rol_id` int(11) NOT NULL,
  `activo` tinyint(1) DEFAULT 1,
  `creado_en` timestamp NOT NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre_usuario`, `correo`, `password`, `rol_id`, `activo`, `creado_en`, `actualizado_en`) VALUES
(2, 'Admin', 'Admin@pruebas.com', '$2y$10$rlYJSiFt4.yWXTkhDZPJP.za0J9jPSaAoegCY0Nkv6p.saZeTIqMa', 1, 1, '2025-11-03 18:31:44', '2025-11-03 23:03:01'),
(4, 'julio', 'julio@example.com', '$2y$10$rlYJSiFt4.yWXTkhDZPJP.za0J9jPSaAoegCY0Nkv6p.saZeTIqMa', 1, 1, '2025-11-03 22:46:35', '2025-11-03 23:03:01'),
(5, 'PRUEBA_2', 'PRUEBA_2@PRUEBA2.COM', '$2y$10$cGuHknQPWixx0AoBzDNaLuA60pALuKuwasd1EYmSoZ.3MkbsrLAfe', 2, 1, '2025-11-04 00:21:39', '2025-11-04 00:21:39'),
(6, 'PRUEBA_3', 'PRUEBA_3@PRUEBA3.COM', '$2y$10$cGuHknQPWixx0AoBzDNaLuA60pALuKuwasd1EYmSoZ.3MkbsrLAfe', 3, 1, '2025-11-04 00:21:39', '2025-11-04 00:21:39'),
(7, 'PRUEBA_4', 'PRUEBA_4@PRUEBA4.COM', '$2y$10$cGuHknQPWixx0AoBzDNaLuA60pALuKuwasd1EYmSoZ.3MkbsrLAfe', 2, 1, '2025-11-04 00:21:39', '2025-11-04 00:21:39');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_final`
--

CREATE TABLE `usuario_final` (
  `id_usuario_final` int(11) NOT NULL,
  `nombre_usuario` varchar(100) NOT NULL,
  `usuario_red` varchar(100) NOT NULL,
  `cedula` bigint(20) NOT NULL,
  `tipo_contrasena_id` int(11) NOT NULL,
  `extension_tel` varchar(20) NOT NULL,
  `estado` enum('OK','EXPIRADO','DESHABILITADO','PENDIENTE','N/A') DEFAULT 'PENDIENTE',
  `campania_id` int(11) DEFAULT NULL,
  `creado_en` timestamp NOT NULL DEFAULT current_timestamp(),
  `actualizado_en` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario_final`
--

INSERT INTO `usuario_final` (`id_usuario_final`, `nombre_usuario`, `usuario_red`, `cedula`, `tipo_contrasena_id`, `extension_tel`, `estado`, `campania_id`, `creado_en`, `actualizado_en`) VALUES
(7, 'Juan Pérez', 'jperez', 123456789, 1, '3012', 'PENDIENTE', NULL, '2025-12-07 03:54:29', '2025-12-07 03:54:29');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cat_campanias`
--
ALTER TABLE `cat_campanias`
  ADD PRIMARY KEY (`id_campania`);

--
-- Indices de la tabla `cat_causas_repeticion`
--
ALTER TABLE `cat_causas_repeticion`
  ADD PRIMARY KEY (`id_causa`);

--
-- Indices de la tabla `cat_discos`
--
ALTER TABLE `cat_discos`
  ADD PRIMARY KEY (`id_disco`);

--
-- Indices de la tabla `cat_modelos`
--
ALTER TABLE `cat_modelos`
  ADD PRIMARY KEY (`id_modelo`);

--
-- Indices de la tabla `cat_procesadores`
--
ALTER TABLE `cat_procesadores`
  ADD PRIMARY KEY (`id_procesador`);

--
-- Indices de la tabla `cat_ram`
--
ALTER TABLE `cat_ram`
  ADD PRIMARY KEY (`id_ram`);

--
-- Indices de la tabla `cat_tipos_contrasena`
--
ALTER TABLE `cat_tipos_contrasena`
  ADD PRIMARY KEY (`id_tipo_contrasena`);

--
-- Indices de la tabla `registros_analistas`
--
ALTER TABLE `registros_analistas`
  ADD PRIMARY KEY (`id_registro`),
  ADD KEY `fk_registro_usuario_final` (`id_usuario_final`),
  ADD KEY `fk_registro_analista_conf` (`analista_configuracion_id`),
  ADD KEY `fk_registro_analista_cal` (`analista_calidad_id`),
  ADD KEY `fk_registro_modelo` (`id_modelo`),
  ADD KEY `fk_registro_ram` (`id_ram`),
  ADD KEY `fk_registro_procesador` (`id_procesador`),
  ADD KEY `fk_registro_disco` (`id_disco`),
  ADD KEY `fk_registro_causa` (`causa_repeticion_id`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `correo` (`correo`),
  ADD KEY `fk_usuarios_roles` (`rol_id`);

--
-- Indices de la tabla `usuario_final`
--
ALTER TABLE `usuario_final`
  ADD PRIMARY KEY (`id_usuario_final`),
  ADD KEY `fk_usuario_tipo_contrasena` (`tipo_contrasena_id`),
  ADD KEY `fk_usuario_campania` (`campania_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cat_campanias`
--
ALTER TABLE `cat_campanias`
  MODIFY `id_campania` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `cat_causas_repeticion`
--
ALTER TABLE `cat_causas_repeticion`
  MODIFY `id_causa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `cat_discos`
--
ALTER TABLE `cat_discos`
  MODIFY `id_disco` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `cat_modelos`
--
ALTER TABLE `cat_modelos`
  MODIFY `id_modelo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `cat_procesadores`
--
ALTER TABLE `cat_procesadores`
  MODIFY `id_procesador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cat_ram`
--
ALTER TABLE `cat_ram`
  MODIFY `id_ram` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cat_tipos_contrasena`
--
ALTER TABLE `cat_tipos_contrasena`
  MODIFY `id_tipo_contrasena` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `registros_analistas`
--
ALTER TABLE `registros_analistas`
  MODIFY `id_registro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `usuario_final`
--
ALTER TABLE `usuario_final`
  MODIFY `id_usuario_final` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `registros_analistas`
--
ALTER TABLE `registros_analistas`
  ADD CONSTRAINT `fk_registro_analista_cal` FOREIGN KEY (`analista_calidad_id`) REFERENCES `usuarios` (`id_usuario`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_registro_analista_conf` FOREIGN KEY (`analista_configuracion_id`) REFERENCES `usuarios` (`id_usuario`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_registro_causa` FOREIGN KEY (`causa_repeticion_id`) REFERENCES `cat_causas_repeticion` (`id_causa`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_registro_disco` FOREIGN KEY (`id_disco`) REFERENCES `cat_discos` (`id_disco`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_registro_modelo` FOREIGN KEY (`id_modelo`) REFERENCES `cat_modelos` (`id_modelo`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_registro_procesador` FOREIGN KEY (`id_procesador`) REFERENCES `cat_procesadores` (`id_procesador`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_registro_ram` FOREIGN KEY (`id_ram`) REFERENCES `cat_ram` (`id_ram`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_registro_usuario_final` FOREIGN KEY (`id_usuario_final`) REFERENCES `usuario_final` (`id_usuario_final`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_usuarios_roles` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`id_rol`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario_final`
--
ALTER TABLE `usuario_final`
  ADD CONSTRAINT `fk_usuario_campania` FOREIGN KEY (`campania_id`) REFERENCES `cat_campanias` (`id_campania`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_usuario_tipo_contrasena` FOREIGN KEY (`tipo_contrasena_id`) REFERENCES `cat_tipos_contrasena` (`id_tipo_contrasena`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
