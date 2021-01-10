// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData> data;

    public static QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody self = new QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBody setData(java.util.List<QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Configs")
        public java.util.List<String> configs;

        public static QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData self = new QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkedeploycoreDeploycoreProfilequerysidecarsResponseBodyData setConfigs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<String> getConfigs() {
            return this.configs;
        }

    }

}
