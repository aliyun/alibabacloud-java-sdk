// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ManageSchedulerxJobSyncShrinkRequest extends TeaModel {
    /**
     * <p>The list of task IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobIdList")
    public String jobIdListShrink;

    /**
     * <p>The source of the namespace. Required only for specific third-party cases.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The source application group to which the task belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("OriginalGroupId")
    public String originalGroupId;

    /**
     * <p>The source namespace where the task resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("OriginalNamespace")
    public String originalNamespace;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the destination application group to which the task will be synchronized.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSyncJobGroup</p>
     */
    @NameInMap("TargetGroupId")
    public String targetGroupId;

    /**
     * <p>The destination namespace to which the task will be synchronized.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5f56ef65-b836-493d-b40b-c4db6425****</p>
     */
    @NameInMap("TargetNamespace")
    public String targetNamespace;

    public static ManageSchedulerxJobSyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageSchedulerxJobSyncShrinkRequest self = new ManageSchedulerxJobSyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ManageSchedulerxJobSyncShrinkRequest setJobIdListShrink(String jobIdListShrink) {
        this.jobIdListShrink = jobIdListShrink;
        return this;
    }
    public String getJobIdListShrink() {
        return this.jobIdListShrink;
    }

    public ManageSchedulerxJobSyncShrinkRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public ManageSchedulerxJobSyncShrinkRequest setOriginalGroupId(String originalGroupId) {
        this.originalGroupId = originalGroupId;
        return this;
    }
    public String getOriginalGroupId() {
        return this.originalGroupId;
    }

    public ManageSchedulerxJobSyncShrinkRequest setOriginalNamespace(String originalNamespace) {
        this.originalNamespace = originalNamespace;
        return this;
    }
    public String getOriginalNamespace() {
        return this.originalNamespace;
    }

    public ManageSchedulerxJobSyncShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ManageSchedulerxJobSyncShrinkRequest setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }
    public String getTargetGroupId() {
        return this.targetGroupId;
    }

    public ManageSchedulerxJobSyncShrinkRequest setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

}
