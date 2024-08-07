// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParametersShrinkRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 10 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>MyParameter</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The path of the parameter. For example, if the name of a parameter is /path/path1/Myparameter, the path of the parameter is /path/path1/.</p>
     * 
     * <strong>example:</strong>
     * <p>/path1/path2/</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Specifies whether to query parameters from all levels of directories in the specified path. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Recursive")
    public Boolean recursive;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The share type of the common parameter. Valid values:</p>
     * <ul>
     * <li>Public</li>
     * <li>Private</li>
     * </ul>
     * <p>Default value: Private.</p>
     * 
     * <strong>example:</strong>
     * <p>‘Private’</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The field used to sort the query results. Valid values:</p>
     * <ul>
     * <li>Name</li>
     * <li>CreatedDate</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The order in which the entries are sorted. Valid values:</p>
     * <ul>
     * <li>Ascending</li>
     * <li>Descending (Default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Descending</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The data type of the common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListParametersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParametersShrinkRequest self = new ListParametersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListParametersShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListParametersShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListParametersShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListParametersShrinkRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListParametersShrinkRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public ListParametersShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListParametersShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListParametersShrinkRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListParametersShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListParametersShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListParametersShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListParametersShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
