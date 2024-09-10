// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySearchConditionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DFFCF83-4F7B-5E05-B82D-3B619D5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySearchConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySearchConditionResponseBody self = new ModifySearchConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySearchConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
