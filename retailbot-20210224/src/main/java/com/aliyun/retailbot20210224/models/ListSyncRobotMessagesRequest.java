// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSyncRobotMessagesRequest extends TeaModel {
    // 人机数据集合
    @NameInMap("RobotMessageDTOList")
    public java.util.List<ListSyncRobotMessagesRequestRobotMessageDTOList> robotMessageDTOList;

    public static ListSyncRobotMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSyncRobotMessagesRequest self = new ListSyncRobotMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListSyncRobotMessagesRequest setRobotMessageDTOList(java.util.List<ListSyncRobotMessagesRequestRobotMessageDTOList> robotMessageDTOList) {
        this.robotMessageDTOList = robotMessageDTOList;
        return this;
    }
    public java.util.List<ListSyncRobotMessagesRequestRobotMessageDTOList> getRobotMessageDTOList() {
        return this.robotMessageDTOList;
    }

    public static class ListSyncRobotMessagesRequestRobotMessageDTOList extends TeaModel {
        // 机器人code
        @NameInMap("RobotCode")
        public String robotCode;

        // 买卖家之间的会话ID
        @NameInMap("SessionId")
        public String sessionId;

        // 单句的唯一ID
        @NameInMap("ChatId")
        public String chatId;

        // 是否使用店小蜜的结果
        @NameInMap("UseDxm")
        public Boolean useDxm;

        // 不采纳店小蜜的原因
        @NameInMap("Reason")
        public String reason;

        // 采纳的场景key
        @NameInMap("SceneKey")
        public String sceneKey;

        // 答案类型
        @NameInMap("AnswerType")
        public String answerType;

        // 回复给买家的答案ID
        @NameInMap("AnswerId")
        public String answerId;

        // 回复到千牛的答案
        @NameInMap("Solutions")
        public java.util.List<String> solutions;

        public static ListSyncRobotMessagesRequestRobotMessageDTOList build(java.util.Map<String, ?> map) throws Exception {
            ListSyncRobotMessagesRequestRobotMessageDTOList self = new ListSyncRobotMessagesRequestRobotMessageDTOList();
            return TeaModel.build(map, self);
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setUseDxm(Boolean useDxm) {
            this.useDxm = useDxm;
            return this;
        }
        public Boolean getUseDxm() {
            return this.useDxm;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setAnswerType(String answerType) {
            this.answerType = answerType;
            return this;
        }
        public String getAnswerType() {
            return this.answerType;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setAnswerId(String answerId) {
            this.answerId = answerId;
            return this;
        }
        public String getAnswerId() {
            return this.answerId;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setSolutions(java.util.List<String> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<String> getSolutions() {
            return this.solutions;
        }

    }

}
