// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterDynamoDBRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query all clusters in the target region, including cluster IDs. Usage notes: Status prerequisite: The DBClusterStatus of the cluster must be Running. After you call EnableDBClusterDynamoDB, the cluster enters the ConfigSwitching transitional state. You must poll DescribeDBClusterAttribute and wait for the cluster to recover. Usage notes: You must first call EnableDBClusterDynamoDB to enable the DynamoDB compatibility mode. Only PostgreSQL clusters are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DisableDBClusterDynamoDBRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterDynamoDBRequest self = new DisableDBClusterDynamoDBRequest();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterDynamoDBRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
