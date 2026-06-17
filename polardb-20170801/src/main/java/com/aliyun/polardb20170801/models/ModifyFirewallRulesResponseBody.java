// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyFirewallRulesResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, Successful is returned. If the request fails, an error message is returned, such as an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8DBA3A7-82FB-5CBE-A002-8959E47D1D61</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyFirewallRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallRulesResponseBody self = new ModifyFirewallRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyFirewallRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFirewallRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
