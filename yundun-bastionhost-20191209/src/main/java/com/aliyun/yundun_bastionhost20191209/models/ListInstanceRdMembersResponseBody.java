// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListInstanceRdMembersResponseBody extends TeaModel {
    /**
     * <p>The value of MaxResults in the request. If you did not specify MaxResults, the default value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A list of member accounts.</p>
     */
    @NameInMap("Members")
    public java.util.List<ListInstanceRdMembersResponseBodyMembers> members;

    /**
     * <p>The token for the next page of results. If the response is truncated, this parameter is returned. Use this token in your next request to retrieve the next page. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
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
         * <p>The UID of the member account.</p>
         * 
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
