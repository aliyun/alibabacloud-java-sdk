// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionExtraConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B70E1FBD-E533-52F2-A7A1-E02B92F78DDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetDataLevelPermissionExtraConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionExtraConfigResponseBody self = new SetDataLevelPermissionExtraConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionExtraConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDataLevelPermissionExtraConfigResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public SetDataLevelPermissionExtraConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
