// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUisesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Uises")
    public DescribeUisesResponseBodyUises uises;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeUisesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisesResponseBody self = new DescribeUisesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUisesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUisesResponseBody setUises(DescribeUisesResponseBodyUises uises) {
        this.uises = uises;
        return this;
    }
    public DescribeUisesResponseBodyUises getUises() {
        return this.uises;
    }

    public DescribeUisesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUisesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUisesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeUisesResponseBodyUisesUisUserInfo extends TeaModel {
        @NameInMap("ClientInfoDBAccount")
        public String clientInfoDBAccount;

        @NameInMap("ClientInfoDB")
        public String clientInfoDB;

        @NameInMap("ClientInfoDBPassword")
        public String clientInfoDBPassword;

        public static DescribeUisesResponseBodyUisesUisUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisesResponseBodyUisesUisUserInfo self = new DescribeUisesResponseBodyUisesUisUserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUisesResponseBodyUisesUisUserInfo setClientInfoDBAccount(String clientInfoDBAccount) {
            this.clientInfoDBAccount = clientInfoDBAccount;
            return this;
        }
        public String getClientInfoDBAccount() {
            return this.clientInfoDBAccount;
        }

        public DescribeUisesResponseBodyUisesUisUserInfo setClientInfoDB(String clientInfoDB) {
            this.clientInfoDB = clientInfoDB;
            return this;
        }
        public String getClientInfoDB() {
            return this.clientInfoDB;
        }

        public DescribeUisesResponseBodyUisesUisUserInfo setClientInfoDBPassword(String clientInfoDBPassword) {
            this.clientInfoDBPassword = clientInfoDBPassword;
            return this;
        }
        public String getClientInfoDBPassword() {
            return this.clientInfoDBPassword;
        }

    }

    public static class DescribeUisesResponseBodyUisesUisUisNodeIds extends TeaModel {
        @NameInMap("UisNodeIds")
        public java.util.List<String> uisNodeIds;

        public static DescribeUisesResponseBodyUisesUisUisNodeIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisesResponseBodyUisesUisUisNodeIds self = new DescribeUisesResponseBodyUisesUisUisNodeIds();
            return TeaModel.build(map, self);
        }

        public DescribeUisesResponseBodyUisesUisUisNodeIds setUisNodeIds(java.util.List<String> uisNodeIds) {
            this.uisNodeIds = uisNodeIds;
            return this;
        }
        public java.util.List<String> getUisNodeIds() {
            return this.uisNodeIds;
        }

    }

    public static class DescribeUisesResponseBodyUisesUis extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UisId")
        public String uisId;

        @NameInMap("ConnectionType")
        public String connectionType;

        @NameInMap("BandwidthType")
        public String bandwidthType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("UserInfo")
        public DescribeUisesResponseBodyUisesUisUserInfo userInfo;

        @NameInMap("SslClientCertUrl")
        public String sslClientCertUrl;

        @NameInMap("ConnectionCount")
        public Integer connectionCount;

        @NameInMap("UisNodeIds")
        public DescribeUisesResponseBodyUisesUisUisNodeIds uisNodeIds;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("ServiceRegion")
        public String serviceRegion;

        @NameInMap("ConnectionBandwidth")
        public Integer connectionBandwidth;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("Name")
        public String name;

        public static DescribeUisesResponseBodyUisesUis build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisesResponseBodyUisesUis self = new DescribeUisesResponseBodyUisesUis();
            return TeaModel.build(map, self);
        }

        public DescribeUisesResponseBodyUisesUis setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeUisesResponseBodyUisesUis setUisId(String uisId) {
            this.uisId = uisId;
            return this;
        }
        public String getUisId() {
            return this.uisId;
        }

        public DescribeUisesResponseBodyUisesUis setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public DescribeUisesResponseBodyUisesUis setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public DescribeUisesResponseBodyUisesUis setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeUisesResponseBodyUisesUis setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeUisesResponseBodyUisesUis setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeUisesResponseBodyUisesUis setUserInfo(DescribeUisesResponseBodyUisesUisUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public DescribeUisesResponseBodyUisesUisUserInfo getUserInfo() {
            return this.userInfo;
        }

        public DescribeUisesResponseBodyUisesUis setSslClientCertUrl(String sslClientCertUrl) {
            this.sslClientCertUrl = sslClientCertUrl;
            return this;
        }
        public String getSslClientCertUrl() {
            return this.sslClientCertUrl;
        }

        public DescribeUisesResponseBodyUisesUis setConnectionCount(Integer connectionCount) {
            this.connectionCount = connectionCount;
            return this;
        }
        public Integer getConnectionCount() {
            return this.connectionCount;
        }

        public DescribeUisesResponseBodyUisesUis setUisNodeIds(DescribeUisesResponseBodyUisesUisUisNodeIds uisNodeIds) {
            this.uisNodeIds = uisNodeIds;
            return this;
        }
        public DescribeUisesResponseBodyUisesUisUisNodeIds getUisNodeIds() {
            return this.uisNodeIds;
        }

        public DescribeUisesResponseBodyUisesUis setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeUisesResponseBodyUisesUis setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeUisesResponseBodyUisesUis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUisesResponseBodyUisesUis setServiceRegion(String serviceRegion) {
            this.serviceRegion = serviceRegion;
            return this;
        }
        public String getServiceRegion() {
            return this.serviceRegion;
        }

        public DescribeUisesResponseBodyUisesUis setConnectionBandwidth(Integer connectionBandwidth) {
            this.connectionBandwidth = connectionBandwidth;
            return this;
        }
        public Integer getConnectionBandwidth() {
            return this.connectionBandwidth;
        }

        public DescribeUisesResponseBodyUisesUis setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeUisesResponseBodyUisesUis setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeUisesResponseBodyUises extends TeaModel {
        @NameInMap("Uis")
        public java.util.List<DescribeUisesResponseBodyUisesUis> uis;

        public static DescribeUisesResponseBodyUises build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisesResponseBodyUises self = new DescribeUisesResponseBodyUises();
            return TeaModel.build(map, self);
        }

        public DescribeUisesResponseBodyUises setUis(java.util.List<DescribeUisesResponseBodyUisesUis> uis) {
            this.uis = uis;
            return this;
        }
        public java.util.List<DescribeUisesResponseBodyUisesUis> getUis() {
            return this.uis;
        }

    }

}
