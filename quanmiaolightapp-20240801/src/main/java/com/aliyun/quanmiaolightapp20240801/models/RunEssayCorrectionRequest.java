// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunEssayCorrectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("answer")
    public String answer;

    @NameInMap("grade")
    public String grade;

    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("otherReviewPoints")
    public String otherReviewPoints;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("question")
    public String question;

    @NameInMap("subject")
    public String subject;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("totalScore")
    public Integer totalScore;

    public static RunEssayCorrectionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunEssayCorrectionRequest self = new RunEssayCorrectionRequest();
        return TeaModel.build(map, self);
    }

    public RunEssayCorrectionRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public RunEssayCorrectionRequest setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public RunEssayCorrectionRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunEssayCorrectionRequest setOtherReviewPoints(String otherReviewPoints) {
        this.otherReviewPoints = otherReviewPoints;
        return this;
    }
    public String getOtherReviewPoints() {
        return this.otherReviewPoints;
    }

    public RunEssayCorrectionRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public RunEssayCorrectionRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public RunEssayCorrectionRequest setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
        return this;
    }
    public Integer getTotalScore() {
        return this.totalScore;
    }

}
