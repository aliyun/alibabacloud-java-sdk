// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class DescribeSessionsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperatorUid")
    public String operatorUid;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SessionStatus")
    public String sessionStatus;

    @NameInMap("AssetThirdId")
    public String assetThirdId;

    @NameInMap("AssetRegionId")
    public String assetRegionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionsRequest self = new DescribeSessionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSessionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSessionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSessionsRequest setOperatorUid(String operatorUid) {
        this.operatorUid = operatorUid;
        return this;
    }
    public String getOperatorUid() {
        return this.operatorUid;
    }

    public DescribeSessionsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeSessionsRequest setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public DescribeSessionsRequest setAssetThirdId(String assetThirdId) {
        this.assetThirdId = assetThirdId;
        return this;
    }
    public String getAssetThirdId() {
        return this.assetThirdId;
    }

    public DescribeSessionsRequest setAssetRegionId(String assetRegionId) {
        this.assetRegionId = assetRegionId;
        return this;
    }
    public String getAssetRegionId() {
        return this.assetRegionId;
    }

    public DescribeSessionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
