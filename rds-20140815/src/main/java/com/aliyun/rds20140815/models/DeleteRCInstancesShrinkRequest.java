// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCInstancesShrinkRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceIdShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TerminateSubscription")
    public Boolean terminateSubscription;

    public static DeleteRCInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCInstancesShrinkRequest self = new DeleteRCInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRCInstancesShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteRCInstancesShrinkRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteRCInstancesShrinkRequest setInstanceIdShrink(String instanceIdShrink) {
        this.instanceIdShrink = instanceIdShrink;
        return this;
    }
    public String getInstanceIdShrink() {
        return this.instanceIdShrink;
    }

    public DeleteRCInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRCInstancesShrinkRequest setTerminateSubscription(Boolean terminateSubscription) {
        this.terminateSubscription = terminateSubscription;
        return this;
    }
    public Boolean getTerminateSubscription() {
        return this.terminateSubscription;
    }

}
