// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody self = new QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody setData(QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SourceApp")
        public String sourceApp;

        @NameInMap("TenantName")
        public String tenantName;

        public static QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData self = new QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setSourceApp(String sourceApp) {
            this.sourceApp = sourceApp;
            return this;
        }
        public String getSourceApp() {
            return this.sourceApp;
        }

        public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
