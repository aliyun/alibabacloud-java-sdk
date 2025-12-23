// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("MemberInfos")
    public java.util.List<ListIpamMembersResponseBodyMemberInfos> memberInfos;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>B90776C8-F703-51D5-893A-AD1CA699D535</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2025-07-11T07:18:07Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>fd-ccccncASqa</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <strong>example:</strong>
         * <p>Folder</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
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
