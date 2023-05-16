package com.mycompany.car.center.data;

import com.mycompany.car.center.domain.Funcionario;
import com.mycompany.car.center.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {

    private static final String GET_FUNCIONARIOS = "SELECT * FROM funcionarios";

    private static final String CREATE_FUNCIONARIOS = "INSERT INTO funcionarios "
            + "(tipo_identificacion, numero_identificacion, nombre, apellido, estado_civil, sexo, direccion, telefono, fecha_nacimiento) "
            + "VALUES "
            + "(? ,? ,? ,? ,? ,? ,? ,? ,? )";

    private static final String GET_FUNCIONARIO_BY_ID = "SELECT * FROM funcionarios WHERE id = ? ";

    private static final String UPDATE_CAR = "UPDATE funcionario SET "
            + "tipo_identificacion = ?,"
            + "numero_identificacion = ?,"
            + "nombre = ?,"
            + "apellido = ?,"
            + "estado_civil = ?,"
            + "sexo = ?,"
            + "direccion = ?,"
            + "telefono = ?,"
            + "fecha_nacimiento =? "
            + "WHERE id = ?";

    private static final String DETELE_CAR = "DELETE FROM funcionarios WHERE id = ? ";

    public List<Funcionario> obtenerFuncionarios() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIOS);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setId(resultSet.getInt("id"));
                funcionario.setTipo_identificacion(resultSet.getString("tipo_identificacion"));
                funcionario.setNumero_identificacion(resultSet.getString("numero_identificacion"));
                funcionario.setNombre(resultSet.getString("nombre"));
                funcionario.setApellido(resultSet.getString("apellido"));
                funcionario.setEstado_civil(resultSet.getString("estado_civil"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getString("telefono"));
                funcionario.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
                funcionarios.add(funcionario);

            }

            return funcionarios;
        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();

            }

            if (resultSet != null) {
                resultSet.close();
            }
        }

    }

    public void crear(Funcionario funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(CREATE_FUNCIONARIOS);
            preparedStatement.setString(1, funcionario.getTipo_identificacion());
            preparedStatement.setString(2, funcionario.getNumero_identificacion());
            preparedStatement.setString(3, funcionario.getNombre());
            preparedStatement.setString(4, funcionario.getApellido());
            preparedStatement.setString(5, funcionario.getEstado_civil());
            preparedStatement.setString(6, funcionario.getSexo());
            preparedStatement.setString(7, funcionario.getDireccion());
            preparedStatement.setString(8, funcionario.getTelefono());
            preparedStatement.setDate(9, funcionario.getFecha_nacimiento());
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();

            }

        }

    }

    public Funcionario obtenerFuncionario(int id) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Funcionario funcionario = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO_BY_ID);

            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                funcionario = new Funcionario();
                funcionario.setId(resultSet.getInt("id"));
                funcionario.setTipo_identificacion(resultSet.getString("tipo_identificacion"));
                funcionario.setNumero_identificacion(resultSet.getString("numero_identificacion"));
                funcionario.setNombre(resultSet.getString("nombre"));
                funcionario.setApellido(resultSet.getString("apellido"));
                funcionario.setEstado_civil(resultSet.getString("estado_civil"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getString("telefono"));
                funcionario.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
            }

            return funcionario;

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();

            }

            if (resultSet != null) {
                resultSet.close();
            }
        }

    }

    public void actualizarFuncionario(int id, Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_CAR);
            preparedStatement.setString(1, funcionario.getTipo_identificacion());
            preparedStatement.setString(2, funcionario.getNumero_identificacion());
            preparedStatement.setString(3, funcionario.getNombre());
            preparedStatement.setString(4, funcionario.getApellido());
            preparedStatement.setString(5, funcionario.getEstado_civil());
            preparedStatement.setString(6, funcionario.getSexo());
            preparedStatement.setString(7, funcionario.getDireccion());
            preparedStatement.setString(8, funcionario.getTelefono());
            preparedStatement.setDate(9, funcionario.getFecha_nacimiento());
            preparedStatement.setInt(10, id);
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();

            }
        }

    }

    public void eliminarFuncionario(int id) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DETELE_CAR);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();

            }
        }

    }

}
