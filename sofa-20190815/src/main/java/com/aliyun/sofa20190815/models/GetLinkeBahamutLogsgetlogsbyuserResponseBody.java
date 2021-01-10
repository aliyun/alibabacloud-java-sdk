// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutLogsgetlogsbyuserResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult> result;

    public static GetLinkeBahamutLogsgetlogsbyuserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutLogsgetlogsbyuserResponseBody self = new GetLinkeBahamutLogsgetlogsbyuserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutLogsgetlogsbyuserResponseBody setResult(java.util.List<GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult self = new GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setContentDetail(String contentDetail) {
            this.contentDetail = contentDetail;
            return this;
        }
        public String getContentDetail() {
            return this.contentDetail;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setPostValue(String postValue) {
            this.postValue = postValue;
            return this;
        }
        public String getPostValue() {
            return this.postValue;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setPreValue(String preValue) {
            this.preValue = preValue;
            return this;
        }
        public String getPreValue() {
            return this.preValue;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutLogsgetlogsbyuserResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
