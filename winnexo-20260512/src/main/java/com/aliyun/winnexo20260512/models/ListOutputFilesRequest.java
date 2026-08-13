// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListOutputFilesRequest extends TeaModel {
    /**
     * <p>产出明细类型: ppt/html/document/picture/slides/video/audio/email/others</p>
     * 
     * <strong>example:</strong>
     * <p>ppt</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>关键词搜索，匹配产出标题或明细名称</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>数字员工（运营对象）名称，按名称过滤</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>页码，从 1 开始</p>
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
     * <p>是否仅展示开启分享的产出和产出明细</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("sharedOnly")
    public Boolean sharedOnly;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListOutputFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutputFilesRequest self = new ListOutputFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListOutputFilesRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public ListOutputFilesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListOutputFilesRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListOutputFilesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListOutputFilesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOutputFilesRequest setSharedOnly(Boolean sharedOnly) {
        this.sharedOnly = sharedOnly;
        return this;
    }
    public Boolean getSharedOnly() {
        return this.sharedOnly;
    }

    public ListOutputFilesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
