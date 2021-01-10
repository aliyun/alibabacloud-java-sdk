// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutMetacenterarchdomainResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutMetacenterarchdomainResponseBodyResult> result;

    public static QueryLinkeBahamutMetacenterarchdomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutMetacenterarchdomainResponseBody self = new QueryLinkeBahamutMetacenterarchdomainResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutMetacenterarchdomainResponseBody setResult(java.util.List<QueryLinkeBahamutMetacenterarchdomainResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutMetacenterarchdomainResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutMetacenterarchdomainResponseBodyResult extends TeaModel {
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

        public static QueryLinkeBahamutMetacenterarchdomainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutMetacenterarchdomainResponseBodyResult self = new QueryLinkeBahamutMetacenterarchdomainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setBakOwner(String bakOwner) {
            this.bakOwner = bakOwner;
            return this;
        }
        public String getBakOwner() {
            return this.bakOwner;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setBakTestOwner(String bakTestOwner) {
            this.bakTestOwner = bakTestOwner;
            return this;
        }
        public String getBakTestOwner() {
            return this.bakTestOwner;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setBuId(String buId) {
            this.buId = buId;
            return this;
        }
        public String getBuId() {
            return this.buId;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setSynacId(String synacId) {
            this.synacId = synacId;
            return this;
        }
        public String getSynacId() {
            return this.synacId;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryLinkeBahamutMetacenterarchdomainResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

    }

}
