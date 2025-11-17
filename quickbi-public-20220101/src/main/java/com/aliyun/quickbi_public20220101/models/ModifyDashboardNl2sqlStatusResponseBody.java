// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyDashboardNl2sqlStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46e537a5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyDashboardNl2sqlStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDashboardNl2sqlStatusResponseBody self = new ModifyDashboardNl2sqlStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDashboardNl2sqlStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDashboardNl2sqlStatusResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

    public ModifyDashboardNl2sqlStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
