// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressCloudConnectionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("ExpressCloudConnectionSet")
    @Validation(required = true)
    public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet expressCloudConnectionSet;

    public static DescribeExpressCloudConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressCloudConnectionsResponse self = new DescribeExpressCloudConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressCloudConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressCloudConnectionsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExpressCloudConnectionsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExpressCloudConnectionsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeExpressCloudConnectionsResponse setExpressCloudConnectionSet(DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet expressCloudConnectionSet) {
        this.expressCloudConnectionSet = expressCloudConnectionSet;
        return this;
    }
    public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet getExpressCloudConnectionSet() {
        return this.expressCloudConnectionSet;
    }

    public static class DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        @NameInMap("PhysicalConnectionId")
        @Validation(required = true)
        public String physicalConnectionId;

        public static DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel self = new DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel();
            return TeaModel.build(map, self);
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

    }

    public static class DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels extends TeaModel {
        @NameInMap("VirtualBorderRouterModel")
        @Validation(required = true)
        public java.util.List<DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel> virtualBorderRouterModel;

        public static DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels self = new DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels();
            return TeaModel.build(map, self);
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels setVirtualBorderRouterModel(java.util.List<DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel> virtualBorderRouterModel) {
            this.virtualBorderRouterModel = virtualBorderRouterModel;
            return this;
        }
        public java.util.List<DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel> getVirtualBorderRouterModel() {
            return this.virtualBorderRouterModel;
        }

    }

    public static class DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModify")
        @Validation(required = true)
        public String gmtModify;

        @NameInMap("PeerCity")
        @Validation(required = true)
        public String peerCity;

        @NameInMap("PeerLocation")
        @Validation(required = true)
        public String peerLocation;

        @NameInMap("PortType")
        @Validation(required = true)
        public String portType;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("Distance")
        @Validation(required = true)
        public Integer distance;

        @NameInMap("RedundantEccId")
        @Validation(required = true)
        public String redundantEccId;

        @NameInMap("CircuitCode")
        @Validation(required = true)
        public String circuitCode;

        @NameInMap("Isp")
        @Validation(required = true)
        public String isp;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("IdcSP")
        @Validation(required = true)
        public String idcSP;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("HasReservationData")
        @Validation(required = true)
        public String hasReservationData;

        @NameInMap("ReservationBandwidth")
        @Validation(required = true)
        public String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        @Validation(required = true)
        public String reservationInternetChargeType;

        @NameInMap("ReservationActiveTime")
        @Validation(required = true)
        public String reservationActiveTime;

        @NameInMap("ReservationOrderType")
        @Validation(required = true)
        public String reservationOrderType;

        @NameInMap("ApplicationType")
        @Validation(required = true)
        public String applicationType;

        @NameInMap("ApplicationId")
        @Validation(required = true)
        public String applicationId;

        @NameInMap("ApplicationStatus")
        @Validation(required = true)
        public String applicationStatus;

        @NameInMap("ApplicationBandwidth")
        @Validation(required = true)
        public String applicationBandwidth;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("ContactTel")
        @Validation(required = true)
        public String contactTel;

        @NameInMap("ContactMail")
        @Validation(required = true)
        public String contactMail;

        @NameInMap("IDCardNo")
        @Validation(required = true)
        public String IDCardNo;

        @NameInMap("EstimatedTime")
        @Validation(required = true)
        public String estimatedTime;

        @NameInMap("BgpAs")
        @Validation(required = true)
        public String bgpAs;

        @NameInMap("PeIp")
        @Validation(required = true)
        public String peIp;

        @NameInMap("CeIp")
        @Validation(required = true)
        public String ceIp;

        @NameInMap("ConstructionPeriod")
        @Validation(required = true)
        public String constructionPeriod;

        @NameInMap("VirtualBorderRouterModels")
        @Validation(required = true)
        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels virtualBorderRouterModels;

        public static DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType self = new DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType();
            return TeaModel.build(map, self);
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setPeerCity(String peerCity) {
            this.peerCity = peerCity;
            return this;
        }
        public String getPeerCity() {
            return this.peerCity;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setDistance(Integer distance) {
            this.distance = distance;
            return this;
        }
        public Integer getDistance() {
            return this.distance;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setRedundantEccId(String redundantEccId) {
            this.redundantEccId = redundantEccId;
            return this;
        }
        public String getRedundantEccId() {
            return this.redundantEccId;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setIdcSP(String idcSP) {
            this.idcSP = idcSP;
            return this;
        }
        public String getIdcSP() {
            return this.idcSP;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setApplicationStatus(String applicationStatus) {
            this.applicationStatus = applicationStatus;
            return this;
        }
        public String getApplicationStatus() {
            return this.applicationStatus;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setApplicationBandwidth(String applicationBandwidth) {
            this.applicationBandwidth = applicationBandwidth;
            return this;
        }
        public String getApplicationBandwidth() {
            return this.applicationBandwidth;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setContactTel(String contactTel) {
            this.contactTel = contactTel;
            return this;
        }
        public String getContactTel() {
            return this.contactTel;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setIDCardNo(String IDCardNo) {
            this.IDCardNo = IDCardNo;
            return this;
        }
        public String getIDCardNo() {
            return this.IDCardNo;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setEstimatedTime(String estimatedTime) {
            this.estimatedTime = estimatedTime;
            return this;
        }
        public String getEstimatedTime() {
            return this.estimatedTime;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setBgpAs(String bgpAs) {
            this.bgpAs = bgpAs;
            return this;
        }
        public String getBgpAs() {
            return this.bgpAs;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setPeIp(String peIp) {
            this.peIp = peIp;
            return this;
        }
        public String getPeIp() {
            return this.peIp;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setCeIp(String ceIp) {
            this.ceIp = ceIp;
            return this;
        }
        public String getCeIp() {
            return this.ceIp;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setConstructionPeriod(String constructionPeriod) {
            this.constructionPeriod = constructionPeriod;
            return this;
        }
        public String getConstructionPeriod() {
            return this.constructionPeriod;
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType setVirtualBorderRouterModels(DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels virtualBorderRouterModels) {
            this.virtualBorderRouterModels = virtualBorderRouterModels;
            return this;
        }
        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels getVirtualBorderRouterModels() {
            return this.virtualBorderRouterModels;
        }

    }

    public static class DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet extends TeaModel {
        @NameInMap("ExpressCloudConnectionType")
        @Validation(required = true)
        public java.util.List<DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType> expressCloudConnectionType;

        public static DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet self = new DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet();
            return TeaModel.build(map, self);
        }

        public DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet setExpressCloudConnectionType(java.util.List<DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType> expressCloudConnectionType) {
            this.expressCloudConnectionType = expressCloudConnectionType;
            return this;
        }
        public java.util.List<DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType> getExpressCloudConnectionType() {
            return this.expressCloudConnectionType;
        }

    }

}
