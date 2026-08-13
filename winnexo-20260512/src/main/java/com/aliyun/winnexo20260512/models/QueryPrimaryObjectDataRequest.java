// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QueryPrimaryObjectDataRequest extends TeaModel {
    /**
     * <p>关键字搜索（固定匹配 name；若 schema 定义 description，则同时匹配 description）</p>
     * 
     * <strong>example:</strong>
     * <p>示例关键词</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>仅返回关注的主对象；false 或不传则返回全部对象（包含 isFavorited 标识）</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("onlyFavorites")
    public Boolean onlyFavorites;

    /**
     * <p>运营对象名称（如 customer_1）</p>
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
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static QueryPrimaryObjectDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPrimaryObjectDataRequest self = new QueryPrimaryObjectDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryPrimaryObjectDataRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryPrimaryObjectDataRequest setOnlyFavorites(Boolean onlyFavorites) {
        this.onlyFavorites = onlyFavorites;
        return this;
    }
    public Boolean getOnlyFavorites() {
        return this.onlyFavorites;
    }

    public QueryPrimaryObjectDataRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public QueryPrimaryObjectDataRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryPrimaryObjectDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPrimaryObjectDataRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
