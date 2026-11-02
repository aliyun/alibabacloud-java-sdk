// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayCapacityReservationResponseBody extends TeaModel {
    /**
     * <p>The status of the resource reservation.</p>
     */
    @NameInMap("CapacityReservationStatus")
    public ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus capacityReservationStatus;

    /**
     * <p>The remaining number of times that you can downgrade the configuration or cancel the resource reservation.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DecreaseRequestsRemaining")
    public Integer decreaseRequestsRemaining;

    /**
     * <p>The number of capacity units (CUs) for the NAT resource reservation.</p>
     */
    @NameInMap("NatGatewayCapacity")
    public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayCapacity natGatewayCapacity;

    /**
     * <p>The ID of the NAT gateway to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-112za33e4****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The performance metrics of the NAT resource reservation.</p>
     */
    @NameInMap("NatGatewayPerformanceValues")
    public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues natGatewayPerformanceValues;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B400EF57-60E3-4D61-B8FB-7FA8F72DF5A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNatGatewayCapacityReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewayCapacityReservationResponseBody self = new ModifyNatGatewayCapacityReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewayCapacityReservationResponseBody setCapacityReservationStatus(ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus capacityReservationStatus) {
        this.capacityReservationStatus = capacityReservationStatus;
        return this;
    }
    public ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus getCapacityReservationStatus() {
        return this.capacityReservationStatus;
    }

    public ModifyNatGatewayCapacityReservationResponseBody setDecreaseRequestsRemaining(Integer decreaseRequestsRemaining) {
        this.decreaseRequestsRemaining = decreaseRequestsRemaining;
        return this;
    }
    public Integer getDecreaseRequestsRemaining() {
        return this.decreaseRequestsRemaining;
    }

    public ModifyNatGatewayCapacityReservationResponseBody setNatGatewayCapacity(ModifyNatGatewayCapacityReservationResponseBodyNatGatewayCapacity natGatewayCapacity) {
        this.natGatewayCapacity = natGatewayCapacity;
        return this;
    }
    public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayCapacity getNatGatewayCapacity() {
        return this.natGatewayCapacity;
    }

    public ModifyNatGatewayCapacityReservationResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ModifyNatGatewayCapacityReservationResponseBody setNatGatewayPerformanceValues(ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues natGatewayPerformanceValues) {
        this.natGatewayPerformanceValues = natGatewayPerformanceValues;
        return this;
    }
    public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues getNatGatewayPerformanceValues() {
        return this.natGatewayPerformanceValues;
    }

    public ModifyNatGatewayCapacityReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus extends TeaModel {
        /**
         * <p>The reason for the processing failure.</p>
         * 
         * <strong>example:</strong>
         * <p>No Available Resource</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the resource reservation. Valid values:</p>
         * <ul>
         * <li><p>pending: The reservation is in progress.</p>
         * </li>
         * <li><p>provisioned: The reservation is completed.</p>
         * </li>
         * <li><p>failed: The reservation failed.</p>
         * </li>
         * <li><p>deleting: The reservation is being deleted.</p>
         * </li>
         * <li><p>deleted: The reservation is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("Status")
        public String status;

        public static ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus build(java.util.Map<String, ?> map) throws Exception {
            ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus self = new ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus();
            return TeaModel.build(map, self);
        }

        public ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ModifyNatGatewayCapacityReservationResponseBodyCapacityReservationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ModifyNatGatewayCapacityReservationResponseBodyNatGatewayCapacity extends TeaModel {
        /**
         * <p>The number of LCUs reserved per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CapacityUnits")
        public Double capacityUnits;

        public static ModifyNatGatewayCapacityReservationResponseBodyNatGatewayCapacity build(java.util.Map<String, ?> map) throws Exception {
            ModifyNatGatewayCapacityReservationResponseBodyNatGatewayCapacity self = new ModifyNatGatewayCapacityReservationResponseBodyNatGatewayCapacity();
            return TeaModel.build(map, self);
        }

        public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayCapacity setCapacityUnits(Double capacityUnits) {
            this.capacityUnits = capacityUnits;
            return this;
        }
        public Double getCapacityUnits() {
            return this.capacityUnits;
        }

    }

    public static class ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues extends TeaModel {
        /**
         * <p>The bandwidth value. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The number of new connections.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The number of packets. Unit: pps.</p>
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

        public static ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues build(java.util.Map<String, ?> map) throws Exception {
            ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues self = new ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues();
            return TeaModel.build(map, self);
        }

        public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public ModifyNatGatewayCapacityReservationResponseBodyNatGatewayPerformanceValues setSessionCount(Integer sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Integer getSessionCount() {
            return this.sessionCount;
        }

    }

}
