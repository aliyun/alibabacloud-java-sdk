// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAdminsecretdicResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeBahamutAdminsecretdicResponseBodyResult> result;

    public static ListLinkeBahamutAdminsecretdicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAdminsecretdicResponseBody self = new ListLinkeBahamutAdminsecretdicResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutAdminsecretdicResponseBody setResult(java.util.List<ListLinkeBahamutAdminsecretdicResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutAdminsecretdicResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutAdminsecretdicResponseBodyResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Type")
        public String type;

        @NameInMap("UniqueKey")
        public String uniqueKey;

        @NameInMap("Value")
        public String value;

        public static ListLinkeBahamutAdminsecretdicResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAdminsecretdicResponseBodyResult self = new ListLinkeBahamutAdminsecretdicResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAdminsecretdicResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeBahamutAdminsecretdicResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLinkeBahamutAdminsecretdicResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutAdminsecretdicResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListLinkeBahamutAdminsecretdicResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLinkeBahamutAdminsecretdicResponseBodyResult setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

        public ListLinkeBahamutAdminsecretdicResponseBodyResult setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
