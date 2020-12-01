// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigMapQuery extends TeaModel {
    @NameInMap("ConfigMapId")
    @Validation(required = true)
    public Long configMapId;

    public static DescribeConfigMapQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigMapQuery self = new DescribeConfigMapQuery();
        return TeaModel.build(map, self);
    }

    public DescribeConfigMapQuery setConfigMapId(Long configMapId) {
        this.configMapId = configMapId;
        return this;
    }
    public Long getConfigMapId() {
        return this.configMapId;
    }

}
