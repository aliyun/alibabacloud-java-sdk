// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetSymUploadParamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetSymUploadParamResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>succeed in handling request</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210f07c516457690916816858d94ea</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static GetSymUploadParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSymUploadParamResponseBody self = new GetSymUploadParamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSymUploadParamResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSymUploadParamResponseBody setData(GetSymUploadParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSymUploadParamResponseBodyData getData() {
        return this.data;
    }

    public GetSymUploadParamResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetSymUploadParamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSymUploadParamResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetSymUploadParamResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LTAI5tM4ZXXXXX</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>eyJjYWxsYmFja1VybCI6Imh0dHBzOi8vYXBtLnVtZW5nLmNvbS9oc2Yvc3ltL29zcy9ub3RpZnlNc2ciLCJjYqc29uIn0=</p>
         */
        @NameInMap("callback")
        public String callback;

        /**
         * <strong>example:</strong>
         * <p>tmp/20220428/5fb6001a73749c24fd9cb356_f49a08dc1225438188c109fcf92eb9f3/symbol.zip</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyMi0wNC0yOFQwNDoxMzo0MS43OTJaIiwiY29uZGl0aW9ucyI6W1siZXEiLCIka2V5IiwidG1WpveGZTSXNJbU5oYkd4aVlXTnJRbTlrZVZSNWNHVWlPaUpoY0hCc2FXTmhkR2x2Ymk5cWMyOXVJbjA9In1dfQ==</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>3f67c435e08d164f41f6e522a2b5d1d7feb93000</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <strong>example:</strong>
         * <p><a href="https://quickbird.oss-cn-shanghai.aliyuncs.com">https://quickbird.oss-cn-shanghai.aliyuncs.com</a></p>
         */
        @NameInMap("uploadAddress")
        public String uploadAddress;

        public static GetSymUploadParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSymUploadParamResponseBodyData self = new GetSymUploadParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSymUploadParamResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetSymUploadParamResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public GetSymUploadParamResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetSymUploadParamResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetSymUploadParamResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetSymUploadParamResponseBodyData setUploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }
        public String getUploadAddress() {
            return this.uploadAddress;
        }

    }

}
