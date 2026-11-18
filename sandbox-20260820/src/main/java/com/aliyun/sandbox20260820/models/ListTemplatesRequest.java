// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Use the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>cae5f900-8b1d-4c0e-9c2a-1a2b3c4d5e6f</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("resourceTags")
    public java.util.List<ListTemplatesRequestResourceTags> resourceTags;

    /**
     * <p>The team ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplatesRequest setResourceTags(java.util.List<ListTemplatesRequestResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public java.util.List<ListTemplatesRequestResourceTags> getResourceTags() {
        return this.resourceTags;
    }

    public ListTemplatesRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public static class ListTemplatesRequestResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("value")
        public String value;

        public static ListTemplatesRequestResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesRequestResourceTags self = new ListTemplatesRequestResourceTags();
            return TeaModel.build(map, self);
        }

        public ListTemplatesRequestResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTemplatesRequestResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
