// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignalForOptimizeParams")
    public Boolean signalForOptimizeParams;

    @NameInMap("ParameterGroups")
    public DescribeParameterGroupsResponseBodyParameterGroups parameterGroups;

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

    public DescribeParameterGroupsResponseBody setSignalForOptimizeParams(Boolean signalForOptimizeParams) {
        this.signalForOptimizeParams = signalForOptimizeParams;
        return this;
    }
    public Boolean getSignalForOptimizeParams() {
        return this.signalForOptimizeParams;
    }

    public DescribeParameterGroupsResponseBody setParameterGroups(DescribeParameterGroupsResponseBodyParameterGroups parameterGroups) {
        this.parameterGroups = parameterGroups;
        return this;
    }
    public DescribeParameterGroupsResponseBodyParameterGroups getParameterGroups() {
        return this.parameterGroups;
    }

    public static class DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup extends TeaModel {
        @NameInMap("ParameterGroupType")
        public Integer parameterGroupType;

        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        @NameInMap("ParamCounts")
        public Integer paramCounts;

        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        @NameInMap("ForceRestart")
        public Integer forceRestart;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        public static DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup self = new DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setParameterGroupType(Integer parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public Integer getParameterGroupType() {
            return this.parameterGroupType;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setParamCounts(Integer paramCounts) {
            this.paramCounts = paramCounts;
            return this;
        }
        public Integer getParamCounts() {
            return this.paramCounts;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setForceRestart(Integer forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Integer getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

    }

    public static class DescribeParameterGroupsResponseBodyParameterGroups extends TeaModel {
        @NameInMap("ParameterGroup")
        public java.util.List<DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup> parameterGroup;

        public static DescribeParameterGroupsResponseBodyParameterGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseBodyParameterGroups self = new DescribeParameterGroupsResponseBodyParameterGroups();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroup(java.util.List<DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup> parameterGroup) {
            this.parameterGroup = parameterGroup;
            return this;
        }
        public java.util.List<DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup> getParameterGroup() {
            return this.parameterGroup;
        }

    }

}
