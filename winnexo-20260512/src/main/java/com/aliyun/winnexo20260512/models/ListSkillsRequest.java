// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    /**
     * <p>The binding status. Valid values: BOUND (bound) and UNBOUND (unbound global skills). Must be specified together with operatingObjectName.</p>
     * 
     * <strong>example:</strong>
     * <p>BOUND</p>
     */
    @NameInMap("bindStatus")
    public String bindStatus;

    /**
     * <p>The filter expression type.</p>
     * <ul>
     * <li>SQL: SQL-based filtering.</li>
     * <li>TAG: Tag-based filtering.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("filterType")
    public String filterType;

    /**
     * <p>The search keyword. Supports fuzzy search by API name or exact search by API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleKeyword</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The digital employee name. Used to calculate the CodeAgent allowedSkills whitelist based on binding relationships.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The tag filtering parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
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
