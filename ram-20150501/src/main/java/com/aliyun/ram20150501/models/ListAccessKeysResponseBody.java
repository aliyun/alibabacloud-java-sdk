// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListAccessKeysResponseBody extends TeaModel {
    @NameInMap("AccessKeys")
    public java.util.List<ListAccessKeysResponseBodyAccessKeys> accessKeys;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAccessKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysResponseBody self = new ListAccessKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysResponseBody setAccessKeys(java.util.List<ListAccessKeysResponseBodyAccessKeys> accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }
    public java.util.List<ListAccessKeysResponseBodyAccessKeys> getAccessKeys() {
        return this.accessKeys;
    }

    public ListAccessKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccessKeysResponseBodyAccessKeys extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("CreateDate")
        public String createDate;

        public static ListAccessKeysResponseBodyAccessKeys build(java.util.Map<String, ?> map) throws Exception {
            ListAccessKeysResponseBodyAccessKeys self = new ListAccessKeysResponseBodyAccessKeys();
            return TeaModel.build(map, self);
        }

        public ListAccessKeysResponseBodyAccessKeys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccessKeysResponseBodyAccessKeys setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ListAccessKeysResponseBodyAccessKeys setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
