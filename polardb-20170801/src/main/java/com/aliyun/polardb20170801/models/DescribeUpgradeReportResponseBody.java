// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeUpgradeReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Details")
    public String details;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DstDBType")
    public String dstDBType;

    @NameInMap("Items")
    public java.util.List<DescribeUpgradeReportResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ItemsSize")
    public Long itemsSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rm-2zen5pe5vi56447d0</p>
     */
    @NameInMap("SourceDBClusterId")
    public String sourceDBClusterId;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SrcDBType")
    public String srcDBType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SrcDeleted")
    public String srcDeleted;

    /**
     * <strong>example:</strong>
     * <p>137</p>
     */
    @NameInMap("TotalSize")
    public Long totalSize;

    /**
     * <strong>example:</strong>
     * <p>tair</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("UpgradeReportList")
    public java.util.List<DescribeUpgradeReportResponseBodyUpgradeReportList> upgradeReportList;

    public static DescribeUpgradeReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeReportResponseBody self = new DescribeUpgradeReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeReportResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public DescribeUpgradeReportResponseBody setDstDBType(String dstDBType) {
        this.dstDBType = dstDBType;
        return this;
    }
    public String getDstDBType() {
        return this.dstDBType;
    }

    public DescribeUpgradeReportResponseBody setItems(java.util.List<DescribeUpgradeReportResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeUpgradeReportResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeUpgradeReportResponseBody setItemsSize(Long itemsSize) {
        this.itemsSize = itemsSize;
        return this;
    }
    public Long getItemsSize() {
        return this.itemsSize;
    }

    public DescribeUpgradeReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpgradeReportResponseBody setSourceDBClusterId(String sourceDBClusterId) {
        this.sourceDBClusterId = sourceDBClusterId;
        return this;
    }
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

    public DescribeUpgradeReportResponseBody setSrcDBType(String srcDBType) {
        this.srcDBType = srcDBType;
        return this;
    }
    public String getSrcDBType() {
        return this.srcDBType;
    }

    public DescribeUpgradeReportResponseBody setSrcDeleted(String srcDeleted) {
        this.srcDeleted = srcDeleted;
        return this;
    }
    public String getSrcDeleted() {
        return this.srcDeleted;
    }

    public DescribeUpgradeReportResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public DescribeUpgradeReportResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeUpgradeReportResponseBody setUpgradeReportList(java.util.List<DescribeUpgradeReportResponseBodyUpgradeReportList> upgradeReportList) {
        this.upgradeReportList = upgradeReportList;
        return this;
    }
    public java.util.List<DescribeUpgradeReportResponseBodyUpgradeReportList> getUpgradeReportList() {
        return this.upgradeReportList;
    }

    public static class DescribeUpgradeReportResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CREATE XXXX</p>
         */
        @NameInMap("DDL")
        public String DDL;

        /**
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ny_openapi</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>orca</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeUpgradeReportResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeReportResponseBodyItems self = new DescribeUpgradeReportResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeReportResponseBodyItems setDDL(String DDL) {
            this.DDL = DDL;
            return this;
        }
        public String getDDL() {
            return this.DDL;
        }

        public DescribeUpgradeReportResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUpgradeReportResponseBodyItems setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeUpgradeReportResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeUpgradeReportResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeUpgradeReportResponseBodyUpgradeReportList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-03-15T06:48:44Z</p>
         */
        @NameInMap("CheckTime")
        public String checkTime;

        /**
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DstVersion")
        public String dstVersion;

        /**
         * <strong>example:</strong>
         * <p>2024-03-08T06:48:44Z</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <strong>example:</strong>
         * <p>2024-03-08T06:48:44Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>pc-2ze54671qoz830za9</p>
         */
        @NameInMap("SrcInsName")
        public String srcInsName;

        /**
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("SrcVersion")
        public String srcVersion;

        /**
         * <strong>example:</strong>
         * <p>2025-07-05T01:56:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>275948</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>rds2polar_pengine_with_dts</p>
         */
        @NameInMap("UpgradeMode")
        public String upgradeMode;

        public static DescribeUpgradeReportResponseBodyUpgradeReportList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeReportResponseBodyUpgradeReportList self = new DescribeUpgradeReportResponseBodyUpgradeReportList();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setCheckTime(String checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public String getCheckTime() {
            return this.checkTime;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setDstVersion(String dstVersion) {
            this.dstVersion = dstVersion;
            return this;
        }
        public String getDstVersion() {
            return this.dstVersion;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setSrcInsName(String srcInsName) {
            this.srcInsName = srcInsName;
            return this;
        }
        public String getSrcInsName() {
            return this.srcInsName;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeUpgradeReportResponseBodyUpgradeReportList setUpgradeMode(String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

    }

}
