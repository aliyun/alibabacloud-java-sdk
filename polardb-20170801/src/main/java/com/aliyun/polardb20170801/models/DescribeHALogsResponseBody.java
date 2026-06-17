// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHALogsResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-a*************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><strong>polardb_mysql_rw</strong>: read-write instance.</li>
     * <li><strong>polardb_mysql_ro</strong>: read-only instance.</li>
     * <li><strong>polardb_mysql_standby</strong>: standby instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polardb_mysql_rw</p>
     */
    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    /**
     * <p>The list of primary/secondary 这里 AI 机翻使用了 failover，但代码里用了 switch，建议保持一致，都改为 swichover logs.</p>
     */
    @NameInMap("HaLogItems")
    public java.util.List<DescribeHALogsResponseBodyHaLogItems> haLogItems;

    /**
     * <p>Indicates whether primary/secondary switchover records exist. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: No</li>
     * <li><strong>0</strong>: Yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HaStatus")
    public Integer haStatus;

    /**
     * <p>The number of items in the log list on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    /**
     * <p>The page number. The value is greater than 0 and does not exceed the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Valid values: 30 to 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>160</p>
     */
    @NameInMap("TotalRecords")
    public Integer totalRecords;

    public static DescribeHALogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHALogsResponseBody self = new DescribeHALogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHALogsResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeHALogsResponseBody setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
        return this;
    }
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    public DescribeHALogsResponseBody setHaLogItems(java.util.List<DescribeHALogsResponseBodyHaLogItems> haLogItems) {
        this.haLogItems = haLogItems;
        return this;
    }
    public java.util.List<DescribeHALogsResponseBodyHaLogItems> getHaLogItems() {
        return this.haLogItems;
    }

    public DescribeHALogsResponseBody setHaStatus(Integer haStatus) {
        this.haStatus = haStatus;
        return this;
    }
    public Integer getHaStatus() {
        return this.haStatus;
    }

    public DescribeHALogsResponseBody setItemsNumbers(Integer itemsNumbers) {
        this.itemsNumbers = itemsNumbers;
        return this;
    }
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    public DescribeHALogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHALogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHALogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHALogsResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static class DescribeHALogsResponseBodyHaLogItems extends TeaModel {
        /**
         * <p>The cause code of the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>Platform.Ha.AuroraService.ManualOperations</p>
         */
        @NameInMap("SwitchCauseCode")
        public String switchCauseCode;

        /**
         * <p>The cause of the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>Platform.Ha.ManuallyTriggered</p>
         */
        @NameInMap("SwitchCauseDetail")
        public String switchCauseDetail;

        /**
         * <p>The end time of the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-20T03:09:56Z</p>
         */
        @NameInMap("SwitchFinishTime")
        public String switchFinishTime;

        /**
         * <p>The ID of the primary/secondary switchover log.</p>
         * 
         * <strong>example:</strong>
         * <p>e571f897-9b3c-4012-9470-88333832dec4</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>The start time of the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-20T03:09:45Z</p>
         */
        @NameInMap("SwitchStartTime")
        public String switchStartTime;

        public static DescribeHALogsResponseBodyHaLogItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHALogsResponseBodyHaLogItems self = new DescribeHALogsResponseBodyHaLogItems();
            return TeaModel.build(map, self);
        }

        public DescribeHALogsResponseBodyHaLogItems setSwitchCauseCode(String switchCauseCode) {
            this.switchCauseCode = switchCauseCode;
            return this;
        }
        public String getSwitchCauseCode() {
            return this.switchCauseCode;
        }

        public DescribeHALogsResponseBodyHaLogItems setSwitchCauseDetail(String switchCauseDetail) {
            this.switchCauseDetail = switchCauseDetail;
            return this;
        }
        public String getSwitchCauseDetail() {
            return this.switchCauseDetail;
        }

        public DescribeHALogsResponseBodyHaLogItems setSwitchFinishTime(String switchFinishTime) {
            this.switchFinishTime = switchFinishTime;
            return this;
        }
        public String getSwitchFinishTime() {
            return this.switchFinishTime;
        }

        public DescribeHALogsResponseBodyHaLogItems setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public DescribeHALogsResponseBodyHaLogItems setSwitchStartTime(String switchStartTime) {
            this.switchStartTime = switchStartTime;
            return this;
        }
        public String getSwitchStartTime() {
            return this.switchStartTime;
        }

    }

}
