// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotListResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeVpcHoneyPotListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("VpcSwitchId")
        public String vpcSwitchId;

        @NameInMap("VpcSwitchName")
        public String vpcSwitchName;

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
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("HoneyPotEcsInstanceStatus")
        public String honeyPotEcsInstanceStatus;

        @NameInMap("HoneyPotEniInstanceId")
        public String honeyPotEniInstanceId;

        @NameInMap("HoneyPotExistence")
        public Boolean honeyPotExistence;

        @NameInMap("HoneyPotInstanceStatus")
        public String honeyPotInstanceStatus;

        @NameInMap("HoneyPotVpcSwitchId")
        public String honeyPotVpcSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        @NameInMap("VpcStatus")
        public String vpcStatus;

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
