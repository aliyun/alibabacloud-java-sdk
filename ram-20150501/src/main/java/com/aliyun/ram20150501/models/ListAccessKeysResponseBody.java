// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListAccessKeysResponseBody extends TeaModel {
    /**
     * <p>The list of AccessKey pairs that belong to the RAM user.</p>
     */
    @NameInMap("AccessKeys")
    public ListAccessKeysResponseBodyAccessKeys accessKeys;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAccessKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysResponseBody self = new ListAccessKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysResponseBody setAccessKeys(ListAccessKeysResponseBodyAccessKeys accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }
    public ListAccessKeysResponseBodyAccessKeys getAccessKeys() {
        return this.accessKeys;
    }

    public ListAccessKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccessKeysResponseBodyAccessKeysAccessKey extends TeaModel {
        /**
         * <p>The AccessKey ID.</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The time when the AccessKey pair was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The status of the AccessKey pair. Valid values: Active and Inactive.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAccessKeysResponseBodyAccessKeysAccessKey build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysResponseBodyAccessKeysAccessKey self = new ListAccessKeysResponseBodyAccessKeysAccessKey();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysResponseBodyAccessKeysAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ListAccessKeysResponseBodyAccessKeysAccessKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListAccessKeysResponseBodyAccessKeysAccessKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAccessKeysResponseBodyAccessKeys extends TeaModel {
        @NameInMap("AccessKey")
        public java.util.List<ListAccessKeysResponseBodyAccessKeysAccessKey> accessKey;

        public static ListAccessKeysResponseBodyAccessKeys build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysResponseBodyAccessKeys self = new ListAccessKeysResponseBodyAccessKeys();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysResponseBodyAccessKeys setAccessKey(java.util.List<ListAccessKeysResponseBodyAccessKeysAccessKey> accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public java.util.List<ListAccessKeysResponseBodyAccessKeysAccessKey> getAccessKey() {
            return this.accessKey;
        }

    }

}
