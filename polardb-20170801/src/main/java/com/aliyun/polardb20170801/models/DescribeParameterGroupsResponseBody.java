// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ParameterGroups")
    public java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> parameterGroups;

    public static DescribeParameterGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupsResponseBody self = new DescribeParameterGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterGroupsResponseBody setParameterGroups(java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> parameterGroups) {
        this.parameterGroups = parameterGroups;
        return this;
    }
    public java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> getParameterGroups() {
        return this.parameterGroups;
    }

    public static class DescribeParameterGroupsResponseBodyParameterGroups extends TeaModel {
        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        @NameInMap("ForceRestart")
        public String forceRestart;

        @NameInMap("ParameterGroupType")
        public String parameterGroupType;

        @NameInMap("ParameterCounts")
        public Long parameterCounts;

        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        public static DescribeParameterGroupsResponseBodyParameterGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseBodyParameterGroups self = new DescribeParameterGroupsResponseBodyParameterGroups();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupType(String parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterCounts(Long parameterCounts) {
            this.parameterCounts = parameterCounts;
            return this;
        }
        public Long getParameterCounts() {
            return this.parameterCounts;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

    }

}
