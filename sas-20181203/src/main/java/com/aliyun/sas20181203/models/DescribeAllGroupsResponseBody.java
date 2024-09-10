// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllGroupsResponseBody extends TeaModel {
    /**
     * <p>The total number of server groups.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The grouping information about the servers.</p>
     */
    @NameInMap("Groups")
    public java.util.List<DescribeAllGroupsResponseBodyGroups> groups;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeAllGroupsResponseBody setGroups(java.util.List<DescribeAllGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeAllGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public DescribeAllGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAllGroupsResponseBodyGroups extends TeaModel {
        /**
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: default group</li>
         * <li><strong>1</strong>: other groups</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GroupFlag")
        public Integer groupFlag;

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>8834224</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The name of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static DescribeAllGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllGroupsResponseBodyGroups self = new DescribeAllGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAllGroupsResponseBodyGroups setGroupFlag(Integer groupFlag) {
            this.groupFlag = groupFlag;
            return this;
        }
        public Integer getGroupFlag() {
            return this.groupFlag;
        }

        public DescribeAllGroupsResponseBodyGroups setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DescribeAllGroupsResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
