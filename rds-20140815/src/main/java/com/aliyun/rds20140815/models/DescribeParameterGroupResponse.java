// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ParamGroup")
    @Validation(required = true)
    public DescribeParameterGroupResponseParamGroup paramGroup;

    public static DescribeParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupResponse self = new DescribeParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail extends TeaModel {
        @NameInMap("ParamName")
        @Validation(required = true)
        public String paramName;

        @NameInMap("ParamValue")
        @Validation(required = true)
        public String paramValue;

        public static DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail self = new DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeParameterGroupResponseParamGroupParameterGroupParamDetail extends TeaModel {
        @NameInMap("ParameterDetail")
        @Validation(required = true)
        public java.util.List<DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail> parameterDetail;

        public static DescribeParameterGroupResponseParamGroupParameterGroupParamDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseParamGroupParameterGroupParamDetail self = new DescribeParameterGroupResponseParamGroupParameterGroupParamDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeParameterGroupResponseParamGroupParameterGroup extends TeaModel {
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

        @NameInMap("ParameterGroupId")
        @Validation(required = true)
        public String parameterGroupId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("ParamDetail")
        @Validation(required = true)
        public DescribeParameterGroupResponseParamGroupParameterGroupParamDetail paramDetail;

        public static DescribeParameterGroupResponseParamGroupParameterGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseParamGroupParameterGroup self = new DescribeParameterGroupResponseParamGroupParameterGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeParameterGroupResponseParamGroup extends TeaModel {
        @NameInMap("ParameterGroup")
        @Validation(required = true)
        public java.util.List<DescribeParameterGroupResponseParamGroupParameterGroup> parameterGroup;

        public static DescribeParameterGroupResponseParamGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseParamGroup self = new DescribeParameterGroupResponseParamGroup();
            return TeaModel.build(map, self);
        }

    }

}
