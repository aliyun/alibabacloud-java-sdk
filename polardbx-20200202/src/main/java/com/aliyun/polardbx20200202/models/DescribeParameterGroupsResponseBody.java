// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeParameterGroupsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupsResponseBody self = new DescribeParameterGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupsResponseBody setData(DescribeParameterGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeParameterGroupsResponseBodyData getData() {
        return this.data;
    }

    public DescribeParameterGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterGroupsResponseBodyDataParameterGroups extends TeaModel {
        @NameInMap("CnForceRestart")
        public Boolean cnForceRestart;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CnParamCount")
        public Integer cnParamCount;

        /**
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        @NameInMap("DnForceRestart")
        public Boolean dnForceRestart;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DnParamCount")
        public Integer dnParamCount;

        /**
         * <strong>example:</strong>
         * <p>2024-12-19T16:41:31+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>1605079985000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>rpg-s1y1xy06****fqs7y</p>
         */
        @NameInMap("ParameterGroupId")
        public String parameterGroupId;

        /**
         * <strong>example:</strong>
         * <p>dstest_api_new</p>
         */
        @NameInMap("ParameterGroupName")
        public String parameterGroupName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParameterGroupType")
        public String parameterGroupType;

        /**
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("Series")
        public String series;

        public static DescribeParameterGroupsResponseBodyDataParameterGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseBodyDataParameterGroups self = new DescribeParameterGroupsResponseBodyDataParameterGroups();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setCnForceRestart(Boolean cnForceRestart) {
            this.cnForceRestart = cnForceRestart;
            return this;
        }
        public Boolean getCnForceRestart() {
            return this.cnForceRestart;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setCnParamCount(Integer cnParamCount) {
            this.cnParamCount = cnParamCount;
            return this;
        }
        public Integer getCnParamCount() {
            return this.cnParamCount;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setDnForceRestart(Boolean dnForceRestart) {
            this.dnForceRestart = dnForceRestart;
            return this;
        }
        public Boolean getDnForceRestart() {
            return this.dnForceRestart;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setDnParamCount(Integer dnParamCount) {
            this.dnParamCount = dnParamCount;
            return this;
        }
        public Integer getDnParamCount() {
            return this.dnParamCount;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setParameterGroupId(String parameterGroupId) {
            this.parameterGroupId = parameterGroupId;
            return this;
        }
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setParameterGroupType(String parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
            return this;
        }
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

        public DescribeParameterGroupsResponseBodyDataParameterGroups setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

    }

    public static class DescribeParameterGroupsResponseBodyData extends TeaModel {
        @NameInMap("ParameterGroups")
        public java.util.List<DescribeParameterGroupsResponseBodyDataParameterGroups> parameterGroups;

        /**
         * <strong>example:</strong>
         * <p>1E5DCFFC-A00D-****-836E-73318F8CA577</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static DescribeParameterGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupsResponseBodyData self = new DescribeParameterGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupsResponseBodyData setParameterGroups(java.util.List<DescribeParameterGroupsResponseBodyDataParameterGroups> parameterGroups) {
            this.parameterGroups = parameterGroups;
            return this;
        }
        public java.util.List<DescribeParameterGroupsResponseBodyDataParameterGroups> getParameterGroups() {
            return this.parameterGroups;
        }

        public DescribeParameterGroupsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
