// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncRobotMessageRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("ChatId")
    public String chatId;

    @NameInMap("UseDxm")
    public String useDxm;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("SceneKey")
    public String sceneKey;

    @NameInMap("AnswerType")
    public String answerType;

    @NameInMap("AnswerId")
    public String answerId;

    @NameInMap("Solutions")
    public java.util.List<String> solutions;

    public static SyncRobotMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRobotMessageRequest self = new SyncRobotMessageRequest();
        return TeaModel.build(map, self);
    }

    public SyncRobotMessageRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public SyncRobotMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SyncRobotMessageRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public SyncRobotMessageRequest setUseDxm(String useDxm) {
        this.useDxm = useDxm;
        return this;
    }
    public String getUseDxm() {
        return this.useDxm;
    }

    public SyncRobotMessageRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SyncRobotMessageRequest setSceneKey(String sceneKey) {
        this.sceneKey = sceneKey;
        return this;
    }
    public String getSceneKey() {
        return this.sceneKey;
    }

    public SyncRobotMessageRequest setAnswerType(String answerType) {
        this.answerType = answerType;
        return this;
    }
    public String getAnswerType() {
        return this.answerType;
    }

    public SyncRobotMessageRequest setAnswerId(String answerId) {
        this.answerId = answerId;
        return this;
    }
    public String getAnswerId() {
        return this.answerId;
    }

    public SyncRobotMessageRequest setSolutions(java.util.List<String> solutions) {
        this.solutions = solutions;
        return this;
    }
    public java.util.List<String> getSolutions() {
        return this.solutions;
    }

}
