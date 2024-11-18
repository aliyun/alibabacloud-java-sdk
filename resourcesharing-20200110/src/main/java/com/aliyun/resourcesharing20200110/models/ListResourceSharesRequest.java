// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesRequest extends TeaModel {
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
     * <p>The name of the permission. For more information, see <a href="https://help.aliyun.com/document_detail/465474.html">Permission library</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunRSDefaultPermissionVSwitch</p>
     */
    @NameInMap("PermissionName")
    public String permissionName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The owner of the resource shares. Valid values:</p>
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
     * <p>The ID of a resource share.</p>
     * 
     * <strong>example:</strong>
     * <p>rs-PqysnzIj****</p>
     */
    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    /**
     * <p>The name of the resource share.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceShareName")
    public String resourceShareName;

    /**
     * <p>The status of the resource share. Valid values:</p>
     * <ul>
     * <li>Active: The resource share is enabled.</li>
     * <li>Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.</li>
     * <li>Deleting: The resource share is being deleted.</li>
     * <li>Deleted: The resource share is deleted.</li>
     * </ul>
     * <blockquote>
     * <p> The system deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("ResourceShareStatus")
    public String resourceShareStatus;

    @NameInMap("Tag")
    public java.util.List<ListResourceSharesRequestTag> tag;

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

    public ListResourceSharesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public ListResourceSharesRequest setTag(java.util.List<ListResourceSharesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListResourceSharesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListResourceSharesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListResourceSharesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListResourceSharesRequestTag self = new ListResourceSharesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListResourceSharesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceSharesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
