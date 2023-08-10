// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareInvitationsRequest extends TeaModel {
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

    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    @NameInMap("ResourceShareInvitationIds")
    public java.util.List<String> resourceShareInvitationIds;

    public static ListResourceShareInvitationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareInvitationsRequest self = new ListResourceShareInvitationsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceShareInvitationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceShareInvitationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceShareInvitationsRequest setResourceShareIds(java.util.List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }
    public java.util.List<String> getResourceShareIds() {
        return this.resourceShareIds;
    }

    public ListResourceShareInvitationsRequest setResourceShareInvitationIds(java.util.List<String> resourceShareInvitationIds) {
        this.resourceShareInvitationIds = resourceShareInvitationIds;
        return this;
    }
    public java.util.List<String> getResourceShareInvitationIds() {
        return this.resourceShareInvitationIds;
    }

}
