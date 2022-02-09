// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    // 集群的部署类型。- multiple：多机房 - single：单机房 - dual：双机房
    @NameInMap("DeployType")
    public String deployType;

    // Oceanbase集群的系列 - normal（默认）：高可用版本 - basic：基础版本
    @NameInMap("Series")
    public String series;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public DescribeZonesRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

}
