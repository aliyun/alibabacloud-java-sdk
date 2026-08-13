// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListPersonalDirectoryContentsShrinkRequest extends TeaModel {
    /**
     * <p>目录 ID（必传非空）；传 &quot;root&quot; 时 service 自动解析当前数字员工的默认根目录并返回其下内容（首屏知识库卡片场景），传具体目录 ID 时返回该目录下子目录与资源</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>数字员工名称（已废弃：不再作为个人资源隔离条件，仅保留用于来源追溯）</p>
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
     * <p>资源类型筛选列表（有值时仅返回资源，不包含子目录）；支持虚拟类型 OUTPUT（产出保存的资源，service 自动反查关联表）</p>
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

    public static ListPersonalDirectoryContentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPersonalDirectoryContentsShrinkRequest self = new ListPersonalDirectoryContentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPersonalDirectoryContentsShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListPersonalDirectoryContentsShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListPersonalDirectoryContentsShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListPersonalDirectoryContentsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonalDirectoryContentsShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListPersonalDirectoryContentsShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListPersonalDirectoryContentsShrinkRequest setSourceTypesShrink(String sourceTypesShrink) {
        this.sourceTypesShrink = sourceTypesShrink;
        return this;
    }
    public String getSourceTypesShrink() {
        return this.sourceTypesShrink;
    }

    public ListPersonalDirectoryContentsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
