// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCensResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Clusters")
    @Validation(required = true)
    public java.util.List<String> clusters;

    public static DescribeCensResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCensResponse self = new DescribeCensResponse();
        return TeaModel.build(map, self);
    }

}
