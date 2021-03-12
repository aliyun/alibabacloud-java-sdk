// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageShrinkRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("ChatId")
    public String chatId;

    @NameInMap("Round")
    public Integer round;

    @NameInMap("Content")
    public String content;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("ExtraContent")
    public String extraContentShrink;

    @NameInMap("UserNick")
    public String userNick;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("StaffNick")
    public String staffNick;

    @NameInMap("StaffId")
    public String staffId;

    @NameInMap("SellerNick")
    public String sellerNick;

    @NameInMap("SellerId")
    public String sellerId;

    @NameInMap("ServiceMode")
    public String serviceMode;

    @NameInMap("FocusOrderId")
    public String focusOrderId;

    @NameInMap("FocusItemId")
    public String focusItemId;

    @NameInMap("Orders")
    public String ordersShrink;

    @NameInMap("Items")
    public String itemsShrink;

    @NameInMap("Packages")
    public String packagesShrink;

    @NameInMap("ClientInfo")
    public String clientInfoShrink;

    public static RecognizeMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageShrinkRequest self = new RecognizeMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public RecognizeMessageShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RecognizeMessageShrinkRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public RecognizeMessageShrinkRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

    public RecognizeMessageShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RecognizeMessageShrinkRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public RecognizeMessageShrinkRequest setExtraContentShrink(String extraContentShrink) {
        this.extraContentShrink = extraContentShrink;
        return this;
    }
    public String getExtraContentShrink() {
        return this.extraContentShrink;
    }

    public RecognizeMessageShrinkRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public RecognizeMessageShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RecognizeMessageShrinkRequest setStaffNick(String staffNick) {
        this.staffNick = staffNick;
        return this;
    }
    public String getStaffNick() {
        return this.staffNick;
    }

    public RecognizeMessageShrinkRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public RecognizeMessageShrinkRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public RecognizeMessageShrinkRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public RecognizeMessageShrinkRequest setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

    public RecognizeMessageShrinkRequest setFocusOrderId(String focusOrderId) {
        this.focusOrderId = focusOrderId;
        return this;
    }
    public String getFocusOrderId() {
        return this.focusOrderId;
    }

    public RecognizeMessageShrinkRequest setFocusItemId(String focusItemId) {
        this.focusItemId = focusItemId;
        return this;
    }
    public String getFocusItemId() {
        return this.focusItemId;
    }

    public RecognizeMessageShrinkRequest setOrdersShrink(String ordersShrink) {
        this.ordersShrink = ordersShrink;
        return this;
    }
    public String getOrdersShrink() {
        return this.ordersShrink;
    }

    public RecognizeMessageShrinkRequest setItemsShrink(String itemsShrink) {
        this.itemsShrink = itemsShrink;
        return this;
    }
    public String getItemsShrink() {
        return this.itemsShrink;
    }

    public RecognizeMessageShrinkRequest setPackagesShrink(String packagesShrink) {
        this.packagesShrink = packagesShrink;
        return this;
    }
    public String getPackagesShrink() {
        return this.packagesShrink;
    }

    public RecognizeMessageShrinkRequest setClientInfoShrink(String clientInfoShrink) {
        this.clientInfoShrink = clientInfoShrink;
        return this;
    }
    public String getClientInfoShrink() {
        return this.clientInfoShrink;
    }

}
