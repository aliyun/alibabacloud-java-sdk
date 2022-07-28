// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadLabelDataRequest extends TeaModel {
    @NameInMap("ChatId")
    public String chatId;

    @NameInMap("Content")
    public String content;

    @NameInMap("Correct")
    public Boolean correct;

    @NameInMap("CorrectSceneKey")
    public String correctSceneKey;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SceneKey")
    public String sceneKey;

    @NameInMap("SellerId")
    public String sellerId;

    @NameInMap("SellerNick")
    public String sellerNick;

    @NameInMap("SendTime")
    public Long sendTime;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("StaffId")
    public String staffId;

    @NameInMap("StaffNick")
    public String staffNick;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserNick")
    public String userNick;

    public static UploadLabelDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadLabelDataRequest self = new UploadLabelDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadLabelDataRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public UploadLabelDataRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
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

    public UploadLabelDataRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UploadLabelDataRequest setSceneKey(String sceneKey) {
        this.sceneKey = sceneKey;
        return this;
    }
    public String getSceneKey() {
        return this.sceneKey;
    }

    public UploadLabelDataRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public UploadLabelDataRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public UploadLabelDataRequest setSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public Long getSendTime() {
        return this.sendTime;
    }

    public UploadLabelDataRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UploadLabelDataRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public UploadLabelDataRequest setStaffNick(String staffNick) {
        this.staffNick = staffNick;
        return this;
    }
    public String getStaffNick() {
        return this.staffNick;
    }

    public UploadLabelDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UploadLabelDataRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
