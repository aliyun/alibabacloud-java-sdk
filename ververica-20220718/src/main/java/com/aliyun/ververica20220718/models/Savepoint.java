// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Savepoint extends TeaModel {
    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("deploymentId")
    public String deploymentId;

    @NameInMap("description")
    public String description;

    @NameInMap("jobId")
    public String jobId;

    @NameInMap("modifiedAt")
    public Long modifiedAt;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("nativeFormat")
    public Boolean nativeFormat;

    @NameInMap("savepointId")
    public String savepointId;

    @NameInMap("savepointLocation")
    public String savepointLocation;

    @NameInMap("savepointOrigin")
    public String savepointOrigin;

    @NameInMap("status")
    public SavepointStatus status;

    @NameInMap("stopWithDrainEnabled")
    public Boolean stopWithDrainEnabled;

    public static Savepoint build(java.util.Map<String, ?> map) throws Exception {
        Savepoint self = new Savepoint();
        return TeaModel.build(map, self);
    }

    public Savepoint setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Savepoint setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public Savepoint setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Savepoint setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public Savepoint setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    public Savepoint setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Savepoint setNativeFormat(Boolean nativeFormat) {
        this.nativeFormat = nativeFormat;
        return this;
    }
    public Boolean getNativeFormat() {
        return this.nativeFormat;
    }

    public Savepoint setSavepointId(String savepointId) {
        this.savepointId = savepointId;
        return this;
    }
    public String getSavepointId() {
        return this.savepointId;
    }

    public Savepoint setSavepointLocation(String savepointLocation) {
        this.savepointLocation = savepointLocation;
        return this;
    }
    public String getSavepointLocation() {
        return this.savepointLocation;
    }

    public Savepoint setSavepointOrigin(String savepointOrigin) {
        this.savepointOrigin = savepointOrigin;
        return this;
    }
    public String getSavepointOrigin() {
        return this.savepointOrigin;
    }

    public Savepoint setStatus(SavepointStatus status) {
        this.status = status;
        return this;
    }
    public SavepointStatus getStatus() {
        return this.status;
    }

    public Savepoint setStopWithDrainEnabled(Boolean stopWithDrainEnabled) {
        this.stopWithDrainEnabled = stopWithDrainEnabled;
        return this;
    }
    public Boolean getStopWithDrainEnabled() {
        return this.stopWithDrainEnabled;
    }

}
