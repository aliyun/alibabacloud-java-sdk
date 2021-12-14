// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleStatusResponseBody extends TeaModel {
    @NameInMap("ModuleStatus")
    public Integer moduleStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProtectionModuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleStatusResponseBody self = new DescribeProtectionModuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleStatusResponseBody setModuleStatus(Integer moduleStatus) {
        this.moduleStatus = moduleStatus;
        return this;
    }
    public Integer getModuleStatus() {
        return this.moduleStatus;
    }

    public DescribeProtectionModuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
