// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 500.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The filter conditions for resources associated with the resource.</p>
     */
    @NameInMap("RelatedResourceFilter")
    public java.util.List<ListResourceRelationshipsRequestRelatedResourceFilter> relatedResourceFilter;

    /**
     * <p>The ID of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-eb3hji****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ACK::Cluster</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListResourceRelationshipsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationshipsRequest self = new ListResourceRelationshipsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationshipsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceRelationshipsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceRelationshipsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListResourceRelationshipsRequest setRelatedResourceFilter(java.util.List<ListResourceRelationshipsRequestRelatedResourceFilter> relatedResourceFilter) {
        this.relatedResourceFilter = relatedResourceFilter;
        return this;
    }
    public java.util.List<ListResourceRelationshipsRequestRelatedResourceFilter> getRelatedResourceFilter() {
        return this.relatedResourceFilter;
    }

    public ListResourceRelationshipsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListResourceRelationshipsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class ListResourceRelationshipsRequestRelatedResourceFilter extends TeaModel {
        /**
         * <p>The key of the filter condition. For more information, see <code>Supported filter parameters</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RelatedResourceRegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method.</p>
         * 
         * <strong>example:</strong>
         * <p>Equals</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The values of the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListResourceRelationshipsRequestRelatedResourceFilter build(java.util.Map<String, ?> map) throws Exception {
            ListResourceRelationshipsRequestRelatedResourceFilter self = new ListResourceRelationshipsRequestRelatedResourceFilter();
            return TeaModel.build(map, self);
        }

        public ListResourceRelationshipsRequestRelatedResourceFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceRelationshipsRequestRelatedResourceFilter setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListResourceRelationshipsRequestRelatedResourceFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
