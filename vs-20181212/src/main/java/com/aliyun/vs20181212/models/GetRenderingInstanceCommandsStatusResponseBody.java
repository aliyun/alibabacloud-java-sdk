// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingInstanceCommandsStatusResponseBody extends TeaModel {
    /**
     * <p>The description. When Status is Failed, this field includes the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>conn failed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution result string of the command.</p>
     * 
     * <strong>example:</strong>
     * <p>Thu Jun 27 16:06:26 CST 2024</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The command execution status. Valid values:</p>
     * <ul>
     * <li>Doing: Executing.</li>
     * <li>Success: Succeeded.</li>
     * <li>Failed: Failed. Within the timeout period, the system automatically retries the command. You can continue to wait or initiate a new request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetRenderingInstanceCommandsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingInstanceCommandsStatusResponseBody self = new GetRenderingInstanceCommandsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRenderingInstanceCommandsStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRenderingInstanceCommandsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRenderingInstanceCommandsStatusResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetRenderingInstanceCommandsStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
