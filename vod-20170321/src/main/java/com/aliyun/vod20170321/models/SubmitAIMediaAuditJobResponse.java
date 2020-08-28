// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static SubmitAIMediaAuditJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIMediaAuditJobResponse self = new SubmitAIMediaAuditJobResponse();
        return TeaModel.build(map, self);
    }

}
