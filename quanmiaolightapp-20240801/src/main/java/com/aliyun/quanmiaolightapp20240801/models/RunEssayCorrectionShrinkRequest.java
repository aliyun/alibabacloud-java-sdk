// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunEssayCorrectionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("answer")
    public String answer;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;内容完整度&quot;, &quot;rubric&quot;: &quot;文章内容是否完整，是否涵盖了题目的核心要求&quot;, &quot;maxScore&quot;: 30}]</p>
     */
    @NameInMap("dimensions")
    public String dimensionsShrink;

    /**
     * <strong>example:</strong>
     * <p>高一</p>
     */
    @NameInMap("grade")
    public String grade;

    /**
     * <strong>example:</strong>
     * <p>qwen-custom-correction-v1</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>语文</p>
     */
    @NameInMap("subject")
    public String subject;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("totalScore")
    public Integer totalScore;

    public static RunEssayCorrectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunEssayCorrectionShrinkRequest self = new RunEssayCorrectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunEssayCorrectionShrinkRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public RunEssayCorrectionShrinkRequest setDimensionsShrink(String dimensionsShrink) {
        this.dimensionsShrink = dimensionsShrink;
        return this;
    }
    public String getDimensionsShrink() {
        return this.dimensionsShrink;
    }

    public RunEssayCorrectionShrinkRequest setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public RunEssayCorrectionShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunEssayCorrectionShrinkRequest setOtherReviewPoints(String otherReviewPoints) {
        this.otherReviewPoints = otherReviewPoints;
        return this;
    }
    public String getOtherReviewPoints() {
        return this.otherReviewPoints;
    }

    public RunEssayCorrectionShrinkRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public RunEssayCorrectionShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public RunEssayCorrectionShrinkRequest setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
        return this;
    }
    public Integer getTotalScore() {
        return this.totalScore;
    }

}
