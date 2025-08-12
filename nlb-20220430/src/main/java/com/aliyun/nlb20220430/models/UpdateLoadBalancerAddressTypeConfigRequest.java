// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAddressTypeConfigRequest extends TeaModel {
    /**
     * <p>The new network type. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The nodes of an Internet-facing NLB instance have public IP addresses. The DNS name of an Internet-facing NLB instance is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing NLB instances can route requests from clients over the Internet.</li>
     * <li><strong>Intranet</strong>: The nodes of an internal-facing NLB instance have only private IP addresses. The DNS name of an internal-facing NLB instance is publicly resolvable to the private IP addresses of the nodes. Therefore, internal-facing NLB instances can route requests only from clients with access to the virtual private cloud (VPC) for the NLB instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate this value. Ensure that the value is unique among all requests. Only ASCII characters are allowed.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** <strong>RequestId</strong> of each request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Perform a dry run without actually making the request. Valid values are:</p>
     * <ul>
     * <li><strong>true</strong>: Perform only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the check, an error message specifying the issue is returned. If the request passes, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): Check the request and perform the operation. If the request passes the check, a 2xx HTTP status code is returned, and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the NLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-83ckzc8d4xlp8o****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The region ID of the NLB instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The mappings between zones and vSwitches. You can specify up to 10 zones.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> zoneMappings;

    public static UpdateLoadBalancerAddressTypeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAddressTypeConfigRequest self = new UpdateLoadBalancerAddressTypeConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setZoneMappings(java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class UpdateLoadBalancerAddressTypeConfigRequestZoneMappings extends TeaModel {
        /**
         * <p>The ID of the elastic IP address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>Common</strong>: an EIP</li>
         * <li><strong>Anycast</strong>: an Anycast EIP</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required only if <strong>AddressType</strong> is set to <strong>Internet</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The ID of the vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10ttov87felojcn****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateLoadBalancerAddressTypeConfigRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerAddressTypeConfigRequestZoneMappings self = new UpdateLoadBalancerAddressTypeConfigRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setEipType(String eipType) {
            this.eipType = eipType;
            return this;
        }
        public String getEipType() {
            return this.eipType;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
