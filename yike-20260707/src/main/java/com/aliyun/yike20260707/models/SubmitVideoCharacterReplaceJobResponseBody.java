// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoCharacterReplaceJobResponseBody extends TeaModel {
    /**
     * <p>The job ID returned by SubmitVideoCharacterReplaceJob.</p>
     * 
     * <strong>example:</strong>
     * <p>ag_83baeea38b534ee1937b8a4acd08****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitVideoCharacterReplaceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoCharacterReplaceJobResponseBody self = new SubmitVideoCharacterReplaceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoCharacterReplaceJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitVideoCharacterReplaceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
