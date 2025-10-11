// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E2FDB684-751D-424D-98B9-704BEA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Zones")
    public java.util.List<DescribeZonesResponseBodyZones> zones;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setZones(java.util.List<DescribeZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<DescribeZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UnSet</p>
         */
        @NameInMap("ModeCode")
        public String modeCode;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setModeCode(String modeCode) {
            this.modeCode = modeCode;
            return this;
        }
        public String getModeCode() {
            return this.modeCode;
        }

        public DescribeZonesResponseBodyZones setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeZonesResponseBodyZones setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
