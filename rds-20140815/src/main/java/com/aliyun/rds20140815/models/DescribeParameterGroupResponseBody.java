// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupResponseBody extends TeaModel {
    @NameInMap("ParamGroup")
    public DescribeParameterGroupResponseBodyParamGroup paramGroup;

    @NameInMap("RelatedCustinsInfo")
    public DescribeParameterGroupResponseBodyRelatedCustinsInfo relatedCustinsInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupResponseBody self = new DescribeParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupResponseBody setParamGroup(DescribeParameterGroupResponseBodyParamGroup paramGroup) {
        this.paramGroup = paramGroup;
        return this;
    }
    public DescribeParameterGroupResponseBodyParamGroup getParamGroup() {
        return this.paramGroup;
    }

    public DescribeParameterGroupResponseBody setRelatedCustinsInfo(DescribeParameterGroupResponseBodyRelatedCustinsInfo relatedCustinsInfo) {
        this.relatedCustinsInfo = relatedCustinsInfo;
        return this;
    }
    public DescribeParameterGroupResponseBodyRelatedCustinsInfo getRelatedCustinsInfo() {
        return this.relatedCustinsInfo;
    }

    public DescribeParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail extends TeaModel {
        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamValue")
        public String paramValue;

        public static DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail self = new DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail extends TeaModel {
        @NameInMap("ParameterDetail")
        public java.util.List<DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail> parameterDetail;

        public static DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail self = new DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail setParameterDetail(java.util.List<DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail> parameterDetail) {
            this.parameterDetail = parameterDetail;
            return this;
        }
        public java.util.List<DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetailParameterDetail> getParameterDetail() {
            return this.parameterDetail;
        }

    }

    public static class DescribeParameterGroupResponseBodyParamGroupParameterGroup extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ForceRestart")
        public Integer forceRestart;

        @NameInMap("ParamCounts")
        public Integer paramCounts;

        @NameInMap("ParamDetail")
        public DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail paramDetail;

        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        @NameInMap("ParameterGroupType")
        public Integer parameterGroupType;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeParameterGroupResponseBodyParamGroupParameterGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParamGroupParameterGroup self = new DescribeParameterGroupResponseBodyParamGroupParameterGroup();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setForceRestart(Integer forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Integer getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setParamCounts(Integer paramCounts) {
            this.paramCounts = paramCounts;
            return this;
        }
        public Integer getParamCounts() {
            return this.paramCounts;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setParamDetail(DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail paramDetail) {
            this.paramDetail = paramDetail;
            return this;
        }
        public DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail getParamDetail() {
            return this.paramDetail;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setParameterGroupType(Integer parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public Integer getParameterGroupType() {
            return this.parameterGroupType;
        }

        public DescribeParameterGroupResponseBodyParamGroupParameterGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeParameterGroupResponseBodyParamGroup extends TeaModel {
        @NameInMap("ParameterGroup")
        public java.util.List<DescribeParameterGroupResponseBodyParamGroupParameterGroup> parameterGroup;

        public static DescribeParameterGroupResponseBodyParamGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParamGroup self = new DescribeParameterGroupResponseBodyParamGroup();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParamGroup setParameterGroup(java.util.List<DescribeParameterGroupResponseBodyParamGroupParameterGroup> parameterGroup) {
            this.parameterGroup = parameterGroup;
            return this;
        }
        public java.util.List<DescribeParameterGroupResponseBodyParamGroupParameterGroup> getParameterGroup() {
            return this.parameterGroup;
        }

    }

    public static class DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo extends TeaModel {
        @NameInMap("AppliedTime")
        public String appliedTime;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo self = new DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo setAppliedTime(String appliedTime) {
            this.appliedTime = appliedTime;
            return this;
        }
        public String getAppliedTime() {
            return this.appliedTime;
        }

        public DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

    public static class DescribeParameterGroupResponseBodyRelatedCustinsInfo extends TeaModel {
        @NameInMap("RelatedCustinsInfo")
        public java.util.List<DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo> relatedCustinsInfo;

        public static DescribeParameterGroupResponseBodyRelatedCustinsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyRelatedCustinsInfo self = new DescribeParameterGroupResponseBodyRelatedCustinsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyRelatedCustinsInfo setRelatedCustinsInfo(java.util.List<DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo> relatedCustinsInfo) {
            this.relatedCustinsInfo = relatedCustinsInfo;
            return this;
        }
        public java.util.List<DescribeParameterGroupResponseBodyRelatedCustinsInfoRelatedCustinsInfo> getRelatedCustinsInfo() {
            return this.relatedCustinsInfo;
        }

    }

}
