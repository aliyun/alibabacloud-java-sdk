// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRecommendIndexRequest extends TeaModel {
    /**
     * <p>The return result of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The index recommended for the SQL statement after calculation by the diagnostic system.   </p>
     * <p>- If the recommended index is the primary key, PRIMARY is returned.  </p>
     * <p>- If an index created by the user is recommended, the index name is returned.   </p>
     * <p>The system recommends only one index for an SQL statement. You can call the DescribeIndexes operation to view the indexes of a table.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeRecommendIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendIndexRequest self = new DescribeRecommendIndexRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendIndexRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRecommendIndexRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeRecommendIndexRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
