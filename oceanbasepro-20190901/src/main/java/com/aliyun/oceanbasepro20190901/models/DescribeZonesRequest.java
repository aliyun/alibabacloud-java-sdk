// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>The deployment type of the cluster. Valid values:   </p>
     * <p>- multiple: multi-IDC deployment   </p>
     * <p>- single: single-IDC deployment   </p>
     * <p>- dual: dual-IDC deployment</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>The series of the OceanBase cluster. Valid values:   </p>
     * <p>NORMAL: the high availability version. This is the default value.</p>
     */
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
