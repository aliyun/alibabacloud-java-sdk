// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class BuildStsAKResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BuildStsAKResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BuildStsAKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuildStsAKResponseBody self = new BuildStsAKResponseBody();
        return TeaModel.build(map, self);
    }

    public BuildStsAKResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BuildStsAKResponseBody setData(BuildStsAKResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BuildStsAKResponseBodyData getData() {
        return this.data;
    }

    public BuildStsAKResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public BuildStsAKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuildStsAKResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BuildStsAKResponseBodyData extends TeaModel {
        @NameInMap("bucket")
        public String bucket;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("id")
        public String id;

        @NameInMap("path")
        public String path;

        @NameInMap("secret")
        public String secret;

        @NameInMap("token")
        public String token;

        public static BuildStsAKResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BuildStsAKResponseBodyData self = new BuildStsAKResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BuildStsAKResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public BuildStsAKResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public BuildStsAKResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BuildStsAKResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public BuildStsAKResponseBodyData setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public BuildStsAKResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
