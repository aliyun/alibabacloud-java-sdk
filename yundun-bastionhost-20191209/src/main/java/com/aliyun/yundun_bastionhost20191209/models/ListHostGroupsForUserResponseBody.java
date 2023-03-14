// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsForUserResponseBody extends TeaModel {
    /**
     * <p>The host groups returned.</p>
     */
    @NameInMap("HostGroups")
    public java.util.List<ListHostGroupsForUserResponseBodyHostGroups> hostGroups;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of host groups returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHostGroupsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsForUserResponseBody self = new ListHostGroupsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsForUserResponseBody setHostGroups(java.util.List<ListHostGroupsForUserResponseBodyHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<ListHostGroupsForUserResponseBodyHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public ListHostGroupsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostGroupsForUserResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostGroupsForUserResponseBodyHostGroups extends TeaModel {
        /**
         * <p>The description of the host group.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the host group.</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        /**
         * <p>The name of the host group.</p>
         */
        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static ListHostGroupsForUserResponseBodyHostGroups build(java.util.Map<String, ?> map) throws Exception {
            ListHostGroupsForUserResponseBodyHostGroups self = new ListHostGroupsForUserResponseBodyHostGroups();
            return TeaModel.build(map, self);
        }

        public ListHostGroupsForUserResponseBodyHostGroups setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostGroupsForUserResponseBodyHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ListHostGroupsForUserResponseBodyHostGroups setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

}
