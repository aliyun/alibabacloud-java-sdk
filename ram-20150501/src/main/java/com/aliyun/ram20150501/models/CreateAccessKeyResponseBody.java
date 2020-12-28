// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateAccessKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccessKey")
    public CreateAccessKeyResponseBodyAccessKey accessKey;

    public static CreateAccessKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyResponseBody self = new CreateAccessKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccessKeyResponseBody setAccessKey(CreateAccessKeyResponseBodyAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public CreateAccessKeyResponseBodyAccessKey getAccessKey() {
        return this.accessKey;
    }

    public static class CreateAccessKeyResponseBodyAccessKey extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        public static CreateAccessKeyResponseBodyAccessKey build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessKeyResponseBodyAccessKey self = new CreateAccessKeyResponseBodyAccessKey();
            return TeaModel.build(map, self);
        }

        public CreateAccessKeyResponseBodyAccessKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAccessKeyResponseBodyAccessKey setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateAccessKeyResponseBodyAccessKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateAccessKeyResponseBodyAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

    }

}
