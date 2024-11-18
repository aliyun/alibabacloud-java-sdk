// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharePermissionsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <p>Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The <code>token</code> that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The owner of the resource share. Valid values:</p>
     * <ul>
     * <li>Self: the current account</li>
     * <li>OtherAccounts: an account other than the current account</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Self</p>
     */
    @NameInMap("ResourceOwner")
    public String resourceOwner;

    /**
     * <p>The ID of the resource share.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rs-6GRmdD3X****</p>
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
