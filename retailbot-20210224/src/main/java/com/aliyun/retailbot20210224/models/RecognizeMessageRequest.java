// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageRequest extends TeaModel {
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
    public java.util.Map<String, ?> extraContent;

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
    public java.util.List<RecognizeMessageRequestOrders> orders;

    @NameInMap("Items")
    public java.util.List<RecognizeMessageRequestItems> items;

    @NameInMap("Packages")
    public java.util.List<RecognizeMessageRequestPackages> packages;

    @NameInMap("ClientInfo")
    public RecognizeMessageRequestClientInfo clientInfo;

    public static RecognizeMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageRequest self = new RecognizeMessageRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public RecognizeMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RecognizeMessageRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public RecognizeMessageRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
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

    public RecognizeMessageRequest setExtraContent(java.util.Map<String, ?> extraContent) {
        this.extraContent = extraContent;
        return this;
    }
    public java.util.Map<String, ?> getExtraContent() {
        return this.extraContent;
    }

    public RecognizeMessageRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public RecognizeMessageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RecognizeMessageRequest setStaffNick(String staffNick) {
        this.staffNick = staffNick;
        return this;
    }
    public String getStaffNick() {
        return this.staffNick;
    }

    public RecognizeMessageRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

    public RecognizeMessageRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public RecognizeMessageRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public RecognizeMessageRequest setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

    public RecognizeMessageRequest setFocusOrderId(String focusOrderId) {
        this.focusOrderId = focusOrderId;
        return this;
    }
    public String getFocusOrderId() {
        return this.focusOrderId;
    }

    public RecognizeMessageRequest setFocusItemId(String focusItemId) {
        this.focusItemId = focusItemId;
        return this;
    }
    public String getFocusItemId() {
        return this.focusItemId;
    }

    public RecognizeMessageRequest setOrders(java.util.List<RecognizeMessageRequestOrders> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<RecognizeMessageRequestOrders> getOrders() {
        return this.orders;
    }

    public RecognizeMessageRequest setItems(java.util.List<RecognizeMessageRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<RecognizeMessageRequestItems> getItems() {
        return this.items;
    }

    public RecognizeMessageRequest setPackages(java.util.List<RecognizeMessageRequestPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<RecognizeMessageRequestPackages> getPackages() {
        return this.packages;
    }

    public RecognizeMessageRequest setClientInfo(RecognizeMessageRequestClientInfo clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public RecognizeMessageRequestClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public static class RecognizeMessageRequestOrders extends TeaModel {
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("ParentOrderId")
        public String parentOrderId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("PayTime")
        public Long payTime;

        @NameInMap("BuyerId")
        public String buyerId;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("PayStatus")
        public String payStatus;

        @NameInMap("RefundStatus")
        public String refundStatus;

        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        @NameInMap("BuyerRateStatus")
        public String buyerRateStatus;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("Price")
        public Float price;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("SkuProperty")
        public String skuProperty;

        public static RecognizeMessageRequestOrders build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageRequestOrders self = new RecognizeMessageRequestOrders();
            return TeaModel.build(map, self);
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

        public RecognizeMessageRequestOrders setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public RecognizeMessageRequestOrders setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public RecognizeMessageRequestOrders setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public RecognizeMessageRequestOrders setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public RecognizeMessageRequestOrders setPayStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public String getPayStatus() {
            return this.payStatus;
        }

        public RecognizeMessageRequestOrders setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public RecognizeMessageRequestOrders setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public RecognizeMessageRequestOrders setBuyerRateStatus(String buyerRateStatus) {
            this.buyerRateStatus = buyerRateStatus;
            return this;
        }
        public String getBuyerRateStatus() {
            return this.buyerRateStatus;
        }

        public RecognizeMessageRequestOrders setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecognizeMessageRequestOrders setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public RecognizeMessageRequestOrders setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public RecognizeMessageRequestOrders setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public RecognizeMessageRequestOrders setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public RecognizeMessageRequestOrders setSkuProperty(String skuProperty) {
            this.skuProperty = skuProperty;
            return this;
        }
        public String getSkuProperty() {
            return this.skuProperty;
        }

    }

    public static class RecognizeMessageRequestItems extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("Title")
        public String title;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("ShopCategoryIds")
        public java.util.List<String> shopCategoryIds;

        @NameInMap("Price")
        public Float price;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("Property")
        public java.util.Map<String, String> property;

        public static RecognizeMessageRequestItems build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageRequestItems self = new RecognizeMessageRequestItems();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageRequestItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecognizeMessageRequestItems setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public RecognizeMessageRequestItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RecognizeMessageRequestItems setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public RecognizeMessageRequestItems setShopCategoryIds(java.util.List<String> shopCategoryIds) {
            this.shopCategoryIds = shopCategoryIds;
            return this;
        }
        public java.util.List<String> getShopCategoryIds() {
            return this.shopCategoryIds;
        }

        public RecognizeMessageRequestItems setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public RecognizeMessageRequestItems setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public RecognizeMessageRequestItems setProperty(java.util.Map<String, String> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, String> getProperty() {
            return this.property;
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

    public static class RecognizeMessageRequestClientInfo extends TeaModel {
        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("ClientApp")
        public String clientApp;

        @NameInMap("ClientOs")
        public String clientOs;

        public static RecognizeMessageRequestClientInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMessageRequestClientInfo self = new RecognizeMessageRequestClientInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeMessageRequestClientInfo setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
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

    }

}
