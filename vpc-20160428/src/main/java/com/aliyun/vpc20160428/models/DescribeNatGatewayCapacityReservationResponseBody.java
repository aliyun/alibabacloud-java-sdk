// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewayCapacityReservationResponseBody extends TeaModel {
    /**
     * <p>The capacity reservation status.</p>
     */
    @NameInMap("CapacityReservationStatus")
    public DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus capacityReservationStatus;

    /**
     * <p>The remaining number of times that you can downgrade the configuration or cancel the capacity reservation.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DecreaseRequestsRemaining")
    public String decreaseRequestsRemaining;

    /**
     * <p>The time when the capacity reservation was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-02 10:07:51</p>
     */
    @NameInMap("LastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>The number of capacity units (CUs) reserved for the NAT gateway.</p>
     */
    @NameInMap("NatGatewayCapacity")
    public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayCapacity natGatewayCapacity;

    /**
     * <p>The ID of the NAT gateway to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The performance metrics of the NAT gateway capacity reservation.</p>
     */
    @NameInMap("NatGatewayPerformanceValues")
    public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues natGatewayPerformanceValues;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD97C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNatGatewayCapacityReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewayCapacityReservationResponseBody self = new DescribeNatGatewayCapacityReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewayCapacityReservationResponseBody setCapacityReservationStatus(DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus capacityReservationStatus) {
        this.capacityReservationStatus = capacityReservationStatus;
        return this;
    }
    public DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus getCapacityReservationStatus() {
        return this.capacityReservationStatus;
    }

    public DescribeNatGatewayCapacityReservationResponseBody setDecreaseRequestsRemaining(String decreaseRequestsRemaining) {
        this.decreaseRequestsRemaining = decreaseRequestsRemaining;
        return this;
    }
    public String getDecreaseRequestsRemaining() {
        return this.decreaseRequestsRemaining;
    }

    public DescribeNatGatewayCapacityReservationResponseBody setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public DescribeNatGatewayCapacityReservationResponseBody setNatGatewayCapacity(DescribeNatGatewayCapacityReservationResponseBodyNatGatewayCapacity natGatewayCapacity) {
        this.natGatewayCapacity = natGatewayCapacity;
        return this;
    }
    public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayCapacity getNatGatewayCapacity() {
        return this.natGatewayCapacity;
    }

    public DescribeNatGatewayCapacityReservationResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatGatewayCapacityReservationResponseBody setNatGatewayPerformanceValues(DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues natGatewayPerformanceValues) {
        this.natGatewayPerformanceValues = natGatewayPerformanceValues;
        return this;
    }
    public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues getNatGatewayPerformanceValues() {
        return this.natGatewayPerformanceValues;
    }

    public DescribeNatGatewayCapacityReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus extends TeaModel {
        /**
         * <p>The reason for the processing failure.</p>
         * 
         * <strong>example:</strong>
         * <p>No Available Resource</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The capacity reservation status. Valid values:</p>
         * <ul>
         * <li>pending: The reservation is in progress.</li>
         * <li>provisioned: The reservation is completed.</li>
         * <li>failed: The reservation failed.</li>
         * <li>deleting: The reservation is being deleted.</li>
         * <li>deleted: The reservation is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus self = new DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeNatGatewayCapacityReservationResponseBodyCapacityReservationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeNatGatewayCapacityReservationResponseBodyNatGatewayCapacity extends TeaModel {
        /**
         * <p>The number of load balancer capacity units (LCUs) reserved per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("CapacityUnits")
        public Double capacityUnits;

        public static DescribeNatGatewayCapacityReservationResponseBodyNatGatewayCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayCapacityReservationResponseBodyNatGatewayCapacity self = new DescribeNatGatewayCapacityReservationResponseBodyNatGatewayCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayCapacity setCapacityUnits(Double capacityUnits) {
            this.capacityUnits = capacityUnits;
            return this;
        }
        public Double getCapacityUnits() {
            return this.capacityUnits;
        }

    }

    public static class DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues extends TeaModel {
        /**
         * <p>The bandwidth value. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The number of new connections per second (CPS).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The number of packets per second (PPS).</p>
         * 
         * <strong>example:</strong>
         * <p>3200000</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        @NameInMap("SessionCount")
        public Integer sessionCount;

        public static DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues self = new DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues setSessionCount(Integer sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Integer getSessionCount() {
            return this.sessionCount;
        }

    }

}
