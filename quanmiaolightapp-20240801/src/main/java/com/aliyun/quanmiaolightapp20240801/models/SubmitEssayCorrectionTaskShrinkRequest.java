// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEssayCorrectionTaskShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>高中二年级</p>
     */
    @NameInMap("grade")
    public String grade;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
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
     * <p>xxx</p>
     */
    @NameInMap("question")
    public String question;

    /**
     * <strong>example:</strong>
     * <p>语文</p>
     */
    @NameInMap("subject")
    public String subject;

    @NameInMap("tasks")
    public String tasksShrink;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("totalScore")
    public Integer totalScore;

    public static SubmitEssayCorrectionTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEssayCorrectionTaskShrinkRequest self = new SubmitEssayCorrectionTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEssayCorrectionTaskShrinkRequest setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public SubmitEssayCorrectionTaskShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitEssayCorrectionTaskShrinkRequest setOtherReviewPoints(String otherReviewPoints) {
        this.otherReviewPoints = otherReviewPoints;
        return this;
    }
    public String getOtherReviewPoints() {
        return this.otherReviewPoints;
    }

    public SubmitEssayCorrectionTaskShrinkRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public SubmitEssayCorrectionTaskShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SubmitEssayCorrectionTaskShrinkRequest setTasksShrink(String tasksShrink) {
        this.tasksShrink = tasksShrink;
        return this;
    }
    public String getTasksShrink() {
        return this.tasksShrink;
    }

    public SubmitEssayCorrectionTaskShrinkRequest setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
        return this;
    }
    public Integer getTotalScore() {
        return this.totalScore;
    }

}
