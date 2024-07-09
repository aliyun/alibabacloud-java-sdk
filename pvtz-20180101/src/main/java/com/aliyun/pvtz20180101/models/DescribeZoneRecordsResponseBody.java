// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The returned DNS records.</p>
     */
    @NameInMap("Records")
    public DescribeZoneRecordsResponseBodyRecords records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B07FBC3-3A53-4939-A3C6-2BDFE407BAB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The time when the DNS record was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-14T03:47Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the DNS record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1672740294000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The resolution line.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>The priority of the mail exchanger (MX) record.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>5809</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>The description of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        @NameInMap("Rr")
        public String rr;

        /**
         * <p>The state of the DNS record. Valid values:</p>
         * <ul>
         * <li>ENABLE: The DNS record is enabled.</li>
         * <li>DISABLE: The DNS record is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time-to-live (TTL) of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The type of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the DNS record was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-08T02:31Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The time when the DNS record was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1654777678000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>The record value.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a49f55537f3b0b1e6e43add0bf5f0033</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZoneRecordsResponseBodyRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneRecordsResponseBodyRecordsRecord self = new DescribeZoneRecordsResponseBodyRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
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

        public DescribeZoneRecordsResponseBodyRecordsRecord setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeZoneRecordsResponseBodyRecordsRecord setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
