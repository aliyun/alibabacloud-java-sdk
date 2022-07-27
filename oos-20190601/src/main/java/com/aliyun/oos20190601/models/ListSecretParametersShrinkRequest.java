// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParametersShrinkRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Path")
    public String path;

    @NameInMap("Recursive")
    public Boolean recursive;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("Tags")
    public String tagsShrink;

    public static ListSecretParametersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretParametersShrinkRequest self = new ListSecretParametersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSecretParametersShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecretParametersShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSecretParametersShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecretParametersShrinkRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListSecretParametersShrinkRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public ListSecretParametersShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSecretParametersShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListSecretParametersShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListSecretParametersShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListSecretParametersShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
