// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEssayCorrectionTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;内容完整度&quot;, &quot;rubric&quot;: &quot;文章内容是否完整，是否涵盖了题目的核心要求&quot;, &quot;maxScore&quot;: 30}]</p>
     */
    @NameInMap("dimensions")
    public java.util.List<SubmitEssayCorrectionTaskRequestDimensions> dimensions;

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

    /**
     * <strong>example:</strong>
     * <p>[{&quot;grade&quot;: &quot;高中二年级&quot;, &quot;subject&quot;: &quot;语文&quot;, &quot;totalScore&quot;: 60, &quot;question&quot;: &quot;请以我的梦想为主题写一篇作文&quot;, &quot;answer&quot;: &quot;我的梦想是成为一名科学家...&quot;, &quot;customId&quot;: &quot;task-001&quot;}]</p>
     */
    @NameInMap("tasks")
    public java.util.List<SubmitEssayCorrectionTaskRequestTasks> tasks;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("totalScore")
    public Integer totalScore;

    public static SubmitEssayCorrectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEssayCorrectionTaskRequest self = new SubmitEssayCorrectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEssayCorrectionTaskRequest setDimensions(java.util.List<SubmitEssayCorrectionTaskRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<SubmitEssayCorrectionTaskRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public SubmitEssayCorrectionTaskRequest setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public SubmitEssayCorrectionTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitEssayCorrectionTaskRequest setOtherReviewPoints(String otherReviewPoints) {
        this.otherReviewPoints = otherReviewPoints;
        return this;
    }
    public String getOtherReviewPoints() {
        return this.otherReviewPoints;
    }

    public SubmitEssayCorrectionTaskRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public SubmitEssayCorrectionTaskRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SubmitEssayCorrectionTaskRequest setTasks(java.util.List<SubmitEssayCorrectionTaskRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<SubmitEssayCorrectionTaskRequestTasks> getTasks() {
        return this.tasks;
    }

    public SubmitEssayCorrectionTaskRequest setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
        return this;
    }
    public Integer getTotalScore() {
        return this.totalScore;
    }

    public static class SubmitEssayCorrectionTaskRequestDimensions extends TeaModel {
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

        public static SubmitEssayCorrectionTaskRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            SubmitEssayCorrectionTaskRequestDimensions self = new SubmitEssayCorrectionTaskRequestDimensions();
            return TeaModel.build(map, self);
        }

        public SubmitEssayCorrectionTaskRequestDimensions setMaxScore(Integer maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public Integer getMaxScore() {
            return this.maxScore;
        }

        public SubmitEssayCorrectionTaskRequestDimensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitEssayCorrectionTaskRequestDimensions setRubric(String rubric) {
            this.rubric = rubric;
            return this;
        }
        public String getRubric() {
            return this.rubric;
        }

    }

    public static class SubmitEssayCorrectionTaskRequestTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("answer")
        public String answer;

        /**
         * <strong>example:</strong>
         * <p>task-001</p>
         */
        @NameInMap("customId")
        public String customId;

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

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("totalScore")
        public Integer totalScore;

        public static SubmitEssayCorrectionTaskRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            SubmitEssayCorrectionTaskRequestTasks self = new SubmitEssayCorrectionTaskRequestTasks();
            return TeaModel.build(map, self);
        }

        public SubmitEssayCorrectionTaskRequestTasks setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public SubmitEssayCorrectionTaskRequestTasks setCustomId(String customId) {
            this.customId = customId;
            return this;
        }
        public String getCustomId() {
            return this.customId;
        }

        public SubmitEssayCorrectionTaskRequestTasks setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public SubmitEssayCorrectionTaskRequestTasks setOtherReviewPoints(String otherReviewPoints) {
            this.otherReviewPoints = otherReviewPoints;
            return this;
        }
        public String getOtherReviewPoints() {
            return this.otherReviewPoints;
        }

        public SubmitEssayCorrectionTaskRequestTasks setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public SubmitEssayCorrectionTaskRequestTasks setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public SubmitEssayCorrectionTaskRequestTasks setTotalScore(Integer totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public Integer getTotalScore() {
            return this.totalScore;
        }

    }

}
