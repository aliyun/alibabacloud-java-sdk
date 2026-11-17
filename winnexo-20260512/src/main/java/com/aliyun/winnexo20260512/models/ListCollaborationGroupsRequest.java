// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupsRequest extends TeaModel {
    /**
     * <p>The search keyword. This parameter is optional and can contain up to 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Workflow</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number. Pages start from 1.</p>
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
     * <p>The tenant ID. If you do not specify this parameter, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListCollaborationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollaborationGroupsRequest self = new ListCollaborationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListCollaborationGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCollaborationGroupsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListCollaborationGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCollaborationGroupsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
