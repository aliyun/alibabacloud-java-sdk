// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryListRequest extends TeaModel {
    /**
     * <p>The type of the image repository. Valid values:</p>
     * <ul>
     * <li><p><strong>acr</strong>: ACR</p>
     * </li>
     * <li><p><strong>harbor</strong>: Harbor</p>
     * </li>
     * <li><p><strong>quay</strong>: Quay</p>
     * </li>
     * <li><p><strong>CI/CD</strong>: Jenkins</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>harbor</p>
     */
    @NameInMap("RegistryType")
    public String registryType;

    public static ListPrivateRegistryListRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateRegistryListRequest self = new ListPrivateRegistryListRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateRegistryListRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

}
