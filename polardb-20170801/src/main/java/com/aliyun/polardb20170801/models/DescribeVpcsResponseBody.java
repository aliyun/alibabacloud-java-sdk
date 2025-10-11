// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>11FDB5A0-84F5-5361-B729-5770B0AEB9D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Vpcs")
    public java.util.List<DescribeVpcsResponseBodyVpcs> vpcs;

    public static DescribeVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponseBody self = new DescribeVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcsResponseBody setVpcs(java.util.List<DescribeVpcsResponseBodyVpcs> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public java.util.List<DescribeVpcsResponseBodyVpcs> getVpcs() {
        return this.vpcs;
    }

    public static class DescribeVpcsResponseBodyVpcsVSwitchs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>47.118.126.0/25</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>2021-04-18T15:02:37Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2021-04-18T15:02:37Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen-f</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-uf6fus5py6hbvxqwzwnk8</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>default-sw</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeVpcsResponseBodyVpcsVSwitchs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVSwitchs self = new DescribeVpcsResponseBodyVpcsVSwitchs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVSwitchs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsResponseBodyVpcsVSwitchs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVpcsResponseBodyVpcsVSwitchs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVpcsResponseBodyVpcsVSwitchs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsResponseBodyVpcsVSwitchs setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeVpcsResponseBodyVpcsVSwitchs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsResponseBodyVpcsVSwitchs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVpcsResponseBodyVpcsVSwitchs setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class DescribeVpcsResponseBodyVpcs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1868512340232755</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <strong>example:</strong>
         * <p>57.100.6.59/32</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>2021-04-18T15:02:37Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2021-04-18T15:02:37Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>cn-chengdu-wt97-a01</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchs")
        public java.util.List<DescribeVpcsResponseBodyVpcsVSwitchs> vSwitchs;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp16efwqjzyumc23c647v</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vpc-e2e-10341f3</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcsResponseBodyVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcs self = new DescribeVpcsResponseBodyVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcs setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeVpcsResponseBodyVpcs setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeVpcsResponseBodyVpcs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsResponseBodyVpcs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVpcsResponseBodyVpcs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVpcsResponseBodyVpcs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsResponseBodyVpcs setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcsResponseBodyVpcs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsResponseBodyVpcs setVSwitchs(java.util.List<DescribeVpcsResponseBodyVpcsVSwitchs> vSwitchs) {
            this.vSwitchs = vSwitchs;
            return this;
        }
        public java.util.List<DescribeVpcsResponseBodyVpcsVSwitchs> getVSwitchs() {
            return this.vSwitchs;
        }

        public DescribeVpcsResponseBodyVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcsResponseBodyVpcs setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
