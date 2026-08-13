// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListChatSessionsRequest extends TeaModel {
    /**
     * <p>数字员工名称筛选（逗号分隔，如 sales_agent,service_agent）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <p>标题模糊搜索</p>
     * 
     * <strong>example:</strong>
     * <p>示例关键词</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>页码，从 1 开始</p>
     */
    @NameInMap("page")
    public Integer page;

    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>租户ID</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListChatSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatSessionsRequest self = new ListChatSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListChatSessionsRequest setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public ListChatSessionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListChatSessionsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListChatSessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChatSessionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
