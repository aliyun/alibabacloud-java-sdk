// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLLogTemplatesResponseBody extends TeaModel {
    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    @NameInMap("DBInstanceID")
    public Integer DBInstanceID;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    @NameInMap("Items")
    public DescribeSQLLogTemplatesResponseBodyItems items;

    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    @NameInMap("Finish")
    public String finish;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("PagingID")
    public String pagingID;

    public static DescribeSQLLogTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogTemplatesResponseBody self = new DescribeSQLLogTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogTemplatesResponseBody setItemsNumbers(Integer itemsNumbers) {
        this.itemsNumbers = itemsNumbers;
        return this;
    }
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    public DescribeSQLLogTemplatesResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogTemplatesResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogTemplatesResponseBody setMaxRecordsPerPage(Integer maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeSQLLogTemplatesResponseBody setDBInstanceID(Integer DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public Integer getDBInstanceID() {
        return this.DBInstanceID;
    }

    public DescribeSQLLogTemplatesResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public DescribeSQLLogTemplatesResponseBody setItems(DescribeSQLLogTemplatesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogTemplatesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSQLLogTemplatesResponseBody setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeSQLLogTemplatesResponseBody setFinish(String finish) {
        this.finish = finish;
        return this;
    }
    public String getFinish() {
        return this.finish;
    }

    public DescribeSQLLogTemplatesResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeSQLLogTemplatesResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSQLLogTemplatesResponseBody setPagingID(String pagingID) {
        this.pagingID = pagingID;
        return this;
    }
    public String getPagingID() {
        return this.pagingID;
    }

    public static class DescribeSQLLogTemplatesResponseBodyItemsTemplate extends TeaModel {
        @NameInMap("TotalConsume")
        public Long totalConsume;

        @NameInMap("AvgUpdateRows")
        public Float avgUpdateRows;

        @NameInMap("TotalScanRows")
        public Long totalScanRows;

        @NameInMap("Template")
        public String template;

        @NameInMap("TemplateHash")
        public String templateHash;

        @NameInMap("ItemID")
        public Integer itemID;

        @NameInMap("TotalUpdateRows")
        public Long totalUpdateRows;

        @NameInMap("TotalCounts")
        public Long totalCounts;

        @NameInMap("AvgScanRows")
        public Float avgScanRows;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("AvgConsume")
        public Float avgConsume;

        public static DescribeSQLLogTemplatesResponseBodyItemsTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogTemplatesResponseBodyItemsTemplate self = new DescribeSQLLogTemplatesResponseBodyItemsTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setTotalConsume(Long totalConsume) {
            this.totalConsume = totalConsume;
            return this;
        }
        public Long getTotalConsume() {
            return this.totalConsume;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setAvgUpdateRows(Float avgUpdateRows) {
            this.avgUpdateRows = avgUpdateRows;
            return this;
        }
        public Float getAvgUpdateRows() {
            return this.avgUpdateRows;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setTotalScanRows(Long totalScanRows) {
            this.totalScanRows = totalScanRows;
            return this;
        }
        public Long getTotalScanRows() {
            return this.totalScanRows;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setTemplateHash(String templateHash) {
            this.templateHash = templateHash;
            return this;
        }
        public String getTemplateHash() {
            return this.templateHash;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setItemID(Integer itemID) {
            this.itemID = itemID;
            return this;
        }
        public Integer getItemID() {
            return this.itemID;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setTotalUpdateRows(Long totalUpdateRows) {
            this.totalUpdateRows = totalUpdateRows;
            return this;
        }
        public Long getTotalUpdateRows() {
            return this.totalUpdateRows;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setTotalCounts(Long totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }
        public Long getTotalCounts() {
            return this.totalCounts;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setAvgScanRows(Float avgScanRows) {
            this.avgScanRows = avgScanRows;
            return this;
        }
        public Float getAvgScanRows() {
            return this.avgScanRows;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSQLLogTemplatesResponseBodyItemsTemplate setAvgConsume(Float avgConsume) {
            this.avgConsume = avgConsume;
            return this;
        }
        public Float getAvgConsume() {
            return this.avgConsume;
        }

    }

    public static class DescribeSQLLogTemplatesResponseBodyItems extends TeaModel {
        @NameInMap("Template")
        public java.util.List<DescribeSQLLogTemplatesResponseBodyItemsTemplate> template;

        public static DescribeSQLLogTemplatesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogTemplatesResponseBodyItems self = new DescribeSQLLogTemplatesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogTemplatesResponseBodyItems setTemplate(java.util.List<DescribeSQLLogTemplatesResponseBodyItemsTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<DescribeSQLLogTemplatesResponseBodyItemsTemplate> getTemplate() {
            return this.template;
        }

    }

}
