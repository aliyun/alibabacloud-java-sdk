// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SignalForOptimizeParams")
    @Validation(required = true)
    public Boolean signalForOptimizeParams;

    @NameInMap("ParameterGroups")
    @Validation(required = true)
    public DescribeParameterGroupsResponseParameterGroups parameterGroups;

    public static DescribeParameterGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupsResponse self = new DescribeParameterGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterGroupsResponse setSignalForOptimizeParams(Boolean signalForOptimizeParams) {
        this.signalForOptimizeParams = signalForOptimizeParams;
        return this;
    }
    public Boolean getSignalForOptimizeParams() {
        return this.signalForOptimizeParams;
    }

    public DescribeParameterGroupsResponse setParameterGroups(DescribeParameterGroupsResponseParameterGroups parameterGroups) {
        this.parameterGroups = parameterGroups;
        return this;
    }
    public DescribeParameterGroupsResponseParameterGroups getParameterGroups() {
        return this.parameterGroups;
    }

    public static class DescribeParameterGroupsResponseParameterGroupsParameterGroup extends TeaModel {
        @NameInMap("ParameterGroupType")
        @Validation(required = true)
        public Integer parameterGroupType;

        @NameInMap("ParameterGroupName")
        @Validation(required = true)
        public String parameterGroupName;

        @NameInMap("ParamCounts")
        @Validation(required = true)
        public Integer paramCounts;

        @NameInMap("ParameterGroupDesc")
        @Validation(required = true)
        public String parameterGroupDesc;

        @NameInMap("ForceRestart")
        @Validation(required = true)
        public Integer forceRestart;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("ParameterGroupId")
        @Validation(required = true)
        public String parameterGroupId;

        public static DescribeParameterGroupsResponseParameterGroupsParameterGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseParameterGroupsParameterGroup self = new DescribeParameterGroupsResponseParameterGroupsParameterGroup();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setParameterGroupType(Integer parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public Integer getParameterGroupType() {
            return this.parameterGroupType;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setParamCounts(Integer paramCounts) {
            this.paramCounts = paramCounts;
            return this;
        }
        public Integer getParamCounts() {
            return this.paramCounts;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setForceRestart(Integer forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Integer getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeParameterGroupsResponseParameterGroupsParameterGroup setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

    }

    public static class DescribeParameterGroupsResponseParameterGroups extends TeaModel {
        @NameInMap("ParameterGroup")
        @Validation(required = true)
        public java.util.List<DescribeParameterGroupsResponseParameterGroupsParameterGroup> parameterGroup;

        public static DescribeParameterGroupsResponseParameterGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseParameterGroups self = new DescribeParameterGroupsResponseParameterGroups();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseParameterGroups setParameterGroup(java.util.List<DescribeParameterGroupsResponseParameterGroupsParameterGroup> parameterGroup) {
            this.parameterGroup = parameterGroup;
            return this;
        }
        public java.util.List<DescribeParameterGroupsResponseParameterGroupsParameterGroup> getParameterGroup() {
            return this.parameterGroup;
        }

    }

}
