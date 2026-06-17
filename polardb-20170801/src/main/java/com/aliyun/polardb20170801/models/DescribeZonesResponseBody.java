// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2FDB684-751D-424D-98B9-704BEA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of zones.</p>
     */
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
         * <p>The enumeration of statuses. Valid values:</p>
         * <ul>
         * <li><p><strong>UnSet</strong>: The zone is not open for use.</p>
         * </li>
         * <li><p><strong>SoldOut</strong>: The resources in the zone are sold out.</p>
         * </li>
         * <li><p><strong>WithStock</strong>: The zone has available resources.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UnSet</p>
         */
        @NameInMap("ModeCode")
        public String modeCode;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The status of the zone. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: The zone is available.</p>
         * </li>
         * <li><p><strong>OFF</strong>: The zone is unavailable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the zone.</p>
         * 
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
