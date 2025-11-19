// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribePackageOrdersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public DescribePackageOrdersResponseBodyPage page;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribePackageOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageOrdersResponseBody self = new DescribePackageOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackageOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePackageOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePackageOrdersResponseBody setPage(DescribePackageOrdersResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribePackageOrdersResponseBodyPage getPage() {
        return this.page;
    }

    public DescribePackageOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackageOrdersResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribePackageOrdersResponseBodyPageOrderList extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("CreatorAliUid")
        public Long creatorAliUid;

        @NameInMap("DeliveryAddress")
        public String deliveryAddress;

        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("GmtCanceledTime")
        public String gmtCanceledTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("GmtPaidTime")
        public String gmtPaidTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductSkuCode")
        public String productSkuCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("TradePrice")
        public String tradePrice;

        public static DescribePackageOrdersResponseBodyPageOrderList build(java.util.Map<String, ?> map) throws Exception {
            DescribePackageOrdersResponseBodyPageOrderList self = new DescribePackageOrdersResponseBodyPageOrderList();
            return TeaModel.build(map, self);
        }

        public DescribePackageOrdersResponseBodyPageOrderList setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setCreatorAliUid(Long creatorAliUid) {
            this.creatorAliUid = creatorAliUid;
            return this;
        }
        public Long getCreatorAliUid() {
            return this.creatorAliUid;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setGmtCanceledTime(String gmtCanceledTime) {
            this.gmtCanceledTime = gmtCanceledTime;
            return this;
        }
        public String getGmtCanceledTime() {
            return this.gmtCanceledTime;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setGmtPaidTime(String gmtPaidTime) {
            this.gmtPaidTime = gmtPaidTime;
            return this;
        }
        public String getGmtPaidTime() {
            return this.gmtPaidTime;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setProductSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }
        public String getProductSkuCode() {
            return this.productSkuCode;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribePackageOrdersResponseBodyPageOrderList setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribePackageOrdersResponseBodyPage extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("OrderList")
        public java.util.List<DescribePackageOrdersResponseBodyPageOrderList> orderList;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribePackageOrdersResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribePackageOrdersResponseBodyPage self = new DescribePackageOrdersResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribePackageOrdersResponseBodyPage setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public DescribePackageOrdersResponseBodyPage setOrderList(java.util.List<DescribePackageOrdersResponseBodyPageOrderList> orderList) {
            this.orderList = orderList;
            return this;
        }
        public java.util.List<DescribePackageOrdersResponseBodyPageOrderList> getOrderList() {
            return this.orderList;
        }

        public DescribePackageOrdersResponseBodyPage setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribePackageOrdersResponseBodyPage setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
