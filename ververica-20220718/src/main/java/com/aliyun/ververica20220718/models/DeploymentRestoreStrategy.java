// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeploymentRestoreStrategy extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TRUE</p>
     */
    @NameInMap("allowNonRestoredState")
    public Boolean allowNonRestoredState;

    /**
     * <strong>example:</strong>
     * <p>1660293803155</p>
     */
    @NameInMap("jobStartTimeInMs")
    public Long jobStartTimeInMs;

    /**
     * <strong>example:</strong>
     * <p>LATEST_STATE</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
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
