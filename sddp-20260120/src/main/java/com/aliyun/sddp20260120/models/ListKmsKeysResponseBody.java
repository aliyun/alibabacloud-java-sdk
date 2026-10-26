// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListKmsKeysResponseBody extends TeaModel {
    /**
     * <p>The list of records returned by the query.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListKmsKeysResponseBodyItems> items;

    /**
     * <p>The request identity, which is active when you invoke the operation to locate this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
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
        /**
         * <p>The alias of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>alias/dsc-encryption</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The ID of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-12345678****</p>
         */
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
