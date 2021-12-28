// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeExtensionProviderResponseBody extends TeaModel {
    @NameInMap("ExtensionProviders")
    public java.util.List<java.util.Map<String, ?>> extensionProviders;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExtensionProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtensionProviderResponseBody self = new DescribeExtensionProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExtensionProviderResponseBody setExtensionProviders(java.util.List<java.util.Map<String, ?>> extensionProviders) {
        this.extensionProviders = extensionProviders;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getExtensionProviders() {
        return this.extensionProviders;
    }

    public DescribeExtensionProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
