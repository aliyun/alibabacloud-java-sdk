// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleCodeConfigResponseBody extends TeaModel {
    @NameInMap("CodeConfigs")
    public String codeConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProtectionModuleCodeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleCodeConfigResponseBody self = new DescribeProtectionModuleCodeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleCodeConfigResponseBody setCodeConfigs(String codeConfigs) {
        this.codeConfigs = codeConfigs;
        return this;
    }
    public String getCodeConfigs() {
        return this.codeConfigs;
    }

    public DescribeProtectionModuleCodeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
