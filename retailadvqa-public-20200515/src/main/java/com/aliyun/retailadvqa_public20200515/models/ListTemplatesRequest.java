// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    // 模板来源
    @NameInMap("Comefrom")
    public String comefrom;

    // 页码
    @NameInMap("PageNum")
    public Long pageNum;

    // 页大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 模糊查询值
    @NameInMap("Keyword")
    public String keyword;

    // 排序顺序字段
    @NameInMap("Order")
    public String order;

    // 排序字段名称
    @NameInMap("ColumnName")
    public String columnName;

    // 模板类型
    @NameInMap("TemplateType")
    public Long templateType;

    // 平台id
    @NameInMap("PlatformId")
    public String platformId;

    // 是否为变量模板
    @NameInMap("IsVariable")
    public Long isVariable;

    // oemcode
    @NameInMap("AccessId")
    public String accessId;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setComefrom(String comefrom) {
        this.comefrom = comefrom;
        return this;
    }
    public String getComefrom() {
        return this.comefrom;
    }

    public ListTemplatesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTemplatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTemplatesRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListTemplatesRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

    public ListTemplatesRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public ListTemplatesRequest setIsVariable(Long isVariable) {
        this.isVariable = isVariable;
        return this;
    }
    public Long getIsVariable() {
        return this.isVariable;
    }

    public ListTemplatesRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListTemplatesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListTemplatesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
