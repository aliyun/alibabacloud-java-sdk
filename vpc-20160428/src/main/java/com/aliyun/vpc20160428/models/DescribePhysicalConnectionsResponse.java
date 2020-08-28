// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponse extends TeaModel {
    // description: The ID of the request ; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: The current page number ; 
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    // description: The number of items per page; 
    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    // description: The number of items in a list; 
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    // description: Details of physical connections
    @NameInMap("PhysicalConnectionSet")
    @Validation(required = true)
    public DescribePhysicalConnectionsResponsePhysicalConnectionSet physicalConnectionSet;

    public static DescribePhysicalConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsResponse self = new DescribePhysicalConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType extends TeaModel {
        // description: The ID of the physical connection; 
        @NameInMap("PhysicalConnectionId")
        @Validation(required = true)
        public String physicalConnectionId;

        // description: The access point ID of the physical connection; 
        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        // description: The type of the physical connection. Default value: **VPC**.; 
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        // description: The status of the physical connection. Valid values: * **Initial**: The physical connection has been applied for and is under review by Alibaba Cloud* **Approved**: The application is approved* **Allocating**: Resources* **Allocated**: The leased line is being installed.* **Confirmed**: The completed leased line installation needs to be confirmed by the customer.* **Enabled**: The physical connection interface is enabled.* **Rejected**: The application is rejected.* **Canceled**: The application is canceled.* **Allocation Failed**: Failed to allocate resources* **Terminated**: The physical connection is terminated; 
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        // description: The payment status of the physical connection. Valid values: * Normal * FinancialLocked: locked due to overdue payment* SecurityLocked: locked due to security reasons; 
        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        // description: The time when the physical connection is established ; 
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        // description: The time when the physical connection is enabled ; 
        @NameInMap("EnabledTime")
        @Validation(required = true)
        public String enabledTime;

        // description: The service provider that provides the leased line. Valid values:* CT: China Telecom * CU: China Unicom* CM: China Mobile* CO: Other Chinese service providers* Equinix: Equinix * Other: Other service providers outside Mainland China; 
        @NameInMap("LineOperator")
        @Validation(required = true)
        public String lineOperator;

        // description: The specification of the physical connection; 
        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        // description: The location of the on-premises IDC; 
        @NameInMap("PeerLocation")
        @Validation(required = true)
        public String peerLocation;

        // description: The type of physical connection ports:* 100Base-T: 100M electrical ports * 1000Base-T (default value): Gigabit electrical ports * 1000Base-LX: Gigabit single-mode optical ports (10 km) * 10GBase-T: 10-GE electrical ports  * 10GBase-LR: 10-GE single-mode optical ports (10 km); 
        @NameInMap("PortType")
        @Validation(required = true)
        public String portType;

        // description: The ID of the redundant physical connection; 
        @NameInMap("RedundantPhysicalConnectionId")
        @Validation(required = true)
        public String redundantPhysicalConnectionId;

        // description: The name of the physical connection; 
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        // description: A description about the physical connection; 
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        // description: The location where the leased line is connected; 
        @NameInMap("AdLocation")
        @Validation(required = true)
        public String adLocation;

        // description: The port number of the physical connection device; 
        @NameInMap("PortNumber")
        @Validation(required = true)
        public String portNumber;

        // description: The number of the leased line from the service provider; 
        @NameInMap("CircuitCode")
        @Validation(required = true)
        public String circuitCode;

        // description: The bandwidth of the physical connection; 
        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Long bandwidth;

        // description: The status of the LOA ; 
        @NameInMap("LoaStatus")
        @Validation(required = true)
        public String loaStatus;

        // description: Indicates whether subscription messages are received; 
        @NameInMap("HasReservationData")
        @Validation(required = true)
        public String hasReservationData;

        // description: The type of renewal ; 
        @NameInMap("ReservationInternetChargeType")
        @Validation(required = true)
        public String reservationInternetChargeType;

        // description: The effective time of a renewal; 
        @NameInMap("ReservationActiveTime")
        @Validation(required = true)
        public String reservationActiveTime;

        // description: The type of the renewal order ; 
        @NameInMap("ReservationOrderType")
        @Validation(required = true)
        public String reservationOrderType;

        // description: The time when the physical connection expires ; 
        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        // description: The billing method of the physical connection; 
        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        public static DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType self = new DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePhysicalConnectionsResponsePhysicalConnectionSet extends TeaModel {
        @NameInMap("PhysicalConnectionType")
        @Validation(required = true)
        public java.util.List<DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType> physicalConnectionType;

        public static DescribePhysicalConnectionsResponsePhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponsePhysicalConnectionSet self = new DescribePhysicalConnectionsResponsePhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

    }

}
