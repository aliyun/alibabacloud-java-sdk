// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class QueryOrderListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryOrderListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderListResponseBody self = new QueryOrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderListResponseBody setData(QueryOrderListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOrderListResponseBodyData getData() {
        return this.data;
    }

    public QueryOrderListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderListResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public QueryOrderListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrderListResponseBodyDataList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderTime")
        public String orderTime;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Status")
        public String status;

        public static QueryOrderListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyDataList self = new QueryOrderListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryOrderListResponseBodyDataList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryOrderListResponseBodyDataList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryOrderListResponseBodyDataList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryOrderListResponseBodyDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryOrderListResponseBodyDataList setOrderTime(String orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public String getOrderTime() {
            return this.orderTime;
        }

        public QueryOrderListResponseBodyDataList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryOrderListResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryOrderListResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryOrderListResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static QueryOrderListResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyDataPageInfo self = new QueryOrderListResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyDataPageInfo setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public QueryOrderListResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryOrderListResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class QueryOrderListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryOrderListResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public QueryOrderListResponseBodyDataPageInfo pageInfo;

        public static QueryOrderListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyData self = new QueryOrderListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyData setList(java.util.List<QueryOrderListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryOrderListResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryOrderListResponseBodyData setPageInfo(QueryOrderListResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public QueryOrderListResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
