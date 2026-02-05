// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintainConfResponseBody extends TeaModel {
    @NameInMap("Config")
    public DescribeActiveOperationMaintainConfResponseBodyConfig config;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HasConfig")
    public Integer hasConfig;

    /**
     * <strong>example:</strong>
     * <p>4438AC3E-ABE3-5943-9436-***********</p>
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

    public DescribeActiveOperationMaintainConfResponseBody setHasConfig(Integer hasConfig) {
        this.hasConfig = hasConfig;
        return this;
    }
    public Integer getHasConfig() {
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
         * <p>2018-05-30T14:30:00Z</p>
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
        public String cycleType;

        /**
         * <strong>example:</strong>
         * <p>20:00:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <strong>example:</strong>
         * <p>18:00:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <strong>example:</strong>
         * <p>2018-05-30T14:30:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

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

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
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

        public DescribeActiveOperationMaintainConfResponseBodyConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
