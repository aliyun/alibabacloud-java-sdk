// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkefabricFabricReleaseprodnotifyRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("ReleaseStatus")
    public String releaseStatus;

    @NameInMap("TenantName")
    public String tenantName;

    public static GetLinkefabricFabricReleaseprodnotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkefabricFabricReleaseprodnotifyRequest self = new GetLinkefabricFabricReleaseprodnotifyRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkefabricFabricReleaseprodnotifyRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetLinkefabricFabricReleaseprodnotifyRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public GetLinkefabricFabricReleaseprodnotifyRequest setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
        return this;
    }
    public String getReleaseStatus() {
        return this.releaseStatus;
    }

    public GetLinkefabricFabricReleaseprodnotifyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
