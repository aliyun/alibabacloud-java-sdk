// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParametersRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 10 to 100. Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the parameter. **You can enter a keyword to query parameter names in fuzzy match mode.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The path of the parameter. For example, if the name of a parameter is /path/path1/Myparameter, the path of the parameter is /path/path1/.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Specifies whether to query parameters from all levels of directories in the specified path. Default value: false.</p>
     */
    @NameInMap("Recursive")
    public Boolean recursive;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The field used to sort the query results. Valid values:</p>
     * <br>
     * <p>*   Name</p>
     * <p>*   CreatedDate</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The order in which the entries are sorted. Valid values:</p>
     * <br>
     * <p>*   Ascending</p>
     * <p>*   Descending (Default)</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The tags of the parameter.</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static ListSecretParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretParametersRequest self = new ListSecretParametersRequest();
        return TeaModel.build(map, self);
    }

    public ListSecretParametersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecretParametersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSecretParametersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecretParametersRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListSecretParametersRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public ListSecretParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSecretParametersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListSecretParametersRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListSecretParametersRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListSecretParametersRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

}
