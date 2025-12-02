// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class ListComponentAssetsRequest extends TeaModel {
    /**
     * <p>Asset UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C5F11E9-<strong><strong>-51F0-</strong></strong>-43BB312A0557</p>
     */
    @NameInMap("ComponentAssetUuid")
    public String componentAssetUuid;

    /**
     * <p>The name of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The language type for requests and responses. Values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Maximum number of results to return. Range: 0~100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next query. Value: Not required for the first query or if there is no next query. For subsequent queries, use the NextToken value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>kt0BLbenY2XCyRfsmoEcVg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Page number for paginated queries, with a default value of 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of items per page for paginated queries. Range: 1~100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Resource directory member account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13760*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListComponentAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentAssetsRequest self = new ListComponentAssetsRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentAssetsRequest setComponentAssetUuid(String componentAssetUuid) {
        this.componentAssetUuid = componentAssetUuid;
        return this;
    }
    public String getComponentAssetUuid() {
        return this.componentAssetUuid;
    }

    public ListComponentAssetsRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ListComponentAssetsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListComponentAssetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComponentAssetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComponentAssetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListComponentAssetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListComponentAssetsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
