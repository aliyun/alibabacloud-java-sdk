// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.um_test20211027.models;

import com.aliyun.tea.*;

public class GetOssUploadParam2ResponseBody extends TeaModel {
    // traceId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("data")
    public GetOssUploadParam2ResponseBodyData data;

    public static GetOssUploadParam2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadParam2ResponseBody self = new GetOssUploadParam2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssUploadParam2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssUploadParam2ResponseBody setData(GetOssUploadParam2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssUploadParam2ResponseBodyData getData() {
        return this.data;
    }

    public static class GetOssUploadParam2ResponseBodyData extends TeaModel {
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

        public static GetOssUploadParam2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssUploadParam2ResponseBodyData self = new GetOssUploadParam2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssUploadParam2ResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssUploadParam2ResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public GetOssUploadParam2ResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetOssUploadParam2ResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssUploadParam2ResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetOssUploadParam2ResponseBodyData setUploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }
        public String getUploadAddress() {
            return this.uploadAddress;
        }

    }

}
