// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListRequest extends TeaModel {
    @NameInMap("ContainCustom")
    public Boolean containCustom;

    @NameInMap("HybridCloudExclude")
    public Boolean hybridCloudExclude;

    public static DescribeNamespaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceListRequest self = new DescribeNamespaceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceListRequest setContainCustom(Boolean containCustom) {
        this.containCustom = containCustom;
        return this;
    }
    public Boolean getContainCustom() {
        return this.containCustom;
    }

    public DescribeNamespaceListRequest setHybridCloudExclude(Boolean hybridCloudExclude) {
        this.hybridCloudExclude = hybridCloudExclude;
        return this;
    }
    public Boolean getHybridCloudExclude() {
        return this.hybridCloudExclude;
    }

}
