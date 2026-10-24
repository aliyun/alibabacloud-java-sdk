// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeResourceConstraintsRequest extends TeaModel {
    /**
     * <p>The instance architecture. Valid values:</p>
     * <ul>
     * <li>onEci: Deployed on ECI.</li>
     * <li>onEcs: Deployed on ECS.</li>
     * <li>onBareMetal: Deployed on a bare metal resource pool.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>onEcs</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li>trial: Trial edition.</li>
     * <li>official: Standard edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>trial</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The running mode of the cluster. Valid values:</p>
     * <ul>
     * <li>shared_nothing: Integrated storage and compute.</li>
     * <li>shared_data: Separated storage and compute.</li>
     * <li>lakehouse: Data lakehouse analysis.</li>
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
