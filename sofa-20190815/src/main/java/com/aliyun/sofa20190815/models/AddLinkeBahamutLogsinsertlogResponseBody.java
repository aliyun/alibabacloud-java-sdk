// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutLogsinsertlogResponseBody extends TeaModel {
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
    public AddLinkeBahamutLogsinsertlogResponseBodyResult result;

    public static AddLinkeBahamutLogsinsertlogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutLogsinsertlogResponseBody self = new AddLinkeBahamutLogsinsertlogResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutLogsinsertlogResponseBody setResult(AddLinkeBahamutLogsinsertlogResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutLogsinsertlogResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutLogsinsertlogResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Time")
        public Long time;

        @NameInMap("User")
        public String user;

        @NameInMap("ContentDetail")
        public String contentDetail;

        @NameInMap("PostValue")
        public String postValue;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("PreValue")
        public String preValue;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Content")
        public String content;

        @NameInMap("Target")
        public String target;

        @NameInMap("Id")
        public String id;

        public static AddLinkeBahamutLogsinsertlogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutLogsinsertlogResponseBodyResult self = new AddLinkeBahamutLogsinsertlogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setContentDetail(String contentDetail) {
            this.contentDetail = contentDetail;
            return this;
        }
        public String getContentDetail() {
            return this.contentDetail;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setPostValue(String postValue) {
            this.postValue = postValue;
            return this;
        }
        public String getPostValue() {
            return this.postValue;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setPreValue(String preValue) {
            this.preValue = preValue;
            return this;
        }
        public String getPreValue() {
            return this.preValue;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public AddLinkeBahamutLogsinsertlogResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
