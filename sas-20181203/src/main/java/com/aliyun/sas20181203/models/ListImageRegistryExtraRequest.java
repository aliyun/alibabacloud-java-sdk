// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRegistryExtraRequest extends TeaModel {
    /**
     * <p>The image repository ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~PageImageRegistry~~">PageImageRegistry</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25363</p>
     */
    @NameInMap("RegistryId")
    public Long registryId;

    public static ListImageRegistryExtraRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageRegistryExtraRequest self = new ListImageRegistryExtraRequest();
        return TeaModel.build(map, self);
    }

    public ListImageRegistryExtraRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

}
