// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppstacksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListLinkeBahamutAppstacksResponseBodyResult> result;

    public static ListLinkeBahamutAppstacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppstacksResponseBody self = new ListLinkeBahamutAppstacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppstacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutAppstacksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutAppstacksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutAppstacksResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutAppstacksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutAppstacksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutAppstacksResponseBody setResult(java.util.List<ListLinkeBahamutAppstacksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutAppstacksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutAppstacksResponseBodyResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Status")
        public String status;

        public static ListLinkeBahamutAppstacksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAppstacksResponseBodyResult self = new ListLinkeBahamutAppstacksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAppstacksResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeBahamutAppstacksResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutAppstacksResponseBodyResult setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public ListLinkeBahamutAppstacksResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutAppstacksResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListLinkeBahamutAppstacksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
