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

    }

    public static class DescribeParameterGroupsResponseParameterGroups extends TeaModel {
        @NameInMap("ParameterGroup")
        @Validation(required = true)
        public java.util.List<DescribeParameterGroupsResponseParameterGroupsParameterGroup> parameterGroup;

        public static DescribeParameterGroupsResponseParameterGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseParameterGroups self = new DescribeParameterGroupsResponseParameterGroups();
            return TeaModel.build(map, self);
        }

    }

}
