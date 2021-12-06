// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageRequest extends TeaModel {
    // 单句的唯一ID
    @NameInMap("ChatId")
    public String chatId;

    // 客户端信息
    @NameInMap("ClientInfo")
    public RecognizeMessageRequestClientInfo clientInfo;

    // 用户输入的query
    @NameInMap("Content")
    public String content;

    // 用户输入的query类型
    @NameInMap("ContentType")
    public String contentType;

    // query扩展信息, 通常在点击事件中使用
    @NameInMap("ExtraContent")
    public java.util.Map<String, ?> extraContent;

    // 焦点商品id
    @NameInMap("FocusItemId")
    public String focusItemId;

    // 焦点订单id
    @NameInMap("FocusOrderId")
    public String focusOrderId;

    // 商品列表
    @NameInMap("Items")
    public java.util.List<RecognizeMessageRequestItems> items;

    // 订单列表
    @NameInMap("Orders")
    public java.util.List<RecognizeMessageRequestOrders> orders;

    // 指定行业包
    @NameInMap("Packages")
    public java.util.List<RecognizeMessageRequestPackages> packages;

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

    // 是否压测流量
    @NameInMap("StressTesting")
    public Boolean stressTesting;

    // 买家ID
    @NameInMap("UserId")
    public String userId;

    // 买家nick
    @NameInMap("UserNick")
    public String userNick;

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

    public static class RecognizeMessageRequestClientInfo extends TeaModel {
        // 客户端APP
        @NameInMap("ClientApp")
        public String clientApp;

        // 客户端系统
        @NameInMap("ClientOs")
        public String clientOs;

        // 客户端版本
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

    public static class RecognizeMessageRequestItems extends TeaModel {
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
        // 行业包code
        @NameInMap("PackageCode")
        public String packageCode;

        // 行业包版本
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
