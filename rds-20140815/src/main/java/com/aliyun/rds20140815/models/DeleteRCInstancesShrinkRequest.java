// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCInstancesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a precheck before releasing the instances. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Performs a precheck and does not release the instances.</li>
     * <li><strong>false</strong> (default): Sends a normal request and directly releases the instances after the check passes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcibly release running instances. Valid values:</p>
     * <ul>
     * <li><strong>Yes</strong>: Forcibly releases the instances.</li>
     * <li><strong>No</strong> (default): Does not forcibly release the instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Yes</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The instance details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceIdShrink;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
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
