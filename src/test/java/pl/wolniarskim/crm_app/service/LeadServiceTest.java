package pl.wolniarskim.crm_app.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.wolniarskim.crm_app.model.Lead;
import pl.wolniarskim.crm_app.model.dto.read.LeadReadModel;
import pl.wolniarskim.crm_app.repository.LeadRepository;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LeadServiceTest {

    private LeadService leadService;

    void shouldThrowExceptionWhenThereIsNoLeadWithGivenIdWhileGettingById(){

    }
}