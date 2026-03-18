// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeResourceConstraintsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>onEcs</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <strong>example:</strong>
     * <p>trial</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
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
