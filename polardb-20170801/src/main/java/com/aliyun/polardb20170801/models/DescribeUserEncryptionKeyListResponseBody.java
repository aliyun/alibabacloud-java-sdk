// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("KeyList")
    public java.util.List<String> keyList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserEncryptionKeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListResponseBody self = new DescribeUserEncryptionKeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeUserEncryptionKeyListResponseBody setKeyList(java.util.List<String> keyList) {
        this.keyList = keyList;
        return this;
    }
    public java.util.List<String> getKeyList() {
        return this.keyList;
    }

    public DescribeUserEncryptionKeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
