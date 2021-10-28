// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeBlockVolumeSnapshotsRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeBlockVolumeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockVolumeSnapshotsRequest self = new DescribeBlockVolumeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockVolumeSnapshotsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeBlockVolumeSnapshotsRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public DescribeBlockVolumeSnapshotsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBlockVolumeSnapshotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBlockVolumeSnapshotsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
