// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeletePrivateRegistryRequest extends TeaModel {
    /**
     * <p>The ID of the image repository.</p>
     * <br>
     * <p>> You can call the [PageImageRegistry](~~PageImageRegistry~~) operation to query the IDs of image repositories.</p>
     * <br>
     * <p>This parameter is required.</p>
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
