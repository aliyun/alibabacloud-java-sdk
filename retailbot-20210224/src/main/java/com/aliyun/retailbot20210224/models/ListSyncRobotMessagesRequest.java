// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSyncRobotMessagesRequest extends TeaModel {
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
        @NameInMap("AnswerId")
        public String answerId;

        @NameInMap("AnswerType")
        public String answerType;

        @NameInMap("ChatId")
        public String chatId;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("SceneKey")
        public String sceneKey;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("Solutions")
        public java.util.List<String> solutions;

        @NameInMap("UseDxm")
        public Boolean useDxm;

        public static ListSyncRobotMessagesRequestRobotMessageDTOList build(java.util.Map<String, ?> map) throws Exception {
            ListSyncRobotMessagesRequestRobotMessageDTOList self = new ListSyncRobotMessagesRequestRobotMessageDTOList();
            return TeaModel.build(map, self);
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setAnswerId(String answerId) {
            this.answerId = answerId;
            return this;
        }
        public String getAnswerId() {
            return this.answerId;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setAnswerType(String answerType) {
            this.answerType = answerType;
            return this;
        }
        public String getAnswerType() {
            return this.answerType;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setSceneKey(String sceneKey) {
            this.sceneKey = sceneKey;
            return this;
        }
        public String getSceneKey() {
            return this.sceneKey;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setSolutions(java.util.List<String> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<String> getSolutions() {
            return this.solutions;
        }

        public ListSyncRobotMessagesRequestRobotMessageDTOList setUseDxm(Boolean useDxm) {
            this.useDxm = useDxm;
            return this;
        }
        public Boolean getUseDxm() {
            return this.useDxm;
        }

    }

}
