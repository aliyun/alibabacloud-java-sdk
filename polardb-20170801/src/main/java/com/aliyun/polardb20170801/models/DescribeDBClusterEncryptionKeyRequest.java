// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEncryptionKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>pc-***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeDBClusterEncryptionKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEncryptionKeyRequest self = new DescribeDBClusterEncryptionKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEncryptionKeyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDBClusterEncryptionKeyRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
