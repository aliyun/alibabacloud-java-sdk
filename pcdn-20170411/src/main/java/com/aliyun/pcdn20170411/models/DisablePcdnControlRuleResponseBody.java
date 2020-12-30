// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class DisablePcdnControlRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Code")
    public Integer code;

    public static DisablePcdnControlRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisablePcdnControlRuleResponseBody self = new DisablePcdnControlRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisablePcdnControlRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisablePcdnControlRuleResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DisablePcdnControlRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
