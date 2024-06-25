// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class AssociateAdditionalCertificatesWithListenerResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>72dcd26b-f12d-4c27-b3af-18f6aed5****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-93F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateAdditionalCertificatesWithListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateAdditionalCertificatesWithListenerResponseBody self = new AssociateAdditionalCertificatesWithListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateAdditionalCertificatesWithListenerResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AssociateAdditionalCertificatesWithListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
