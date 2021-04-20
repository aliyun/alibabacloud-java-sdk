// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDoubleVerificationGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("DoubleVerificationGroup")
    public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup doubleVerificationGroup;

    public static UpdateDoubleVerificationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDoubleVerificationGroupResponseBody self = new UpdateDoubleVerificationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDoubleVerificationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDoubleVerificationGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDoubleVerificationGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDoubleVerificationGroupResponseBody setDoubleVerificationGroup(UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup doubleVerificationGroup) {
        this.doubleVerificationGroup = doubleVerificationGroup;
        return this;
    }
    public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup getDoubleVerificationGroup() {
        return this.doubleVerificationGroup;
    }

    public static class UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList extends TeaModel {
        @NameInMap("PersonTableId")
        public String personTableId;

        @NameInMap("PersonId")
        public String personId;

        public static UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList build(java.util.Map<String, ?> map) throws Exception {
            UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList self = new UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList();
            return TeaModel.build(map, self);
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

    public static class UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("LastChange")
        public String lastChange;

        @NameInMap("MemberNumber")
        public Long memberNumber;

        @NameInMap("PersonIdList")
        public java.util.List<UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList> personIdList;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("DeviceId")
        public String deviceId;

        public static UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup self = new UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup();
            return TeaModel.build(map, self);
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup setLastChange(String lastChange) {
            this.lastChange = lastChange;
            return this;
        }
        public String getLastChange() {
            return this.lastChange;
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup setMemberNumber(Long memberNumber) {
            this.memberNumber = memberNumber;
            return this;
        }
        public Long getMemberNumber() {
            return this.memberNumber;
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup setPersonIdList(java.util.List<UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList> personIdList) {
            this.personIdList = personIdList;
            return this;
        }
        public java.util.List<UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroupPersonIdList> getPersonIdList() {
            return this.personIdList;
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public UpdateDoubleVerificationGroupResponseBodyDoubleVerificationGroup setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

}
