// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupStructResponseBody extends TeaModel {
    @NameInMap("GroupFather")
    public Integer groupFather;

    @NameInMap("GroupFlag")
    public Integer groupFlag;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupIndex")
    public Integer groupIndex;

    @NameInMap("GroupLevel")
    public Integer groupLevel;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Groups")
    public java.util.List<String> groups;

    @NameInMap("MachineNum")
    public Integer machineNum;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupStructResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupStructResponseBody self = new DescribeGroupStructResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupStructResponseBody setGroupFather(Integer groupFather) {
        this.groupFather = groupFather;
        return this;
    }
    public Integer getGroupFather() {
        return this.groupFather;
    }

    public DescribeGroupStructResponseBody setGroupFlag(Integer groupFlag) {
        this.groupFlag = groupFlag;
        return this;
    }
    public Integer getGroupFlag() {
        return this.groupFlag;
    }

    public DescribeGroupStructResponseBody setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeGroupStructResponseBody setGroupIndex(Integer groupIndex) {
        this.groupIndex = groupIndex;
        return this;
    }
    public Integer getGroupIndex() {
        return this.groupIndex;
    }

    public DescribeGroupStructResponseBody setGroupLevel(Integer groupLevel) {
        this.groupLevel = groupLevel;
        return this;
    }
    public Integer getGroupLevel() {
        return this.groupLevel;
    }

    public DescribeGroupStructResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeGroupStructResponseBody setGroups(java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public DescribeGroupStructResponseBody setMachineNum(Integer machineNum) {
        this.machineNum = machineNum;
        return this;
    }
    public Integer getMachineNum() {
        return this.machineNum;
    }

    public DescribeGroupStructResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
