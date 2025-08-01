// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class QuestionAnswer extends TeaModel {
    @NameInMap("Answer")
    public QuestionAnswerAnswer answer;

    @NameInMap("GroundTruth")
    public QuestionAnswerGroundTruth groundTruth;

    @NameInMap("Question")
    public String question;

    public static QuestionAnswer build(java.util.Map<String, ?> map) throws Exception {
        QuestionAnswer self = new QuestionAnswer();
        return TeaModel.build(map, self);
    }

    public QuestionAnswer setAnswer(QuestionAnswerAnswer answer) {
        this.answer = answer;
        return this;
    }
    public QuestionAnswerAnswer getAnswer() {
        return this.answer;
    }

    public QuestionAnswer setGroundTruth(QuestionAnswerGroundTruth groundTruth) {
        this.groundTruth = groundTruth;
        return this;
    }
    public QuestionAnswerGroundTruth getGroundTruth() {
        return this.groundTruth;
    }

    public QuestionAnswer setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public static class QuestionAnswerAnswer extends TeaModel {
        @NameInMap("Contexts")
        public java.util.List<String> contexts;

        @NameInMap("Text")
        public String text;

        public static QuestionAnswerAnswer build(java.util.Map<String, ?> map) throws Exception {
            QuestionAnswerAnswer self = new QuestionAnswerAnswer();
            return TeaModel.build(map, self);
        }

        public QuestionAnswerAnswer setContexts(java.util.List<String> contexts) {
            this.contexts = contexts;
            return this;
        }
        public java.util.List<String> getContexts() {
            return this.contexts;
        }

        public QuestionAnswerAnswer setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QuestionAnswerGroundTruth extends TeaModel {
        @NameInMap("Contexts")
        public java.util.List<String> contexts;

        @NameInMap("Text")
        public String text;

        public static QuestionAnswerGroundTruth build(java.util.Map<String, ?> map) throws Exception {
            QuestionAnswerGroundTruth self = new QuestionAnswerGroundTruth();
            return TeaModel.build(map, self);
        }

        public QuestionAnswerGroundTruth setContexts(java.util.List<String> contexts) {
            this.contexts = contexts;
            return this;
        }
        public java.util.List<String> getContexts() {
            return this.contexts;
        }

        public QuestionAnswerGroundTruth setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
