// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintenanceConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration details of the O\&amp;M task.</p>
     */
    @NameInMap("Config")
    public DescribeActiveOperationMaintenanceConfigResponseBodyConfig config;

    /**
     * <p>Indicates whether the O\&amp;M task is configured. Valid values:</p>
     * <ul>
     * <li>1: The O\&amp;M task is configured.</li>
     * <li>0: The O\&amp;M task is not configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HasConfig")
    public Integer hasConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>794120D1-E0CF-4713-BAE4-EBAEA04506AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActiveOperationMaintenanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintenanceConfigResponseBody self = new DescribeActiveOperationMaintenanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setConfig(DescribeActiveOperationMaintenanceConfigResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeActiveOperationMaintenanceConfigResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setHasConfig(Integer hasConfig) {
        this.hasConfig = hasConfig;
        return this;
    }
    public Integer getHasConfig() {
        return this.hasConfig;
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeActiveOperationMaintenanceConfigResponseBodyConfig extends TeaModel {
        /**
         * <p>The time when the O\&amp;M task was created. The time follows the ISO 8601 standard in the <em>yyyy-mm-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-30T14:30:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The interval between two O\&amp;M tasks.</p>
         * <ul>
         * <li>If the CycleType parameter is set to Month, the CycleTime parameter returns a string of numbers ranging from 1 to 28, which indicates the specific days of the month. The numbers are separated with commas (,). The CycleTime parameter returns 0 when the configurations do not take effect.</li>
         * <li>If the CycleType parameter is set to Week, the CycleTime parameter returns a string of numbers ranging from 1 to 7, which indicates the specific days of the week. The numbers are separated with commas (,). The CycleTime parameter returns 0 when the configurations do not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("CycleTime")
        public String cycleTime;

        /**
         * <p>The unit of the O\&amp;M task cycle. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Week</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The end time of the O\&amp;M window. The time follows the ISO 8601 standard in the <em>hh:mm:ss</em> Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>20:00:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the O\&amp;M window. The time follows the ISO 8601 standard in the <em>hh:mm:ss</em> Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The time when the last O\&amp;M task configurations are modified. The time follows the ISO 8601 standard in the <em>yyyy-mm-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30T14:30:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>Indicates whether the configurations take effect. Valid values:</p>
         * <ul>
         * <li>1: The configurations are in effect.</li>
         * <li>2: The configurations are invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeActiveOperationMaintenanceConfigResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationMaintenanceConfigResponseBodyConfig self = new DescribeActiveOperationMaintenanceConfigResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCycleTime(String cycleTime) {
            this.cycleTime = cycleTime;
            return this;
        }
        public String getCycleTime() {
            return this.cycleTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
