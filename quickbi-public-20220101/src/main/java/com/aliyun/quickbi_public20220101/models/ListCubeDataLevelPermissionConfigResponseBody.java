// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCubeDataLevelPermissionConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static ListCubeDataLevelPermissionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCubeDataLevelPermissionConfigResponseBody self = new ListCubeDataLevelPermissionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCubeDataLevelPermissionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCubeDataLevelPermissionConfigResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ListCubeDataLevelPermissionConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
