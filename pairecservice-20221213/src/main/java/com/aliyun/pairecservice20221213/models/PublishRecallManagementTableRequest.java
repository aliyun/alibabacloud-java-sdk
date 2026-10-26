// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PublishRecallManagementTableRequest extends TeaModel {
    /**
     * <p><strong>The instance ID.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p><strong>The enumeration value for the table synchronization mode</strong>:</p>
     * <ul>
     * <li><code>Merge</code>: Merge.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Merge</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The partition of the table to be published.</p>
     */
    @NameInMap("Partition")
    public java.util.Map<String, String> partition;

    /**
     * <p>The partition of the table to be published.</p>
     */
    @NameInMap("Partitions")
    public java.util.Map<String, String> partitions;

    /**
     * <p><strong>Specifies whether to skip the threshold check when synchronizing the table.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipThresholdCheck")
    public Boolean skipThresholdCheck;

    /**
     * <p>The start time of incremental data playback (UNIX milliseconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1792512000000</p>
     */
    @NameInMap("StartTimestampMs")
    public Long startTimestampMs;

    public static PublishRecallManagementTableRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRecallManagementTableRequest self = new PublishRecallManagementTableRequest();
        return TeaModel.build(map, self);
    }

    public PublishRecallManagementTableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PublishRecallManagementTableRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public PublishRecallManagementTableRequest setPartition(java.util.Map<String, String> partition) {
        this.partition = partition;
        return this;
    }
    public java.util.Map<String, String> getPartition() {
        return this.partition;
    }

    public PublishRecallManagementTableRequest setPartitions(java.util.Map<String, String> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.Map<String, String> getPartitions() {
        return this.partitions;
    }

    public PublishRecallManagementTableRequest setSkipThresholdCheck(Boolean skipThresholdCheck) {
        this.skipThresholdCheck = skipThresholdCheck;
        return this;
    }
    public Boolean getSkipThresholdCheck() {
        return this.skipThresholdCheck;
    }

    public PublishRecallManagementTableRequest setStartTimestampMs(Long startTimestampMs) {
        this.startTimestampMs = startTimestampMs;
        return this;
    }
    public Long getStartTimestampMs() {
        return this.startTimestampMs;
    }

}
