// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.um_test20211027.models;

import com.aliyun.tea.*;

public class GetOssUploadParamResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public GetOssUploadParamResponseBodyData data;

    // 异常描述
    @NameInMap("msg")
    public String msg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // traceId
    @NameInMap("traceId")
    public String traceId;

    public static GetOssUploadParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadParamResponseBody self = new GetOssUploadParamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssUploadParamResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetOssUploadParamResponseBody setData(GetOssUploadParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssUploadParamResponseBodyData getData() {
        return this.data;
    }

    public GetOssUploadParamResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetOssUploadParamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOssUploadParamResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetOssUploadParamResponseBodyData extends TeaModel {
        // 文件上传表单必要参数
        @NameInMap("accessKeyId")
        public String accessKeyId;

        // 文件上传表单必要参数
        @NameInMap("callback")
        public String callback;

        // 文件上传表单必要参数
        @NameInMap("key")
        public String key;

        // 文件上传表单必要参数
        @NameInMap("policy")
        public String policy;

        // 文件上传表单必要参数
        @NameInMap("signature")
        public String signature;

        // 文件上传地址
        @NameInMap("uploadAddress")
        public String uploadAddress;

        public static GetOssUploadParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssUploadParamResponseBodyData self = new GetOssUploadParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssUploadParamResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssUploadParamResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public GetOssUploadParamResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetOssUploadParamResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssUploadParamResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetOssUploadParamResponseBodyData setUploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }
        public String getUploadAddress() {
            return this.uploadAddress;
        }

    }

}
