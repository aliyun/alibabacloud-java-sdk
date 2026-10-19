// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintenanceConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration details of the O&amp;M task.</p>
     */
    @NameInMap("Config")
    public DescribeActiveOperationMaintenanceConfigResponseBodyConfig config;

    /**
     * <p>Indicates whether the configuration exists. Valid values:</p>
     * <ul>
     * <li>1: Configured.</li>
     * <li>0: Not configured.</li>
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
         * <p>The time when the O&amp;M task configuration was created. The time is in the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-30T14:30:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The cycle time.</p>
         * <ul>
         * <li>If CycleType is set to Month, a number from 1 to 28 is returned, indicating the day of the month. Multiple values are separated by commas (,). The value is 0 if the configuration is inactive.</li>
         * <li>If CycleType is set to Week, a number from 1 to 7 is returned, indicating the day of the week. Multiple values are separated by commas (,). The value is 0 if the configuration is inactive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("CycleTime")
        public String cycleTime;

        /**
         * <p>The cycle type. Valid values:</p>
         * <ul>
         * <li>Month: monthly</li>
         * <li>Week: weekly</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Week</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The end time of the O&amp;M time window. The time is in the <i>hh:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>20:00:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the O&amp;M time window. The time is in the <i>hh:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>18:00:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The time when the O&amp;M task configuration was last modified. The time is in the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30T14:30:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>Indicates whether the configuration is active. Valid values:</p>
         * <ul>
         * <li>1: Active.</li>
         * <li>2: Inactive.</li>
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
