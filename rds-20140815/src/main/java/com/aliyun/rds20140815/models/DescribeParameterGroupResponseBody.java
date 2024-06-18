// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the parameter template.</p>
     */
    @NameInMap("ParamGroup")
    public DescribeParameterGroupResponseBodyParamGroup paramGroup;

    /**
     * <p>The information about the instance to which the parameter template is applied.</p>
     * <blockquote>
     * <p> This parameter is available only for ApsaraDB RDS for PostgreSQL instances.</p>
     * </blockquote>
     */
    @NameInMap("RelatedCustinsInfo")
    public DescribeParameterGroupResponseBodyRelatedCustinsInfo relatedCustinsInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>498AE8CA-8C81-4A01-AF37-2B902014ED30</p>
     */
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
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>back_log</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
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
        /**
         * <p>The time when the parameter template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-22T06:02:53Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>Indicates whether the restart of an instance is required for the parameter template to take effect. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: A restart is not required.</li>
         * <li><strong>1</strong>: A restart is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ForceRestart")
        public Integer forceRestart;

        /**
         * <p>The number of parameters in the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ParamCounts")
        public Integer paramCounts;

        /**
         * <p>The details of the parameters.</p>
         */
        @NameInMap("ParamDetail")
        public DescribeParameterGroupResponseBodyParamGroupParameterGroupParamDetail paramDetail;

        /**
         * <p>The description of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup1</p>
         */
        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        /**
         * <p>The ID of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>rpg-dp****</p>
         */
        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        /**
         * <p>The name of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>test123456</p>
         */
        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        /**
         * <p>The type of the parameter template. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the default parameter template.</li>
         * <li><strong>1</strong>: a custom parameter template.</li>
         * <li><strong>2</strong>: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterGroupType")
        public Integer parameterGroupType;

        /**
         * <p>The time when the parameter template was last updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-22T06:07:54Z</p>
         */
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
        /**
         * <p>The time when the parameter template was applied.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-17T03:19:02Z</p>
         */
        @NameInMap("AppliedTime")
        public String appliedTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp170****</p>
         */
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
