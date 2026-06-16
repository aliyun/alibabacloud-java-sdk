// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeGdnInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of instance details.</p>
     */
    @NameInMap("Data")
    public DescribeGdnInstancesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * <blockquote>
     * <p>This parameter is empty when the request succeeds. When the request fails, an exception message is returned, such as an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B044BD1-6402-5DE9-9AED-63D15A994E37</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.medium.2e</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The CN node specifications. Valid values:</p>
         * <ul>
         * <li><strong>polarx.x4.medium.2e</strong>: 2 cores, 8 GB</li>
         * <li><strong>polarx.x4.large.2e</strong>: 4 cores, 16 GB</li>
         * <li><strong>polarx.x8.large.2e</strong>: 4 cores, 32 GB</li>
         * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores, 32 GB</li>
         * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores, 64 GB</li>
         * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores, 64 GB</li>
         * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores, 128 GB</li>
         * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores, 128 GB</li>
         * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores, 256 GB</li>
         * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores, 470 GB</li>
         * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores, 720 GB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.medium.2e</p>
         */
        @NameInMap("CnNodeClassCode")
        public String cnNodeClassCode;

        /**
         * <p>The number of CN nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CnNodeCount")
        public String cnNodeCount;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_polarxpre_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("DataSyncStatus")
        public String dataSyncStatus;

        /**
         * <p>The DN node specifications. Valid values:</p>
         * <ul>
         * <li><strong>mysql.n2.medium.25</strong>: 2 cores, 4 GB</li>
         * <li><strong>mysql.n4.medium.25</strong>: 2 cores, 8 GB</li>
         * <li><strong>mysql.x8.medium.25</strong>: 2 cores, 16 GB</li>
         * <li><strong>mysql.n2.large.25</strong>: 4 cores, 8 GB</li>
         * <li><strong>mysql.n4.large.25</strong>: 4 cores, 16 GB</li>
         * <li><strong>mysql.x8.large.25</strong>: 4 cores, 32 GB</li>
         * <li><strong>mysql.n2.xlarge.25</strong>: 8 cores, 16 GB</li>
         * <li><strong>mysql.n4.xlarge.25</strong>: 8 cores, 32 GB</li>
         * <li><strong>mysql.x8.xlarge.25</strong>: 8 cores, 64 GB</li>
         * <li><strong>mysql.n4.2xlarge.25</strong>: 16 cores, 64 GB</li>
         * <li><strong>mysql.x8.2xlarge.25</strong>: 16 cores, 128 GB</li>
         * <li><strong>mysql.x4.4xlarge.25</strong>: 32 cores, 128 GB</li>
         * <li><strong>mysql.x8.4xlarge.25</strong>: 32 cores, 256 GB</li>
         * <li><strong>mysql.st.8xlarge.25</strong>: 60 cores, 470 GB</li>
         * <li><strong>mysql.st.12xlarge.25</strong>: 90 cores, 720 GB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mysql.n4.medium.25</p>
         */
        @NameInMap("DnNodeClassCode")
        public String dnNodeClassCode;

        /**
         * <p>The number of DN nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DnNodeCount")
        public String dnNodeCount;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02T13:11:10.000+0000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02T13:11:10.000+0000</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The member name (PolarDB-X instance name).</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-***</p>
         */
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        @NameInMap("ReadWriteStatus")
        public String readWriteStatus;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The member role.</p>
         * 
         * <strong>example:</strong>
         * <p>primary、
         * standby</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("SecondaryZone")
        public String secondaryZone;

        /**
         * <p>The data latency.</p>
         * 
         * <strong>example:</strong>
         * <p>1s</p>
         */
        @NameInMap("SecondsBehindMaster")
        public String secondsBehindMaster;

        /**
         * <p>The member status.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The switchover task status.</p>
         * 
         * <strong>example:</strong>
         * <p>prepared：参数初始化完毕
         * set_old_primary_readonly：原主实例已禁写
         * set_new_primary_read_write：已切换
         * timeout：任务超时
         * rollback：已回滚</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The zone for Three-zone deployment. This zone is active only when three-zone deployment is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("TertiaryZone")
        public String tertiaryZone;

        /**
         * <p>The zone ID.</p>
         * 
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

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setDataSyncStatus(String dataSyncStatus) {
            this.dataSyncStatus = dataSyncStatus;
            return this;
        }
        public String getDataSyncStatus() {
            return this.dataSyncStatus;
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

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setReadWriteStatus(String readWriteStatus) {
            this.readWriteStatus = readWriteStatus;
            return this;
        }
        public String getReadWriteStatus() {
            return this.readWriteStatus;
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

        public DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The GDN instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-***</p>
         */
        @NameInMap("GdnInstanceName")
        public String gdnInstanceName;

        @NameInMap("GdnMode")
        public String gdnMode;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02T13:11:10.000+0000</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The list of members.</p>
         */
        @NameInMap("MemberList")
        public java.util.List<DescribeGdnInstancesResponseBodyDataGdnInstanceListMemberList> memberList;

        /**
         * <p>The MySQL version supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("MysqlVersion")
        public String mysqlVersion;

        @NameInMap("RplConflictStrategy")
        public String rplConflictStrategy;

        @NameInMap("RplDmlStrategy")
        public String rplDmlStrategy;

        @NameInMap("RplSyncDdl")
        public Boolean rplSyncDdl;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The switchover log.</p>
         * 
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

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setGdnMode(String gdnMode) {
            this.gdnMode = gdnMode;
            return this;
        }
        public String getGdnMode() {
            return this.gdnMode;
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

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setRplConflictStrategy(String rplConflictStrategy) {
            this.rplConflictStrategy = rplConflictStrategy;
            return this;
        }
        public String getRplConflictStrategy() {
            return this.rplConflictStrategy;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setRplDmlStrategy(String rplDmlStrategy) {
            this.rplDmlStrategy = rplDmlStrategy;
            return this;
        }
        public String getRplDmlStrategy() {
            return this.rplDmlStrategy;
        }

        public DescribeGdnInstancesResponseBodyDataGdnInstanceList setRplSyncDdl(Boolean rplSyncDdl) {
            this.rplSyncDdl = rplSyncDdl;
            return this;
        }
        public Boolean getRplSyncDdl() {
            return this.rplSyncDdl;
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
        /**
         * <p>The list of GDN instances.</p>
         */
        @NameInMap("GdnInstanceList")
        public java.util.List<DescribeGdnInstancesResponseBodyDataGdnInstanceList> gdnInstanceList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
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
