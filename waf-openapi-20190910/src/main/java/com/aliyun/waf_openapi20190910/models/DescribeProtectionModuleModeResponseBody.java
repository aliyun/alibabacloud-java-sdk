// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleModeResponseBody extends TeaModel {
    @NameInMap("Mode")
    public Integer mode;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProtectionModuleModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleModeResponseBody self = new DescribeProtectionModuleModeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleModeResponseBody setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public DescribeProtectionModuleModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
