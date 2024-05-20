// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeIngressRequest extends TeaModel {
    /**
     * <p>The returned data.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IngressId")
    public Long ingressId;

    public static DescribeIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressRequest self = new DescribeIngressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIngressRequest setIngressId(Long ingressId) {
        this.ingressId = ingressId;
        return this;
    }
    public Long getIngressId() {
        return this.ingressId;
    }

}
