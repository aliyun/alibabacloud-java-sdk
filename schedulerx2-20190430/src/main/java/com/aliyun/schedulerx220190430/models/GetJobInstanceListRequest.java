// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceListRequest extends TeaModel {
    /**
     * <p>结束时间（时间戳）。</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The ID of the application. You can obtain the application ID on the Application Management page in the SchedulerX console.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the job. You can obtain the ID of the job on the Task Management page in the SchedulerX console.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the namespace. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>开始时间（时间戳）。</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>实例状态。包含以下几种状态：</p>
     * <br>
     * <p>1：等待</p>
     * <p>3：运行中</p>
     * <p>4：成功</p>
     * <p>5：失败</p>
     * <p>9：拒绝</p>
     * <p>对应枚举类： com.alibaba.schedulerx.common.domain.InstanceStatus</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static GetJobInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceListRequest self = new GetJobInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceListRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public GetJobInstanceListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetJobInstanceListRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetJobInstanceListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetJobInstanceListRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public GetJobInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetJobInstanceListRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public GetJobInstanceListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
