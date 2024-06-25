// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupResponseBody extends TeaModel {
    /**
     * <p>Details about the parameter templates.</p>
     */
    @NameInMap("ParameterGroup")
    public java.util.List<DescribeParameterGroupResponseBodyParameterGroup> parameterGroup;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F1F16757-D31B-49CA-9BF4-305BAF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupResponseBody self = new DescribeParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupResponseBody setParameterGroup(java.util.List<DescribeParameterGroupResponseBodyParameterGroup> parameterGroup) {
        this.parameterGroup = parameterGroup;
        return this;
    }
    public java.util.List<DescribeParameterGroupResponseBodyParameterGroup> getParameterGroup() {
        return this.parameterGroup;
    }

    public DescribeParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterGroupResponseBodyParameterGroupParameterDetail extends TeaModel {
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
         * <p>3000</p>
         */
        @NameInMap("ParamValue")
        public String paramValue;

        public static DescribeParameterGroupResponseBodyParameterGroupParameterDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParameterGroupParameterDetail self = new DescribeParameterGroupResponseBodyParameterGroupParameterDetail();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParameterGroupParameterDetail setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeParameterGroupResponseBodyParameterGroupParameterDetail setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class DescribeParameterGroupResponseBodyParameterGroup extends TeaModel {
        /**
         * <p>The time when the parameter template was created. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10T08:40:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>Indicates whether to restart the cluster when this parameter template is applied. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: A restart is not required.</li>
         * <li><strong>1</strong>: A restart is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ForceRestart")
        public String forceRestart;

        /**
         * <p>The number of parameters in the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ParameterCounts")
        public Integer parameterCounts;

        /**
         * <p>Details about the parameters.</p>
         */
        @NameInMap("ParameterDetail")
        public java.util.List<DescribeParameterGroupResponseBodyParameterGroupParameterDetail> parameterDetail;

        /**
         * <p>The description of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroup</p>
         */
        @NameInMap("ParameterGroupDesc")
        public String parameterGroupDesc;

        /**
         * <p>The ID of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>pcpg-**************</p>
         */
        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        /**
         * <p>The name of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
        public String parameterGroupType;

        public static DescribeParameterGroupResponseBodyParameterGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupResponseBodyParameterGroup self = new DescribeParameterGroupResponseBodyParameterGroup();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupResponseBodyParameterGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public DescribeParameterGroupResponseBodyParameterGroup setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterCounts(Integer parameterCounts) {
            this.parameterCounts = parameterCounts;
            return this;
        }
        public Integer getParameterCounts() {
            return this.parameterCounts;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterDetail(java.util.List<DescribeParameterGroupResponseBodyParameterGroupParameterDetail> parameterDetail) {
            this.parameterDetail = parameterDetail;
            return this;
        }
        public java.util.List<DescribeParameterGroupResponseBodyParameterGroupParameterDetail> getParameterDetail() {
            return this.parameterDetail;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupResponseBodyParameterGroup setParameterGroupType(String parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

    }

}
