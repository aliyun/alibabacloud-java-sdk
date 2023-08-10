// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListPermissionsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The `token` that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the shared resources.</p>
     * <br>
     * <p>For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsRequest self = new ListPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPermissionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPermissionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
