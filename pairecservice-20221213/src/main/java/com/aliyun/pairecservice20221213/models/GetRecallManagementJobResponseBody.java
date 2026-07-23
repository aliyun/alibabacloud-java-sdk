// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementJobResponseBody extends TeaModel {
    /**
     * <p>The time when the job ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The log of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;success&quot;</p>
     */
    @NameInMap("Log")
    public String log;

    /**
     * <p>The recall management job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecallManagementJobId")
    public String recallManagementJobId;

    /**
     * <p>Details of the recall management table.</p>
     */
    @NameInMap("RecallManagementTableInfo")
    public GetRecallManagementJobResponseBodyRecallManagementTableInfo recallManagementTableInfo;

    /**
     * <p>Details of the recall management table.</p>
     */
    @NameInMap("RecallManagerTableInfo")
    public GetRecallManagementJobResponseBodyRecallManagerTableInfo recallManagerTableInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the job started.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T22:24:33.132</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the job. Valid values are:</p>
     * <ul>
     * <li><p><code>Init</code>: Initializing.</p>
     * </li>
     * <li><p><code>Running</code>: Running.</p>
     * </li>
     * <li><p><code>Success</code>: Successful.</p>
     * </li>
     * <li><p><code>Failed</code>: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetRecallManagementJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementJobResponseBody self = new GetRecallManagementJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementJobResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetRecallManagementJobResponseBody setLog(String log) {
        this.log = log;
        return this;
    }
    public String getLog() {
        return this.log;
    }

    public GetRecallManagementJobResponseBody setRecallManagementJobId(String recallManagementJobId) {
        this.recallManagementJobId = recallManagementJobId;
        return this;
    }
    public String getRecallManagementJobId() {
        return this.recallManagementJobId;
    }

    public GetRecallManagementJobResponseBody setRecallManagementTableInfo(GetRecallManagementJobResponseBodyRecallManagementTableInfo recallManagementTableInfo) {
        this.recallManagementTableInfo = recallManagementTableInfo;
        return this;
    }
    public GetRecallManagementJobResponseBodyRecallManagementTableInfo getRecallManagementTableInfo() {
        return this.recallManagementTableInfo;
    }

    public GetRecallManagementJobResponseBody setRecallManagerTableInfo(GetRecallManagementJobResponseBodyRecallManagerTableInfo recallManagerTableInfo) {
        this.recallManagerTableInfo = recallManagerTableInfo;
        return this;
    }
    public GetRecallManagementJobResponseBodyRecallManagerTableInfo getRecallManagerTableInfo() {
        return this.recallManagerTableInfo;
    }

    public GetRecallManagementJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecallManagementJobResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetRecallManagementJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetRecallManagementJobResponseBodyRecallManagementTableInfo extends TeaModel {
        /**
         * <p>The data version.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20250701</p>
         */
        @NameInMap("DataVersion")
        public String dataVersion;

        /**
         * <p>The recall management table version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20250101000</p>
         */
        @NameInMap("RecallManagementTableVersionId")
        public String recallManagementTableVersionId;

        /**
         * <p>The data size of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("SourceTableDataSize")
        public String sourceTableDataSize;

        /**
         * <p>The number of rows in the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SourceTableRowCount")
        public String sourceTableRowCount;

        public static GetRecallManagementJobResponseBodyRecallManagementTableInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementJobResponseBodyRecallManagementTableInfo self = new GetRecallManagementJobResponseBodyRecallManagementTableInfo();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementJobResponseBodyRecallManagementTableInfo setDataVersion(String dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public String getDataVersion() {
            return this.dataVersion;
        }

        public GetRecallManagementJobResponseBodyRecallManagementTableInfo setRecallManagementTableVersionId(String recallManagementTableVersionId) {
            this.recallManagementTableVersionId = recallManagementTableVersionId;
            return this;
        }
        public String getRecallManagementTableVersionId() {
            return this.recallManagementTableVersionId;
        }

        public GetRecallManagementJobResponseBodyRecallManagementTableInfo setSourceTableDataSize(String sourceTableDataSize) {
            this.sourceTableDataSize = sourceTableDataSize;
            return this;
        }
        public String getSourceTableDataSize() {
            return this.sourceTableDataSize;
        }

        public GetRecallManagementJobResponseBodyRecallManagementTableInfo setSourceTableRowCount(String sourceTableRowCount) {
            this.sourceTableRowCount = sourceTableRowCount;
            return this;
        }
        public String getSourceTableRowCount() {
            return this.sourceTableRowCount;
        }

    }

    public static class GetRecallManagementJobResponseBodyRecallManagerTableInfo extends TeaModel {
        /**
         * <p>The data version.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20250701</p>
         */
        @NameInMap("DataVersion")
        public String dataVersion;

        /**
         * <p>The recall management table version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20250101000</p>
         */
        @NameInMap("RecallManagerTableVersionId")
        public String recallManagerTableVersionId;

        /**
         * <p>The data size of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("SourceTableDataSize")
        public String sourceTableDataSize;

        /**
         * <p>The number of rows in the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SourceTableRowCount")
        public String sourceTableRowCount;

        public static GetRecallManagementJobResponseBodyRecallManagerTableInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementJobResponseBodyRecallManagerTableInfo self = new GetRecallManagementJobResponseBodyRecallManagerTableInfo();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementJobResponseBodyRecallManagerTableInfo setDataVersion(String dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public String getDataVersion() {
            return this.dataVersion;
        }

        public GetRecallManagementJobResponseBodyRecallManagerTableInfo setRecallManagerTableVersionId(String recallManagerTableVersionId) {
            this.recallManagerTableVersionId = recallManagerTableVersionId;
            return this;
        }
        public String getRecallManagerTableVersionId() {
            return this.recallManagerTableVersionId;
        }

        public GetRecallManagementJobResponseBodyRecallManagerTableInfo setSourceTableDataSize(String sourceTableDataSize) {
            this.sourceTableDataSize = sourceTableDataSize;
            return this;
        }
        public String getSourceTableDataSize() {
            return this.sourceTableDataSize;
        }

        public GetRecallManagementJobResponseBodyRecallManagerTableInfo setSourceTableRowCount(String sourceTableRowCount) {
            this.sourceTableRowCount = sourceTableRowCount;
            return this;
        }
        public String getSourceTableRowCount() {
            return this.sourceTableRowCount;
        }

    }

}
