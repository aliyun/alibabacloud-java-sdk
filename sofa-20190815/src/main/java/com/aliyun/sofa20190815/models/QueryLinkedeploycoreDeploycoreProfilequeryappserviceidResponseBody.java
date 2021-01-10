// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody extends TeaModel {
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
    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody self = new QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody setData(QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppServiceId")
        public Long appServiceId;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("TenantName")
        public String tenantName;

        public static QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData self = new QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
