//package com.example.integrationtests.demo
//
//import com.fasterxml.jackson.databind.ObjectMapper
//import org.junit.jupiter.api.Test
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.test.context.ActiveProfiles
//import org.springframework.test.web.servlet.MockMvc
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
//
//
//@SpringBootTest
//@ActiveProfiles("test")
//class DemoApplicationTests {
//
//    @Test
//    fun contextLoads() {
//    }
//
//}
//
//
//@SpringBootTest
//@AutoConfigureMockMvc
//internal class RegisterUseCaseIntegrationTest(
//	private val mockMvc: MockMvc
//) {
//
//    @Test
//    @Throws(Exception::class)
//    fun registrationWorksThroughAllLayers() {
//
//        mockMvc.perform(
//            get("/blah")
//                .contentType("application/json")
//        ).andExpect(status().isOk())
//
//    }
//}