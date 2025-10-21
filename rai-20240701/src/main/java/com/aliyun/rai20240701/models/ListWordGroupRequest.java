// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListWordGroupRequest extends TeaModel {
    /**
     * <p>Keyword group name.</p>
     * 
     * <strong>example:</strong>
     * <p>testGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>When performing a paginated query, sort the specified field in ascending or descending order. Values are as follows:</p>
     * <ul>
     * <li>asc: Ascending.</li>
     * <li>desc: Descending.</li>
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
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
     * <p>620***</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListWordGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWordGroupRequest self = new ListWordGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListWordGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListWordGroupRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListWordGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWordGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWordGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListWordGroupRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListWordGroupRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
