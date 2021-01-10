// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutZappinfosecarchdomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult> result;

    public static QueryLinkeBahamutZappinfosecarchdomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutZappinfosecarchdomainResponseBody self = new QueryLinkeBahamutZappinfosecarchdomainResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponseBody setResult(java.util.List<QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult extends TeaModel {
        @NameInMap("BakOwner")
        public String bakOwner;

        @NameInMap("BakTestOwner")
        public String bakTestOwner;

        @NameInMap("BuId")
        public String buId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Level")
        public String level;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("SynacId")
        public String synacId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TestOwner")
        public String testOwner;

        public static QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult self = new QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setBakOwner(String bakOwner) {
            this.bakOwner = bakOwner;
            return this;
        }
        public String getBakOwner() {
            return this.bakOwner;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setBakTestOwner(String bakTestOwner) {
            this.bakTestOwner = bakTestOwner;
            return this;
        }
        public String getBakTestOwner() {
            return this.bakTestOwner;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setBuId(String buId) {
            this.buId = buId;
            return this;
        }
        public String getBuId() {
            return this.buId;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setSynacId(String synacId) {
            this.synacId = synacId;
            return this;
        }
        public String getSynacId() {
            return this.synacId;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryLinkeBahamutZappinfosecarchdomainResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

    }

}
