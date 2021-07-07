// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ParameterGroup")
    public java.util.List<DescribeParameterGroupResponseBodyParameterGroup> parameterGroup;

    public static DescribeParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupResponseBody self = new DescribeParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterGroupResponseBody setParameterGroup(java.util.List<DescribeParameterGroupResponseBodyParameterGroup> parameterGroup) {
        this.parameterGroup = parameterGroup;
        return this;
    }
    public java.util.List<DescribeParameterGroupResponseBodyParameterGroup> getParameterGroup() {
        return this.parameterGroup;
    }

    public static class DescribeParameterGroupResponseBodyParameterGroupParameterDetail extends TeaModel {
        @NameInMap("ParamValue")
        public String paramValue;

        @NameInMap("ParamName")
        public String paramName;

        public static DescribeParameterGroupResponseBodyParameterGroupParameterDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParameterGroupParameterDetail self = new DescribeParameterGroupResponseBodyParameterGroupParameterDetail();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParameterGroupParameterDetail setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

        public DescribeParameterGroupResponseBodyParameterGroupParameterDetail setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

    public static class DescribeParameterGroupResponseBodyParameterGroup extends TeaModel {
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
        public Integer parameterCounts;

        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ParameterDetail")
        public java.util.List<DescribeParameterGroupResponseBodyParameterGroupParameterDetail> parameterDetail;

        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        public static DescribeParameterGroupResponseBodyParameterGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParameterGroup self = new DescribeParameterGroupResponseBodyParameterGroup();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParameterGroup setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupType(String parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterCounts(Integer parameterCounts) {
            this.parameterCounts = parameterCounts;
            return this;
        }
        public Integer getParameterCounts() {
            return this.parameterCounts;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterDetail(java.util.List<DescribeParameterGroupResponseBodyParameterGroupParameterDetail> parameterDetail) {
            this.parameterDetail = parameterDetail;
            return this;
        }
        public java.util.List<DescribeParameterGroupResponseBodyParameterGroupParameterDetail> getParameterDetail() {
            return this.parameterDetail;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

    }

}
