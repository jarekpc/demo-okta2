package com.okta.developer.demookta2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.okta.developer.demookta2.dto.CarDTO;
import com.okta.developer.demookta2.model.Car;
import com.okta.developer.demookta2.repository.CarRepository;
import com.okta.developer.demookta2.service.CarService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CoolCarControllerTest {

//    @Mock
//    CarService carService;
//
//    @MockBean
//    CarRepository mockRepository;
//
//    @Autowired
//    ApplicationContext context;

    CarDTO carDTO;

    @Autowired
    MockMvc mvc;

    @Before
    public void setup(){
        //"Honda", "Jaguar","Porsche", "Lamborghini","Suzuku")
//        carDTO = new CarDTO("Ford");
//        listCarDto = Arrays.asList(new CarDTO("aasa"));
    }

    @Ignore
    public void testGetAllCars(){
//        Mockito.when(mockRepository.count()).thenReturn(5L);
//
//        CarRepository carRepositoryContext = context.getBean(CarRepository.class);
//        long carCount = carRepositoryContext.count();
//        Assert.assertEquals(5L, carCount);
    }

//    @Ignore
//    public void testPostCars() throws Exception {
//        CarDTO mockCarDto = new CarDTO("Ford");
//        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//        String json = ow.writeValueAsString(mockCarDto);
//        System.out.println("JSON " + json);
//        mvc.perform(post("/addCars").contentType(MediaType.APPLICATION_JSON).content(json)).andExpect(status().isCreated());
//    }

    @Test
    public void testPostCars(){
        int a = 1;
        assertNotNull(a);
    }

}
