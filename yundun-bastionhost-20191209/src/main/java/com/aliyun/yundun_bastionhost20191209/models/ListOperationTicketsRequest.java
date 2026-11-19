// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationTicketsRequest extends TeaModel {
    /**
     * <p>The status of the O&amp;M ticket. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Pending approval.</p>
     * </li>
     * <li><p><strong>2</strong>: Approved.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is 1, and only tickets pending approval are queried.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    /**
     * <p>The address of the O&amp;M asset for exact search.</p>
     * 
     * <strong>example:</strong>
     * <p>10.167.XX.XX</p>
     */
    @NameInMap("AssetAddress")
    public String assetAddress;

    /**
     * <p>The instance ID of the Bastionhost.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the parameter value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the O&amp;M ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OperationTicketId")
    public String operationTicketId;

    /**
     * <p>The page number of the page to return in a paged query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries to return on each page in a paged query.<br>Maximum value of PageSize: 1000. Default value: 20. If PageSize is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Specify a value for PageSize.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListOperationTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationTicketsRequest self = new ListOperationTicketsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationTicketsRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public ListOperationTicketsRequest setAssetAddress(String assetAddress) {
        this.assetAddress = assetAddress;
        return this;
    }
    public String getAssetAddress() {
        return this.assetAddress;
    }

    public ListOperationTicketsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationTicketsRequest setOperationTicketId(String operationTicketId) {
        this.operationTicketId = operationTicketId;
        return this;
    }
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    public ListOperationTicketsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationTicketsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListOperationTicketsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListOperationTicketsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
