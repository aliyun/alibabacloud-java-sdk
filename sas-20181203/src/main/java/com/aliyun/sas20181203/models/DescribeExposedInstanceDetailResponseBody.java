// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceDetailResponseBody extends TeaModel {
    // The exposure details about the server.
    @NameInMap("ExposedChains")
    public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChains> exposedChains;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExposedInstanceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceDetailResponseBody self = new DescribeExposedInstanceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceDetailResponseBody setExposedChains(java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChains> exposedChains) {
        this.exposedChains = exposedChains;
        return this;
    }
    public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChains> getExposedChains() {
        return this.exposedChains;
    }

    public DescribeExposedInstanceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList extends TeaModel {
        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        // The priority to fix the vulnerability. Valid values:
        // 
        // *   **asap**: high
        // *   **later**: medium
        // *   **nntf**: low
        // 
        // >  We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.
        @NameInMap("Necessity")
        public String necessity;

        // The type of the vulnerability. Valid values:
        // 
        // *   **cve**: Linux software vulnerabilities
        // *   **sys**: Windows system vulnerabilities
        // *   **cms**: Web-CMS vulnerabilities
        // *   **app**: application vulnerabilities
        // *   **emg**: urgent vulnerabilities
        // *   **sca**: middleware vulnerabilities
        @NameInMap("Type")
        public String type;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList self = new DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList extends TeaModel {
        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        // The priority to fix the vulnerability. Valid values:
        // 
        // *   **asap**: high
        // *   **later**: medium
        // *   **nntf**: low
        // 
        // >  We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.
        @NameInMap("Necessity")
        public String necessity;

        // The type of the vulnerability. Valid values:
        // 
        // *   **cve**: Linux software vulnerabilities
        // *   **sys**: Windows system vulnerabilities
        // *   **cms**: Web-CMS vulnerabilities
        // *   **app**: application vulnerabilities
        // *   **emg**: urgent vulnerabilities
        // *   **sca**: middleware vulnerabilities
        @NameInMap("Type")
        public String type;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList self = new DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeExposedInstanceDetailResponseBodyExposedChains extends TeaModel {
        // The information about all vulnerabilities on the server.
        @NameInMap("AllVulList")
        public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList> allVulList;

        // The server component that is exposed on the Internet.
        @NameInMap("ExposureComponent")
        public String exposureComponent;

        // The public IP address.
        @NameInMap("ExposureIp")
        public String exposureIp;

        // The port that is exposed on the Internet.
        @NameInMap("ExposurePort")
        public String exposurePort;

        // The resource from which the server is exposed. Valid values:
        // 
        // *   **INTERNET_IP**: the public IP address of an Elastic Compute Service (ECS) instance
        // *   **SLB**: the public IP address of a Server Load Balancer (SLB) instance
        // *   **EIP**: an elastic IP address (EIP)
        // *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
        @NameInMap("ExposureType")
        public String exposureType;

        // The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the value of the ExposureType parameter.
        // 
        // *   If the value of the ExposureType parameter is **INTERNET_IP**, the value of this parameter is an empty string.
        // *   If the value of the ExposureType parameter is **SLB**, the value of this parameter is the ID of the Internet-facing SLB instance.
        // *   If the value of the ExposureType parameter is **EIP**, the value of this parameter is the ID of the EIP.
        // *   If the value of the ExposureType parameter is **DNAT**, the value of this parameter is the ID of the NAT gateway.
        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        // The server group to which the server belongs.
        @NameInMap("GroupNo")
        public String groupNo;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the server.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The information about the vulnerabilities that are exposed on the Internet and can be exploited by attackers.
        @NameInMap("RealVulList")
        public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList> realVulList;

        // The region in which the server resides.
        // 
        // >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
        @NameInMap("RegionId")
        public String regionId;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeExposedInstanceDetailResponseBodyExposedChains build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceDetailResponseBodyExposedChains self = new DescribeExposedInstanceDetailResponseBodyExposedChains();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setAllVulList(java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList> allVulList) {
            this.allVulList = allVulList;
            return this;
        }
        public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList> getAllVulList() {
            return this.allVulList;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setExposureComponent(String exposureComponent) {
            this.exposureComponent = exposureComponent;
            return this;
        }
        public String getExposureComponent() {
            return this.exposureComponent;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setExposureIp(String exposureIp) {
            this.exposureIp = exposureIp;
            return this;
        }
        public String getExposureIp() {
            return this.exposureIp;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setExposurePort(String exposurePort) {
            this.exposurePort = exposurePort;
            return this;
        }
        public String getExposurePort() {
            return this.exposurePort;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setExposureType(String exposureType) {
            this.exposureType = exposureType;
            return this;
        }
        public String getExposureType() {
            return this.exposureType;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setExposureTypeId(String exposureTypeId) {
            this.exposureTypeId = exposureTypeId;
            return this;
        }
        public String getExposureTypeId() {
            return this.exposureTypeId;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setGroupNo(String groupNo) {
            this.groupNo = groupNo;
            return this;
        }
        public String getGroupNo() {
            return this.groupNo;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setRealVulList(java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList> realVulList) {
            this.realVulList = realVulList;
            return this;
        }
        public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList> getRealVulList() {
            return this.realVulList;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeExposedInstanceDetailResponseBodyExposedChains setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
