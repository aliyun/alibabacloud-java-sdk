// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyApiDatasourceParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyApiDatasourceParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiDatasourceParametersResponseBody self = new ModifyApiDatasourceParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiDatasourceParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyApiDatasourceParametersResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ModifyApiDatasourceParametersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
