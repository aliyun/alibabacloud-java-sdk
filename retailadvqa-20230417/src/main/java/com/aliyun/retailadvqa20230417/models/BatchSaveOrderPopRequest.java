// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class BatchSaveOrderPopRequest extends TeaModel {
    @NameInMap("Orders")
    public java.util.List<BatchSaveOrderPopRequestOrders> orders;

    public static BatchSaveOrderPopRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveOrderPopRequest self = new BatchSaveOrderPopRequest();
        return TeaModel.build(map, self);
    }

    public BatchSaveOrderPopRequest setOrders(java.util.List<BatchSaveOrderPopRequestOrders> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<BatchSaveOrderPopRequestOrders> getOrders() {
        return this.orders;
    }

    public static class BatchSaveOrderPopRequestOrdersSubOrderModelList extends TeaModel {
        @NameInMap("AdjustFee")
        public String adjustFee;

        @NameInMap("BuyerArea")
        public String buyerArea;

        @NameInMap("BuyerRate")
        public String buyerRate;

        @NameInMap("Cid")
        public String cid;

        @NameInMap("ConsignTime")
        public String consignTime;

        @NameInMap("DiscountFee")
        public String discountFee;

        @NameInMap("Feature")
        public String feature;

        @NameInMap("ItemMealId")
        public String itemMealId;

        @NameInMap("ItemMealName")
        public String itemMealName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSubOrderId</p>
         */
        @NameInMap("OpenSubOrderId")
        public String openSubOrderId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("OrderPayment")
        public String orderPayment;

        @NameInMap("OrderTag")
        public String orderTag;

        @NameInMap("OutProductId")
        public String outProductId;

        @NameInMap("Payment")
        public String payment;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProductAmount")
        public String productAmount;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ReceiverCity")
        public String receiverCity;

        @NameInMap("ReceiverState")
        public String receiverState;

        @NameInMap("RefundId")
        public String refundId;

        @NameInMap("RefundStatus")
        public String refundStatus;

        @NameInMap("SellerFlag")
        public String sellerFlag;

        @NameInMap("SellerRate")
        public String sellerRate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TRADE_FINISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalFee")
        public String totalFee;

        @NameInMap("TradeFrom")
        public String tradeFrom;

        public static BatchSaveOrderPopRequestOrdersSubOrderModelList build(java.util.Map<String, ?> map) throws Exception {
            BatchSaveOrderPopRequestOrdersSubOrderModelList self = new BatchSaveOrderPopRequestOrdersSubOrderModelList();
            return TeaModel.build(map, self);
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setAdjustFee(String adjustFee) {
            this.adjustFee = adjustFee;
            return this;
        }
        public String getAdjustFee() {
            return this.adjustFee;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setBuyerArea(String buyerArea) {
            this.buyerArea = buyerArea;
            return this;
        }
        public String getBuyerArea() {
            return this.buyerArea;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setBuyerRate(String buyerRate) {
            this.buyerRate = buyerRate;
            return this;
        }
        public String getBuyerRate() {
            return this.buyerRate;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setConsignTime(String consignTime) {
            this.consignTime = consignTime;
            return this;
        }
        public String getConsignTime() {
            return this.consignTime;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setDiscountFee(String discountFee) {
            this.discountFee = discountFee;
            return this;
        }
        public String getDiscountFee() {
            return this.discountFee;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setItemMealId(String itemMealId) {
            this.itemMealId = itemMealId;
            return this;
        }
        public String getItemMealId() {
            return this.itemMealId;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setItemMealName(String itemMealName) {
            this.itemMealName = itemMealName;
            return this;
        }
        public String getItemMealName() {
            return this.itemMealName;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setOpenSubOrderId(String openSubOrderId) {
            this.openSubOrderId = openSubOrderId;
            return this;
        }
        public String getOpenSubOrderId() {
            return this.openSubOrderId;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setOrderPayment(String orderPayment) {
            this.orderPayment = orderPayment;
            return this;
        }
        public String getOrderPayment() {
            return this.orderPayment;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setOrderTag(String orderTag) {
            this.orderTag = orderTag;
            return this;
        }
        public String getOrderTag() {
            return this.orderTag;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setOutProductId(String outProductId) {
            this.outProductId = outProductId;
            return this;
        }
        public String getOutProductId() {
            return this.outProductId;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setPayment(String payment) {
            this.payment = payment;
            return this;
        }
        public String getPayment() {
            return this.payment;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setProductAmount(String productAmount) {
            this.productAmount = productAmount;
            return this;
        }
        public String getProductAmount() {
            return this.productAmount;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setReceiverCity(String receiverCity) {
            this.receiverCity = receiverCity;
            return this;
        }
        public String getReceiverCity() {
            return this.receiverCity;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setReceiverState(String receiverState) {
            this.receiverState = receiverState;
            return this;
        }
        public String getReceiverState() {
            return this.receiverState;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setRefundId(String refundId) {
            this.refundId = refundId;
            return this;
        }
        public String getRefundId() {
            return this.refundId;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setSellerFlag(String sellerFlag) {
            this.sellerFlag = sellerFlag;
            return this;
        }
        public String getSellerFlag() {
            return this.sellerFlag;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setSellerRate(String sellerRate) {
            this.sellerRate = sellerRate;
            return this;
        }
        public String getSellerRate() {
            return this.sellerRate;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setTotalFee(String totalFee) {
            this.totalFee = totalFee;
            return this;
        }
        public String getTotalFee() {
            return this.totalFee;
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setTradeFrom(String tradeFrom) {
            this.tradeFrom = tradeFrom;
            return this;
        }
        public String getTradeFrom() {
            return this.tradeFrom;
        }

    }

    public static class BatchSaveOrderPopRequestOrders extends TeaModel {
        @NameInMap("AdjustFee")
        public String adjustFee;

        @NameInMap("BuyerArea")
        public String buyerArea;

        @NameInMap("BuyerRate")
        public String buyerRate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>doudian</p>
         */
        @NameInMap("ChannelCode")
        public String channelCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1699b2b974d444e3aa489f96457ef204</p>
         */
        @NameInMap("ChannelOpenId")
        public String channelOpenId;

        @NameInMap("CommissionFee")
        public String commissionFee;

        @NameInMap("ConsignTime")
        public String consignTime;

        @NameInMap("DiscountFee")
        public String discountFee;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Feature")
        public String feature;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testOpenMerchantId</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testOpenOrderId</p>
         */
        @NameInMap("OpenOrderId")
        public String openOrderId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-20 12:12:12</p>
         */
        @NameInMap("OrderCreateTime")
        public String orderCreateTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("OrderPayment")
        public String orderPayment;

        @NameInMap("PayTime")
        public String payTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DOUDIAN</p>
         */
        @NameInMap("PlatformType")
        public String platformType;

        @NameInMap("PointFee")
        public String pointFee;

        @NameInMap("PostFee")
        public String postFee;

        @NameInMap("RealPointFee")
        public String realPointFee;

        @NameInMap("ReceiverCity")
        public String receiverCity;

        @NameInMap("ReceiverState")
        public String receiverState;

        @NameInMap("SellerFlag")
        public String sellerFlag;

        @NameInMap("SellerRate")
        public String sellerRate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testShopId</p>
         */
        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("Sid")
        public String sid;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TRADE_FINISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SubOrderModelList")
        public java.util.List<BatchSaveOrderPopRequestOrdersSubOrderModelList> subOrderModelList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalFee")
        public String totalFee;

        @NameInMap("buyerOpenUid")
        public String buyerOpenUid;

        @NameInMap("tradeFrom")
        public String tradeFrom;

        public static BatchSaveOrderPopRequestOrders build(java.util.Map<String, ?> map) throws Exception {
            BatchSaveOrderPopRequestOrders self = new BatchSaveOrderPopRequestOrders();
            return TeaModel.build(map, self);
        }

        public BatchSaveOrderPopRequestOrders setAdjustFee(String adjustFee) {
            this.adjustFee = adjustFee;
            return this;
        }
        public String getAdjustFee() {
            return this.adjustFee;
        }

        public BatchSaveOrderPopRequestOrders setBuyerArea(String buyerArea) {
            this.buyerArea = buyerArea;
            return this;
        }
        public String getBuyerArea() {
            return this.buyerArea;
        }

        public BatchSaveOrderPopRequestOrders setBuyerRate(String buyerRate) {
            this.buyerRate = buyerRate;
            return this;
        }
        public String getBuyerRate() {
            return this.buyerRate;
        }

        public BatchSaveOrderPopRequestOrders setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public BatchSaveOrderPopRequestOrders setChannelOpenId(String channelOpenId) {
            this.channelOpenId = channelOpenId;
            return this;
        }
        public String getChannelOpenId() {
            return this.channelOpenId;
        }

        public BatchSaveOrderPopRequestOrders setCommissionFee(String commissionFee) {
            this.commissionFee = commissionFee;
            return this;
        }
        public String getCommissionFee() {
            return this.commissionFee;
        }

        public BatchSaveOrderPopRequestOrders setConsignTime(String consignTime) {
            this.consignTime = consignTime;
            return this;
        }
        public String getConsignTime() {
            return this.consignTime;
        }

        public BatchSaveOrderPopRequestOrders setDiscountFee(String discountFee) {
            this.discountFee = discountFee;
            return this;
        }
        public String getDiscountFee() {
            return this.discountFee;
        }

        public BatchSaveOrderPopRequestOrders setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public BatchSaveOrderPopRequestOrders setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public BatchSaveOrderPopRequestOrders setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public BatchSaveOrderPopRequestOrders setOpenOrderId(String openOrderId) {
            this.openOrderId = openOrderId;
            return this;
        }
        public String getOpenOrderId() {
            return this.openOrderId;
        }

        public BatchSaveOrderPopRequestOrders setOrderCreateTime(String orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
            return this;
        }
        public String getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public BatchSaveOrderPopRequestOrders setOrderPayment(String orderPayment) {
            this.orderPayment = orderPayment;
            return this;
        }
        public String getOrderPayment() {
            return this.orderPayment;
        }

        public BatchSaveOrderPopRequestOrders setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public BatchSaveOrderPopRequestOrders setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public BatchSaveOrderPopRequestOrders setPointFee(String pointFee) {
            this.pointFee = pointFee;
            return this;
        }
        public String getPointFee() {
            return this.pointFee;
        }

        public BatchSaveOrderPopRequestOrders setPostFee(String postFee) {
            this.postFee = postFee;
            return this;
        }
        public String getPostFee() {
            return this.postFee;
        }

        public BatchSaveOrderPopRequestOrders setRealPointFee(String realPointFee) {
            this.realPointFee = realPointFee;
            return this;
        }
        public String getRealPointFee() {
            return this.realPointFee;
        }

        public BatchSaveOrderPopRequestOrders setReceiverCity(String receiverCity) {
            this.receiverCity = receiverCity;
            return this;
        }
        public String getReceiverCity() {
            return this.receiverCity;
        }

        public BatchSaveOrderPopRequestOrders setReceiverState(String receiverState) {
            this.receiverState = receiverState;
            return this;
        }
        public String getReceiverState() {
            return this.receiverState;
        }

        public BatchSaveOrderPopRequestOrders setSellerFlag(String sellerFlag) {
            this.sellerFlag = sellerFlag;
            return this;
        }
        public String getSellerFlag() {
            return this.sellerFlag;
        }

        public BatchSaveOrderPopRequestOrders setSellerRate(String sellerRate) {
            this.sellerRate = sellerRate;
            return this;
        }
        public String getSellerRate() {
            return this.sellerRate;
        }

        public BatchSaveOrderPopRequestOrders setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public BatchSaveOrderPopRequestOrders setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public BatchSaveOrderPopRequestOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchSaveOrderPopRequestOrders setSubOrderModelList(java.util.List<BatchSaveOrderPopRequestOrdersSubOrderModelList> subOrderModelList) {
            this.subOrderModelList = subOrderModelList;
            return this;
        }
        public java.util.List<BatchSaveOrderPopRequestOrdersSubOrderModelList> getSubOrderModelList() {
            return this.subOrderModelList;
        }

        public BatchSaveOrderPopRequestOrders setTotalFee(String totalFee) {
            this.totalFee = totalFee;
            return this;
        }
        public String getTotalFee() {
            return this.totalFee;
        }

        public BatchSaveOrderPopRequestOrders setBuyerOpenUid(String buyerOpenUid) {
            this.buyerOpenUid = buyerOpenUid;
            return this;
        }
        public String getBuyerOpenUid() {
            return this.buyerOpenUid;
        }

        public BatchSaveOrderPopRequestOrders setTradeFrom(String tradeFrom) {
            this.tradeFrom = tradeFrom;
            return this;
        }
        public String getTradeFrom() {
            return this.tradeFrom;
        }

    }

}
