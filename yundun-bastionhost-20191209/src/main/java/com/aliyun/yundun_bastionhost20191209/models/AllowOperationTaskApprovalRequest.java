// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AllowOperationTaskApprovalRequest extends TeaModel {
    /**
     * <p>The approval ID of the O&amp;M task.</p>
     * <blockquote>
     * <p>You can call the ListTodoOpsTaskApprovals operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApproveId")
    public String approveId;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-lbj3bw4ma02</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AllowOperationTaskApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        AllowOperationTaskApprovalRequest self = new AllowOperationTaskApprovalRequest();
        return TeaModel.build(map, self);
    }

    public AllowOperationTaskApprovalRequest setApproveId(String approveId) {
        this.approveId = approveId;
        return this;
    }
    public String getApproveId() {
        return this.approveId;
    }

    public AllowOperationTaskApprovalRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllowOperationTaskApprovalRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AllowOperationTaskApprovalRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
