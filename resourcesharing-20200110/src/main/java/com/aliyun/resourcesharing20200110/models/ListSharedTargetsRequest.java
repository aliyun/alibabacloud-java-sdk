// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedTargetsRequest extends TeaModel {
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
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the shared resource.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1upw03qyz8n7us9****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The owner of the resource share.</p>
     * <ul>
     * <li>Self: your account. If you set the value to Self, the principals that are associated with your resource shares are queried.</li>
     * <li>OtherAccounts: another account. If you set the value to OtherAccounts, the resource shares with which your account is associated and the owners of the resource shares are queried.</li>
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
     * <p>Valid values of N: 1 to 5. This indicates that a maximum of five resource shares can be specified at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>rs-6GRmdD3X****</p>
     */
    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    /**
     * <p>The type of the shared resources.</p>
     * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>VSwitch</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The information about the principals.</p>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static ListSharedTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSharedTargetsRequest self = new ListSharedTargetsRequest();
        return TeaModel.build(map, self);
    }

    public ListSharedTargetsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSharedTargetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedTargetsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListSharedTargetsRequest setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    public ListSharedTargetsRequest setResourceShareIds(java.util.List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }
    public java.util.List<String> getResourceShareIds() {
        return this.resourceShareIds;
    }

    public ListSharedTargetsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListSharedTargetsRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

}
