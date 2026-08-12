// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeResourceConstraintsRequest extends TeaModel {
    /**
     * <p>Specifies the instance architecture. Valid values:</p>
     * <ul>
     * <li><p>onEci: The instance is deployed on ECI.</p>
     * </li>
     * <li><p>onEcs: The instance is deployed on ECS.</p>
     * </li>
     * <li><p>onBareMetal: The instance is deployed on a bare metal resource pool.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>onEcs</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Specifies the instance edition. Valid values:</p>
     * <ul>
     * <li><p>trial: The entry-level edition.</p>
     * </li>
     * <li><p>official: The Standard Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>trial</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>Specifies the run mode of the cluster. Valid values:</p>
     * <ul>
     * <li><p>shared_nothing: The shared-nothing mode.</p>
     * </li>
     * <li><p>shared_data: The shared-data mode.</p>
     * </li>
     * <li><p>lakehouse: The data lake analytics mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shared_data</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    public static DescribeResourceConstraintsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceConstraintsRequest self = new DescribeResourceConstraintsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceConstraintsRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public DescribeResourceConstraintsRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public DescribeResourceConstraintsRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

}
