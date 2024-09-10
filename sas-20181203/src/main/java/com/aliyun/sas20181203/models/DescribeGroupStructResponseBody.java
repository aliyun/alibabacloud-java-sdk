// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupStructResponseBody extends TeaModel {
    /**
     * <p>The parent node of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>958****</p>
     */
    @NameInMap("GroupFather")
    public Integer groupFather;

    /**
     * <p>The type of the server group. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the default group</li>
     * <li><strong>1</strong>: other groups</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GroupFlag")
    public Integer groupFlag;

    /**
     * <p>The ID of the server group.</p>
     * 
     * <strong>example:</strong>
     * <p>958****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The sequence number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupIndex")
    public Integer groupIndex;

    /**
     * <p>The level of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GroupLevel")
    public Integer groupLevel;

    /**
     * <p>The name of the server group.</p>
     * 
     * <strong>example:</strong>
     * <p>TestGroupName</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>An array that consists of child groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<String> groups;

    /**
     * <p>The number of servers in the group.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MachineNum")
    public Integer machineNum;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9FBC6E47-7508-58C9-9E76-528E118C****</p>
     */
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
