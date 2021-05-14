// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllGroupsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Groups")
    public java.util.List<DescribeAllGroupsResponseBodyGroups> groups;

    public static DescribeAllGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllGroupsResponseBody self = new DescribeAllGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllGroupsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeAllGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllGroupsResponseBody setGroups(java.util.List<DescribeAllGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeAllGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public static class DescribeAllGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public Integer groupId;

        @NameInMap("GroupFlag")
        public Integer groupFlag;

        public static DescribeAllGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllGroupsResponseBodyGroups self = new DescribeAllGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAllGroupsResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAllGroupsResponseBodyGroups setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DescribeAllGroupsResponseBodyGroups setGroupFlag(Integer groupFlag) {
            this.groupFlag = groupFlag;
            return this;
        }
        public Integer getGroupFlag() {
            return this.groupFlag;
        }

    }

}
