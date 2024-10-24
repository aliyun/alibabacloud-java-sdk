// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponseBody extends TeaModel {
    /**
     * <p>The details about the NAT gateway.</p>
     */
    @NameInMap("NatGateways")
    public DescribeNatGatewaysResponseBodyNatGateways natGateways;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of NAT gateway entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNatGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponseBody self = new DescribeNatGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysResponseBody setNatGateways(DescribeNatGatewaysResponseBodyNatGateways natGateways) {
        this.natGateways = natGateways;
        return this;
    }
    public DescribeNatGatewaysResponseBodyNatGateways getNatGateways() {
        return this.natGateways;
    }

    public DescribeNatGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNatGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNatGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode extends TeaModel {
        @NameInMap("ModeValue")
        public String modeValue;

        @NameInMap("TunnelType")
        public String tunnelType;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode setModeValue(String modeValue) {
            this.modeValue = modeValue;
            return this;
        }
        public String getModeValue() {
            return this.modeValue;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode setTunnelType(String tunnelType) {
            this.tunnelType = tunnelType;
            return this;
        }
        public String getTunnelType() {
            return this.tunnelType;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        public java.util.List<String> forwardTableId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds setForwardTableId(java.util.List<String> forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds extends TeaModel {
        @NameInMap("FullNatTableId")
        public java.util.List<String> fullNatTableId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds setFullNatTableId(java.util.List<String> fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }
        public java.util.List<String> getFullNatTableId() {
            return this.fullNatTableId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList extends TeaModel {
        /**
         * <p>The ID of the EIP associated with the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-m5egzuvp3dgixen6****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The IP address of the EIP associated with the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The private IP address of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>Indicates whether IP addresses that are used in DNAT entries can be specified in SNAT entries. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SnatEntryEnabled")
        public Boolean snatEntryEnabled;

        /**
         * <p>The association between the EIP and the Internet NAT gateway. Valid values:</p>
         * <ul>
         * <li><strong>UsedByForwardTable</strong>: The EIP is specified in a DNAT entry.</li>
         * <li><strong>UsedBySnatTable</strong>: The EIP is specified in an SNAT entry.</li>
         * <li><strong>UsedByForwardSnatTable</strong>: The EIP is specified in both an SNAT entry and a DNAT entry.</li>
         * <li><strong>Idle</strong>: The EIP is not specified in a DNAT or SNAT entry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UsedByForwardTable</p>
         */
        @NameInMap("UsingStatus")
        public String usingStatus;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setSnatEntryEnabled(Boolean snatEntryEnabled) {
            this.snatEntryEnabled = snatEntryEnabled;
            return this;
        }
        public Boolean getSnatEntryEnabled() {
            return this.snatEntryEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList setUsingStatus(String usingStatus) {
            this.usingStatus = usingStatus;
            return this;
        }
        public String getUsingStatus() {
            return this.usingStatus;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists extends TeaModel {
        @NameInMap("IpList")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList> ipList;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists setIpList(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpListsIpList> getIpList() {
            return this.ipList;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo extends TeaModel {
        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-m5eg4ozy5st8q3q4****</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The mode in which the ENI is associated with the NAT gateway.</p>
         * <ul>
         * <li><strong>indirect</strong>: non-cut-through mode</li>
         * <li>If an empty value is returned, it indicates that the cut-through mode is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>indirect</p>
         */
        @NameInMap("EniType")
        public String eniType;

        /**
         * <p>The zone to which the NAT gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <p>The maximum bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("MaxBandwidth")
        public Integer maxBandwidth;

        /**
         * <p>The number of new connections to the NAT gateway. Unit: connections per second.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("MaxSessionEstablishRate")
        public Integer maxSessionEstablishRate;

        /**
         * <p>The number of concurrent connections to the NAT gateway. Unit: connections.</p>
         * 
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        @NameInMap("MaxSessionQuota")
        public Integer maxSessionQuota;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The ID of the vSwitch to which the NAT gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1s2laxhdf9ayjbo****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setEniType(String eniType) {
            this.eniType = eniType;
            return this;
        }
        public String getEniType() {
            return this.eniType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setMaxBandwidth(Integer maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }
        public Integer getMaxBandwidth() {
            return this.maxBandwidth;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setMaxSessionEstablishRate(Integer maxSessionEstablishRate) {
            this.maxSessionEstablishRate = maxSessionEstablishRate;
            return this;
        }
        public Integer getMaxSessionEstablishRate() {
            return this.maxSessionEstablishRate;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setMaxSessionQuota(Integer maxSessionQuota) {
            this.maxSessionQuota = maxSessionQuota;
            return this;
        }
        public Integer getMaxSessionQuota() {
            return this.maxSessionQuota;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds extends TeaModel {
        @NameInMap("SnatTableId")
        public java.util.List<String> snatTableId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds setSnatTableId(java.util.List<String> snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public java.util.List<String> getSnatTableId() {
            return this.snatTableId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>valueTest</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag> tag;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags setTag(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGateway extends TeaModel {
        @NameInMap("AccessMode")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode accessMode;

        /**
         * <p>Indicates whether automatic payment is enabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: no</li>
         * <li><strong>true</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        /**
         * <p>The status of the NAT gateway. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal</li>
         * <li><strong>FinancialLocked</strong>: locked due to overdue payments</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The time when the NAT gateway was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:20Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the deletion protection feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The description of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>NAT</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the traffic monitoring feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EcsMetricEnabled")
        public Boolean ecsMetricEnabled;

        /**
         * <p>The mode in which the NAT gateway is associated with an elastic IP address (EIP). Valid values:</p>
         * <ul>
         * <li><strong>MULTI_BINDED</strong>: multi-EIP-to-ENI mode</li>
         * <li><strong>NAT</strong>: NAT mode, which is compatible with IPv4 addresses.</li>
         * </ul>
         * <blockquote>
         * <p> Note: If you use the NAT mode, the EIP occupies one private IP address on the vSwitch of the NAT gateway. Make sure that the vSwitch has sufficient private IP addresses. Otherwise, the NAT gateway fails to be associated with the EIP. In NAT mode, you can associate a NAT gateway with up to 50 EIPs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MULTI_BINDED</p>
         */
        @NameInMap("EipBindMode")
        public String eipBindMode;

        @NameInMap("EnableSessionLog")
        public String enableSessionLog;

        /**
         * <p>The time when the NAT gateway expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-26T16:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the DNAT table.</p>
         */
        @NameInMap("ForwardTableIds")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds forwardTableIds;

        /**
         * <p>The ID of the FULLNAT table.</p>
         */
        @NameInMap("FullNatTableIds")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds fullNatTableIds;

        /**
         * <p>Indicates whether the ICMP non-retrieval feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IcmpReplyEnabled")
        public Boolean icmpReplyEnabled;

        /**
         * <p>The billing method of the NAT gateway. The value is set to <strong>PostPaid</strong>, which indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The metering method of the NAT gateway. Valid values:</p>
         * <ul>
         * <li><strong>PayBySpec</strong>: pay-by-specification</li>
         * <li><strong>PayByLcu</strong>: pay-by-CU</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByLcu</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The list of elastic IP addresses (EIPs) that are associated with the Internet NAT gateway.</p>
         */
        @NameInMap("IpLists")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists ipLists;

        /**
         * <p>The name of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1047e2d4z7kf2ki****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The private network information about the enhanced Internet NAT gateway.</p>
         * <blockquote>
         * <p> If <strong>NatType</strong> is set to <strong>Normal</strong>, all parameters returned in this list are empty.</p>
         * </blockquote>
         */
        @NameInMap("NatGatewayPrivateInfo")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo natGatewayPrivateInfo;

        /**
         * <p>The type of the NAT gateway. The value is set to <strong>Enhanced</strong> (enhanced NAT gateway).</p>
         * 
         * <strong>example:</strong>
         * <p>Enhanced</p>
         */
        @NameInMap("NatType")
        public String natType;

        /**
         * <p>The type of NAT gateway. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: an Internet NAT gateway</li>
         * <li><strong>intranet</strong>: a VPC NAT gateway</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>Indicates whether the NAT gateway supports PrivateLink. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PrivateLinkEnabled")
        public Boolean privateLinkEnabled;

        /**
         * <p>The mode that is used by PrivateLink. Valid values:</p>
         * <ul>
         * <li><strong>FullNat</strong>: the FULLNAT mode</li>
         * <li><strong>Geneve</strong>: the GENEVE mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullNat</p>
         */
        @NameInMap("PrivateLinkMode")
        public String privateLinkMode;

        /**
         * <p>The ID of the region where the NAT gateway is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the contiguous EIP group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the firewall feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: no</li>
         * <li><strong>true</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SecurityProtectionEnabled")
        public Boolean securityProtectionEnabled;

        /**
         * <p>The ID of the SNAT table of the NAT gateway.</p>
         */
        @NameInMap("SnatTableIds")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds snatTableIds;

        /**
         * <p>The size of the NAT gateway. An empty value is returned for the parameter.</p>
         * <p>If <strong>InternetChargeType</strong> is set to <strong>PayByLcu</strong>, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Small</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the NAT gateway. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: After you send a request to create a NAT gateway, the system creates the NAT gateway in the background. The NAT gateway remains in the Creating state until the operation is completed.</li>
         * <li><strong>Available</strong>: The NAT gateway remains in a stable state after the NAT gateway is created.</li>
         * <li><strong>Modifying</strong>: After you send a request to modify a NAT gateway, the system modifies the NAT gateway in the background. The NAT gateway remains in the Modifying state until the operation is completed.</li>
         * <li><strong>Deleting</strong>: After you send a request to delete a NAT gateway, the system deletes the NAT gateway in the background. The NAT gateway remains in the Deleting state until the operation is completed.</li>
         * <li><strong>Converting</strong>: After you send a request to upgrade a standard NAT gateway to an enhanced NAT gateway, the system upgrades the NAT gateway in the background. The NAT gateway remains in the Converting state until the operation is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are added to the resource group.</p>
         */
        @NameInMap("Tags")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags tags;

        /**
         * <p>The ID of the VPC where the NAT gateway is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72z****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGateway self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGateway();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setAccessMode(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayAccessMode getAccessMode() {
            return this.accessMode;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setEcsMetricEnabled(Boolean ecsMetricEnabled) {
            this.ecsMetricEnabled = ecsMetricEnabled;
            return this;
        }
        public Boolean getEcsMetricEnabled() {
            return this.ecsMetricEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setEipBindMode(String eipBindMode) {
            this.eipBindMode = eipBindMode;
            return this;
        }
        public String getEipBindMode() {
            return this.eipBindMode;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setEnableSessionLog(String enableSessionLog) {
            this.enableSessionLog = enableSessionLog;
            return this;
        }
        public String getEnableSessionLog() {
            return this.enableSessionLog;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setForwardTableIds(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds getForwardTableIds() {
            return this.forwardTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setFullNatTableIds(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds fullNatTableIds) {
            this.fullNatTableIds = fullNatTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayFullNatTableIds getFullNatTableIds() {
            return this.fullNatTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
            this.icmpReplyEnabled = icmpReplyEnabled;
            return this;
        }
        public Boolean getIcmpReplyEnabled() {
            return this.icmpReplyEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setIpLists(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists ipLists) {
            this.ipLists = ipLists;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayIpLists getIpLists() {
            return this.ipLists;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNatGatewayPrivateInfo(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo natGatewayPrivateInfo) {
            this.natGatewayPrivateInfo = natGatewayPrivateInfo;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayNatGatewayPrivateInfo getNatGatewayPrivateInfo() {
            return this.natGatewayPrivateInfo;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNatType(String natType) {
            this.natType = natType;
            return this;
        }
        public String getNatType() {
            return this.natType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setPrivateLinkEnabled(Boolean privateLinkEnabled) {
            this.privateLinkEnabled = privateLinkEnabled;
            return this;
        }
        public Boolean getPrivateLinkEnabled() {
            return this.privateLinkEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setPrivateLinkMode(String privateLinkMode) {
            this.privateLinkMode = privateLinkMode;
            return this;
        }
        public String getPrivateLinkMode() {
            return this.privateLinkMode;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
            this.securityProtectionEnabled = securityProtectionEnabled;
            return this;
        }
        public Boolean getSecurityProtectionEnabled() {
            return this.securityProtectionEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setSnatTableIds(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds snatTableIds) {
            this.snatTableIds = snatTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewaySnatTableIds getSnatTableIds() {
            return this.snatTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setTags(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayTags getTags() {
            return this.tags;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGateways extends TeaModel {
        @NameInMap("NatGateway")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> natGateway;

        public static DescribeNatGatewaysResponseBodyNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGateways self = new DescribeNatGatewaysResponseBodyNatGateways();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGateways setNatGateway(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> natGateway) {
            this.natGateway = natGateway;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> getNatGateway() {
            return this.natGateway;
        }

    }

}
