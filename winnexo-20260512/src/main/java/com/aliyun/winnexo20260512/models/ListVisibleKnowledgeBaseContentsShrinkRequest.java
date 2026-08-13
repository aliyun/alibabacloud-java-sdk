// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBaseContentsShrinkRequest extends TeaModel {
    /**
     * <p>目录 ID（必传非空，必须在数字员工 linked_directories 及其子目录范围内）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>数字员工名称（运营对象 name）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>页码（从 1 开始）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页数量，范围 1-100</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>排序字段，可选 name / gmt_create / gmt_modified</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("sortField")
    public String sortField;

    /**
     * <p>排序方向，可选 asc / desc</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>资源类型筛选列表（有值时仅返回资源，不包含子目录）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceTypes")
    public String sourceTypesShrink;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListVisibleKnowledgeBaseContentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBaseContentsShrinkRequest self = new ListVisibleKnowledgeBaseContentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBaseContentsShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListVisibleKnowledgeBaseContentsShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListVisibleKnowledgeBaseContentsShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListVisibleKnowledgeBaseContentsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVisibleKnowledgeBaseContentsShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListVisibleKnowledgeBaseContentsShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListVisibleKnowledgeBaseContentsShrinkRequest setSourceTypesShrink(String sourceTypesShrink) {
        this.sourceTypesShrink = sourceTypesShrink;
        return this;
    }
    public String getSourceTypesShrink() {
        return this.sourceTypesShrink;
    }

    public ListVisibleKnowledgeBaseContentsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
