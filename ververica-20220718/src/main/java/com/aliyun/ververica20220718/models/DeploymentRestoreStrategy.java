// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeploymentRestoreStrategy extends TeaModel {
    /**
     * <p>Specifies whether to allow specific operator states to be skipped. This parameter is required only when a Python deployment or a JAR deployment is resumed with state data.</p>
     * 
     * <strong>example:</strong>
     * <p>TRUE</p>
     */
    @NameInMap("allowNonRestoredState")
    public Boolean allowNonRestoredState;

    /**
     * <p>The time point at which the deployment is started without states. You must enter a 13-digit timestamp. If you set the kind parameter to NONE, you can configure this parameter to allow all source tables for which the startTime parameter is configured to read data from the specified time point.</p>
     * 
     * <strong>example:</strong>
     * <p>1660293803155</p>
     */
    @NameInMap("jobStartTimeInMs")
    public Long jobStartTimeInMs;

    /**
     * <p>The type of the start offset. Valid values:</p>
     * <ul>
     * <li>NONE: The deployment is started without states.</li>
     * <li>LATEST_SAVEPOINT: The deployment is started from the latest savepoint.</li>
     * <li>FROM_SAVEPOINT: The deployment is started from the specified savepoint.</li>
     * <li>LATEST_STATE: The deployment is started from the latest state of the deployment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LATEST_STATE</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The ID of the savepoint for starting the deployment. This parameter is required when the kind parameter is set to FROM_SAVEPOINT.</p>
     * 
     * <strong>example:</strong>
     * <p>354dde66-a3ae-463e-967a-0b4107fd****</p>
     */
    @NameInMap("savepointId")
    public String savepointId;

    public static DeploymentRestoreStrategy build(java.util.Map<String, ?> map) throws Exception {
        DeploymentRestoreStrategy self = new DeploymentRestoreStrategy();
        return TeaModel.build(map, self);
    }

    public DeploymentRestoreStrategy setAllowNonRestoredState(Boolean allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
        return this;
    }
    public Boolean getAllowNonRestoredState() {
        return this.allowNonRestoredState;
    }

    public DeploymentRestoreStrategy setJobStartTimeInMs(Long jobStartTimeInMs) {
        this.jobStartTimeInMs = jobStartTimeInMs;
        return this;
    }
    public Long getJobStartTimeInMs() {
        return this.jobStartTimeInMs;
    }

    public DeploymentRestoreStrategy setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public DeploymentRestoreStrategy setSavepointId(String savepointId) {
        this.savepointId = savepointId;
        return this;
    }
    public String getSavepointId() {
        return this.savepointId;
    }

}
