// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicket4CopilotResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787************05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>ID of the Smart Q module to be embedded.</p>
     * 
     * <strong>example:</strong>
     * <p>f5eeb52e-d9c2-4a8b-80e3-47ab55c2****</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: The request succeeded</li>
     * <li>false: The request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTicket4CopilotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTicket4CopilotResponseBody self = new CreateTicket4CopilotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTicket4CopilotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTicket4CopilotResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CreateTicket4CopilotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
