// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryListRequest extends TeaModel {
    /**
     * <p>The type of the image repository. Valid values:</p>
     * <br>
     * <p>*   **acr**: Container Registry</p>
     * <p>*   **harbor**: Harbor</p>
     * <p>*   **quay**: Quay</p>
     * <p>*   **CI/CD**: Jenkins</p>
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
