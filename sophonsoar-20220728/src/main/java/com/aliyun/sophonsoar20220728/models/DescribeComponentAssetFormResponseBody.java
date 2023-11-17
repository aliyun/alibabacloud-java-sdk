// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetFormResponseBody extends TeaModel {
    @NameInMap("ComponentAssetForm")
    public String componentAssetForm;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentAssetFormResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentAssetFormResponseBody self = new DescribeComponentAssetFormResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentAssetFormResponseBody setComponentAssetForm(String componentAssetForm) {
        this.componentAssetForm = componentAssetForm;
        return this;
    }
    public String getComponentAssetForm() {
        return this.componentAssetForm;
    }

    public DescribeComponentAssetFormResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
