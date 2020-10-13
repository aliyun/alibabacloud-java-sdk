// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class DeletePcdnControlRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    public static DeletePcdnControlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePcdnControlRuleResponse self = new DeletePcdnControlRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeletePcdnControlRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePcdnControlRuleResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
