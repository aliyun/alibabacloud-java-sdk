// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshRegistryTokenRequest extends TeaModel {
    /**
     * <p>The ID of the image repository.</p>
     * <blockquote>
     * <p> You can call the <a href="~~PageImageRegistry~~">PageImageRegistry</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistryId")
    public Long registryId;

    public static RefreshRegistryTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshRegistryTokenRequest self = new RefreshRegistryTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshRegistryTokenRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

}
