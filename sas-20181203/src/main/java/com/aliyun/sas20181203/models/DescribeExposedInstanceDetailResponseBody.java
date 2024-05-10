// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceDetailResponseBody extends TeaModel {
    /**
     * <p>The exposure details about the server.</p>
     */
    @NameInMap("ExposedChains")
    public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChains> exposedChains;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority to fix the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **asap**: high</p>
         * <p>*   **later**: medium</p>
         * <p>*   **nntf**: low</p>
         * <br>
         * <p>>  We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.</p>
         */
        @NameInMap("Necessity")
        public String necessity;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: Linux software vulnerabilities</p>
         * <p>*   **sys**: Windows system vulnerabilities</p>
         * <p>*   **cms**: Web-CMS vulnerabilities</p>
         * <p>*   **app**: application vulnerabilities</p>
         * <p>*   **emg**: urgent vulnerabilities</p>
         * <p>*   **sca**: middleware vulnerabilities</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the server.</p>
         */
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
        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority to fix the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **asap**: high</p>
         * <p>*   **later**: medium</p>
         * <p>*   **nntf**: low</p>
         * <br>
         * <p>>  We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.</p>
         */
        @NameInMap("Necessity")
        public String necessity;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: Linux software vulnerabilities</p>
         * <p>*   **sys**: Windows system vulnerabilities</p>
         * <p>*   **cms**: Web-CMS vulnerabilities</p>
         * <p>*   **app**: application vulnerabilities</p>
         * <p>*   **emg**: urgent vulnerabilities</p>
         * <p>*   **sca**: middleware vulnerabilities</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the server.</p>
         */
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
        /**
         * <p>The information about all vulnerabilities on the server.</p>
         */
        @NameInMap("AllVulList")
        public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList> allVulList;

        /**
         * <p>The server component that is exposed on the Internet.</p>
         */
        @NameInMap("ExposureComponent")
        public String exposureComponent;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("ExposureIp")
        public String exposureIp;

        /**
         * <p>The port that is exposed on the Internet.</p>
         */
        @NameInMap("ExposurePort")
        public String exposurePort;

        /**
         * <p>The resource from which the server is exposed. Valid values:</p>
         * <br>
         * <p>*   **INTERNET_IP**: the public IP address of an Elastic Compute Service (ECS) instance</p>
         * <p>*   **SLB**: the public IP address of a Server Load Balancer (SLB) instance</p>
         * <p>*   **EIP**: an elastic IP address (EIP)</p>
         * <p>*   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature</p>
         */
        @NameInMap("ExposureType")
        public String exposureType;

        /**
         * <p>The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the value of the ExposureType parameter.</p>
         * <br>
         * <p>*   If the value of the ExposureType parameter is **INTERNET_IP**, the value of this parameter is an empty string.</p>
         * <p>*   If the value of the ExposureType parameter is **SLB**, the value of this parameter is the ID of the Internet-facing SLB instance.</p>
         * <p>*   If the value of the ExposureType parameter is **EIP**, the value of this parameter is the ID of the EIP.</p>
         * <p>*   If the value of the ExposureType parameter is **DNAT**, the value of this parameter is the ID of the NAT gateway.</p>
         */
        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        /**
         * <p>The server group to which the server belongs.</p>
         */
        @NameInMap("GroupNo")
        public String groupNo;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The information about the vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         */
        @NameInMap("RealVulList")
        public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList> realVulList;

        /**
         * <p>The region in which the server resides.</p>
         * <br>
         * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](https://help.aliyun.com/document_detail/40654.html).</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the server.</p>
         */
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
