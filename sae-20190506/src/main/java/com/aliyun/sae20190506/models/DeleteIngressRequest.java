// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteIngressRequest extends TeaModel {
    /**
     * <p>The ID of the routing rule that you want to delete. You can call the <a href="https://help.aliyun.com/document_detail/153934.html">ListIngresses</a> operation to obtain the ID of a routing rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>87</p>
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
