// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGroupDirectoriesRequest extends TeaModel {
    /**
     * <p>The ID of a visible directory in the current space. If this parameter is omitted or set to root, the space root is queried. The first query reuses the existing service-initialized internal root directory.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The ID of the collaborative share.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The sort field. Valid values: name, gmt_create, and gmt_modified.</p>
     * 
     * <strong>example:</strong>
     * <p>gmt_create</p>
     */
    @NameInMap("sortField")
    public String sortField;

    /**
     * <p>The sort order. Valid values: asc and desc.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListGroupDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupDirectoriesRequest self = new ListGroupDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupDirectoriesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListGroupDirectoriesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListGroupDirectoriesRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListGroupDirectoriesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListGroupDirectoriesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
