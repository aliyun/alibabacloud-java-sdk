// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEssayCorrectionTaskRequest extends TeaModel {
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

    public static class SubmitEssayCorrectionTaskRequestTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("answer")
        public String answer;

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
