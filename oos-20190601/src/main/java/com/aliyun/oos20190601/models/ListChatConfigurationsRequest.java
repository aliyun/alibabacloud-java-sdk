// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListChatConfigurationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;: &quot;status&quot;, &quot;Value&quot;: &quot;inactive&quot;}, {&quot;Name&quot;: &quot;type&quot;, &quot;Value&quot;: &quot;private&quot;}]</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListChatConfigurationsRequestFilters> filters;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AQEBARoBBgEAAgIBBQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListChatConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatConfigurationsRequest self = new ListChatConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListChatConfigurationsRequest setFilters(java.util.List<ListChatConfigurationsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListChatConfigurationsRequestFilters> getFilters() {
        return this.filters;
    }

    public ListChatConfigurationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListChatConfigurationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChatConfigurationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ListChatConfigurationsRequestFilters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>status</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>inactive</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListChatConfigurationsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListChatConfigurationsRequestFilters self = new ListChatConfigurationsRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListChatConfigurationsRequestFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChatConfigurationsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
