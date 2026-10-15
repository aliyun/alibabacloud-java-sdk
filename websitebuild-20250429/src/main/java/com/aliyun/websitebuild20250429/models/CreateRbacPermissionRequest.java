// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateRbacPermissionRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250821161210000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The permission parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;resource&quot;:&quot;post&quot;,&quot;action&quot;:&quot;read&quot;,&quot;description&quot;:&quot;read post&quot;}</p>
     */
    @NameInMap("PermissionData")
    public String permissionData;

    public static CreateRbacPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRbacPermissionRequest self = new CreateRbacPermissionRequest();
        return TeaModel.build(map, self);
    }

    public CreateRbacPermissionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateRbacPermissionRequest setPermissionData(String permissionData) {
        this.permissionData = permissionData;
        return this;
    }
    public String getPermissionData() {
        return this.permissionData;
    }

}
