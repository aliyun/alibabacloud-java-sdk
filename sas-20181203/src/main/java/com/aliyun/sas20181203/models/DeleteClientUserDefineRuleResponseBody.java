// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteClientUserDefineRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4552b59b-18f2-4fad-b6a2-0d59b8f2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClientUserDefineRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientUserDefineRuleResponseBody self = new DeleteClientUserDefineRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClientUserDefineRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
