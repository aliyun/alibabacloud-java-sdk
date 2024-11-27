// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsForUserGroupResponseBody extends TeaModel {
    /**
     * <p>The host groups returned.</p>
     */
    @NameInMap("HostGroups")
    public java.util.List<ListHostGroupsForUserGroupResponseBodyHostGroups> hostGroups;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of host groups returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHostGroupsForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsForUserGroupResponseBody self = new ListHostGroupsForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsForUserGroupResponseBody setHostGroups(java.util.List<ListHostGroupsForUserGroupResponseBodyHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<ListHostGroupsForUserGroupResponseBodyHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public ListHostGroupsForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostGroupsForUserGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostGroupsForUserGroupResponseBodyHostGroups extends TeaModel {
        /**
         * <p>The description of the host group.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the host group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        /**
         * <p>The name of the host group.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static ListHostGroupsForUserGroupResponseBodyHostGroups build(java.util.Map<String, ?> map) throws Exception {
            ListHostGroupsForUserGroupResponseBodyHostGroups self = new ListHostGroupsForUserGroupResponseBodyHostGroups();
            return TeaModel.build(map, self);
        }

        public ListHostGroupsForUserGroupResponseBodyHostGroups setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostGroupsForUserGroupResponseBodyHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ListHostGroupsForUserGroupResponseBodyHostGroups setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

}
