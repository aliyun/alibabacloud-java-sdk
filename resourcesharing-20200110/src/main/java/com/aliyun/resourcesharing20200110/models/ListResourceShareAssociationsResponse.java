// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareAssociationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("ResourceShareAssociations")
    @Validation(required = true)
    public java.util.List<ListResourceShareAssociationsResponseResourceShareAssociations> resourceShareAssociations;

    public static ListResourceShareAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareAssociationsResponse self = new ListResourceShareAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceShareAssociationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceShareAssociationsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceShareAssociationsResponse setResourceShareAssociations(java.util.List<ListResourceShareAssociationsResponseResourceShareAssociations> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }
    public java.util.List<ListResourceShareAssociationsResponseResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static class ListResourceShareAssociationsResponseResourceShareAssociations extends TeaModel {
        @NameInMap("ResourceShareId")
        @Validation(required = true)
        public String resourceShareId;

        @NameInMap("ResourceShareName")
        @Validation(required = true)
        public String resourceShareName;

        @NameInMap("AssociationType")
        @Validation(required = true)
        public String associationType;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("EntityType")
        @Validation(required = true)
        public String entityType;

        @NameInMap("AssociationStatus")
        @Validation(required = true)
        public String associationStatus;

        @NameInMap("AssociationStatusMessage")
        @Validation(required = true)
        public String associationStatusMessage;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static ListResourceShareAssociationsResponseResourceShareAssociations build(java.util.Map<String, ?> map) throws Exception {
            ListResourceShareAssociationsResponseResourceShareAssociations self = new ListResourceShareAssociationsResponseResourceShareAssociations();
            return TeaModel.build(map, self);
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setAssociationType(String associationType) {
            this.associationType = associationType;
            return this;
        }
        public String getAssociationType() {
            return this.associationType;
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setAssociationStatus(String associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setAssociationStatusMessage(String associationStatusMessage) {
            this.associationStatusMessage = associationStatusMessage;
            return this;
        }
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceShareAssociationsResponseResourceShareAssociations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
