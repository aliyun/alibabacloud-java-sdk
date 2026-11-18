// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterDynamoDBRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters in the target region, including cluster IDs. Usage notes: Engine constraints that explicitly list the DBType and DBVersion ranges supporting the DynamoDB compatibility feature (such as Oracle 14+).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static EnableDBClusterDynamoDBRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterDynamoDBRequest self = new EnableDBClusterDynamoDBRequest();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterDynamoDBRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
