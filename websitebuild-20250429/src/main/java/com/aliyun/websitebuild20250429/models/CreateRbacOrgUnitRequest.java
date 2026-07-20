// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateRbacOrgUnitRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OrgUnitData")
    public String orgUnitData;

    public static CreateRbacOrgUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRbacOrgUnitRequest self = new CreateRbacOrgUnitRequest();
        return TeaModel.build(map, self);
    }

    public CreateRbacOrgUnitRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateRbacOrgUnitRequest setOrgUnitData(String orgUnitData) {
        this.orgUnitData = orgUnitData;
        return this;
    }
    public String getOrgUnitData() {
        return this.orgUnitData;
    }

}
