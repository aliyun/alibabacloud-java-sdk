// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyDashboardNl2sqlStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46e537a5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of dashboard IDs for which the operation failed.</p>
     */
    @NameInMap("Result")
    public java.util.List<String> result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
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
