// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncRobotMessageShrinkRequest extends TeaModel {
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
    public String solutionsShrink;

    // 是否使用店小蜜的结果
    @NameInMap("UseDxm")
    public String useDxm;

    public static SyncRobotMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRobotMessageShrinkRequest self = new SyncRobotMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncRobotMessageShrinkRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public SyncRobotMessageShrinkRequest setAnswerId(String answerId) {
        this.answerId = answerId;
        return this;
    }
    public String getAnswerId() {
        return this.answerId;
    }

    public SyncRobotMessageShrinkRequest setAnswerType(String answerType) {
        this.answerType = answerType;
        return this;
    }
    public String getAnswerType() {
        return this.answerType;
    }

    public SyncRobotMessageShrinkRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public SyncRobotMessageShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SyncRobotMessageShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public SyncRobotMessageShrinkRequest setSceneKey(String sceneKey) {
        this.sceneKey = sceneKey;
        return this;
    }
    public String getSceneKey() {
        return this.sceneKey;
    }

    public SyncRobotMessageShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SyncRobotMessageShrinkRequest setSolutionsShrink(String solutionsShrink) {
        this.solutionsShrink = solutionsShrink;
        return this;
    }
    public String getSolutionsShrink() {
        return this.solutionsShrink;
    }

    public SyncRobotMessageShrinkRequest setUseDxm(String useDxm) {
        this.useDxm = useDxm;
        return this;
    }
    public String getUseDxm() {
        return this.useDxm;
    }

}
