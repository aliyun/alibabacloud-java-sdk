// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableZoneRequest extends TeaModel {
    @NameInMap("CpuArch")
    public String cpuArch;

    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ObVersion")
    public String obVersion;

    @NameInMap("Series")
    public String series;

    @NameInMap("Spec")
    public String spec;

    public static DescribeAvailableZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZoneRequest self = new DescribeAvailableZoneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZoneRequest setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }
    public String getCpuArch() {
        return this.cpuArch;
    }

    public DescribeAvailableZoneRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public DescribeAvailableZoneRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeAvailableZoneRequest setObVersion(String obVersion) {
        this.obVersion = obVersion;
        return this;
    }
    public String getObVersion() {
        return this.obVersion;
    }

    public DescribeAvailableZoneRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public DescribeAvailableZoneRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
