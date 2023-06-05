// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribesDoubleVerificationGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DoubleVerificationGroups")
    public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups doubleVerificationGroups;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribesDoubleVerificationGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribesDoubleVerificationGroupsResponseBody self = new DescribesDoubleVerificationGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribesDoubleVerificationGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribesDoubleVerificationGroupsResponseBody setDoubleVerificationGroups(DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups doubleVerificationGroups) {
        this.doubleVerificationGroups = doubleVerificationGroups;
        return this;
    }
    public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups getDoubleVerificationGroups() {
        return this.doubleVerificationGroups;
    }

    public DescribesDoubleVerificationGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribesDoubleVerificationGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList extends TeaModel {
        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PersonTableId")
        public String personTableId;

        public static DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList self = new DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList();
            return TeaModel.build(map, self);
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

    }

    public static class DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("LastChange")
        public String lastChange;

        @NameInMap("MemberNumber")
        public Long memberNumber;

        @NameInMap("PersonIdList")
        public java.util.List<DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList> personIdList;

        public static DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList self = new DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList();
            return TeaModel.build(map, self);
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList setLastChange(String lastChange) {
            this.lastChange = lastChange;
            return this;
        }
        public String getLastChange() {
            return this.lastChange;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList setMemberNumber(Long memberNumber) {
            this.memberNumber = memberNumber;
            return this;
        }
        public Long getMemberNumber() {
            return this.memberNumber;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList setPersonIdList(java.util.List<DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList> personIdList) {
            this.personIdList = personIdList;
            return this;
        }
        public java.util.List<DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupListPersonIdList> getPersonIdList() {
            return this.personIdList;
        }

    }

    public static class DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups extends TeaModel {
        @NameInMap("DoubleVerificationGroupList")
        public java.util.List<DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList> doubleVerificationGroupList;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups self = new DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups();
            return TeaModel.build(map, self);
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups setDoubleVerificationGroupList(java.util.List<DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList> doubleVerificationGroupList) {
            this.doubleVerificationGroupList = doubleVerificationGroupList;
            return this;
        }
        public java.util.List<DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroupsDoubleVerificationGroupList> getDoubleVerificationGroupList() {
            return this.doubleVerificationGroupList;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribesDoubleVerificationGroupsResponseBodyDoubleVerificationGroups setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
