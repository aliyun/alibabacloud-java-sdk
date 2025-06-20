// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryCustomerResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryCustomerResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerResponseBody self = new QueryCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustomerResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryCustomerResponseBody setData(java.util.List<QueryCustomerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCustomerResponseBodyData> getData() {
        return this.data;
    }

    public QueryCustomerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustomerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCustomerResponseBodyData extends TeaModel {
        @NameInMap("Product")
        public String product;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        public static QueryCustomerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustomerResponseBodyData self = new QueryCustomerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustomerResponseBodyData setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public QueryCustomerResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCustomerResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
