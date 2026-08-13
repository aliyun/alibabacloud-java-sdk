// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    /**
     * <p>绑定状态：BOUND(已绑定) / UNBOUND(未绑定的全局技能)；必须与 operatingObjectName 同时传入</p>
     * 
     * <strong>example:</strong>
     * <p>BOUND</p>
     */
    @NameInMap("bindStatus")
    public String bindStatus;

    /**
     * <p>技能筛选维度：ALL/BUILTIN/CUSTOM/DRAFT/ALL_WITH_DRAFTS</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("filterType")
    public String filterType;

    /**
     * <p>按技能名称或描述模糊匹配</p>
     * 
     * <strong>example:</strong>
     * <p>示例关键词</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>数字员工名称；必须与 bindStatus 同时传入</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>页码，从 1 开始</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>每页数量，范围 1-100</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>按标签过滤，数组任一命中即匹配</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsRequest self = new ListSkillsRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillsRequest setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
        return this;
    }
    public String getBindStatus() {
        return this.bindStatus;
    }

    public ListSkillsRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public ListSkillsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSkillsRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListSkillsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSkillsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillsRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public ListSkillsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
