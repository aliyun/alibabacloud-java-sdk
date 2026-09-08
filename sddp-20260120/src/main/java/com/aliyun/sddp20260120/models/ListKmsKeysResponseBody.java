// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListKmsKeysResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListKmsKeysResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    public static ListKmsKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKmsKeysResponseBody self = new ListKmsKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKmsKeysResponseBody setItems(java.util.List<ListKmsKeysResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListKmsKeysResponseBodyItems> getItems() {
        return this.items;
    }

    public ListKmsKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListKmsKeysResponseBodyItems extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("KeyId")
        public String keyId;

        public static ListKmsKeysResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListKmsKeysResponseBodyItems self = new ListKmsKeysResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListKmsKeysResponseBodyItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListKmsKeysResponseBodyItems setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

    }

}
