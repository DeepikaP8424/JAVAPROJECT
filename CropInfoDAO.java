package com.agri.AGRIBOT;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CropInfoDAO {

    public String getAnswer(String userQuery) {
        String[] words = userQuery.toLowerCase().split("\\s+"); // split query into words

        String sql = "SELECT answer FROM crop_info WHERE LOWER(question_pattern) LIKE ? LIMIT 1";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            for (String word : words) {
                ps.setString(1, "%" + word + "%"); // match any word
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    return rs.getString("answer");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Sorry, I don't know the answer to that.";
    }
}
