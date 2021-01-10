// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutUnitbranchRequest extends TeaModel {
    @NameInMap("StageId")
    public String stageId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UnitId")
    public String unitId;

    public static CheckLinkeBahamutUnitbranchRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutUnitbranchRequest self = new CheckLinkeBahamutUnitbranchRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutUnitbranchRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public CheckLinkeBahamutUnitbranchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckLinkeBahamutUnitbranchRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
