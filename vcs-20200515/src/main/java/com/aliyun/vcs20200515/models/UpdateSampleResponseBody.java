// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateSampleResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("LabelId")
    public String labelId;

    public static UpdateSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSampleResponseBody self = new UpdateSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSampleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSampleResponseBody setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

}
