// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageKnowledgesResponseBody extends TeaModel {
    // 知识集合
    @NameInMap("Knowledges")
    public java.util.List<ListPackageKnowledgesResponseBodyKnowledges> knowledges;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPackageKnowledgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackageKnowledgesResponseBody self = new ListPackageKnowledgesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackageKnowledgesResponseBody setKnowledges(java.util.List<ListPackageKnowledgesResponseBodyKnowledges> knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public java.util.List<ListPackageKnowledgesResponseBodyKnowledges> getKnowledges() {
        return this.knowledges;
    }

    public ListPackageKnowledgesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions extends TeaModel {
        // 问法id
        @NameInMap("SimilarQuestionId")
        public Long similarQuestionId;

        // 示例问法标题
        @NameInMap("SimilarQuestionTitle")
        public String similarQuestionTitle;

        // "similar":相似问法，"sample":例句，"keyword":关键字
        @NameInMap("SimilarQuestionType")
        public String similarQuestionType;

        // "positive":正向，"negative":负向
        @NameInMap("SimilarQuestionEffectType")
        public String similarQuestionEffectType;

        // 创建时间格式：yyyy-MM-dd HH:mm:ss
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间格式：yyyy-MM-dd HH:mm:ss
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 创建用户id
        @NameInMap("CreateUserId")
        public String createUserId;

        // 修改用户id
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        public static ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions self = new ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionId(Long similarQuestionId) {
            this.similarQuestionId = similarQuestionId;
            return this;
        }
        public Long getSimilarQuestionId() {
            return this.similarQuestionId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionTitle(String similarQuestionTitle) {
            this.similarQuestionTitle = similarQuestionTitle;
            return this;
        }
        public String getSimilarQuestionTitle() {
            return this.similarQuestionTitle;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionType(String similarQuestionType) {
            this.similarQuestionType = similarQuestionType;
            return this;
        }
        public String getSimilarQuestionType() {
            return this.similarQuestionType;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setSimilarQuestionEffectType(String similarQuestionEffectType) {
            this.similarQuestionEffectType = similarQuestionEffectType;
            return this;
        }
        public String getSimilarQuestionEffectType() {
            return this.similarQuestionEffectType;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

    }

    public static class ListPackageKnowledgesResponseBodyKnowledges extends TeaModel {
        // 知识id
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        // 知识标题
        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        // "online":在用，"disabled":禁用
        @NameInMap("KnowledgeStatus")
        public String knowledgeStatus;

        // 场景key
        @NameInMap("SceneKey")
        public String sceneKey;

        // 知识描述
        @NameInMap("KnowledgeDescription")
        public String knowledgeDescription;

        // 创建时间格式：yyyy-MM-dd HH:mm:ss
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间格式：yyyy-MM-dd HH:mm:ss
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 创建用户id
        @NameInMap("CreateUserId")
        public String createUserId;

        // 修改用户id
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        // 示例问法、正负例句、正负关键字
        @NameInMap("SimilarQuestions")
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> similarQuestions;

        public static ListPackageKnowledgesResponseBodyKnowledges build(java.util.Map<String, ?> map) throws Exception {
            ListPackageKnowledgesResponseBodyKnowledges self = new ListPackageKnowledgesResponseBodyKnowledges();
            return TeaModel.build(map, self);
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeStatus(String knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
            return this;
        }
        public String getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setKnowledgeDescription(String knowledgeDescription) {
            this.knowledgeDescription = knowledgeDescription;
            return this;
        }
        public String getKnowledgeDescription() {
            return this.knowledgeDescription;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListPackageKnowledgesResponseBodyKnowledges setSimilarQuestions(java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> similarQuestions) {
            this.similarQuestions = similarQuestions;
            return this;
        }
        public java.util.List<ListPackageKnowledgesResponseBodyKnowledgesSimilarQuestions> getSimilarQuestions() {
            return this.similarQuestions;
        }

    }

}
