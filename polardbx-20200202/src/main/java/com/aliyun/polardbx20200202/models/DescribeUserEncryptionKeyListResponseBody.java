// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeUserEncryptionKeyListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserEncryptionKeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListResponseBody self = new DescribeUserEncryptionKeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListResponseBody setData(DescribeUserEncryptionKeyListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUserEncryptionKeyListResponseBodyData getData() {
        return this.data;
    }

    public DescribeUserEncryptionKeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserEncryptionKeyListResponseBodyData extends TeaModel {
        @NameInMap("KeyIds")
        public java.util.List<String> keyIds;

        public static DescribeUserEncryptionKeyListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserEncryptionKeyListResponseBodyData self = new DescribeUserEncryptionKeyListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserEncryptionKeyListResponseBodyData setKeyIds(java.util.List<String> keyIds) {
            this.keyIds = keyIds;
            return this;
        }
        public java.util.List<String> getKeyIds() {
            return this.keyIds;
        }

    }

}
