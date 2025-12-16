// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ManageSchedulerxJobSyncRequest extends TeaModel {
    /**
     * <p>The list of task IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobIdList")
    public java.util.List<Long> jobIdList;

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

    public static ManageSchedulerxJobSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageSchedulerxJobSyncRequest self = new ManageSchedulerxJobSyncRequest();
        return TeaModel.build(map, self);
    }

    public ManageSchedulerxJobSyncRequest setJobIdList(java.util.List<Long> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public java.util.List<Long> getJobIdList() {
        return this.jobIdList;
    }

    public ManageSchedulerxJobSyncRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public ManageSchedulerxJobSyncRequest setOriginalGroupId(String originalGroupId) {
        this.originalGroupId = originalGroupId;
        return this;
    }
    public String getOriginalGroupId() {
        return this.originalGroupId;
    }

    public ManageSchedulerxJobSyncRequest setOriginalNamespace(String originalNamespace) {
        this.originalNamespace = originalNamespace;
        return this;
    }
    public String getOriginalNamespace() {
        return this.originalNamespace;
    }

    public ManageSchedulerxJobSyncRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ManageSchedulerxJobSyncRequest setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }
    public String getTargetGroupId() {
        return this.targetGroupId;
    }

    public ManageSchedulerxJobSyncRequest setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

}
