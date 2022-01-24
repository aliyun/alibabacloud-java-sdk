// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareAssociationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceShareAssociations")
    public java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociations> resourceShareAssociations;

    public static ListResourceShareAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareAssociationsResponseBody self = new ListResourceShareAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceShareAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceShareAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceShareAssociationsResponseBody setResourceShareAssociations(java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociations> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }
    public java.util.List<ListResourceShareAssociationsResponseBodyResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static class ListResourceShareAssociationsResponseBodyResourceShareAssociations extends TeaModel {
        @NameInMap("AssociationStatus")
        public String associationStatus;

        @NameInMap("AssociationStatusMessage")
        public String associationStatusMessage;

        @NameInMap("AssociationType")
        public String associationType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("ResourceShareId")
        public String resourceShareId;

        @NameInMap("ResourceShareName")
        public String resourceShareName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListResourceShareAssociationsResponseBodyResourceShareAssociations build(java.util.Map<String, ?> map) throws Exception {
            ListResourceShareAssociationsResponseBodyResourceShareAssociations self = new ListResourceShareAssociationsResponseBodyResourceShareAssociations();
            return TeaModel.build(map, self);
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setAssociationStatus(String associationStatus) {
            this.associationStatus = associationStatus;
            return this;
        }
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setAssociationStatusMessage(String associationStatusMessage) {
            this.associationStatusMessage = associationStatusMessage;
            return this;
        }
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setAssociationType(String associationType) {
            this.associationType = associationType;
            return this;
        }
        public String getAssociationType() {
            return this.associationType;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public ListResourceShareAssociationsResponseBodyResourceShareAssociations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
