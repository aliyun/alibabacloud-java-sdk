// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadKnowledgeResultRequest extends TeaModel {
    @NameInMap("DigDatas")
    public java.util.List<UploadKnowledgeResultRequestDigDatas> digDatas;

    public static UploadKnowledgeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadKnowledgeResultRequest self = new UploadKnowledgeResultRequest();
        return TeaModel.build(map, self);
    }

    public UploadKnowledgeResultRequest setDigDatas(java.util.List<UploadKnowledgeResultRequestDigDatas> digDatas) {
        this.digDatas = digDatas;
        return this;
    }
    public java.util.List<UploadKnowledgeResultRequestDigDatas> getDigDatas() {
        return this.digDatas;
    }

    public static class UploadKnowledgeResultRequestDigDatas extends TeaModel {
        @NameInMap("AcceptType")
        public String acceptType;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("KmpAnswerId")
        public String kmpAnswerId;

        @NameInMap("KmpClusterId")
        public String kmpClusterId;

        @NameInMap("KnowledgeId")
        public String knowledgeId;

        @NameInMap("QuestionId")
        public String questionId;

        @NameInMap("QuestionName")
        public String questionName;

        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("SceneKey")
        public String sceneKey;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("SolutionId")
        public String solutionId;

        @NameInMap("TaskId")
        public Long taskId;

        public static UploadKnowledgeResultRequestDigDatas build(java.util.Map<String, ?> map) throws Exception {
            UploadKnowledgeResultRequestDigDatas self = new UploadKnowledgeResultRequestDigDatas();
            return TeaModel.build(map, self);
        }

        public UploadKnowledgeResultRequestDigDatas setAcceptType(String acceptType) {
            this.acceptType = acceptType;
            return this;
        }
        public String getAcceptType() {
            return this.acceptType;
        }

        public UploadKnowledgeResultRequestDigDatas setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UploadKnowledgeResultRequestDigDatas setKmpAnswerId(String kmpAnswerId) {
            this.kmpAnswerId = kmpAnswerId;
            return this;
        }
        public String getKmpAnswerId() {
            return this.kmpAnswerId;
        }

        public UploadKnowledgeResultRequestDigDatas setKmpClusterId(String kmpClusterId) {
            this.kmpClusterId = kmpClusterId;
            return this;
        }
        public String getKmpClusterId() {
            return this.kmpClusterId;
        }

        public UploadKnowledgeResultRequestDigDatas setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public UploadKnowledgeResultRequestDigDatas setQuestionId(String questionId) {
            this.questionId = questionId;
            return this;
        }
        public String getQuestionId() {
            return this.questionId;
        }

        public UploadKnowledgeResultRequestDigDatas setQuestionName(String questionName) {
            this.questionName = questionName;
            return this;
        }
        public String getQuestionName() {
            return this.questionName;
        }

        public UploadKnowledgeResultRequestDigDatas setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public UploadKnowledgeResultRequestDigDatas setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public UploadKnowledgeResultRequestDigDatas setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UploadKnowledgeResultRequestDigDatas setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

        public UploadKnowledgeResultRequestDigDatas setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
