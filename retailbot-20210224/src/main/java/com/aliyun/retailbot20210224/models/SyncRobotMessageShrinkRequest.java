// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncRobotMessageShrinkRequest extends TeaModel {
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
    public String solutionsShrink;

    public static SyncRobotMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRobotMessageShrinkRequest self = new SyncRobotMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncRobotMessageShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public SyncRobotMessageShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SyncRobotMessageShrinkRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public SyncRobotMessageShrinkRequest setUseDxm(String useDxm) {
        this.useDxm = useDxm;
        return this;
    }
    public String getUseDxm() {
        return this.useDxm;
    }

    public SyncRobotMessageShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SyncRobotMessageShrinkRequest setSceneKey(String sceneKey) {
        this.sceneKey = sceneKey;
        return this;
    }
    public String getSceneKey() {
        return this.sceneKey;
    }

    public SyncRobotMessageShrinkRequest setAnswerType(String answerType) {
        this.answerType = answerType;
        return this;
    }
    public String getAnswerType() {
        return this.answerType;
    }

    public SyncRobotMessageShrinkRequest setAnswerId(String answerId) {
        this.answerId = answerId;
        return this;
    }
    public String getAnswerId() {
        return this.answerId;
    }

    public SyncRobotMessageShrinkRequest setSolutionsShrink(String solutionsShrink) {
        this.solutionsShrink = solutionsShrink;
        return this;
    }
    public String getSolutionsShrink() {
        return this.solutionsShrink;
    }

}
