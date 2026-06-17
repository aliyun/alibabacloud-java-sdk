// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEncryptionKeyRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a>Operation to query the details of all clusters in your account, including cluster IDs.</p>
     * </blockquote>
     * 
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
