// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverEndpointRequest extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("Lang")
    public String lang;

    public static DeleteResolverEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResolverEndpointRequest self = new DeleteResolverEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResolverEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DeleteResolverEndpointRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
