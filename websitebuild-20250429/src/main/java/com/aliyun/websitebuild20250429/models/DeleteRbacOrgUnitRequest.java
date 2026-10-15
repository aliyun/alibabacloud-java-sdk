// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteRbacOrgUnitRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The organization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f0534aa7-94ec-4368-a34a-310390f66253</p>
     */
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
