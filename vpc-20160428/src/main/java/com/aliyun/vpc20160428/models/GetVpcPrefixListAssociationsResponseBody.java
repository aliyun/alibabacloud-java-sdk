// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcPrefixListAssociationsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PrefixListAssociation")
    public java.util.List<GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation> prefixListAssociation;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetVpcPrefixListAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPrefixListAssociationsResponseBody self = new GetVpcPrefixListAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcPrefixListAssociationsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetVpcPrefixListAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetVpcPrefixListAssociationsResponseBody setPrefixListAssociation(java.util.List<GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation> prefixListAssociation) {
        this.prefixListAssociation = prefixListAssociation;
        return this;
    }
    public java.util.List<GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation> getPrefixListAssociation() {
        return this.prefixListAssociation;
    }

    public GetVpcPrefixListAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcPrefixListAssociationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation extends TeaModel {
        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("PrefixListId")
        public String prefixListId;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        public static GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation build(java.util.Map<String, ?> map) throws Exception {
            GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation self = new GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation();
            return TeaModel.build(map, self);
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetVpcPrefixListAssociationsResponseBodyPrefixListAssociation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
