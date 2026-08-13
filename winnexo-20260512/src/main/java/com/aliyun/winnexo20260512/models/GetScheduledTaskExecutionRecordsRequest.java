// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskExecutionRecordsRequest extends TeaModel {
    /**
     * <p>协作群组 ID（如 cg_101）；传入时按群维度返回（调用者需为有效群成员），未传时为个人维度（排除群任务）</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>页码，从1开始</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCollaborationGroupId</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>每页任务数（1~100）</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetScheduledTaskExecutionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskExecutionRecordsRequest self = new GetScheduledTaskExecutionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskExecutionRecordsRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetScheduledTaskExecutionRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetScheduledTaskExecutionRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetScheduledTaskExecutionRecordsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
