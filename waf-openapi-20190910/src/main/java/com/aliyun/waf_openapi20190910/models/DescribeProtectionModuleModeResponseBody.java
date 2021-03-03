// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleModeResponseBody extends TeaModel {
    @NameInMap("LearnStatus")
    public Integer learnStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Mode")
    public Integer mode;

    public static DescribeProtectionModuleModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleModeResponseBody self = new DescribeProtectionModuleModeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleModeResponseBody setLearnStatus(Integer learnStatus) {
        this.learnStatus = learnStatus;
        return this;
    }
    public Integer getLearnStatus() {
        return this.learnStatus;
    }

    public DescribeProtectionModuleModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProtectionModuleModeResponseBody setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

}
