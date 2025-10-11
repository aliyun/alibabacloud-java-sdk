// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyResourcePackageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoQuota")
    public Boolean autoQuota;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-bp11b0i9389******</p>
     */
    @NameInMap("ResourcePackageId")
    public String resourcePackageId;

    public static ModifyResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourcePackageRequest self = new ModifyResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourcePackageRequest setAutoQuota(Boolean autoQuota) {
        this.autoQuota = autoQuota;
        return this;
    }
    public Boolean getAutoQuota() {
        return this.autoQuota;
    }

    public ModifyResourcePackageRequest setResourcePackageId(String resourcePackageId) {
        this.resourcePackageId = resourcePackageId;
        return this;
    }
    public String getResourcePackageId() {
        return this.resourcePackageId;
    }

}
