// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetlterationtabnumRequest extends TeaModel {
    @NameInMap("StageId")
    public String stageId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutIterationgetlterationtabnumRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetlterationtabnumRequest self = new GetLinkeBahamutIterationgetlterationtabnumRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetlterationtabnumRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public GetLinkeBahamutIterationgetlterationtabnumRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutIterationgetlterationtabnumRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
