// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CalculateNatGatewayCapacityUnitsResponseBody extends TeaModel {
    /**
     * <p>The details of the calculated equivalent resource reservation CUs.</p>
     */
    @NameInMap("NatGatewayCapacity")
    public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayCapacity natGatewayCapacity;

    /**
     * <p>The details of the calculated equivalent resource reservation metrics.</p>
     */
    @NameInMap("NatGatewayPerformanceValues")
    public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues natGatewayPerformanceValues;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CalculateNatGatewayCapacityUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalculateNatGatewayCapacityUnitsResponseBody self = new CalculateNatGatewayCapacityUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public CalculateNatGatewayCapacityUnitsResponseBody setNatGatewayCapacity(CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayCapacity natGatewayCapacity) {
        this.natGatewayCapacity = natGatewayCapacity;
        return this;
    }
    public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayCapacity getNatGatewayCapacity() {
        return this.natGatewayCapacity;
    }

    public CalculateNatGatewayCapacityUnitsResponseBody setNatGatewayPerformanceValues(CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues natGatewayPerformanceValues) {
        this.natGatewayPerformanceValues = natGatewayPerformanceValues;
        return this;
    }
    public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues getNatGatewayPerformanceValues() {
        return this.natGatewayPerformanceValues;
    }

    public CalculateNatGatewayCapacityUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayCapacity extends TeaModel {
        /**
         * <p>The number of reserved LCUs per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CapacityUnits")
        public Double capacityUnits;

        public static CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayCapacity build(java.util.Map<String, ?> map) throws Exception {
            CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayCapacity self = new CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayCapacity();
            return TeaModel.build(map, self);
        }

        public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayCapacity setCapacityUnits(Double capacityUnits) {
            this.capacityUnits = capacityUnits;
            return this;
        }
        public Double getCapacityUnits() {
            return this.capacityUnits;
        }

    }

    public static class CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues extends TeaModel {
        /**
         * <p>The bandwidth. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The maximum number of new connections per second.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The number of packets. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>160000</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SessionCount")
        public Integer sessionCount;

        public static CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues build(java.util.Map<String, ?> map) throws Exception {
            CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues self = new CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues();
            return TeaModel.build(map, self);
        }

        public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public CalculateNatGatewayCapacityUnitsResponseBodyNatGatewayPerformanceValues setSessionCount(Integer sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Integer getSessionCount() {
            return this.sessionCount;
        }

    }

}
