// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetYzdStsAKResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetYzdStsAKResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetYzdStsAKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYzdStsAKResponseBody self = new GetYzdStsAKResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYzdStsAKResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetYzdStsAKResponseBody setData(GetYzdStsAKResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetYzdStsAKResponseBodyData getData() {
        return this.data;
    }

    public GetYzdStsAKResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetYzdStsAKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYzdStsAKResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetYzdStsAKResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("bucket")
        public String bucket;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("id")
        public String id;

        @NameInMap("internalKnowledgeId")
        public String internalKnowledgeId;

        @NameInMap("path")
        public String path;

        @NameInMap("secret")
        public String secret;

        @NameInMap("token")
        public String token;

        public static GetYzdStsAKResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetYzdStsAKResponseBodyData self = new GetYzdStsAKResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetYzdStsAKResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetYzdStsAKResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetYzdStsAKResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetYzdStsAKResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetYzdStsAKResponseBodyData setInternalKnowledgeId(String internalKnowledgeId) {
            this.internalKnowledgeId = internalKnowledgeId;
            return this;
        }
        public String getInternalKnowledgeId() {
            return this.internalKnowledgeId;
        }

        public GetYzdStsAKResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetYzdStsAKResponseBodyData setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public GetYzdStsAKResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
