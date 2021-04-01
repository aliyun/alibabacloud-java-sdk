// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("OperatorUid")
    public String operatorUid;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("AssetThirdId")
    public String assetThirdId;

    @NameInMap("AssetRegionId")
    public String assetRegionId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientSourceIp")
    public String clientSourceIp;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAuditLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogsRequest self = new DescribeAuditLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAuditLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAuditLogsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeAuditLogsRequest setOperatorUid(String operatorUid) {
        this.operatorUid = operatorUid;
        return this;
    }
    public String getOperatorUid() {
        return this.operatorUid;
    }

    public DescribeAuditLogsRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeAuditLogsRequest setAssetThirdId(String assetThirdId) {
        this.assetThirdId = assetThirdId;
        return this;
    }
    public String getAssetThirdId() {
        return this.assetThirdId;
    }

    public DescribeAuditLogsRequest setAssetRegionId(String assetRegionId) {
        this.assetRegionId = assetRegionId;
        return this;
    }
    public String getAssetRegionId() {
        return this.assetRegionId;
    }

    public DescribeAuditLogsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAuditLogsRequest setClientSourceIp(String clientSourceIp) {
        this.clientSourceIp = clientSourceIp;
        return this;
    }
    public String getClientSourceIp() {
        return this.clientSourceIp;
    }

    public DescribeAuditLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuditLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
