// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncRobotMessageRequest extends TeaModel {
    // 答案正文
    @NameInMap("Answer")
    public String answer;

    // 回复给买家的答案ID
    @NameInMap("AnswerId")
    public String answerId;

    // 答案类型
    @NameInMap("AnswerType")
    public String answerType;

    // 单句的唯一ID
    @NameInMap("ChatId")
    public String chatId;

    // 不采纳店小蜜的原因
    @NameInMap("Reason")
    public String reason;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 采纳的场景key
    @NameInMap("SceneKey")
    public String sceneKey;

    // 买卖家之间的会话ID
    @NameInMap("SessionId")
    public String sessionId;

    // 回复到千牛的答案
    @NameInMap("Solutions")
    public java.util.List<String> solutions;

    // 是否使用店小蜜的结果
    @NameInMap("UseDxm")
    public String useDxm;

    public static SyncRobotMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRobotMessageRequest self = new SyncRobotMessageRequest();
        return TeaModel.build(map, self);
    }

    public SyncRobotMessageRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public SyncRobotMessageRequest setAnswerId(String answerId) {
        this.answerId = answerId;
        return this;
    }
    public String getAnswerId() {
        return this.answerId;
    }

    public SyncRobotMessageRequest setAnswerType(String answerType) {
        this.answerType = answerType;
        return this;
    }
    public String getAnswerType() {
        return this.answerType;
    }

    public SyncRobotMessageRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public SyncRobotMessageRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SyncRobotMessageRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public SyncRobotMessageRequest setSceneKey(String sceneKey) {
        this.sceneKey = sceneKey;
        return this;
    }
    public String getSceneKey() {
        return this.sceneKey;
    }

    public SyncRobotMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SyncRobotMessageRequest setSolutions(java.util.List<String> solutions) {
        this.solutions = solutions;
        return this;
    }
    public java.util.List<String> getSolutions() {
        return this.solutions;
    }

    public SyncRobotMessageRequest setUseDxm(String useDxm) {
        this.useDxm = useDxm;
        return this;
    }
    public String getUseDxm() {
        return this.useDxm;
    }

}
