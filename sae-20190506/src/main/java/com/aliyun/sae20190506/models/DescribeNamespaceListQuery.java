// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListQuery extends TeaModel {
    @NameInMap("ContainCustom")
    @Validation(required = true)
    public Boolean containCustom;

    @NameInMap("HybridCloudExclude")
    public Boolean hybridCloudExclude;

    public static DescribeNamespaceListQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceListQuery self = new DescribeNamespaceListQuery();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceListQuery setContainCustom(Boolean containCustom) {
        this.containCustom = containCustom;
        return this;
    }
    public Boolean getContainCustom() {
        return this.containCustom;
    }

    public DescribeNamespaceListQuery setHybridCloudExclude(Boolean hybridCloudExclude) {
        this.hybridCloudExclude = hybridCloudExclude;
        return this;
    }
    public Boolean getHybridCloudExclude() {
        return this.hybridCloudExclude;
    }

}
