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

    }

    public static class DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels extends TeaModel {
        @NameInMap("VirtualBorderRouterModel")
        @Validation(required = true)
        public java.util.List<DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModelsVirtualBorderRouterModel> virtualBorderRouterModel;

        public static DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels self = new DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionTypeVirtualBorderRouterModels();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet extends TeaModel {
        @NameInMap("ExpressCloudConnectionType")
        @Validation(required = true)
        public java.util.List<DescribeExpressCloudConnectionsResponseExpressCloudConnectionSetExpressCloudConnectionType> expressCloudConnectionType;

        public static DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet self = new DescribeExpressCloudConnectionsResponseExpressCloudConnectionSet();
            return TeaModel.build(map, self);
        }

    }

}
