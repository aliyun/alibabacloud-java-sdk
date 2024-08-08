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
        @NameInMap("Feature")
        public String feature;

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

        @NameInMap("OutProductId")
        public String outProductId;

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

        @NameInMap("RefundStatus")
        public String refundStatus;

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

        public static BatchSaveOrderPopRequestOrdersSubOrderModelList build(java.util.Map<String, ?> map) throws Exception {
            BatchSaveOrderPopRequestOrdersSubOrderModelList self = new BatchSaveOrderPopRequestOrdersSubOrderModelList();
            return TeaModel.build(map, self);
        }

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
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

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setOutProductId(String outProductId) {
            this.outProductId = outProductId;
            return this;
        }
        public String getOutProductId() {
            return this.outProductId;
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

        public BatchSaveOrderPopRequestOrdersSubOrderModelList setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
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

    }

    public static class BatchSaveOrderPopRequestOrders extends TeaModel {
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testShopId</p>
         */
        @NameInMap("ShopId")
        public String shopId;

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

        public static BatchSaveOrderPopRequestOrders build(java.util.Map<String, ?> map) throws Exception {
            BatchSaveOrderPopRequestOrders self = new BatchSaveOrderPopRequestOrders();
            return TeaModel.build(map, self);
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

        public BatchSaveOrderPopRequestOrders setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
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

    }

}
