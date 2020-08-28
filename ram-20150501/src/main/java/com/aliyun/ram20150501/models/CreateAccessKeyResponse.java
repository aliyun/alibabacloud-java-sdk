// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateAccessKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccessKey")
    @Validation(required = true)
    public CreateAccessKeyResponseAccessKey accessKey;

    public static CreateAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyResponse self = new CreateAccessKeyResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateAccessKeyResponseAccessKey extends TeaModel {
        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        @Validation(required = true)
        public String accessKeySecret;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreateAccessKeyResponseAccessKey build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessKeyResponseAccessKey self = new CreateAccessKeyResponseAccessKey();
            return TeaModel.build(map, self);
        }

    }

}
