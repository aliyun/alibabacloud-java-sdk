// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteRbacOrgUnitRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OrgUnitId")
    public String orgUnitId;

    public static DeleteRbacOrgUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRbacOrgUnitRequest self = new DeleteRbacOrgUnitRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRbacOrgUnitRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteRbacOrgUnitRequest setOrgUnitId(String orgUnitId) {
        this.orgUnitId = orgUnitId;
        return this;
    }
    public String getOrgUnitId() {
        return this.orgUnitId;
    }

}
