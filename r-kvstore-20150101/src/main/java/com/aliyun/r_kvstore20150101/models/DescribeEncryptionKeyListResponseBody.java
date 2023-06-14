// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyListResponseBody extends TeaModel {
    /**
     * <p>DescribeEncryptionKeyList</p>
     */
    @NameInMap("KeyIds")
    public DescribeEncryptionKeyListResponseBodyKeyIds keyIds;

    /**
     * <p>Queries the custom keys that are available for an ApsaraDB for Redis instance to use transparent data encryption (TDE).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEncryptionKeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionKeyListResponseBody self = new DescribeEncryptionKeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionKeyListResponseBody setKeyIds(DescribeEncryptionKeyListResponseBodyKeyIds keyIds) {
        this.keyIds = keyIds;
        return this;
    }
    public DescribeEncryptionKeyListResponseBodyKeyIds getKeyIds() {
        return this.keyIds;
    }

    public DescribeEncryptionKeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEncryptionKeyListResponseBodyKeyIds extends TeaModel {
        @NameInMap("KeyId")
        public java.util.List<String> keyId;

        public static DescribeEncryptionKeyListResponseBodyKeyIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeEncryptionKeyListResponseBodyKeyIds self = new DescribeEncryptionKeyListResponseBodyKeyIds();
            return TeaModel.build(map, self);
        }

        public DescribeEncryptionKeyListResponseBodyKeyIds setKeyId(java.util.List<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public java.util.List<String> getKeyId() {
            return this.keyId;
        }

    }

}
