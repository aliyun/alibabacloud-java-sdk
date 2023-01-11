// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class BuildStsAK2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BuildStsAK2ResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BuildStsAK2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuildStsAK2ResponseBody self = new BuildStsAK2ResponseBody();
        return TeaModel.build(map, self);
    }

    public BuildStsAK2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BuildStsAK2ResponseBody setData(BuildStsAK2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BuildStsAK2ResponseBodyData getData() {
        return this.data;
    }

    public BuildStsAK2ResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public BuildStsAK2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuildStsAK2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BuildStsAK2ResponseBodyData extends TeaModel {
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

        public static BuildStsAK2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BuildStsAK2ResponseBodyData self = new BuildStsAK2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BuildStsAK2ResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public BuildStsAK2ResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public BuildStsAK2ResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BuildStsAK2ResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public BuildStsAK2ResponseBodyData setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public BuildStsAK2ResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
