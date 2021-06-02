// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetUserBucketConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    @NameInMap("Config")
    public GetUserBucketConfigResponseBodyConfig config;

    public static GetUserBucketConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserBucketConfigResponseBody self = new GetUserBucketConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserBucketConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserBucketConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetUserBucketConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserBucketConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserBucketConfigResponseBody setConfig(GetUserBucketConfigResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetUserBucketConfigResponseBodyConfig getConfig() {
        return this.config;
    }

    public static class GetUserBucketConfigResponseBodyConfigInput extends TeaModel {
        @NameInMap("Id")
        public String id;

        // bucket名称（3-63位字符）
        @NameInMap("BucketName")
        public String bucketName;

        // oss地域
        @NameInMap("Location")
        public String location;

        public static GetUserBucketConfigResponseBodyConfigInput build(java.util.Map<String, ?> map) throws Exception {
            GetUserBucketConfigResponseBodyConfigInput self = new GetUserBucketConfigResponseBodyConfigInput();
            return TeaModel.build(map, self);
        }

        public GetUserBucketConfigResponseBodyConfigInput setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserBucketConfigResponseBodyConfigInput setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetUserBucketConfigResponseBodyConfigInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class GetUserBucketConfigResponseBodyConfigOutput extends TeaModel {
        @NameInMap("Id")
        public String id;

        // bucket名称（3-63位字符）
        @NameInMap("BucketName")
        public String bucketName;

        // oss地域
        @NameInMap("Location")
        public String location;

        public static GetUserBucketConfigResponseBodyConfigOutput build(java.util.Map<String, ?> map) throws Exception {
            GetUserBucketConfigResponseBodyConfigOutput self = new GetUserBucketConfigResponseBodyConfigOutput();
            return TeaModel.build(map, self);
        }

        public GetUserBucketConfigResponseBodyConfigOutput setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserBucketConfigResponseBodyConfigOutput setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetUserBucketConfigResponseBodyConfigOutput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class GetUserBucketConfigResponseBodyConfig extends TeaModel {
        @NameInMap("Input")
        public GetUserBucketConfigResponseBodyConfigInput input;

        @NameInMap("Output")
        public GetUserBucketConfigResponseBodyConfigOutput output;

        public static GetUserBucketConfigResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetUserBucketConfigResponseBodyConfig self = new GetUserBucketConfigResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetUserBucketConfigResponseBodyConfig setInput(GetUserBucketConfigResponseBodyConfigInput input) {
            this.input = input;
            return this;
        }
        public GetUserBucketConfigResponseBodyConfigInput getInput() {
            return this.input;
        }

        public GetUserBucketConfigResponseBodyConfig setOutput(GetUserBucketConfigResponseBodyConfigOutput output) {
            this.output = output;
            return this;
        }
        public GetUserBucketConfigResponseBodyConfigOutput getOutput() {
            return this.output;
        }

    }

}
