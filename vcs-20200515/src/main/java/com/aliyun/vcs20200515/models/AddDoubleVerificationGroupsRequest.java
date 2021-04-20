// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDoubleVerificationGroupsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("DoubleVerificationGroupList")
    public java.util.List<AddDoubleVerificationGroupsRequestDoubleVerificationGroupList> doubleVerificationGroupList;

    public static AddDoubleVerificationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDoubleVerificationGroupsRequest self = new AddDoubleVerificationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AddDoubleVerificationGroupsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddDoubleVerificationGroupsRequest setDoubleVerificationGroupList(java.util.List<AddDoubleVerificationGroupsRequestDoubleVerificationGroupList> doubleVerificationGroupList) {
        this.doubleVerificationGroupList = doubleVerificationGroupList;
        return this;
    }
    public java.util.List<AddDoubleVerificationGroupsRequestDoubleVerificationGroupList> getDoubleVerificationGroupList() {
        return this.doubleVerificationGroupList;
    }

    public static class AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList extends TeaModel {
        @NameInMap("PersonTableId")
        public String personTableId;

        @NameInMap("PersonId")
        public String personId;

        public static AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList build(java.util.Map<String, ?> map) throws Exception {
            AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList self = new AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList();
            return TeaModel.build(map, self);
        }

        public AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

    public static class AddDoubleVerificationGroupsRequestDoubleVerificationGroupList extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("MemberNumber")
        public Long memberNumber;

        @NameInMap("PersonIdList")
        public java.util.List<AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList> personIdList;

        public static AddDoubleVerificationGroupsRequestDoubleVerificationGroupList build(java.util.Map<String, ?> map) throws Exception {
            AddDoubleVerificationGroupsRequestDoubleVerificationGroupList self = new AddDoubleVerificationGroupsRequestDoubleVerificationGroupList();
            return TeaModel.build(map, self);
        }

        public AddDoubleVerificationGroupsRequestDoubleVerificationGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public AddDoubleVerificationGroupsRequestDoubleVerificationGroupList setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public AddDoubleVerificationGroupsRequestDoubleVerificationGroupList setMemberNumber(Long memberNumber) {
            this.memberNumber = memberNumber;
            return this;
        }
        public Long getMemberNumber() {
            return this.memberNumber;
        }

        public AddDoubleVerificationGroupsRequestDoubleVerificationGroupList setPersonIdList(java.util.List<AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList> personIdList) {
            this.personIdList = personIdList;
            return this;
        }
        public java.util.List<AddDoubleVerificationGroupsRequestDoubleVerificationGroupListPersonIdList> getPersonIdList() {
            return this.personIdList;
        }

    }

}
