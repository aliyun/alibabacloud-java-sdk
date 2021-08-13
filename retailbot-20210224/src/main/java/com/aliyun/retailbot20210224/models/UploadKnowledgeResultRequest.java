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
        // 任务id
        @NameInMap("TaskId")
        public Long taskId;

        // 机器人code
        @NameInMap("RobotCode")
        public String robotCode;

        // 知识类型
        @NameInMap("ContentType")
        public String contentType;

        // 场景key
        @NameInMap("SceneKey")
        public String sceneKey;

        // 场景名称
        @NameInMap("SceneName")
        public String sceneName;

        // 问题id
        @NameInMap("QuestionId")
        public String questionId;

        // 问题
        @NameInMap("QuestionName")
        public String questionName;

        // 聚类id
        @NameInMap("KmpClusterId")
        public String kmpClusterId;

        // 答案id
        @NameInMap("KmpAnswerId")
        public String kmpAnswerId;

        // 商家操作类型       accept 手动采纳       ignore 手动忽略       modify 手动修改       error  错误       other  其他(商家无操作)
        @NameInMap("AcceptType")
        public String acceptType;

        // 采纳后的知识id
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        // solutionId
        @NameInMap("SolutionId")
        public String solutionId;

        public static UploadKnowledgeResultRequestDigDatas build(java.util.Map<String, ?> map) throws Exception {
            UploadKnowledgeResultRequestDigDatas self = new UploadKnowledgeResultRequestDigDatas();
            return TeaModel.build(map, self);
        }

        public UploadKnowledgeResultRequestDigDatas setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public UploadKnowledgeResultRequestDigDatas setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public UploadKnowledgeResultRequestDigDatas setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
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

        public UploadKnowledgeResultRequestDigDatas setKmpClusterId(String kmpClusterId) {
            this.kmpClusterId = kmpClusterId;
            return this;
        }
        public String getKmpClusterId() {
            return this.kmpClusterId;
        }

        public UploadKnowledgeResultRequestDigDatas setKmpAnswerId(String kmpAnswerId) {
            this.kmpAnswerId = kmpAnswerId;
            return this;
        }
        public String getKmpAnswerId() {
            return this.kmpAnswerId;
        }

        public UploadKnowledgeResultRequestDigDatas setAcceptType(String acceptType) {
            this.acceptType = acceptType;
            return this;
        }
        public String getAcceptType() {
            return this.acceptType;
        }

        public UploadKnowledgeResultRequestDigDatas setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public UploadKnowledgeResultRequestDigDatas setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

}
