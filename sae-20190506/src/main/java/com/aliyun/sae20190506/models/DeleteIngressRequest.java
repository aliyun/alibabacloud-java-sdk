// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteIngressRequest extends TeaModel {
    /**
     * <p>87</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IngressId")
    public Long ingressId;

    public static DeleteIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIngressRequest self = new DeleteIngressRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIngressRequest setIngressId(Long ingressId) {
        this.ingressId = ingressId;
        return this;
    }
    public Long getIngressId() {
        return this.ingressId;
    }

}
