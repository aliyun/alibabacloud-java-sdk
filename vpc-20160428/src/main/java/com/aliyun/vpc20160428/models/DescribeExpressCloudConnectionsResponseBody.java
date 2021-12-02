// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressCloudConnectionsResponseBody extends TeaModel {
    @NameInMap("ExpressCloudConnectionSet")
    public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSet expressCloudConnectionSet;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeExpressCloudConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressCloudConnectionsResponseBody self = new DescribeExpressCloudConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressCloudConnectionsResponseBody setExpressCloudConnectionSet(DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSet expressCloudConnectionSet) {
        this.expressCloudConnectionSet = expressCloudConnectionSet;
        return this;
    }
    public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSet getExpressCloudConnectionSet() {
        return this.expressCloudConnectionSet;
    }

    public DescribeExpressCloudConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExpressCloudConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExpressCloudConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressCloudConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        public static DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel self = new DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel();
            return TeaModel.build(map, self);
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

    }

    public static class DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels extends TeaModel {
        @NameInMap("VirtualBorderRouterModel")
        public java.util.List<DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel> virtualBorderRouterModel;

        public static DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels self = new DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels();
            return TeaModel.build(map, self);
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels setVirtualBorderRouterModel(java.util.List<DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel> virtualBorderRouterModel) {
            this.virtualBorderRouterModel = virtualBorderRouterModel;
            return this;
        }
        public java.util.List<DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel> getVirtualBorderRouterModel() {
            return this.virtualBorderRouterModel;
        }

    }

    public static class DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType extends TeaModel {
        @NameInMap("ApplicationBandwidth")
        public String applicationBandwidth;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplicationStatus")
        public String applicationStatus;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BgpAs")
        public String bgpAs;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("CeIp")
        public String ceIp;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("ConstructionPeriod")
        public String constructionPeriod;

        @NameInMap("ContactMail")
        public String contactMail;

        @NameInMap("ContactTel")
        public String contactTel;

        @NameInMap("Description")
        public String description;

        @NameInMap("Distance")
        public Integer distance;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EstimatedTime")
        public String estimatedTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("HasReservationData")
        public String hasReservationData;

        @NameInMap("IDCardNo")
        public String IDCardNo;

        @NameInMap("IdcSP")
        public String idcSP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("Name")
        public String name;

        @NameInMap("PeIp")
        public String peIp;

        @NameInMap("PeerCity")
        public String peerCity;

        @NameInMap("PeerLocation")
        public String peerLocation;

        @NameInMap("PortType")
        public String portType;

        @NameInMap("RedundantEccId")
        public String redundantEccId;

        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("VirtualBorderRouterModels")
        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels virtualBorderRouterModels;

        public static DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType self = new DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType();
            return TeaModel.build(map, self);
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setApplicationBandwidth(String applicationBandwidth) {
            this.applicationBandwidth = applicationBandwidth;
            return this;
        }
        public String getApplicationBandwidth() {
            return this.applicationBandwidth;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setApplicationStatus(String applicationStatus) {
            this.applicationStatus = applicationStatus;
            return this;
        }
        public String getApplicationStatus() {
            return this.applicationStatus;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setBgpAs(String bgpAs) {
            this.bgpAs = bgpAs;
            return this;
        }
        public String getBgpAs() {
            return this.bgpAs;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setCeIp(String ceIp) {
            this.ceIp = ceIp;
            return this;
        }
        public String getCeIp() {
            return this.ceIp;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setConstructionPeriod(String constructionPeriod) {
            this.constructionPeriod = constructionPeriod;
            return this;
        }
        public String getConstructionPeriod() {
            return this.constructionPeriod;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setContactTel(String contactTel) {
            this.contactTel = contactTel;
            return this;
        }
        public String getContactTel() {
            return this.contactTel;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setDistance(Integer distance) {
            this.distance = distance;
            return this;
        }
        public Integer getDistance() {
            return this.distance;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setEstimatedTime(String estimatedTime) {
            this.estimatedTime = estimatedTime;
            return this;
        }
        public String getEstimatedTime() {
            return this.estimatedTime;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setIDCardNo(String IDCardNo) {
            this.IDCardNo = IDCardNo;
            return this;
        }
        public String getIDCardNo() {
            return this.IDCardNo;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setIdcSP(String idcSP) {
            this.idcSP = idcSP;
            return this;
        }
        public String getIdcSP() {
            return this.idcSP;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setPeIp(String peIp) {
            this.peIp = peIp;
            return this;
        }
        public String getPeIp() {
            return this.peIp;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setPeerCity(String peerCity) {
            this.peerCity = peerCity;
            return this;
        }
        public String getPeerCity() {
            return this.peerCity;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setRedundantEccId(String redundantEccId) {
            this.redundantEccId = redundantEccId;
            return this;
        }
        public String getRedundantEccId() {
            return this.redundantEccId;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType setVirtualBorderRouterModels(DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels virtualBorderRouterModels) {
            this.virtualBorderRouterModels = virtualBorderRouterModels;
            return this;
        }
        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels getVirtualBorderRouterModels() {
            return this.virtualBorderRouterModels;
        }

    }

    public static class DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSet extends TeaModel {
        @NameInMap("ExpressCloudConnectionType")
        public java.util.List<DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType> expressCloudConnectionType;

        public static DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSet self = new DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSet();
            return TeaModel.build(map, self);
        }

        public DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSet setExpressCloudConnectionType(java.util.List<DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType> expressCloudConnectionType) {
            this.expressCloudConnectionType = expressCloudConnectionType;
            return this;
        }
        public java.util.List<DescribeExpressCloudConnectionsResponseBodyExpressCloudConnectionSetExpressCloudConnectionType> getExpressCloudConnectionType() {
            return this.expressCloudConnectionType;
        }

    }

}
