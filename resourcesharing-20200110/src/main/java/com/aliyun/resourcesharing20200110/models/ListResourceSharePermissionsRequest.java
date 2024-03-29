// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharePermissionsRequest extends TeaModel {
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
     * <p>The owner of the resource share. Valid values:</p>
     * <br>
     * <p>*   Self: the current account</p>
     * <p>*   OtherAccounts: an account other than the current account</p>
     */
    @NameInMap("ResourceOwner")
    public String resourceOwner;

    /**
     * <p>The ID of the resource share.</p>
     */
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    public static ListResourceSharePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharePermissionsRequest self = new ListResourceSharePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceSharePermissionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceSharePermissionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceSharePermissionsRequest setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    public ListResourceSharePermissionsRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

}
