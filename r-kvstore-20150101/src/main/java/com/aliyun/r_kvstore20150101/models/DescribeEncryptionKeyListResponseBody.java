// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyListResponseBody extends TeaModel {
    /**
     * <p>The custom keys that are available in the region.</p>
     */
    @NameInMap("KeyIds")
    public DescribeEncryptionKeyListResponseBodyKeyIds keyIds;

    /**
     * <p>The ID of the request.</p>
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
