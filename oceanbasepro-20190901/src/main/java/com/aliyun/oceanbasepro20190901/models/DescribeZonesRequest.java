// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("CpuArch")
    public String cpuArch;

    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeZones</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>The deployment mode.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Series")
    public String series;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }
    public String getCpuArch() {
        return this.cpuArch;
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
