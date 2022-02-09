// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRecommendIndexRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // SQLID
    @NameInMap("SQLId")
    public String SQLId;

    // 租户ID
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
