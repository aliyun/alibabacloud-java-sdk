// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeRdsVSwitchsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A0450B18-BBD4-5DF9-8E71-610F1A921CDE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VSwitches")
    public DescribeRdsVSwitchsResponseBodyVSwitches vSwitches;

    public static DescribeRdsVSwitchsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVSwitchsResponseBody self = new DescribeRdsVSwitchsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVSwitchsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsVSwitchsResponseBody setVSwitches(DescribeRdsVSwitchsResponseBodyVSwitches vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public DescribeRdsVSwitchsResponseBodyVSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>175358919****</p>
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
         * <p>192.168.8.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>2024-12-23 10:15:38</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-04-30T09:41:14+08:00</p>
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
         * <p>ch-hangzhou-g</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-**************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>sw01</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch self = new DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class DescribeRdsVSwitchsResponseBodyVSwitches extends TeaModel {
        @NameInMap("VSwitch")
        public java.util.List<DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch> vSwitch;

        public static DescribeRdsVSwitchsResponseBodyVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVSwitchsResponseBodyVSwitches self = new DescribeRdsVSwitchsResponseBodyVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVSwitchsResponseBodyVSwitches setVSwitch(java.util.List<DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch> vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public java.util.List<DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch> getVSwitch() {
            return this.vSwitch;
        }

    }

}
