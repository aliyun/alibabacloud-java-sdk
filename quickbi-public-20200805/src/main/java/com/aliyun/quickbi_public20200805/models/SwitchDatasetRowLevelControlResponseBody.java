// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class SwitchDatasetRowLevelControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public Boolean result;

    public static SwitchDatasetRowLevelControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchDatasetRowLevelControlResponseBody self = new SwitchDatasetRowLevelControlResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchDatasetRowLevelControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchDatasetRowLevelControlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SwitchDatasetRowLevelControlResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
