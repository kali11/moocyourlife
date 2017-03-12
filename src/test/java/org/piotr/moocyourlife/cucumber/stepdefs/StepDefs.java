package org.piotr.moocyourlife.cucumber.stepdefs;

import org.piotr.moocyourlife.MoocyourlifeApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MoocyourlifeApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
