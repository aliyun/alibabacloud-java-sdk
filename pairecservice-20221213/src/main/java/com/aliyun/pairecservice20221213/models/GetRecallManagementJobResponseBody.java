// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementJobResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Log")
    public String log;

    @NameInMap("RecallManagementJobId")
    public String recallManagementJobId;

    @NameInMap("RecallManagerTableInfo")
    public GetRecallManagementJobResponseBodyRecallManagerTableInfo recallManagerTableInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

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

    public static class GetRecallManagementJobResponseBodyRecallManagerTableInfo extends TeaModel {
        @NameInMap("DataVersion")
        public String dataVersion;

        @NameInMap("RecallManagerTableVersionId")
        public String recallManagerTableVersionId;

        @NameInMap("SourceTableDataSize")
        public String sourceTableDataSize;

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
