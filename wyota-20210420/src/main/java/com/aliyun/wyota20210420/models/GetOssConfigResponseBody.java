// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetOssConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOssConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOssConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssConfigResponseBody self = new GetOssConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOssConfigResponseBody setData(GetOssConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssConfigResponseBodyData getData() {
        return this.data;
    }

    public GetOssConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssConfigResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("OssPolicy")
        public String ossPolicy;

        @NameInMap("OssSignature")
        public String ossSignature;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetOssConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssConfigResponseBodyData self = new GetOssConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssConfigResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssConfigResponseBodyData setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public GetOssConfigResponseBodyData setOssPolicy(String ossPolicy) {
            this.ossPolicy = ossPolicy;
            return this;
        }
        public String getOssPolicy() {
            return this.ossPolicy;
        }

        public GetOssConfigResponseBodyData setOssSignature(String ossSignature) {
            this.ossSignature = ossSignature;
            return this;
        }
        public String getOssSignature() {
            return this.ossSignature;
        }

        public GetOssConfigResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
