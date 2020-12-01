// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteIngressQuery extends TeaModel {
    @NameInMap("IngressId")
    public Long ingressId;

    public static DeleteIngressQuery build(java.util.Map<String, ?> map) throws Exception {
        DeleteIngressQuery self = new DeleteIngressQuery();
        return TeaModel.build(map, self);
    }

    public DeleteIngressQuery setIngressId(Long ingressId) {
        this.ingressId = ingressId;
        return this;
    }
    public Long getIngressId() {
        return this.ingressId;
    }

}
