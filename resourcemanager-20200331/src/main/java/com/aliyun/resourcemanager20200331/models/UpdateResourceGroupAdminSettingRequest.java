// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupAdminSettingRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the Use Creator as Administrator feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreatorAsAdmin")
    public Boolean creatorAsAdmin;

    public static UpdateResourceGroupAdminSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupAdminSettingRequest self = new UpdateResourceGroupAdminSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupAdminSettingRequest setCreatorAsAdmin(Boolean creatorAsAdmin) {
        this.creatorAsAdmin = creatorAsAdmin;
        return this;
    }
    public Boolean getCreatorAsAdmin() {
        return this.creatorAsAdmin;
    }

}
