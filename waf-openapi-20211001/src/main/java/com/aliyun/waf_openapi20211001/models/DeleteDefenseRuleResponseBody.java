// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseRuleResponseBody self = new DeleteDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
