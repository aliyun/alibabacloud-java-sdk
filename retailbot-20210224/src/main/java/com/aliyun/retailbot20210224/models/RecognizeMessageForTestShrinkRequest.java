// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageForTestShrinkRequest extends TeaModel {
    // 机器人ID
    @NameInMap("RobotCode")
    public String robotCode;

    // 买卖家之间的会话ID
    @NameInMap("SessionId")
    public String sessionId;

    // 单句的唯一ID
    @NameInMap("ChatId")
    public String chatId;

    // 当前的对话轮次
    @NameInMap("Round")
    public Integer round;

    // 用户输入的query
    @NameInMap("Content")
    public String content;

    // 用户输入的query类型
    @NameInMap("ContentType")
    public String contentType;

    // query扩展信息, 通常在点击事件中使用
    @NameInMap("ExtraContent")
    public String extraContentShrink;

    // 买家nick
    @NameInMap("UserNick")
    public String userNick;

    // 买家ID
    @NameInMap("UserId")
    public String userId;

    // 卖家接待人nick
    @NameInMap("StaffNick")
    public String staffNick;

    // 卖家接待人ID
    @NameInMap("StaffId")
    public String staffId;

    // 卖家nick
    @NameInMap("SellerNick")
    public String sellerNick;

    // 卖家ID
    @NameInMap("SellerId")
    public String sellerId;

    // 机器人模式
    @NameInMap("ServiceMode")
    public String serviceMode;

    // 焦点订单id
    @NameInMap("FocusOrderId")
    public String focusOrderId;

    // 焦点商品id
    @NameInMap("FocusItemId")
    public String focusItemId;

    // 订单列表
    @NameInMap("Orders")
    public String ordersShrink;

    // 商品列表
    @NameInMap("Items")
    public String itemsShrink;

    // 客户端信息
    @NameInMap("ClientInfo")
    public String clientInfoShrink;

    // 是否忽略场景开关
    @NameInMap("IgnoreSceneSwitch")
    public Boolean ignoreSceneSwitch;

    public static RecognizeMessageForTestShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageForTestShrinkRequest self = new RecognizeMessageForTestShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageForTestShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public RecognizeMessageForTestShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RecognizeMessageForTestShrinkRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public RecognizeMessageForTestShrinkRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

    public RecognizeMessageForTestShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RecognizeMessageForTestShrinkRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public RecognizeMessageForTestShrinkRequest setExtraContentShrink(String extraContentShrink) {
        this.extraContentShrink = extraContentShrink;
        return this;
    }
    public String getExtraContentShrink() {
        return this.extraContentShrink;
    }

    public RecognizeMessageForTestShrinkRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public RecognizeMessageForTestShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RecognizeMessageForTestShrinkRequest setStaffNick(String staffNick) {
        this.staffNick = staffNick;
        return this;
    }
    public String getStaffNick() {
        return this.staffNick;
    }

    public RecognizeMessageForTestShrinkRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public RecognizeMessageForTestShrinkRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public RecognizeMessageForTestShrinkRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public RecognizeMessageForTestShrinkRequest setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

    public RecognizeMessageForTestShrinkRequest setFocusOrderId(String focusOrderId) {
        this.focusOrderId = focusOrderId;
        return this;
    }
    public String getFocusOrderId() {
        return this.focusOrderId;
    }

    public RecognizeMessageForTestShrinkRequest setFocusItemId(String focusItemId) {
        this.focusItemId = focusItemId;
        return this;
    }
    public String getFocusItemId() {
        return this.focusItemId;
    }

    public RecognizeMessageForTestShrinkRequest setOrdersShrink(String ordersShrink) {
        this.ordersShrink = ordersShrink;
        return this;
    }
    public String getOrdersShrink() {
        return this.ordersShrink;
    }

    public RecognizeMessageForTestShrinkRequest setItemsShrink(String itemsShrink) {
        this.itemsShrink = itemsShrink;
        return this;
    }
    public String getItemsShrink() {
        return this.itemsShrink;
    }

    public RecognizeMessageForTestShrinkRequest setClientInfoShrink(String clientInfoShrink) {
        this.clientInfoShrink = clientInfoShrink;
        return this;
    }
    public String getClientInfoShrink() {
        return this.clientInfoShrink;
    }

    public RecognizeMessageForTestShrinkRequest setIgnoreSceneSwitch(Boolean ignoreSceneSwitch) {
        this.ignoreSceneSwitch = ignoreSceneSwitch;
        return this;
    }
    public Boolean getIgnoreSceneSwitch() {
        return this.ignoreSceneSwitch;
    }

}
