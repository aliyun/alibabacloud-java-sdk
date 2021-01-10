// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData> data;

    public static QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody self = new QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody setData(java.util.List<QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData self = new QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
