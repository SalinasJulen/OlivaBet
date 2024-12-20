Create database olivabet;
use olivabet;
--
-- Base de datos: `olivabet`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `idEmpelado` int(11) NOT NULL,
  `nombreEmpleado` varchar(120) NOT NULL,
  `cargo` varchar(200) NOT NULL,
  `sueldo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maquinas`
--

CREATE TABLE `maquinas` (
  `idMaquina` int(11) NOT NULL,
  `nombreMaquina` varchar(150) NOT NULL,
  `tematica` varchar(120) NOT NULL,
  `coste` int(11) NOT NULL,
  `saldoMinimo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `maquinas`
--

INSERT INTO `maquinas` (`idMaquina`, `nombreMaquina`, `tematica`, `coste`, `saldoMinimo`) VALUES
(1, 'Slot Frutas', 'Frutas', 350, 350),
(2, 'Slot Animales', 'Animales', 350, 350),
(3, 'Slot Joyas', 'Joyas', 105, 8000),
(4, 'Slot Halloween', 'Halloween', 850, 15000),
(5, 'Slot Navidad', 'Navidad', 850, 15000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(220) NOT NULL,
  `contrasena` text NOT NULL,
  `correoelectronico` text NOT NULL,
  `puntos` int(11) NOT NULL,
  `fecha_Alta` timestamp NOT NULL DEFAULT current_timestamp(),
  `IP_Registro` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `contrasena`, `correoelectronico`, `puntos`, `fecha_Alta`, `IP_Registro`) VALUES
(72, 'Cristiano07', 'f7608826f9018f79799bb6bc20cb1b55', 'siusiu@hotmail.com', 77777, '2024-05-09 15:07:07', '156.67.8.2'),
(73, 'DavyJones23', '321ca6c23928968a61578c4396e23a8c', 'piratilla23@gmail.com', 435, '2024-05-09 15:08:09', '123.98.7.5'),
(74, 'LucasVazquez17', 'e99a1cabb25217e9c1c189081f4e2a0b', 'lucass17@hotmail.com', 6788, '2024-05-09 15:11:28', '181.20.23.3'),
(77, 'TomasShelby1800', '9c95eacbed3d8638597aa7aafc089202', 'shelby1@gmail.com', 9999, '2024-05-09 15:17:31', '127.67.43.9'),
(78, 'SaleguiAlejandro23', '30e24872067cfdd0b3c3365f3c822c57', 'rebollo76@gmail.eus', 3211, '2024-05-09 15:19:58', '124.89.76.4'),
(79, 'Jadjer04', '31db881c9b4628095cbdc3b4d872bfd2', 'aa.oliva@aulanzt.net', 3180, '2024-05-10 06:20:07', '192.168.56.1'),
(110, 'MartinTxo', 'c947eb5b4e82d605968d8ee690e07626', 'martin@hotmail.com', 5000, '2024-05-14 06:24:17', '112.77.64.3'),
(111, 'JoxeMai', 'dbdeabf1bb0fc1f9d80a73e3eb3240bd', 'joxebetimari@gmail.com', 5000, '2024-05-14 06:25:19', '133.33.31.2'),
(112, 'Aaronson', '380cc7f9a5ae29663d849ac0fe4069b1', 'aaronoson@gmail.com', 5000, '2024-05-14 06:26:14', '187.93.10.1'),
(113, 'Fogi99', 'a72c348edfcd38dfeb384b35f4c2a104', 'fogi@gmail.com', 5000, '2024-05-14 06:27:06', '165.55.43.7'),
(114, 'a', '0cc175b9c0f1b6a831c399e269772661', 'a', 5000, '2024-05-14 06:48:49', '::1'),
(115, 'f', '8fa14cdd754f91cc6554c9e71929cce7', 'f', 5000, '2024-05-14 07:28:06', '::1'),
(116, 'd', '8277e0910d750195b448797616e091ad', 'd', 5000, '2024-05-14 07:29:34', '::1'),
(117, 'd', '8277e0910d750195b448797616e091ad', 'd', 5000, '2024-05-14 07:29:35', '::1'),
(118, 'd', '8277e0910d750195b448797616e091ad', 'd', 5000, '2024-05-14 07:29:35', '::1'),
(119, 'drwerw', 'dc189cc59c532e75e957f5dc64f03b82', 'dww', 5000, '2024-05-14 07:30:19', '::1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`idEmpelado`);

--
-- Indices de la tabla `maquinas`
--
ALTER TABLE `maquinas`
  ADD PRIMARY KEY (`idMaquina`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `idEmpelado` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `maquinas`
--
ALTER TABLE `maquinas`
  MODIFY `idMaquina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=120;
COMMIT;

Insert into empleados (`idEmpelado`, `nombreEmpleado`,`cargo`,`sueldo`)
values (1,"Aaron","Trabajador de mantenimineto WEB",1626),
	   (2,"Julen","Trabajador de mantenimineto WEB",2037),
	   (3,"Mario","Programador Júnior",1327),
       (4,"Jon","Atención al cliente",2113),
	   (5,"Iñaki","Trabajador de mantenimineto WEB",1168);
  
  
SELECT*FROM usuarios;
SELECT*FROM empleados;

INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `contrasena`, `correoelectronico`, `puntos`, `fecha_Alta`, `IP_Registro`) VALUES
(135, 'Mane14', 'g7608826f9518f79739bb6bc20cb1a55', 'mane@hotmail.com', 5700, '2024-05-12 15:09:04', '111.61.8.2');
INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `contrasena`, `correoelectronico`, `puntos`, `fecha_Alta`, `IP_Registro`) VALUES
(136, 'Boss21', 'g7608826f9518f72139bl0bc20cb1a55', 'boss@hotmail.com', 6409, '2024-05-14 17:34:54', '118.43.9.6'),
(137, 'Carletto15', 'g7608826s3318f79739bb6bc20cb1j00', 'carlo@gmail.com', 6109, '2024-05-12 19:09:44', '101.78.7.2');
set sql_safe_updates = 0;
UPDATE usuarios
set nombreUsuario = "casinoLoco" where nombreUsuario = "f";
set sql_safe_updates = 1;
UPDATE usuarios
set nombreUsuario = "CasinoLoco" where nombreUsuario = "casinoLoco";
set sql_safe_updates = 1;


-- los nombres que empiezan en minúscula han sido eliminados o reemplazados para que todos los nombres comienzen con mayúscula, lo hemos realizado todo en una única consulta que es la siguente:

-- set sql_safe_updates = 0;
-- delete from usuarios where nomrbeUsuario = ""
-- set sql_safe_updates = 1;