// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigMapRequest extends TeaModel {
    @NameInMap("ConfigMapId")
    public Long configMapId;

    public static DescribeConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigMapRequest self = new DescribeConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigMapRequest setConfigMapId(Long configMapId) {
        this.configMapId = configMapId;
        return this;
    }
    public Long getConfigMapId() {
        return this.configMapId;
    }

}
