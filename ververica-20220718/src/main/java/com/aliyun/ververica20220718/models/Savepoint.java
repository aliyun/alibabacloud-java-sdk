// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Savepoint extends TeaModel {
    /**
     * <p>The time when the savepoint was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1659066711</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The deployment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1d716b22-6aad-4be2-85c2-50cfc757****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <p>The description of the savepoint.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5af678c0-7db0-4650-94c2-d2604f0a****</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <p>The time when the savepoint was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1659069473</p>
     */
    @NameInMap("modifiedAt")
    public Long modifiedAt;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>namespacetest</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Specifies whether the savepoint is in native format.</p>
     * 
     * <strong>example:</strong>
     * <p>TRUE</p>
     */
    @NameInMap("nativeFormat")
    public Boolean nativeFormat;

    /**
     * <p>The savepoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>354dde66-a3ae-463e-967a-0b4107fd****</p>
     */
    @NameInMap("savepointId")
    public String savepointId;

    /**
     * <p>The storage URL of the savepoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss/bucket/flink/flink-jobs/namespaces/vvp-team/deployments/5a19a71b-1c42-4f34-94fd-86cf60782c81/checkpoints/sp-3285">https://oss/bucket/flink/flink-jobs/namespaces/vvp-team/deployments/5a19a71b-1c42-4f34-94fd-86cf60782c81/checkpoints/sp-3285</a></p>
     */
    @NameInMap("savepointLocation")
    public String savepointLocation;

    /**
     * <p>The method that is used to create a savepoint.</p>
     * <ul>
     * <li><code>USER_REQUEST</code>: The savepoint is manually created.</li>
     * <li><code>STOP_WITH_SAVEPOINT</code>: The savepoint is created when you cancel the deployment.</li>
     * <li><code>RETAINED_CHECKPOINT</code>: The savepoint is created based on the returned checkpoint.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER_REQUEST</p>
     */
    @NameInMap("savepointOrigin")
    public String savepointOrigin;

    /**
     * <p>The status of the savepoint.</p>
     */
    @NameInMap("status")
    public SavepointStatus status;

    /**
     * <p>Specifies whether to use the stop-with-drain mode.</p>
     * 
     * <strong>example:</strong>
     * <p>TRUE</p>
     */
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
