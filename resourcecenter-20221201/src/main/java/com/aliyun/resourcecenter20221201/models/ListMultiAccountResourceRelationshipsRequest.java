// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountResourceRelationshipsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RelatedResourceFilter")
    public java.util.List<ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter> relatedResourceFilter;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static ListMultiAccountResourceRelationshipsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountResourceRelationshipsRequest self = new ListMultiAccountResourceRelationshipsRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountResourceRelationshipsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiAccountResourceRelationshipsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiAccountResourceRelationshipsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListMultiAccountResourceRelationshipsRequest setRelatedResourceFilter(java.util.List<ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter> relatedResourceFilter) {
        this.relatedResourceFilter = relatedResourceFilter;
        return this;
    }
    public java.util.List<ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter> getRelatedResourceFilter() {
        return this.relatedResourceFilter;
    }

    public ListMultiAccountResourceRelationshipsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListMultiAccountResourceRelationshipsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListMultiAccountResourceRelationshipsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter build(java.util.Map<String, ?> map) throws Exception {
            ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter self = new ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter();
            return TeaModel.build(map, self);
        }

        public ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListMultiAccountResourceRelationshipsRequestRelatedResourceFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
