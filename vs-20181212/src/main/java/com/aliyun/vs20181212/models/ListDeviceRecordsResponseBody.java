// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListDeviceRecordsResponseBody extends TeaModel {
    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Records")
    public java.util.List<ListDeviceRecordsResponseBodyRecords> records;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDeviceRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceRecordsResponseBody self = new ListDeviceRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceRecordsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListDeviceRecordsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDeviceRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDeviceRecordsResponseBody setRecords(java.util.List<ListDeviceRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListDeviceRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListDeviceRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeviceRecordsResponseBodyRecords extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("Filename")
        public String filename;

        @NameInMap("RecordType")
        public String recordType;

        @NameInMap("StartTime")
        public String startTime;

        public static ListDeviceRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceRecordsResponseBodyRecords self = new ListDeviceRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListDeviceRecordsResponseBodyRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDeviceRecordsResponseBodyRecords setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListDeviceRecordsResponseBodyRecords setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public ListDeviceRecordsResponseBodyRecords setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListDeviceRecordsResponseBodyRecords setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
