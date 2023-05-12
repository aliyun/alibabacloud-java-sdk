// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public DescribeZoneRecordsResponseBodyRecords records;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeZoneRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneRecordsResponseBody self = new DescribeZoneRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZoneRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeZoneRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeZoneRecordsResponseBody setRecords(DescribeZoneRecordsResponseBodyRecords records) {
        this.records = records;
        return this;
    }
    public DescribeZoneRecordsResponseBodyRecords getRecords() {
        return this.records;
    }

    public DescribeZoneRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZoneRecordsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeZoneRecordsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeZoneRecordsResponseBodyRecordsRecord extends TeaModel {
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RecordId")
        public Long recordId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Rr")
        public String rr;

        @NameInMap("Status")
        public String status;

        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeZoneRecordsResponseBodyRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneRecordsResponseBodyRecordsRecord self = new DescribeZoneRecordsResponseBodyRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setRr(String rr) {
            this.rr = rr;
            return this;
        }
        public String getRr() {
            return this.rr;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeZoneRecordsResponseBodyRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<DescribeZoneRecordsResponseBodyRecordsRecord> record;

        public static DescribeZoneRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneRecordsResponseBodyRecords self = new DescribeZoneRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeZoneRecordsResponseBodyRecords setRecord(java.util.List<DescribeZoneRecordsResponseBodyRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<DescribeZoneRecordsResponseBodyRecordsRecord> getRecord() {
            return this.record;
        }

    }

}
