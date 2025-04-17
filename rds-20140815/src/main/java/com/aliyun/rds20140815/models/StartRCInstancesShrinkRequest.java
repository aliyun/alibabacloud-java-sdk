// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartRCInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The batch operation mode. Set the value to <strong>AllTogether</strong>. In this mode, a success message is returned if all specified instances are started. If an instance fails the verification, none of the specified instances can be started and an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AllTogether</p>
     */
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    /**
     * <p>The node IDs.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartRCInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRCInstancesShrinkRequest self = new StartRCInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartRCInstancesShrinkRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public StartRCInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public StartRCInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
