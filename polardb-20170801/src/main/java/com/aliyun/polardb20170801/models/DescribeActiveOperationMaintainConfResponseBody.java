// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintainConfResponseBody extends TeaModel {
    @NameInMap("Config")
    public DescribeActiveOperationMaintainConfResponseBodyConfig config;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HasConfig")
    public Long hasConfig;

    /**
     * <strong>example:</strong>
     * <p>14109129-EF13-5C83-AD86-7581D9552603</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActiveOperationMaintainConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintainConfResponseBody self = new DescribeActiveOperationMaintainConfResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintainConfResponseBody setConfig(DescribeActiveOperationMaintainConfResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeActiveOperationMaintainConfResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeActiveOperationMaintainConfResponseBody setHasConfig(Long hasConfig) {
        this.hasConfig = hasConfig;
        return this;
    }
    public Long getHasConfig() {
        return this.hasConfig;
    }

    public DescribeActiveOperationMaintainConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeActiveOperationMaintainConfResponseBodyConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-04T19:28:46</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleTime")
        public String cycleTime;

        /**
         * <strong>example:</strong>
         * <p>Week</p>
         */
        @NameInMap("CycleType")
        public Integer cycleType;

        /**
         * <strong>example:</strong>
         * <p>09:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <strong>example:</strong>
         * <p>8:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <strong>example:</strong>
         * <p>2025-04-02T02:10:08Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        public static DescribeActiveOperationMaintainConfResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationMaintainConfResponseBodyConfig self = new DescribeActiveOperationMaintainConfResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCycleTime(String cycleTime) {
            this.cycleTime = cycleTime;
            return this;
        }
        public String getCycleTime() {
            return this.cycleTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCycleType(Integer cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public Integer getCycleType() {
            return this.cycleType;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
