// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeIngressQuery extends TeaModel {
    @NameInMap("IngressId")
    @Validation(required = true)
    public Long ingressId;

    public static DescribeIngressQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressQuery self = new DescribeIngressQuery();
        return TeaModel.build(map, self);
    }

    public DescribeIngressQuery setIngressId(Long ingressId) {
        this.ingressId = ingressId;
        return this;
    }
    public Long getIngressId() {
        return this.ingressId;
    }

}
