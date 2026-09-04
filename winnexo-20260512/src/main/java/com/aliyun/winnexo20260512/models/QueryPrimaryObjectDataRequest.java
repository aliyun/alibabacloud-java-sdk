// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QueryPrimaryObjectDataRequest extends TeaModel {
    /**
     * <p>The keyword for searching. The keyword is matched against the name field by default. If the schema defines a description field, the keyword is also matched against the description field.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleKeyword</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>Specifies whether to return only favorited primary objects. If this parameter is set to false or not specified, all objects are returned, including the isFavorited flag.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("onlyFavorites")
    public Boolean onlyFavorites;

    /**
     * <p>The operating object name, such as customer_1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The tenant ID. This is a common parameter. You can explicitly pass it in winnexo-cli by using --tenant-id.</p>
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
