// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigChangeLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>failed</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The information returned.</p>
     */
    @NameInMap("Data")
    public DescribeDBClusterConfigChangeLogsResponseBodyData data;

    /**
     * <p>The dynamic code. This parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic message. This parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>An error occurred while processing your request.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterConfigChangeLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigChangeLogsResponseBody self = new DescribeDBClusterConfigChangeLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setData(DescribeDBClusterConfigChangeLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBClusterConfigChangeLogsResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-10-11T08:53:32Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2024-03-08T10:08Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the change log.</p>
         * 
         * <strong>example:</strong>
         * <p>617975</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the modification has taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsApplied")
        public Boolean isApplied;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>cumulative_compaction_rounds_for_each_base_compaction_round</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OldValue")
        public String oldValue;

        public static DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs self = new DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setIsApplied(Boolean isApplied) {
            this.isApplied = isApplied;
            return this;
        }
        public Boolean getIsApplied() {
            return this.isApplied;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

    }

    public static class DescribeDBClusterConfigChangeLogsResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-wny3li00g02-be</p>
         */
        @NameInMap("DbClusterId")
        public String dbClusterId;

        /**
         * <strong>example:</strong>
         * <p>6585</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-wny3li00g02</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <p>The parameter change logs.</p>
         */
        @NameInMap("ParamChangeLogs")
        public java.util.List<DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs> paramChangeLogs;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>107841167</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static DescribeDBClusterConfigChangeLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterConfigChangeLogsResponseBodyData self = new DescribeDBClusterConfigChangeLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setParamChangeLogs(java.util.List<DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs> paramChangeLogs) {
            this.paramChangeLogs = paramChangeLogs;
            return this;
        }
        public java.util.List<DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs> getParamChangeLogs() {
            return this.paramChangeLogs;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
