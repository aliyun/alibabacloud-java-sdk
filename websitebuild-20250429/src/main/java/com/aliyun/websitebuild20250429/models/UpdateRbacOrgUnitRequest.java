// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateRbacOrgUnitRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OrgUnitData")
    public String orgUnitData;

    @NameInMap("OrgUnitId")
    public String orgUnitId;

    public static UpdateRbacOrgUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRbacOrgUnitRequest self = new UpdateRbacOrgUnitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRbacOrgUnitRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateRbacOrgUnitRequest setOrgUnitData(String orgUnitData) {
        this.orgUnitData = orgUnitData;
        return this;
    }
    public String getOrgUnitData() {
        return this.orgUnitData;
    }

    public UpdateRbacOrgUnitRequest setOrgUnitId(String orgUnitId) {
        this.orgUnitId = orgUnitId;
        return this;
    }
    public String getOrgUnitId() {
        return this.orgUnitId;
    }

}
