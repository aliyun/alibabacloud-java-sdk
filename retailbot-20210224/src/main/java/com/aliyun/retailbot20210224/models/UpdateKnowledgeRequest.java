// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeRequest extends TeaModel {
    @NameInMap("Knowledge")
    public UpdateKnowledgeRequestKnowledge knowledge;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("RobotCode")
    public String robotCode;

    public static UpdateKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeRequest self = new UpdateKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeRequest setKnowledge(UpdateKnowledgeRequestKnowledge knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public UpdateKnowledgeRequestKnowledge getKnowledge() {
        return this.knowledge;
    }

    public UpdateKnowledgeRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateKnowledgeRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public UpdateKnowledgeRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public static class UpdateKnowledgeRequestKnowledgeSimilarQuestions extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("SimilarQuestionEffectType")
        public String similarQuestionEffectType;

        @NameInMap("SimilarQuestionId")
        public Long similarQuestionId;

        @NameInMap("SimilarQuestionTitle")
        public String similarQuestionTitle;

        public static UpdateKnowledgeRequestKnowledgeSimilarQuestions build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeRequestKnowledgeSimilarQuestions self = new UpdateKnowledgeRequestKnowledgeSimilarQuestions();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeRequestKnowledgeSimilarQuestions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateKnowledgeRequestKnowledgeSimilarQuestions setSimilarQuestionEffectType(String similarQuestionEffectType) {
            this.similarQuestionEffectType = similarQuestionEffectType;
            return this;
        }
        public String getSimilarQuestionEffectType() {
            return this.similarQuestionEffectType;
        }

        public UpdateKnowledgeRequestKnowledgeSimilarQuestions setSimilarQuestionId(Long similarQuestionId) {
            this.similarQuestionId = similarQuestionId;
            return this;
        }
        public Long getSimilarQuestionId() {
            return this.similarQuestionId;
        }

        public UpdateKnowledgeRequestKnowledgeSimilarQuestions setSimilarQuestionTitle(String similarQuestionTitle) {
            this.similarQuestionTitle = similarQuestionTitle;
            return this;
        }
        public String getSimilarQuestionTitle() {
            return this.similarQuestionTitle;
        }

    }

    public static class UpdateKnowledgeRequestKnowledge extends TeaModel {
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("SimilarQuestions")
        public java.util.List<UpdateKnowledgeRequestKnowledgeSimilarQuestions> similarQuestions;

        public static UpdateKnowledgeRequestKnowledge build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeRequestKnowledge self = new UpdateKnowledgeRequestKnowledge();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeRequestKnowledge setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public UpdateKnowledgeRequestKnowledge setSimilarQuestions(java.util.List<UpdateKnowledgeRequestKnowledgeSimilarQuestions> similarQuestions) {
            this.similarQuestions = similarQuestions;
            return this;
        }
        public java.util.List<UpdateKnowledgeRequestKnowledgeSimilarQuestions> getSimilarQuestions() {
            return this.similarQuestions;
        }

    }

}
