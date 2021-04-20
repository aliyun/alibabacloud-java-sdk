// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDoubleVerificationGroupRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("DoubleVerificationGroup")
    public UpdateDoubleVerificationGroupRequestDoubleVerificationGroup doubleVerificationGroup;

    public static UpdateDoubleVerificationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDoubleVerificationGroupRequest self = new UpdateDoubleVerificationGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDoubleVerificationGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDoubleVerificationGroupRequest setDoubleVerificationGroup(UpdateDoubleVerificationGroupRequestDoubleVerificationGroup doubleVerificationGroup) {
        this.doubleVerificationGroup = doubleVerificationGroup;
        return this;
    }
    public UpdateDoubleVerificationGroupRequestDoubleVerificationGroup getDoubleVerificationGroup() {
        return this.doubleVerificationGroup;
    }

    public static class UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList extends TeaModel {
        @NameInMap("PersonTableId")
        public String personTableId;

        @NameInMap("PersonId")
        public String personId;

        public static UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList build(java.util.Map<String, ?> map) throws Exception {
            UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList self = new UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList();
            return TeaModel.build(map, self);
        }

        public UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

    public static class UpdateDoubleVerificationGroupRequestDoubleVerificationGroup extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("MemberNumber")
        public Long memberNumber;

        @NameInMap("PersonIdList")
        public java.util.List<UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList> personIdList;

        public static UpdateDoubleVerificationGroupRequestDoubleVerificationGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateDoubleVerificationGroupRequestDoubleVerificationGroup self = new UpdateDoubleVerificationGroupRequestDoubleVerificationGroup();
            return TeaModel.build(map, self);
        }

        public UpdateDoubleVerificationGroupRequestDoubleVerificationGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateDoubleVerificationGroupRequestDoubleVerificationGroup setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public UpdateDoubleVerificationGroupRequestDoubleVerificationGroup setMemberNumber(Long memberNumber) {
            this.memberNumber = memberNumber;
            return this;
        }
        public Long getMemberNumber() {
            return this.memberNumber;
        }

        public UpdateDoubleVerificationGroupRequestDoubleVerificationGroup setPersonIdList(java.util.List<UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList> personIdList) {
            this.personIdList = personIdList;
            return this;
        }
        public java.util.List<UpdateDoubleVerificationGroupRequestDoubleVerificationGroupPersonIdList> getPersonIdList() {
            return this.personIdList;
        }

    }

}
