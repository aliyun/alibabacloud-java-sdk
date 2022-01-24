// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareAssociationsRequest extends TeaModel {
    @NameInMap("AssociationStatus")
    public String associationStatus;

    @NameInMap("AssociationType")
    public String associationType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceShareIds")
    public java.util.List<String> resourceShareIds;

    @NameInMap("Target")
    public String target;

    public static ListResourceShareAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareAssociationsRequest self = new ListResourceShareAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceShareAssociationsRequest setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
        return this;
    }
    public String getAssociationStatus() {
        return this.associationStatus;
    }

    public ListResourceShareAssociationsRequest setAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }
    public String getAssociationType() {
        return this.associationType;
    }

    public ListResourceShareAssociationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceShareAssociationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceShareAssociationsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListResourceShareAssociationsRequest setResourceShareIds(java.util.List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }
    public java.util.List<String> getResourceShareIds() {
        return this.resourceShareIds;
    }

    public ListResourceShareAssociationsRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
