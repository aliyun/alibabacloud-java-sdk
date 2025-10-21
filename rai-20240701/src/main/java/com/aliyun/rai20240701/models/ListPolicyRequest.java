// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListPolicyRequest extends TeaModel {
    @NameInMap("IsSidecarPolicy")
    public Integer isSidecarPolicy;

    /**
     * <p>Sort order. The value range is as follows:</p>
     * <ul>
     * <li><p>asc (default): ascending</p>
     * </li>
     * <li><p>desc: descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, the maximum number of results returned per page.
     * Maximum limit: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Policy identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>x1bc5xgs4uhx</p>
     */
    @NameInMap("PolicyIdentifier")
    public String policyIdentifier;

    /**
     * <p>Detection policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SceneType")
    public Integer sceneType;

    /**
     * <p>Sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62****</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyRequest self = new ListPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyRequest setIsSidecarPolicy(Integer isSidecarPolicy) {
        this.isSidecarPolicy = isSidecarPolicy;
        return this;
    }
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
    }

    public ListPolicyRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListPolicyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPolicyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPolicyRequest setPolicyIdentifier(String policyIdentifier) {
        this.policyIdentifier = policyIdentifier;
        return this;
    }
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public ListPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ListPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPolicyRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public ListPolicyRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListPolicyRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
