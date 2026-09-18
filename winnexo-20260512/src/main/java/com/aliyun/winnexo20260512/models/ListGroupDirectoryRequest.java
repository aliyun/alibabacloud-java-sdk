// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGroupDirectoryRequest extends TeaModel {
    /**
     * <p>The ID of a visible directory within the space. If omitted or set to root, the internal root is queried. On the first query, the existing service initialization for the root directory is used.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The collaboration space ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The sort field within the group. Valid values: name, gmt_create, and gmt_modified. Directories are listed first.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("sortField")
    public String sortField;

    /**
     * <p>The sort order within the group. Valid values: asc and desc. Directories are always listed first.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>The resource status filter. Physical subdirectories are retained. Immediate reference directories are not returned when a status filter is set. This follows the existing behavior.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("sourceStatus")
    public String sourceStatus;

    /**
     * <p>The array of resource types. If values are specified, only resources are returned. If the array is empty or omitted, no type-based filtering is applied, and the existing resource type filtering logic is used.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;TEXT&quot;]</p>
     */
    @NameInMap("sourceTypes")
    public java.util.List<String> sourceTypes;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListGroupDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupDirectoryRequest self = new ListGroupDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListGroupDirectoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListGroupDirectoryRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListGroupDirectoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListGroupDirectoryRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListGroupDirectoryRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListGroupDirectoryRequest setSourceStatus(String sourceStatus) {
        this.sourceStatus = sourceStatus;
        return this;
    }
    public String getSourceStatus() {
        return this.sourceStatus;
    }

    public ListGroupDirectoryRequest setSourceTypes(java.util.List<String> sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public java.util.List<String> getSourceTypes() {
        return this.sourceTypes;
    }

    public ListGroupDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
