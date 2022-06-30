package com.example.springbatchpractice;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

// @Component를 사용해 bean으로 등록 후 사용해도 된다.
public class CustomTasklet implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("CustomTasklet : step2 was executed");

        return RepeatStatus.FINISHED;
    }
}
