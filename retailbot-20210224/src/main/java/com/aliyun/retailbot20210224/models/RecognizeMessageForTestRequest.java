// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageForTestRequest extends TeaModel {
    @NameInMap("ChatId")
    public String chatId;

    @NameInMap("ClientInfo")
    public RecognizeMessageForTestRequestClientInfo clientInfo;

    @NameInMap("Content")
    public String content;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("ExpectedSlots")
    public java.util.List<RecognizeMessageForTestRequestExpectedSlots> expectedSlots;

    @NameInMap("ExtraContent")
    public java.util.Map<String, ?> extraContent;

    @NameInMap("FocusItemId")
    public String focusItemId;

    @NameInMap("FocusOrderId")
    public String focusOrderId;

    @NameInMap("IgnoreSceneSwitch")
    public Boolean ignoreSceneSwitch;

    @NameInMap("Items")
    public java.util.List<RecognizeMessageForTestRequestItems> items;

    @NameInMap("Orders")
    public java.util.List<RecognizeMessageForTestRequestOrders> orders;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Round")
    public Integer round;

    @NameInMap("SellerId")
    public String sellerId;

    @NameInMap("SellerNick")
    public String sellerNick;

    @NameInMap("ServiceMode")
    public String serviceMode;

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
        @NameInMap("ClientApp")
        public String clientApp;

        @NameInMap("ClientOs")
        public String clientOs;

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
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("Price")
        public Float price;

        @NameInMap("Property")
        public java.util.Map<String, String> property;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("ShopCategoryIds")
        public java.util.List<String> shopCategoryIds;

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
        @NameInMap("BuyerId")
        public String buyerId;

        @NameInMap("BuyerRateStatus")
        public String buyerRateStatus;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("ParentOrderId")
        public String parentOrderId;

        @NameInMap("PayStatus")
        public String payStatus;

        @NameInMap("PayTime")
        public Long payTime;

        @NameInMap("Price")
        public Float price;

        @NameInMap("RefundStatus")
        public String refundStatus;

        @NameInMap("SellerId")
        public String sellerId;

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
