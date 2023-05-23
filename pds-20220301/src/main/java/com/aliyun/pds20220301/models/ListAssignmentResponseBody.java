// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAssignmentResponseBody extends TeaModel {
    @NameInMap("assignment_list")
    public java.util.List<ListAssignmentResponseBodyAssignmentList> assignmentList;

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
        @NameInMap("created_at")
        public Long createdAt;

        @NameInMap("creator")
        public String creator;

        @NameInMap("domain_id")
        public String domainId;

        @NameInMap("identity")
        public Identity identity;

        @NameInMap("manage_resource_id")
        public String manageResourceId;

        @NameInMap("manage_resource_type")
        public String manageResourceType;

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
