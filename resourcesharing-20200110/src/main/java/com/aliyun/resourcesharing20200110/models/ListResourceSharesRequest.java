// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesRequest extends TeaModel {
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
     * <p>The name of the permission. For more information, see [Permission library](~~465474~~).</p>
     */
    @NameInMap("PermissionName")
    public String permissionName;

    /**
     * <p>The owner of the resource shares. Valid values:</p>
     * <br>
     * <p>*   Self: the current account</p>
     * <p>*   OtherAccounts: an account other than the current account</p>
     */
    @NameInMap("ResourceOwner")
    public String resourceOwner;

    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    /**
     * <p>The name of the resource share.</p>
     */
    @NameInMap("ResourceShareName")
    public String resourceShareName;

    /**
     * <p>The status of the resource share. Valid values:</p>
     * <br>
     * <p>*   Active: The resource share is enabled.</p>
     * <p>*   Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.</p>
     * <p>*   Deleting: The resource share is being deleted.</p>
     * <p>*   Deleted: The resource share is deleted.</p>
     * <br>
     * <p>>  The system deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.</p>
     */
    @NameInMap("ResourceShareStatus")
    public String resourceShareStatus;

    public static ListResourceSharesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharesRequest self = new ListResourceSharesRequest();
        return TeaModel.build(map, self);
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

    public ListResourceSharesRequest setPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }
    public String getPermissionName() {
        return this.permissionName;
    }

    public ListResourceSharesRequest setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    public ListResourceSharesRequest setResourceShareIds(java.util.List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }
    public java.util.List<String> getResourceShareIds() {
        return this.resourceShareIds;
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

}
