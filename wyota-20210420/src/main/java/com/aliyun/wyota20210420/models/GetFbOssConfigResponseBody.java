// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetFbOssConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetFbOssConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFbOssConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFbOssConfigResponseBody self = new GetFbOssConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFbOssConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFbOssConfigResponseBody setData(GetFbOssConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFbOssConfigResponseBodyData getData() {
        return this.data;
    }

    public GetFbOssConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFbOssConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFbOssConfigResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("OssPolicy")
        public String ossPolicy;

        @NameInMap("OssSignature")
        public String ossSignature;

        @NameInMap("SessionId")
        public String sessionId;

        public static GetFbOssConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFbOssConfigResponseBodyData self = new GetFbOssConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFbOssConfigResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetFbOssConfigResponseBodyData setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public GetFbOssConfigResponseBodyData setOssPolicy(String ossPolicy) {
            this.ossPolicy = ossPolicy;
            return this;
        }
        public String getOssPolicy() {
            return this.ossPolicy;
        }

        public GetFbOssConfigResponseBodyData setOssSignature(String ossSignature) {
            this.ossSignature = ossSignature;
            return this;
        }
        public String getOssSignature() {
            return this.ossSignature;
        }

        public GetFbOssConfigResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
