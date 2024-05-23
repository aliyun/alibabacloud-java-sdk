// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeCharsetRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>实例的系列  - normal（默认）：标准集群版（云盘）  - normal_ssd：标准集群版（本地盘） - history：历史库集群版。</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The return result of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantMode")
    public String tenantMode;

    public static DescribeCharsetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharsetRequest self = new DescribeCharsetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCharsetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCharsetRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public DescribeCharsetRequest setTenantMode(String tenantMode) {
        this.tenantMode = tenantMode;
        return this;
    }
    public String getTenantMode() {
        return this.tenantMode;
    }

}
