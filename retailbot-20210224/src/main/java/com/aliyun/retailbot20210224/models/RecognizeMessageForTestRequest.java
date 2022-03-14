// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageForTestRequest extends TeaModel {
    // 单句的唯一ID
    @NameInMap("ChatId")
    public String chatId;

    // 客户端信息
    @NameInMap("ClientInfo")
    public RecognizeMessageForTestRequestClientInfo clientInfo;

    // 用户输入的query
    @NameInMap("Content")
    public String content;

    // 用户输入的query类型
    @NameInMap("ContentType")
    public String contentType;

    // 上文期望的槽位
    @NameInMap("ExpectedSlots")
    public java.util.List<RecognizeMessageForTestRequestExpectedSlots> expectedSlots;

    // query扩展信息, 通常在点击事件中使用
    @NameInMap("ExtraContent")
    public java.util.Map<String, ?> extraContent;

    // 焦点商品id
    @NameInMap("FocusItemId")
    public String focusItemId;

    // 焦点订单id
    @NameInMap("FocusOrderId")
    public String focusOrderId;

    // 是否忽略场景开关
    @NameInMap("IgnoreSceneSwitch")
    public Boolean ignoreSceneSwitch;

    // 商品列表
    @NameInMap("Items")
    public java.util.List<RecognizeMessageForTestRequestItems> items;

    // 订单列表
    @NameInMap("Orders")
    public java.util.List<RecognizeMessageForTestRequestOrders> orders;

    // 机器人ID
    @NameInMap("RobotCode")
    public String robotCode;

    // 当前的对话轮次
    @NameInMap("Round")
    public Integer round;

    // 卖家ID
    @NameInMap("SellerId")
    public String sellerId;

    // 卖家nick
    @NameInMap("SellerNick")
    public String sellerNick;

    // 机器人模式
    @NameInMap("ServiceMode")
    public String serviceMode;

    // 买卖家之间的会话ID
    @NameInMap("SessionId")
    public String sessionId;

    // 卖家接待人ID
    @NameInMap("StaffId")
    public String staffId;

    // 卖家接待人nick
    @NameInMap("StaffNick")
    public String staffNick;

    // 买家ID
    @NameInMap("UserId")
    public String userId;

    // 买家nick
    @NameInMap("UserNick")
    public String userNick;

    public static RecognizeMessageForTestRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageForTestRequest self = new RecognizeMessageForTestRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageForTestRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public RecognizeMessageForTestRequest setClientInfo(RecognizeMessageForTestRequestClientInfo clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public RecognizeMessageForTestRequestClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public RecognizeMessageForTestRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RecognizeMessageForTestRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public RecognizeMessageForTestRequest setExpectedSlots(java.util.List<RecognizeMessageForTestRequestExpectedSlots> expectedSlots) {
        this.expectedSlots = expectedSlots;
        return this;
    }
    public java.util.List<RecognizeMessageForTestRequestExpectedSlots> getExpectedSlots() {
        return this.expectedSlots;
    }

    public RecognizeMessageForTestRequest setExtraContent(java.util.Map<String, ?> extraContent) {
        this.extraContent = extraContent;
        return this;
    }
    public java.util.Map<String, ?> getExtraContent() {
        return this.extraContent;
    }

    public RecognizeMessageForTestRequest setFocusItemId(String focusItemId) {
        this.focusItemId = focusItemId;
        return this;
    }
    public String getFocusItemId() {
        return this.focusItemId;
    }

    public RecognizeMessageForTestRequest setFocusOrderId(String focusOrderId) {
        this.focusOrderId = focusOrderId;
        return this;
    }
    public String getFocusOrderId() {
        return this.focusOrderId;
    }

    public RecognizeMessageForTestRequest setIgnoreSceneSwitch(Boolean ignoreSceneSwitch) {
        this.ignoreSceneSwitch = ignoreSceneSwitch;
        return this;
    }
    public Boolean getIgnoreSceneSwitch() {
        return this.ignoreSceneSwitch;
    }

    public RecognizeMessageForTestRequest setItems(java.util.List<RecognizeMessageForTestRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<RecognizeMessageForTestRequestItems> getItems() {
        return this.items;
    }

    public RecognizeMessageForTestRequest setOrders(java.util.List<RecognizeMessageForTestRequestOrders> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<RecognizeMessageForTestRequestOrders> getOrders() {
        return this.orders;
    }

    public RecognizeMessageForTestRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public RecognizeMessageForTestRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

    public RecognizeMessageForTestRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public RecognizeMessageForTestRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public RecognizeMessageForTestRequest setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

    public RecognizeMessageForTestRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RecognizeMessageForTestRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public RecognizeMessageForTestRequest setStaffNick(String staffNick) {
        this.staffNick = staffNick;
        return this;
    }
    public String getStaffNick() {
        return this.staffNick;
    }

    public RecognizeMessageForTestRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RecognizeMessageForTestRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public static class RecognizeMessageForTestRequestClientInfo extends TeaModel {
        // 客户端APP
        @NameInMap("ClientApp")
        public String clientApp;

        // 客户端系统
        @NameInMap("ClientOs")
        public String clientOs;

        // 客户端版本
        @NameInMap("ClientVersion")
        public String clientVersion;

        public static RecognizeMessageForTestRequestClientInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestRequestClientInfo self = new RecognizeMessageForTestRequestClientInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestRequestClientInfo setClientApp(String clientApp) {
            this.clientApp = clientApp;
            return this;
        }
        public String getClientApp() {
            return this.clientApp;
        }

        public RecognizeMessageForTestRequestClientInfo setClientOs(String clientOs) {
            this.clientOs = clientOs;
            return this;
        }
        public String getClientOs() {
            return this.clientOs;
        }

        public RecognizeMessageForTestRequestClientInfo setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

    public static class RecognizeMessageForTestRequestExpectedSlots extends TeaModel {
        // 槽位key
        @NameInMap("SlotKey")
        public String slotKey;

        public static RecognizeMessageForTestRequestExpectedSlots build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestRequestExpectedSlots self = new RecognizeMessageForTestRequestExpectedSlots();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestRequestExpectedSlots setSlotKey(String slotKey) {
            this.slotKey = slotKey;
            return this;
        }
        public String getSlotKey() {
            return this.slotKey;
        }

    }

    public static class RecognizeMessageForTestRequestItems extends TeaModel {
        // 商品叶子类目id
        @NameInMap("CategoryId")
        public String categoryId;

        // 商品id
        @NameInMap("ItemId")
        public String itemId;

        // 商品主图url
        @NameInMap("PicUrl")
        public String picUrl;

        // 商品价格
        @NameInMap("Price")
        public Float price;

        // 商品属性
        @NameInMap("Property")
        public java.util.Map<String, String> property;

        // 卖家id
        @NameInMap("SellerId")
        public String sellerId;

        // 商品店铺类目
        @NameInMap("ShopCategoryIds")
        public java.util.List<String> shopCategoryIds;

        // 商品标题
        @NameInMap("Title")
        public String title;

        public static RecognizeMessageForTestRequestItems build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestRequestItems self = new RecognizeMessageForTestRequestItems();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestRequestItems setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public RecognizeMessageForTestRequestItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecognizeMessageForTestRequestItems setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public RecognizeMessageForTestRequestItems setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public RecognizeMessageForTestRequestItems setProperty(java.util.Map<String, String> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, String> getProperty() {
            return this.property;
        }

        public RecognizeMessageForTestRequestItems setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public RecognizeMessageForTestRequestItems setShopCategoryIds(java.util.List<String> shopCategoryIds) {
            this.shopCategoryIds = shopCategoryIds;
            return this;
        }
        public java.util.List<String> getShopCategoryIds() {
            return this.shopCategoryIds;
        }

        public RecognizeMessageForTestRequestItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RecognizeMessageForTestRequestOrders extends TeaModel {
        // 买家id
        @NameInMap("BuyerId")
        public String buyerId;

        // 评价状态
        @NameInMap("BuyerRateStatus")
        public String buyerRateStatus;

        // 订单中的商品数量
        @NameInMap("Count")
        public Integer count;

        // 订单创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 订单中的商品id
        @NameInMap("ItemId")
        public String itemId;

        // 商品主图url
        @NameInMap("ItemPic")
        public String itemPic;

        // 商品标题
        @NameInMap("ItemTitle")
        public String itemTitle;

        // 物流状态
        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        // 子订单id
        @NameInMap("OrderId")
        public String orderId;

        // 主订单id
        @NameInMap("ParentOrderId")
        public String parentOrderId;

        // 支付状态
        @NameInMap("PayStatus")
        public String payStatus;

        // 订单支付时间
        @NameInMap("PayTime")
        public Long payTime;

        // 订单价格
        @NameInMap("Price")
        public Float price;

        // 退款状态
        @NameInMap("RefundStatus")
        public String refundStatus;

        // 卖家id
        @NameInMap("SellerId")
        public String sellerId;

        // sku属性
        @NameInMap("SkuProperty")
        public String skuProperty;

        public static RecognizeMessageForTestRequestOrders build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageForTestRequestOrders self = new RecognizeMessageForTestRequestOrders();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageForTestRequestOrders setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public RecognizeMessageForTestRequestOrders setBuyerRateStatus(String buyerRateStatus) {
            this.buyerRateStatus = buyerRateStatus;
            return this;
        }
        public String getBuyerRateStatus() {
            return this.buyerRateStatus;
        }

        public RecognizeMessageForTestRequestOrders setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public RecognizeMessageForTestRequestOrders setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public RecognizeMessageForTestRequestOrders setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecognizeMessageForTestRequestOrders setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public RecognizeMessageForTestRequestOrders setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public RecognizeMessageForTestRequestOrders setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public RecognizeMessageForTestRequestOrders setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public RecognizeMessageForTestRequestOrders setParentOrderId(String parentOrderId) {
            this.parentOrderId = parentOrderId;
            return this;
        }
        public String getParentOrderId() {
            return this.parentOrderId;
        }

        public RecognizeMessageForTestRequestOrders setPayStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public String getPayStatus() {
            return this.payStatus;
        }

        public RecognizeMessageForTestRequestOrders setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public RecognizeMessageForTestRequestOrders setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public RecognizeMessageForTestRequestOrders setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public RecognizeMessageForTestRequestOrders setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public RecognizeMessageForTestRequestOrders setSkuProperty(String skuProperty) {
            this.skuProperty = skuProperty;
            return this;
        }
        public String getSkuProperty() {
            return this.skuProperty;
        }

    }

}
