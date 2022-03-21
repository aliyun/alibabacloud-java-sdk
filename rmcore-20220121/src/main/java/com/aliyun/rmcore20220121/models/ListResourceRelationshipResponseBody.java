// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListResourceRelationshipResponseBodyResources> resources;

    public static ListResourceRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationshipResponseBody self = new ListResourceRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationshipResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceRelationshipResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceRelationshipResponseBody setResources(java.util.List<ListResourceRelationshipResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListResourceRelationshipResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListResourceRelationshipResponseBodyResources extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static ListResourceRelationshipResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourceRelationshipResponseBodyResources self = new ListResourceRelationshipResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListResourceRelationshipResponseBodyResources setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceRelationshipResponseBodyResources setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListResourceRelationshipResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceRelationshipResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourceRelationshipResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
