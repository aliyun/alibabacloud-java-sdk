// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeletePrivateRegistryRequest extends TeaModel {
    /**
     * <p>The image repository ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~PageImageRegistry~~">PageImageRegistry</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22233</p>
     */
    @NameInMap("RegistryId")
    public Long registryId;

    public static DeletePrivateRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateRegistryRequest self = new DeletePrivateRegistryRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrivateRegistryRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

}
