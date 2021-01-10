// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutApplevelsResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeBahamutApplevelsResponseBodyResult> result;

    public static ListLinkeBahamutApplevelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutApplevelsResponseBody self = new ListLinkeBahamutApplevelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutApplevelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutApplevelsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutApplevelsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutApplevelsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutApplevelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutApplevelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutApplevelsResponseBody setResult(java.util.List<ListLinkeBahamutApplevelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutApplevelsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutApplevelsResponseBodyResult extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerLoginName")
        public String ownerLoginName;

        public static ListLinkeBahamutApplevelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutApplevelsResponseBodyResult self = new ListLinkeBahamutApplevelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutApplevelsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutApplevelsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutApplevelsResponseBodyResult setOwnerLoginName(String ownerLoginName) {
            this.ownerLoginName = ownerLoginName;
            return this;
        }
        public String getOwnerLoginName() {
            return this.ownerLoginName;
        }

    }

}
