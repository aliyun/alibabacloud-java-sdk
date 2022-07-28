// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageRequest extends TeaModel {
    @NameInMap("ChatId")
    public String chatId;

    @NameInMap("ClientInfo")
    public RecognizeMessageRequestClientInfo clientInfo;

    @NameInMap("Content")
    public String content;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("ExpectedSlots")
    public java.util.List<RecognizeMessageRequestExpectedSlots> expectedSlots;

    @NameInMap("ExtraContent")
    public java.util.Map<String, ?> extraContent;

    @NameInMap("FocusItemId")
    public String focusItemId;

    @NameInMap("FocusOrderId")
    public String focusOrderId;

    @NameInMap("Items")
    public java.util.List<RecognizeMessageRequestItems> items;

    @NameInMap("Orders")
    public java.util.List<RecognizeMessageRequestOrders> orders;

    @NameInMap("Packages")
    public java.util.List<RecognizeMessageRequestPackages> packages;

    @NameInMap("PlatformCode")
    public String platformCode;

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

    @NameInMap("StressTesting")
    public Boolean stressTesting;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserNick")
    public String userNick;

    @NameInMap("Variables")
    public java.util.Map<String, ?> variables;

    public static RecognizeMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageRequest self = new RecognizeMessageRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public RecognizeMessageRequest setClientInfo(RecognizeMessageRequestClientInfo clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public RecognizeMessageRequestClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public RecognizeMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RecognizeMessageRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public RecognizeMessageRequest setExpectedSlots(java.util.List<RecognizeMessageRequestExpectedSlots> expectedSlots) {
        this.expectedSlots = expectedSlots;
        return this;
    }
    public java.util.List<RecognizeMessageRequestExpectedSlots> getExpectedSlots() {
        return this.expectedSlots;
    }

    public RecognizeMessageRequest setExtraContent(java.util.Map<String, ?> extraContent) {
        this.extraContent = extraContent;
        return this;
    }
    public java.util.Map<String, ?> getExtraContent() {
        return this.extraContent;
    }

    public RecognizeMessageRequest setFocusItemId(String focusItemId) {
        this.focusItemId = focusItemId;
        return this;
    }
    public String getFocusItemId() {
        return this.focusItemId;
    }

    public RecognizeMessageRequest setFocusOrderId(String focusOrderId) {
        this.focusOrderId = focusOrderId;
        return this;
    }
    public String getFocusOrderId() {
        return this.focusOrderId;
    }

    public RecognizeMessageRequest setItems(java.util.List<RecognizeMessageRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<RecognizeMessageRequestItems> getItems() {
        return this.items;
    }

    public RecognizeMessageRequest setOrders(java.util.List<RecognizeMessageRequestOrders> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<RecognizeMessageRequestOrders> getOrders() {
        return this.orders;
    }

    public RecognizeMessageRequest setPackages(java.util.List<RecognizeMessageRequestPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<RecognizeMessageRequestPackages> getPackages() {
        return this.packages;
    }

    public RecognizeMessageRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public RecognizeMessageRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public RecognizeMessageRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

    public RecognizeMessageRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public RecognizeMessageRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public RecognizeMessageRequest setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

    public RecognizeMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RecognizeMessageRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public RecognizeMessageRequest setStaffNick(String staffNick) {
        this.staffNick = staffNick;
        return this;
    }
    public String getStaffNick() {
        return this.staffNick;
    }

    public RecognizeMessageRequest setStressTesting(Boolean stressTesting) {
        this.stressTesting = stressTesting;
        return this;
    }
    public Boolean getStressTesting() {
        return this.stressTesting;
    }

    public RecognizeMessageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RecognizeMessageRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public RecognizeMessageRequest setVariables(java.util.Map<String, ?> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public static class RecognizeMessageRequestClientInfo extends TeaModel {
        @NameInMap("ClientApp")
        public String clientApp;

        @NameInMap("ClientOs")
        public String clientOs;

        @NameInMap("ClientVersion")
        public String clientVersion;

        public static RecognizeMessageRequestClientInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageRequestClientInfo self = new RecognizeMessageRequestClientInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageRequestClientInfo setClientApp(String clientApp) {
            this.clientApp = clientApp;
            return this;
        }
        public String getClientApp() {
            return this.clientApp;
        }

        public RecognizeMessageRequestClientInfo setClientOs(String clientOs) {
            this.clientOs = clientOs;
            return this;
        }
        public String getClientOs() {
            return this.clientOs;
        }

        public RecognizeMessageRequestClientInfo setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

    public static class RecognizeMessageRequestExpectedSlots extends TeaModel {
        @NameInMap("SlotKey")
        public String slotKey;

        public static RecognizeMessageRequestExpectedSlots build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageRequestExpectedSlots self = new RecognizeMessageRequestExpectedSlots();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageRequestExpectedSlots setSlotKey(String slotKey) {
            this.slotKey = slotKey;
            return this;
        }
        public String getSlotKey() {
            return this.slotKey;
        }

    }

    public static class RecognizeMessageRequestItems extends TeaModel {
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

        public static RecognizeMessageRequestItems build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageRequestItems self = new RecognizeMessageRequestItems();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageRequestItems setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public RecognizeMessageRequestItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecognizeMessageRequestItems setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public RecognizeMessageRequestItems setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public RecognizeMessageRequestItems setProperty(java.util.Map<String, String> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, String> getProperty() {
            return this.property;
        }

        public RecognizeMessageRequestItems setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public RecognizeMessageRequestItems setShopCategoryIds(java.util.List<String> shopCategoryIds) {
            this.shopCategoryIds = shopCategoryIds;
            return this;
        }
        public java.util.List<String> getShopCategoryIds() {
            return this.shopCategoryIds;
        }

        public RecognizeMessageRequestItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RecognizeMessageRequestOrders extends TeaModel {
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

        public static RecognizeMessageRequestOrders build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageRequestOrders self = new RecognizeMessageRequestOrders();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageRequestOrders setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public RecognizeMessageRequestOrders setBuyerRateStatus(String buyerRateStatus) {
            this.buyerRateStatus = buyerRateStatus;
            return this;
        }
        public String getBuyerRateStatus() {
            return this.buyerRateStatus;
        }

        public RecognizeMessageRequestOrders setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public RecognizeMessageRequestOrders setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public RecognizeMessageRequestOrders setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecognizeMessageRequestOrders setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public RecognizeMessageRequestOrders setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public RecognizeMessageRequestOrders setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public RecognizeMessageRequestOrders setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public RecognizeMessageRequestOrders setParentOrderId(String parentOrderId) {
            this.parentOrderId = parentOrderId;
            return this;
        }
        public String getParentOrderId() {
            return this.parentOrderId;
        }

        public RecognizeMessageRequestOrders setPayStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public String getPayStatus() {
            return this.payStatus;
        }

        public RecognizeMessageRequestOrders setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public RecognizeMessageRequestOrders setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public RecognizeMessageRequestOrders setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public RecognizeMessageRequestOrders setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public RecognizeMessageRequestOrders setSkuProperty(String skuProperty) {
            this.skuProperty = skuProperty;
            return this;
        }
        public String getSkuProperty() {
            return this.skuProperty;
        }

    }

    public static class RecognizeMessageRequestPackages extends TeaModel {
        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("PackageVersion")
        public String packageVersion;

        public static RecognizeMessageRequestPackages build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageRequestPackages self = new RecognizeMessageRequestPackages();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageRequestPackages setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public RecognizeMessageRequestPackages setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

    }

}
