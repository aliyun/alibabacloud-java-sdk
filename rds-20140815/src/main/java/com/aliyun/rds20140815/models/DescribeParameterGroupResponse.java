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

    public DescribeParameterGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterGroupResponse setParamGroup(DescribeParameterGroupResponseParamGroup paramGroup) {
        this.paramGroup = paramGroup;
        return this;
    }
    public DescribeParameterGroupResponseParamGroup getParamGroup() {
        return this.paramGroup;
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

        public DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
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

        public DescribeParameterGroupResponseParamGroupParameterGroupParamDetail setParameterDetail(java.util.List<DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail> parameterDetail) {
            this.parameterDetail = parameterDetail;
            return this;
        }
        public java.util.List<DescribeParameterGroupResponseParamGroupParameterGroupParamDetailParameterDetail> getParameterDetail() {
            return this.parameterDetail;
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

        public DescribeParameterGroupResponseParamGroupParameterGroup setParameterGroupType(Integer parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public Integer getParameterGroupType() {
            return this.parameterGroupType;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setParamCounts(Integer paramCounts) {
            this.paramCounts = paramCounts;
            return this;
        }
        public Integer getParamCounts() {
            return this.paramCounts;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setForceRestart(Integer forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Integer getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeParameterGroupResponseParamGroupParameterGroup setParamDetail(DescribeParameterGroupResponseParamGroupParameterGroupParamDetail paramDetail) {
            this.paramDetail = paramDetail;
            return this;
        }
        public DescribeParameterGroupResponseParamGroupParameterGroupParamDetail getParamDetail() {
            return this.paramDetail;
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

        public DescribeParameterGroupResponseParamGroup setParameterGroup(java.util.List<DescribeParameterGroupResponseParamGroupParameterGroup> parameterGroup) {
            this.parameterGroup = parameterGroup;
            return this;
        }
        public java.util.List<DescribeParameterGroupResponseParamGroupParameterGroup> getParameterGroup() {
            return this.parameterGroup;
        }

    }

}
