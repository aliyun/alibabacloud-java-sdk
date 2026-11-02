// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CalculateNatGatewayCapacityUnitsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned. The Internet NAT gateway is not upgraded.</li>
     * <li>false (default): sends a normal request. If the request passes the check, a 2xx HTTP status code is returned and the Internet NAT gateway is upgraded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The details of the resource reservation CUs to be calculated.</p>
     */
    @NameInMap("NatGatewayCapacity")
    public CalculateNatGatewayCapacityUnitsRequestNatGatewayCapacity natGatewayCapacity;

    /**
     * <p>The instance ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-2ze0dcn4mq31qx2jc****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The details of the resource reservation metrics to be calculated.</p>
     */
    @NameInMap("NatGatewayPerformanceValues")
    public CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues natGatewayPerformanceValues;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CalculateNatGatewayCapacityUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        CalculateNatGatewayCapacityUnitsRequest self = new CalculateNatGatewayCapacityUnitsRequest();
        return TeaModel.build(map, self);
    }

    public CalculateNatGatewayCapacityUnitsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CalculateNatGatewayCapacityUnitsRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public CalculateNatGatewayCapacityUnitsRequest setNatGatewayCapacity(CalculateNatGatewayCapacityUnitsRequestNatGatewayCapacity natGatewayCapacity) {
        this.natGatewayCapacity = natGatewayCapacity;
        return this;
    }
    public CalculateNatGatewayCapacityUnitsRequestNatGatewayCapacity getNatGatewayCapacity() {
        return this.natGatewayCapacity;
    }

    public CalculateNatGatewayCapacityUnitsRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CalculateNatGatewayCapacityUnitsRequest setNatGatewayPerformanceValues(CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues natGatewayPerformanceValues) {
        this.natGatewayPerformanceValues = natGatewayPerformanceValues;
        return this;
    }
    public CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues getNatGatewayPerformanceValues() {
        return this.natGatewayPerformanceValues;
    }

    public CalculateNatGatewayCapacityUnitsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CalculateNatGatewayCapacityUnitsRequestNatGatewayCapacity extends TeaModel {
        /**
         * <p>The number of reserved LCUs per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CapacityUnits")
        public Integer capacityUnits;

        public static CalculateNatGatewayCapacityUnitsRequestNatGatewayCapacity build(java.util.Map<String, ?> map) throws Exception {
            CalculateNatGatewayCapacityUnitsRequestNatGatewayCapacity self = new CalculateNatGatewayCapacityUnitsRequestNatGatewayCapacity();
            return TeaModel.build(map, self);
        }

        public CalculateNatGatewayCapacityUnitsRequestNatGatewayCapacity setCapacityUnits(Integer capacityUnits) {
            this.capacityUnits = capacityUnits;
            return this;
        }
        public Integer getCapacityUnits() {
            return this.capacityUnits;
        }

    }

    public static class CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues extends TeaModel {
        /**
         * <p>The bandwidth. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The maximum number of new connections per second.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The number of packets. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
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

        public static CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues build(java.util.Map<String, ?> map) throws Exception {
            CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues self = new CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues();
            return TeaModel.build(map, self);
        }

        public CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public CalculateNatGatewayCapacityUnitsRequestNatGatewayPerformanceValues setSessionCount(Integer sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Integer getSessionCount() {
            return this.sessionCount;
        }

    }

}
