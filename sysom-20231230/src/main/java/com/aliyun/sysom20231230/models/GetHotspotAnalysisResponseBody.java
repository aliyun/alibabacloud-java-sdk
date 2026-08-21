// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotAnalysisResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;AliYunDun:1657494 process (1657494): Based on the provided hot spot call stack information, the hot spot is mainly concentrated on <code>__nanosleep_nocancel</code> and the related system call <code>SyS_nanosleep</code>, which indicates that the process is waiting for a specific time interval. This is usually caused by long sleep periods or high-frequency timed operations in the application, such as scheduled tasks and heartbeat detection.\n\nThe application code uses <code>nanosleep</code> to implement precise delay control when it needs to periodically perform certain checks or wait for external events. To optimize this situation, consider the following approaches:\n- Evaluate whether the frequency of scheduled tasks can be reduced.\n- Use condition variables instead of simple sleep waits to respond to faster event triggers.\n- If it is an I/O-intensive operation wait, consider optimizing the I/O path or improving I/O efficiency. Use the IO diagnostic tool on the SysOM platform to further locate specific I/O bottlenecks.&quot;</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetHotspotAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotAnalysisResponseBody self = new GetHotspotAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotspotAnalysisResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetHotspotAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotspotAnalysisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
