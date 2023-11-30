// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAssignmentResponseBody extends TeaModel {
    /**
     * <p>The assigned roles.</p>
     */
    @NameInMap("assignment_list")
    public java.util.List<ListAssignmentResponseBodyAssignmentList> assignmentList;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListAssignmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssignmentResponseBody self = new ListAssignmentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssignmentResponseBody setAssignmentList(java.util.List<ListAssignmentResponseBodyAssignmentList> assignmentList) {
        this.assignmentList = assignmentList;
        return this;
    }
    public java.util.List<ListAssignmentResponseBodyAssignmentList> getAssignmentList() {
        return this.assignmentList;
    }

    public ListAssignmentResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public static class ListAssignmentResponseBodyAssignmentList extends TeaModel {
        /**
         * <p>The time when the role was assigned. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("created_at")
        public Long createdAt;

        /**
         * <p>The ID of the user who assigned the role.</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The domain ID.</p>
         */
        @NameInMap("domain_id")
        public String domainId;

        /**
         * <p>The identity to whom the role is assigned, which is a user or a group.</p>
         */
        @NameInMap("identity")
        public Identity identity;

        /**
         * <p>The ID of the managed resource, such as a group ID.</p>
         */
        @NameInMap("manage_resource_id")
        public String manageResourceId;

        /**
         * <p>The type of the managed resource. For example, a value of RT_Group indicates group.</p>
         */
        @NameInMap("manage_resource_type")
        public String manageResourceType;

        /**
         * <p>The ID of the role assigned to the identity.</p>
         */
        @NameInMap("role_id")
        public String roleId;

        public static ListAssignmentResponseBodyAssignmentList build(java.util.Map<String, ?> map) throws Exception {
            ListAssignmentResponseBodyAssignmentList self = new ListAssignmentResponseBodyAssignmentList();
            return TeaModel.build(map, self);
        }

        public ListAssignmentResponseBodyAssignmentList setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListAssignmentResponseBodyAssignmentList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListAssignmentResponseBodyAssignmentList setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ListAssignmentResponseBodyAssignmentList setIdentity(Identity identity) {
            this.identity = identity;
            return this;
        }
        public Identity getIdentity() {
            return this.identity;
        }

        public ListAssignmentResponseBodyAssignmentList setManageResourceId(String manageResourceId) {
            this.manageResourceId = manageResourceId;
            return this;
        }
        public String getManageResourceId() {
            return this.manageResourceId;
        }

        public ListAssignmentResponseBodyAssignmentList setManageResourceType(String manageResourceType) {
            this.manageResourceType = manageResourceType;
            return this;
        }
        public String getManageResourceType() {
            return this.manageResourceType;
        }

        public ListAssignmentResponseBodyAssignmentList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

}
