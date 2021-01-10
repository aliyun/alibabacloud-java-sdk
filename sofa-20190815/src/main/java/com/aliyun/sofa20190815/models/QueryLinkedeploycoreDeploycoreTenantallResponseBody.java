// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreTenantallResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkedeploycoreDeploycoreTenantallResponseBodyData> data;

    public static QueryLinkedeploycoreDeploycoreTenantallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreTenantallResponseBody self = new QueryLinkedeploycoreDeploycoreTenantallResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponseBody setData(java.util.List<QueryLinkedeploycoreDeploycoreTenantallResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkedeploycoreDeploycoreTenantallResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreTenantallResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static QueryLinkedeploycoreDeploycoreTenantallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreTenantallResponseBodyData self = new QueryLinkedeploycoreDeploycoreTenantallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreTenantallResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkedeploycoreDeploycoreTenantallResponseBodyData setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public QueryLinkedeploycoreDeploycoreTenantallResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkedeploycoreDeploycoreTenantallResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
