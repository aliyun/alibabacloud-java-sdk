// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListDelegatedAdministratorsRequest extends TeaModel {
    @NameInMap("ServicePrincipal")
    public String servicePrincipal;

    public static ListDelegatedAdministratorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedAdministratorsRequest self = new ListDelegatedAdministratorsRequest();
        return TeaModel.build(map, self);
    }

    public ListDelegatedAdministratorsRequest setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }
    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

}
