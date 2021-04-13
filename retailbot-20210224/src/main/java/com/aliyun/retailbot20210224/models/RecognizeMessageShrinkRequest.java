// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageShrinkRequest extends TeaModel {
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

    // 指定行业包
    @NameInMap("Packages")
    public String packagesShrink;

    // 客户端信息
    @NameInMap("ClientInfo")
    public String clientInfoShrink;

    // 是否压测流量
    @NameInMap("StressTesting")
    public Boolean stressTesting;

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

    public RecognizeMessageShrinkRequest setStressTesting(Boolean stressTesting) {
        this.stressTesting = stressTesting;
        return this;
    }
    public Boolean getStressTesting() {
        return this.stressTesting;
    }

}
