// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUniBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4F07F4F1-88ED-5569-B519-FFCC9B7E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUniBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUniBackupPolicyResponseBody self = new DeleteUniBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUniBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
