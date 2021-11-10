// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListAudienceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNum")
    public String pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAudienceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAudienceRequest self = new ListAudienceRequest();
        return TeaModel.build(map, self);
    }

    public ListAudienceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListAudienceRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListAudienceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAudienceRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListAudienceRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListAudienceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAudienceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListAudienceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListAudienceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
