// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class ModelStsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ModelStsResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ModelStsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelStsResponseBody self = new ModelStsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelStsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModelStsResponseBody setData(ModelStsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelStsResponseBodyData getData() {
        return this.data;
    }

    public ModelStsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ModelStsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelStsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModelStsResponseBodyData extends TeaModel {
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

        public static ModelStsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelStsResponseBodyData self = new ModelStsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelStsResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ModelStsResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ModelStsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModelStsResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModelStsResponseBodyData setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public ModelStsResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
