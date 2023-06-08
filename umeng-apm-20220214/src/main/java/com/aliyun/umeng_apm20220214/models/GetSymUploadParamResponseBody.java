// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetSymUploadParamResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetSymUploadParamResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
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
        @NameInMap("accessKeyId")
        public String accessKeyId;

        @NameInMap("callback")
        public String callback;

        @NameInMap("key")
        public String key;

        @NameInMap("policy")
        public String policy;

        @NameInMap("signature")
        public String signature;

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
