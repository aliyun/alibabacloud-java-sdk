// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryListRequest extends TeaModel {
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
