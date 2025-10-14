// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbackTaskListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSqlFlashbackTaskListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSqlFlashbackTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlFlashbackTaskListResponseBody self = new DescribeSqlFlashbackTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlFlashbackTaskListResponseBody setData(DescribeSqlFlashbackTaskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlFlashbackTaskListResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlFlashbackTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlFlashbackTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlFlashbackTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <strong>example:</strong>
         * <p>http://...</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>1569216270000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>1568611408000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1568611469000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>pxc-********</p>
         */
        @NameInMap("InstId")
        public String instId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecallProgress")
        public String recallProgress;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RecallRestoreType")
        public String recallRestoreType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecallStatus")
        public String recallStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RecallType")
        public String recallType;

        /**
         * <strong>example:</strong>
         * <p>1568609597000</p>
         */
        @NameInMap("SearchEndTime")
        public String searchEndTime;

        /**
         * <strong>example:</strong>
         * <p>1568609597000</p>
         */
        @NameInMap("SearchStartTime")
        public String searchStartTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SqlCounter")
        public String sqlCounter;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("SqlPk")
        public String sqlPk;

        /**
         * <strong>example:</strong>
         * <p>INSERT,UPDATE</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>13ed05705f801000</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks self = new DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks();
            return TeaModel.build(map, self);
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setRecallProgress(String recallProgress) {
            this.recallProgress = recallProgress;
            return this;
        }
        public String getRecallProgress() {
            return this.recallProgress;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setRecallRestoreType(String recallRestoreType) {
            this.recallRestoreType = recallRestoreType;
            return this;
        }
        public String getRecallRestoreType() {
            return this.recallRestoreType;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setRecallStatus(String recallStatus) {
            this.recallStatus = recallStatus;
            return this;
        }
        public String getRecallStatus() {
            return this.recallStatus;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setRecallType(String recallType) {
            this.recallType = recallType;
            return this;
        }
        public String getRecallType() {
            return this.recallType;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setSearchEndTime(String searchEndTime) {
            this.searchEndTime = searchEndTime;
            return this;
        }
        public String getSearchEndTime() {
            return this.searchEndTime;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setSearchStartTime(String searchStartTime) {
            this.searchStartTime = searchStartTime;
            return this;
        }
        public String getSearchStartTime() {
            return this.searchStartTime;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setSqlCounter(String sqlCounter) {
            this.sqlCounter = sqlCounter;
            return this;
        }
        public String getSqlCounter() {
            return this.sqlCounter;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setSqlPk(String sqlPk) {
            this.sqlPk = sqlPk;
            return this;
        }
        public String getSqlPk() {
            return this.sqlPk;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class DescribeSqlFlashbackTaskListResponseBodyData extends TeaModel {
        @NameInMap("SqlFlashbackTasks")
        public java.util.List<DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks> sqlFlashbackTasks;

        public static DescribeSqlFlashbackTaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlFlashbackTaskListResponseBodyData self = new DescribeSqlFlashbackTaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlFlashbackTaskListResponseBodyData setSqlFlashbackTasks(java.util.List<DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks> sqlFlashbackTasks) {
            this.sqlFlashbackTasks = sqlFlashbackTasks;
            return this;
        }
        public java.util.List<DescribeSqlFlashbackTaskListResponseBodyDataSqlFlashbackTasks> getSqlFlashbackTasks() {
            return this.sqlFlashbackTasks;
        }

    }

}
