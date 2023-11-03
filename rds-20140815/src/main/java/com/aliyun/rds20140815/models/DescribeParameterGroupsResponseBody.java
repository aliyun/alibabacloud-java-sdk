// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponseBody extends TeaModel {
    /**
     * <p>The details of the parameter templates.</p>
     */
    @NameInMap("ParameterGroups")
    public DescribeParameterGroupsResponseBodyParameterGroups parameterGroups;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether parameter templates exist in the specified region. Valid values:</p>
     * <p>*   true</p>
     * <p>*   false</p>
     * <p>><notice>This parameter is deprecated.></notice></p>
     */
    @NameInMap("SignalForOptimizeParams")
    public Boolean signalForOptimizeParams;

    public static DescribeParameterGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupsResponseBody self = new DescribeParameterGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupsResponseBody setParameterGroups(DescribeParameterGroupsResponseBodyParameterGroups parameterGroups) {
        this.parameterGroups = parameterGroups;
        return this;
    }
    public DescribeParameterGroupsResponseBodyParameterGroups getParameterGroups() {
        return this.parameterGroups;
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

    public static class DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup extends TeaModel {
        /**
         * <p>The time when the parameter template was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The database engine of the instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>Indicates whether the restart of an instance is required for the parameter template to take effect. Valid values:</p>
         * <br>
         * <p>*   0: A restart is not required.</p>
         * <p>*   1: A restart is required.</p>
         */
        @NameInMap("ForceRestart")
        public Integer forceRestart;

        /**
         * <p>The number of parameters in the parameter template.</p>
         */
        @NameInMap("ParamCounts")
        public Integer paramCounts;

        /**
         * <p>The type of the parameter template. Valid values:</p>
         * <br>
         * <p>*   0: the default parameter template.</p>
         * <p>*   1: a custom parameter template.</p>
         * <p>*   2: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.</p>
         */
        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        /**
         * <p>The ID of the parameter template.</p>
         */
        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        /**
         * <p>The name of the parameter template.</p>
         */
        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        /**
         * <p>The type of the parameter template. Valid values:</p>
         * <br>
         * <p>*   0: the default parameter template.</p>
         * <p>*   1: a custom parameter template.</p>
         * <p>*   2: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.</p>
         */
        @NameInMap("ParameterGroupType")
        public Integer parameterGroupType;

        /**
         * <p>The time when the parameter template was last updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup self = new DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setForceRestart(Integer forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Integer getForceRestart() {
            return this.forceRestart;
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

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setParameterGroupType(Integer parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public Integer getParameterGroupType() {
            return this.parameterGroupType;
        }

        public DescribeParameterGroupsResponseBodyParameterGroupsParameterGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
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
