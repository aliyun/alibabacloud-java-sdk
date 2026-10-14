// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListOrdersResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used to retrieve more results. If a single request does not return all results, this parameter is returned. You can pass the returned token in a subsequent request to continue retrieving results.</p>
     * 
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The order list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderList")
    public java.util.List<ListOrdersResponseBodyOrderList> orderList;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3AA69096-757C-4647-B36C-29EBC2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrdersResponseBody self = new ListOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrdersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOrdersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOrdersResponseBody setOrderList(java.util.List<ListOrdersResponseBodyOrderList> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<ListOrdersResponseBodyOrderList> getOrderList() {
        return this.orderList;
    }

    public ListOrdersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOrdersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrdersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrdersResponseBodyOrderList extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1910740440664****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code. Valid values:</p>
         * <ul>
         * <li>polardb_sub: subscription in the Chinese mainland.</li>
         * <li>polardb_sub_intl: subscription in Hong Kong (China) and outside China.</li>
         * <li>polardb_payg: pay-as-you-go in the Chinese mainland.</li>
         * <li>polardb_payg_intl: pay-as-you-go in Hong Kong (China) and outside China.</li>
         * <li>polardb_sub_jushita: Jushita subscription.</li>
         * <li>polardb_payg_jushita: Jushita pay-as-you-go.</li>
         * <li>polardb_sub_cainiao: Cainiao subscription.</li>
         * <li>polardb_payg_cainiao: Cainiao pay-as-you-go.<blockquote>
         * <ul>
         * <li>If you use an Alibaba Cloud China Website account, you can view only the commodity codes for the Chinese mainland.</li>
         * <li>If you use an Alibaba Cloud International Website account, you can view only the commodity codes for international regions.</li>
         * <li>If you use a Jushita account, you can view only the commodity codes for Jushita.</li>
         * <li>If you use a Cainiao account, you can view only the commodity codes for Cainiao.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polardb_payg_intl</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The creation time.</p>
         * <p>The time is in the YYYY-MM-DDTHH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-31T16:09:13</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The cluster ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-uf6k532gav*******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25808743077*****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The order status. Valid values:</p>
         * <ul>
         * <li><p><strong>pending</strong>: The task is waiting to start.</p>
         * </li>
         * <li><p><strong>create</strong>: The order has been placed and entered the production process.</p>
         * </li>
         * <li><p><strong>fail</strong>: Production failed.</p>
         * </li>
         * <li><p><strong>cancel</strong>: The order is canceled.</p>
         * </li>
         * <li><p><strong>success</strong>: Production succeeded.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("OrderStatus")
        public String orderStatus;

        /**
         * <p>The order type. Valid values:</p>
         * <ul>
         * <li>BUY: new purchase.</li>
         * <li>UPGRADE: configuration change.</li>
         * <li>RENEW: renewal.</li>
         * <li>CONVERT: billing method conversion.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        @NameInMap("ProduceCode")
        public String produceCode;

        /**
         * <p>The region information.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        public static ListOrdersResponseBodyOrderList build(java.util.Map<String, ?> map) throws Exception {
            ListOrdersResponseBodyOrderList self = new ListOrdersResponseBodyOrderList();
            return TeaModel.build(map, self);
        }

        public ListOrdersResponseBodyOrderList setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListOrdersResponseBodyOrderList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListOrdersResponseBodyOrderList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListOrdersResponseBodyOrderList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListOrdersResponseBodyOrderList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOrdersResponseBodyOrderList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListOrdersResponseBodyOrderList setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public ListOrdersResponseBodyOrderList setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListOrdersResponseBodyOrderList setProduceCode(String produceCode) {
            this.produceCode = produceCode;
            return this;
        }
        public String getProduceCode() {
            return this.produceCode;
        }

        public ListOrdersResponseBodyOrderList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
