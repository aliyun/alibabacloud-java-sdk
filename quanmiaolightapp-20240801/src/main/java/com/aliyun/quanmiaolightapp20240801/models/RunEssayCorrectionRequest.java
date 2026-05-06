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

    /**
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;内容完整度&quot;, &quot;rubric&quot;: &quot;文章内容是否完整，是否涵盖了题目的核心要求&quot;, &quot;maxScore&quot;: 30}]</p>
     */
    @NameInMap("dimensions")
    public java.util.List<RunEssayCorrectionRequestDimensions> dimensions;

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

    public RunEssayCorrectionRequest setDimensions(java.util.List<RunEssayCorrectionRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<RunEssayCorrectionRequestDimensions> getDimensions() {
        return this.dimensions;
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

    public static class RunEssayCorrectionRequestDimensions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("maxScore")
        public Integer maxScore;

        /**
         * <strong>example:</strong>
         * <p>内容完整度</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>文章内容是否完整，是否涵盖了题目的核心要求</p>
         */
        @NameInMap("rubric")
        public String rubric;

        public static RunEssayCorrectionRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            RunEssayCorrectionRequestDimensions self = new RunEssayCorrectionRequestDimensions();
            return TeaModel.build(map, self);
        }

        public RunEssayCorrectionRequestDimensions setMaxScore(Integer maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public Integer getMaxScore() {
            return this.maxScore;
        }

        public RunEssayCorrectionRequestDimensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunEssayCorrectionRequestDimensions setRubric(String rubric) {
            this.rubric = rubric;
            return this;
        }
        public String getRubric() {
            return this.rubric;
        }

    }

}
