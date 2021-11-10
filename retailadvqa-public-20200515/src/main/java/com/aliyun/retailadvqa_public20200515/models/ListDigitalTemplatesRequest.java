// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListDigitalTemplatesRequest extends TeaModel {
    // oem code
    @NameInMap("AccessId")
    public String accessId;

    // 排列字段名称
    @NameInMap("ColumnName")
    public String columnName;

    // 模糊查询值
    @NameInMap("Keyword")
    public String keyword;

    // 排列顺序字段
    @NameInMap("Order")
    public String order;

    // 页码
    @NameInMap("PageNum")
    public Long pageNum;

    // 页大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 短信签名
    @NameInMap("SmsSign")
    public String smsSign;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    // 工作空间
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDigitalTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalTemplatesRequest self = new ListDigitalTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalTemplatesRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListDigitalTemplatesRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListDigitalTemplatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListDigitalTemplatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDigitalTemplatesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDigitalTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDigitalTemplatesRequest setSmsSign(String smsSign) {
        this.smsSign = smsSign;
        return this;
    }
    public String getSmsSign() {
        return this.smsSign;
    }

    public ListDigitalTemplatesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListDigitalTemplatesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
