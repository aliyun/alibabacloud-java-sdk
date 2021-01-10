// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetlogsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutWebapigetlogsResponseBodyResult> result;

    public static GetLinkeBahamutWebapigetlogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetlogsResponseBody self = new GetLinkeBahamutWebapigetlogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutWebapigetlogsResponseBody setResult(java.util.List<GetLinkeBahamutWebapigetlogsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutWebapigetlogsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutWebapigetlogsResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentDetail")
        public String contentDetail;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("PostValue")
        public String postValue;

        @NameInMap("PreValue")
        public String preValue;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("Time")
        public Long time;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Type")
        public String type;

        @NameInMap("User")
        public String user;

        public static GetLinkeBahamutWebapigetlogsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutWebapigetlogsResponseBodyResult self = new GetLinkeBahamutWebapigetlogsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setContentDetail(String contentDetail) {
            this.contentDetail = contentDetail;
            return this;
        }
        public String getContentDetail() {
            return this.contentDetail;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setPostValue(String postValue) {
            this.postValue = postValue;
            return this;
        }
        public String getPostValue() {
            return this.postValue;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setPreValue(String preValue) {
            this.preValue = preValue;
            return this;
        }
        public String getPreValue() {
            return this.preValue;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutWebapigetlogsResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
