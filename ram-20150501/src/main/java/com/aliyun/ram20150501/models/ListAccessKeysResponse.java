// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListAccessKeysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccessKeys")
    @Validation(required = true)
    public ListAccessKeysResponseAccessKeys accessKeys;

    public static ListAccessKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysResponse self = new ListAccessKeysResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAccessKeysResponseAccessKeysAccessKey extends TeaModel {
        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static ListAccessKeysResponseAccessKeysAccessKey build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysResponseAccessKeysAccessKey self = new ListAccessKeysResponseAccessKeysAccessKey();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAccessKeysResponseAccessKeys extends TeaModel {
        @NameInMap("AccessKey")
        @Validation(required = true)
        public java.util.List<ListAccessKeysResponseAccessKeysAccessKey> accessKey;

        public static ListAccessKeysResponseAccessKeys build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysResponseAccessKeys self = new ListAccessKeysResponseAccessKeys();
            return TeaModel.build(map, self);
        }

    }

}
