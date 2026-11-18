// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class SyncJobsShrinkRequest extends TeaModel {
    /**
     * <p>The list of node IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobIds")
    public String jobIdsShrink;

    /**
     * <p>The name of the original application where the nodes are located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-source</p>
     */
    @NameInMap("OriginalAppName")
    public String originalAppName;

    /**
     * <p>The ID of the original cluster where the nodes are located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-00ed7f0d742b1</p>
     */
    @NameInMap("OriginalClusterId")
    public String originalClusterId;

    /**
     * <p>The name of the target application to which the nodes are synchronized.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-target</p>
     */
    @NameInMap("TargetAppName")
    public String targetAppName;

    /**
     * <p>The ID of the target cluster to which the nodes are synchronized.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-008bfb1541111</p>
     */
    @NameInMap("TargetClusterId")
    public String targetClusterId;

    public static SyncJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncJobsShrinkRequest self = new SyncJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncJobsShrinkRequest setJobIdsShrink(String jobIdsShrink) {
        this.jobIdsShrink = jobIdsShrink;
        return this;
    }
    public String getJobIdsShrink() {
        return this.jobIdsShrink;
    }

    public SyncJobsShrinkRequest setOriginalAppName(String originalAppName) {
        this.originalAppName = originalAppName;
        return this;
    }
    public String getOriginalAppName() {
        return this.originalAppName;
    }

    public SyncJobsShrinkRequest setOriginalClusterId(String originalClusterId) {
        this.originalClusterId = originalClusterId;
        return this;
    }
    public String getOriginalClusterId() {
        return this.originalClusterId;
    }

    public SyncJobsShrinkRequest setTargetAppName(String targetAppName) {
        this.targetAppName = targetAppName;
        return this;
    }
    public String getTargetAppName() {
        return this.targetAppName;
    }

    public SyncJobsShrinkRequest setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

}
