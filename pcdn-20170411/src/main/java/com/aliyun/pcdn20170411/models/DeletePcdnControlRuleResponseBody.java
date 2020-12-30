// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class DeletePcdnControlRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static DeletePcdnControlRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePcdnControlRuleResponseBody self = new DeletePcdnControlRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePcdnControlRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePcdnControlRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
