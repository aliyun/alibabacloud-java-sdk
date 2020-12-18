// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesRequest extends TeaModel {
    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    @NameInMap("ResourceOwner")
    @Validation(required = true)
    public String resourceOwner;

    @NameInMap("ResourceShareName")
    public String resourceShareName;

    @NameInMap("ResourceShareStatus")
    public String resourceShareStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListResourceSharesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharesRequest self = new ListResourceSharesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceSharesRequest setResourceShareIds(java.util.List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }
    public java.util.List<String> getResourceShareIds() {
        return this.resourceShareIds;
    }

    public ListResourceSharesRequest setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    public ListResourceSharesRequest setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
        return this;
    }
    public String getResourceShareName() {
        return this.resourceShareName;
    }

    public ListResourceSharesRequest setResourceShareStatus(String resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus;
        return this;
    }
    public String getResourceShareStatus() {
        return this.resourceShareStatus;
    }

    public ListResourceSharesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceSharesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
