// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientUserDefineRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5cbb3c39-88ec-429a-be26-5d0f62cc****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClientUserDefineRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientUserDefineRuleResponseBody self = new ModifyClientUserDefineRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClientUserDefineRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
