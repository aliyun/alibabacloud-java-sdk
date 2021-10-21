// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateApplicantContacterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicantContacterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicantContacterResponseBody self = new UpdateApplicantContacterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicantContacterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
