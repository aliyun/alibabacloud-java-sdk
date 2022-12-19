// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotListResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeVpcHoneyPotListResponseBodyPageInfo pageInfo;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the honeypots.
    @NameInMap("VpcHoneyPotDTOList")
    public java.util.List<DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList> vpcHoneyPotDTOList;

    public static DescribeVpcHoneyPotListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHoneyPotListResponseBody self = new DescribeVpcHoneyPotListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHoneyPotListResponseBody setPageInfo(DescribeVpcHoneyPotListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeVpcHoneyPotListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeVpcHoneyPotListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcHoneyPotListResponseBody setVpcHoneyPotDTOList(java.util.List<DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList> vpcHoneyPotDTOList) {
        this.vpcHoneyPotDTOList = vpcHoneyPotDTOList;
        return this;
    }
    public java.util.List<DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList> getVpcHoneyPotDTOList() {
        return this.vpcHoneyPotDTOList;
    }

    public static class DescribeVpcHoneyPotListResponseBodyPageInfo extends TeaModel {
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeVpcHoneyPotListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcHoneyPotListResponseBodyPageInfo self = new DescribeVpcHoneyPotListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVpcHoneyPotListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeVpcHoneyPotListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeVpcHoneyPotListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeVpcHoneyPotListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList extends TeaModel {
        // The ID of the vSwitch.
        @NameInMap("VpcSwitchId")
        public String vpcSwitchId;

        // The name of the vSwitch.
        @NameInMap("VpcSwitchName")
        public String vpcSwitchName;

        // The zone ID of the vSwitch.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList self = new DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList setVpcSwitchId(String vpcSwitchId) {
            this.vpcSwitchId = vpcSwitchId;
            return this;
        }
        public String getVpcSwitchId() {
            return this.vpcSwitchId;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList setVpcSwitchName(String vpcSwitchName) {
            this.vpcSwitchName = vpcSwitchName;
            return this;
        }
        public String getVpcSwitchName() {
            return this.vpcSwitchName;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList extends TeaModel {
        // The CIDR block of the VPC.
        @NameInMap("CidrBlock")
        public String cidrBlock;

        // The time when the VPC was created. Unit: milliseconds.
        @NameInMap("CreateTime")
        public Long createTime;

        // The status of the server on which the honeypot is deployed. Valid values:
        // 
        // *   **Pending**: The server is being created.
        // *   **Running**: The server is running.
        // *   **Starting**: The server is being started.
        // *   **Stopping**: The server is being stopped.
        // *   **Stopped**: The server is stopped.
        @NameInMap("HoneyPotEcsInstanceStatus")
        public String honeyPotEcsInstanceStatus;

        // The ID of the elastic network interface (ENI) used by the honeypot in the VPC.
        @NameInMap("HoneyPotEniInstanceId")
        public String honeyPotEniInstanceId;

        // Indicates whether the cloud honeypot feature is enabled for the VPC. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("HoneyPotExistence")
        public Boolean honeyPotExistence;

        // The status of the honeypot. Valid values:
        // 
        // *   **pending**: The honeypot is being created.
        // *   **deleting**: The honeypot is being deleted.
        // *   **off**: The honeypot is disabled.
        // *   **suspending**: The honeypot is suspended.
        // *   **on**: The honeypot is enabled.
        @NameInMap("HoneyPotInstanceStatus")
        public String honeyPotInstanceStatus;

        // The ID of the vSwitch to which the ENI used by the honeypot is connected.
        @NameInMap("HoneyPotVpcSwitchId")
        public String honeyPotVpcSwitchId;

        // The ID of the VPC.
        @NameInMap("VpcId")
        public String vpcId;

        // The name of the VPC.
        @NameInMap("VpcName")
        public String vpcName;

        // The region ID of the VPC.
        // 
        // >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        // The status of the VPC. Valid values:
        // 
        // *   **Available**: The VPC is normal and available.
        // *   **Pending**: The VPC is being configured.
        @NameInMap("VpcStatus")
        public String vpcStatus;

        // An array that consists of the vSwitches in the VPC.
        @NameInMap("VpcSwitchIdList")
        public java.util.List<DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList> vpcSwitchIdList;

        public static DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList self = new DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setHoneyPotEcsInstanceStatus(String honeyPotEcsInstanceStatus) {
            this.honeyPotEcsInstanceStatus = honeyPotEcsInstanceStatus;
            return this;
        }
        public String getHoneyPotEcsInstanceStatus() {
            return this.honeyPotEcsInstanceStatus;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setHoneyPotEniInstanceId(String honeyPotEniInstanceId) {
            this.honeyPotEniInstanceId = honeyPotEniInstanceId;
            return this;
        }
        public String getHoneyPotEniInstanceId() {
            return this.honeyPotEniInstanceId;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setHoneyPotExistence(Boolean honeyPotExistence) {
            this.honeyPotExistence = honeyPotExistence;
            return this;
        }
        public Boolean getHoneyPotExistence() {
            return this.honeyPotExistence;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setHoneyPotInstanceStatus(String honeyPotInstanceStatus) {
            this.honeyPotInstanceStatus = honeyPotInstanceStatus;
            return this;
        }
        public String getHoneyPotInstanceStatus() {
            return this.honeyPotInstanceStatus;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setHoneyPotVpcSwitchId(String honeyPotVpcSwitchId) {
            this.honeyPotVpcSwitchId = honeyPotVpcSwitchId;
            return this;
        }
        public String getHoneyPotVpcSwitchId() {
            return this.honeyPotVpcSwitchId;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setVpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setVpcStatus(String vpcStatus) {
            this.vpcStatus = vpcStatus;
            return this;
        }
        public String getVpcStatus() {
            return this.vpcStatus;
        }

        public DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOList setVpcSwitchIdList(java.util.List<DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList> vpcSwitchIdList) {
            this.vpcSwitchIdList = vpcSwitchIdList;
            return this;
        }
        public java.util.List<DescribeVpcHoneyPotListResponseBodyVpcHoneyPotDTOListVpcSwitchIdList> getVpcSwitchIdList() {
            return this.vpcSwitchIdList;
        }

    }

}
