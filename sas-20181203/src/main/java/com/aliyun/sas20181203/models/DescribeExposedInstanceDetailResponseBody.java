// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceDetailResponseBody extends TeaModel {
    @NameInMap("ExposedChains")
    public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChains> exposedChains;

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
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Necessity")
        public String necessity;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Necessity")
        public String necessity;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("AllVulList")
        public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsAllVulList> allVulList;

        @NameInMap("ExposureComponent")
        public String exposureComponent;

        @NameInMap("ExposureIp")
        public String exposureIp;

        @NameInMap("ExposurePort")
        public String exposurePort;

        @NameInMap("ExposureType")
        public String exposureType;

        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        @NameInMap("GroupNo")
        public String groupNo;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("RealVulList")
        public java.util.List<DescribeExposedInstanceDetailResponseBodyExposedChainsRealVulList> realVulList;

        @NameInMap("RegionId")
        public String regionId;

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
