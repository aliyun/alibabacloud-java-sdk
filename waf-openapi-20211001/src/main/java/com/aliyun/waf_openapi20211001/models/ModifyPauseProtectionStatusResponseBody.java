// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyPauseProtectionStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D7861F61-<em><strong><strong>-</strong></strong></em>*-D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPauseProtectionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPauseProtectionStatusResponseBody self = new ModifyPauseProtectionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPauseProtectionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
