// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeGdnInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeGdnInstancesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7B044BD1-6402-5DE9-9AED-63D15A994E37</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeGdnInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGdnInstancesResponseBody self = new DescribeGdnInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGdnInstancesResponseBody setData(DescribeGdnInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeGdnInstancesResponseBodyData getData() {
        return this.data;
    }

    public DescribeGdnInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGdnInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGdnInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polarx.x4.medium.2e</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <strong>example:</strong>
         * <p>polarx.x4.medium.2e</p>
         */
        @NameInMap("CnNodeClassCode")
        public String cnNodeClassCode;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CnNodeCount")
        public String cnNodeCount;

        /**
         * <strong>example:</strong>
         * <p>drds_polarxpre_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>mysql.n4.medium.25</p>
         */
        @NameInMap("DnNodeClassCode")
        public String dnNodeClassCode;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DnNodeCount")
        public String dnNodeCount;

        /**
         * <strong>example:</strong>
         * <p>2025-01-02T13:11:10.000+0000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-02T13:11:10.000+0000</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>pxc-***</p>
         */
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>primary、
         * standby</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("SecondaryZone")
        public String secondaryZone;

        /**
         * <strong>example:</strong>
         * <p>1s</p>
         */
        @NameInMap("SecondsBehindMaster")
        public String secondsBehindMaster;

        /**
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("TertiaryZone")
        public String tertiaryZone;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList self = new DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList();
            return TeaModel.build(map, self);
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setCnNodeClassCode(String cnNodeClassCode) {
            this.cnNodeClassCode = cnNodeClassCode;
            return this;
        }
        public String getCnNodeClassCode() {
            return this.cnNodeClassCode;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setCnNodeCount(String cnNodeCount) {
            this.cnNodeCount = cnNodeCount;
            return this;
        }
        public String getCnNodeCount() {
            return this.cnNodeCount;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setDnNodeClassCode(String dnNodeClassCode) {
            this.dnNodeClassCode = dnNodeClassCode;
            return this;
        }
        public String getDnNodeClassCode() {
            return this.dnNodeClassCode;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setDnNodeCount(String dnNodeCount) {
            this.dnNodeCount = dnNodeCount;
            return this;
        }
        public String getDnNodeCount() {
            return this.dnNodeCount;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setSecondaryZone(String secondaryZone) {
            this.secondaryZone = secondaryZone;
            return this;
        }
        public String getSecondaryZone() {
            return this.secondaryZone;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setSecondsBehindMaster(String secondsBehindMaster) {
            this.secondsBehindMaster = secondsBehindMaster;
            return this;
        }
        public String getSecondsBehindMaster() {
            return this.secondsBehindMaster;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setTertiaryZone(String tertiaryZone) {
            this.tertiaryZone = tertiaryZone;
            return this;
        }
        public String getTertiaryZone() {
            return this.tertiaryZone;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeGdnInstancesResponseBodyDataGdnInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>gdn-***</p>
         */
        @NameInMap("GdnInstanceName")
        public String gdnInstanceName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-02T13:11:10.000+0000</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("MemberList")
        public java.util.List<DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList> memberList;

        /**
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("MysqlVersion")
        public String mysqlVersion;

        /**
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("SwitchHistory")
        public String switchHistory;

        public static DescribeGdnInstancesResponseBodyDataGdnInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGdnInstancesResponseBodyDataGdnInstanceList self = new DescribeGdnInstancesResponseBodyDataGdnInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setGdnInstanceName(String gdnInstanceName) {
            this.gdnInstanceName = gdnInstanceName;
            return this;
        }
        public String getGdnInstanceName() {
            return this.gdnInstanceName;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setMemberList(java.util.List<DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList> getMemberList() {
            return this.memberList;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setMysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            return this;
        }
        public String getMysqlVersion() {
            return this.mysqlVersion;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setSwitchHistory(String switchHistory) {
            this.switchHistory = switchHistory;
            return this;
        }
        public String getSwitchHistory() {
            return this.switchHistory;
        }

    }

    public static class DescribeGdnInstancesResponseBodyData extends TeaModel {
        @NameInMap("GdnInstanceList")
        public java.util.List<DescribeGdnInstancesResponseBodyDataGdnInstanceList> gdnInstanceList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("TotalNumber")
        public String totalNumber;

        public static DescribeGdnInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGdnInstancesResponseBodyData self = new DescribeGdnInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeGdnInstancesResponseBodyData setGdnInstanceList(java.util.List<DescribeGdnInstancesResponseBodyDataGdnInstanceList> gdnInstanceList) {
            this.gdnInstanceList = gdnInstanceList;
            return this;
        }
        public java.util.List<DescribeGdnInstancesResponseBodyDataGdnInstanceList> getGdnInstanceList() {
            return this.gdnInstanceList;
        }

        public DescribeGdnInstancesResponseBodyData setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public DescribeGdnInstancesResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public DescribeGdnInstancesResponseBodyData setTotalNumber(String totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public String getTotalNumber() {
            return this.totalNumber;
        }

    }

}
