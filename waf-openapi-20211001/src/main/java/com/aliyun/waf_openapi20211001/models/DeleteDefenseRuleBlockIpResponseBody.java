// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseRuleBlockIpResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9D11AC3A-A10C-56E7-A342-E87EC892BAE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDefenseRuleBlockIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseRuleBlockIpResponseBody self = new DeleteDefenseRuleBlockIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseRuleBlockIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
