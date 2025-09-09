// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListInstanceRdMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Members")
    public java.util.List<ListInstanceRdMembersResponseBodyMembers> members;

    /**
     * <strong>example:</strong>
     * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceRdMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRdMembersResponseBody self = new ListInstanceRdMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceRdMembersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceRdMembersResponseBody setMembers(java.util.List<ListInstanceRdMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ListInstanceRdMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public ListInstanceRdMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstanceRdMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceRdMembersResponseBodyMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1197234496852779</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        public static ListInstanceRdMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRdMembersResponseBodyMembers self = new ListInstanceRdMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public ListInstanceRdMembersResponseBodyMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

    }

}
