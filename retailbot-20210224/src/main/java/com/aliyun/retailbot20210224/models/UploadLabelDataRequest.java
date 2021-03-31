// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadLabelDataRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 买卖家之间的会话ID
    @NameInMap("SessionId")
    public String sessionId;

    // 单句的唯一ID
    @NameInMap("ChatId")
    public String chatId;

    // 消息发送时间戳
    @NameInMap("SendTime")
    public Long sendTime;

    // 买家nick
    @NameInMap("UserNick")
    public String userNick;

    // 买家ID
    @NameInMap("UserId")
    public String userId;

    // 卖家小二nick
    @NameInMap("StaffNick")
    public String staffNick;

    // 卖家小二ID
    @NameInMap("StaffId")
    public String staffId;

    // 卖家nick
    @NameInMap("SellerNick")
    public String sellerNick;

    // 卖家ID
    @NameInMap("SellerId")
    public String sellerId;

    // 用户输入的query
    @NameInMap("Content")
    public String content;

    // 小蜜定位的场景key，小蜜未定位到场景时为空
    @NameInMap("SceneKey")
    public String sceneKey;

    // 是否正确，小蜜未定位到时为空
    @NameInMap("Correct")
    public Boolean correct;

    // 正确的场景key，IsCorrect=true时为空，IsCorrect=false时必填，录入场景id必须是双方合作范围内由小蜜定位的场景
    @NameInMap("CorrectSceneKey")
    public String correctSceneKey;

    public static UploadLabelDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadLabelDataRequest self = new UploadLabelDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadLabelDataRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UploadLabelDataRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UploadLabelDataRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public UploadLabelDataRequest setSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public Long getSendTime() {
        return this.sendTime;
    }

    public UploadLabelDataRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public UploadLabelDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UploadLabelDataRequest setStaffNick(String staffNick) {
        this.staffNick = staffNick;
        return this;
    }
    public String getStaffNick() {
        return this.staffNick;
    }

    public UploadLabelDataRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public UploadLabelDataRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public UploadLabelDataRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public UploadLabelDataRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UploadLabelDataRequest setSceneKey(String sceneKey) {
        this.sceneKey = sceneKey;
        return this;
    }
    public String getSceneKey() {
        return this.sceneKey;
    }

    public UploadLabelDataRequest setCorrect(Boolean correct) {
        this.correct = correct;
        return this;
    }
    public Boolean getCorrect() {
        return this.correct;
    }

    public UploadLabelDataRequest setCorrectSceneKey(String correctSceneKey) {
        this.correctSceneKey = correctSceneKey;
        return this;
    }
    public String getCorrectSceneKey() {
        return this.correctSceneKey;
    }

}
