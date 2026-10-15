// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateRbacOrgUnitRequest extends TeaModel {
    /**
     * <p>The site ID.</p>
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
     * <p>{&quot;name&quot;:&quot;xx&quot;,&quot;path&quot;:&quot;root.shanghai&quot;}</p>
     */
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
