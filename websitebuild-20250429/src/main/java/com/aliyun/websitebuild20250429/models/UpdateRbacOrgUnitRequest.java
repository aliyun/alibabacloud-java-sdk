// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateRbacOrgUnitRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The organization parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;xx&quot;}</p>
     */
    @NameInMap("OrgUnitData")
    public String orgUnitData;

    /**
     * <p>The organization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f0534aa7-94ec-4368-a34a-310390f66253</p>
     */
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
