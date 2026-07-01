// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamMembersResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("MemberInfos")
    public java.util.List<ListIpamMembersResponseBodyMemberInfos> memberInfos;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamMembersResponseBody self = new ListIpamMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamMembersResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListIpamMembersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamMembersResponseBody setMemberInfos(java.util.List<ListIpamMembersResponseBodyMemberInfos> memberInfos) {
        this.memberInfos = memberInfos;
        return this;
    }
    public java.util.List<ListIpamMembersResponseBodyMemberInfos> getMemberInfos() {
        return this.memberInfos;
    }

    public ListIpamMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamMembersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamMembersResponseBodyMemberInfos extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberType")
        public String memberType;

        @NameInMap("Status")
        public String status;

        public static ListIpamMembersResponseBodyMemberInfos build(java.util.Map<String, ?> map) throws Exception {
            ListIpamMembersResponseBodyMemberInfos self = new ListIpamMembersResponseBodyMemberInfos();
            return TeaModel.build(map, self);
        }

        public ListIpamMembersResponseBodyMemberInfos setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListIpamMembersResponseBodyMemberInfos setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListIpamMembersResponseBodyMemberInfos setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public ListIpamMembersResponseBodyMemberInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
