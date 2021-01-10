// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutServernotificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public AddLinkeBahamutServernotificationResponseBodyResult result;

    public static AddLinkeBahamutServernotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutServernotificationResponseBody self = new AddLinkeBahamutServernotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutServernotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutServernotificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutServernotificationResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutServernotificationResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutServernotificationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutServernotificationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutServernotificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutServernotificationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutServernotificationResponseBody setResult(AddLinkeBahamutServernotificationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutServernotificationResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutServernotificationResponseBodyResult extends TeaModel {
        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Time")
        public Long time;

        @NameInMap("ShowNotification")
        public Boolean showNotification;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static AddLinkeBahamutServernotificationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutServernotificationResponseBodyResult self = new AddLinkeBahamutServernotificationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutServernotificationResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutServernotificationResponseBodyResult setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public AddLinkeBahamutServernotificationResponseBodyResult setShowNotification(Boolean showNotification) {
            this.showNotification = showNotification;
            return this;
        }
        public Boolean getShowNotification() {
            return this.showNotification;
        }

        public AddLinkeBahamutServernotificationResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutServernotificationResponseBodyResult setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public AddLinkeBahamutServernotificationResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutServernotificationResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AddLinkeBahamutServernotificationResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
