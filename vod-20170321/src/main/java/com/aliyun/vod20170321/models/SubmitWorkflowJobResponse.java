// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SubmitWorkflowJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitWorkflowJobResponse self = new SubmitWorkflowJobResponse();
        return TeaModel.build(map, self);
    }

}
