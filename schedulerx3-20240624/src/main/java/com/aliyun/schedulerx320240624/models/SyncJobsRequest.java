// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class SyncJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobIds")
    public java.util.List<Long> jobIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-source</p>
     */
    @NameInMap("OriginalAppName")
    public String originalAppName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-00ed7f0d742b1</p>
     */
    @NameInMap("OriginalClusterId")
    public String originalClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-target</p>
     */
    @NameInMap("TargetAppName")
    public String targetAppName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-008bfb1541111</p>
     */
    @NameInMap("TargetClusterId")
    public String targetClusterId;

    public static SyncJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncJobsRequest self = new SyncJobsRequest();
        return TeaModel.build(map, self);
    }

    public SyncJobsRequest setJobIds(java.util.List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<Long> getJobIds() {
        return this.jobIds;
    }

    public SyncJobsRequest setOriginalAppName(String originalAppName) {
        this.originalAppName = originalAppName;
        return this;
    }
    public String getOriginalAppName() {
        return this.originalAppName;
    }

    public SyncJobsRequest setOriginalClusterId(String originalClusterId) {
        this.originalClusterId = originalClusterId;
        return this;
    }
    public String getOriginalClusterId() {
        return this.originalClusterId;
    }

    public SyncJobsRequest setTargetAppName(String targetAppName) {
        this.targetAppName = targetAppName;
        return this;
    }
    public String getTargetAppName() {
        return this.targetAppName;
    }

    public SyncJobsRequest setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

}
