// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponseBody extends TeaModel {
    /**
     * <p>The details of parameter templates.</p>
     */
    @NameInMap("ParameterGroups")
    public java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> parameterGroups;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>944CED46-A6F7-40C6-B6DC-C6E5CC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupsResponseBody self = new DescribeParameterGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupsResponseBody setParameterGroups(java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> parameterGroups) {
        this.parameterGroups = parameterGroups;
        return this;
    }
    public java.util.List<DescribeParameterGroupsResponseBodyParameterGroups> getParameterGroups() {
        return this.parameterGroups;
    }

    public DescribeParameterGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterGroupsResponseBodyParameterGroups extends TeaModel {
        /**
         * <p>The time when the parameter template was created. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10T08:40:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The type of the engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database engine</p>
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
        public Long parameterCounts;

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

        public static DescribeParameterGroupsResponseBodyParameterGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseBodyParameterGroups self = new DescribeParameterGroupsResponseBodyParameterGroups();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterCounts(Long parameterCounts) {
            this.parameterCounts = parameterCounts;
            return this;
        }
        public Long getParameterCounts() {
            return this.parameterCounts;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupsResponseBodyParameterGroups setParameterGroupType(String parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

    }

}
