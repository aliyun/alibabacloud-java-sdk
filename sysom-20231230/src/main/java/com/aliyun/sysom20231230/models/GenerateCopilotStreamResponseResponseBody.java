// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotStreamResponseResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned by the LLM service. The data is of the string type. If it is a dict, convert and parse it yourself.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;choices\&quot;: [{\&quot;finish_reason\&quot;: \&quot;stop\&quot;, \&quot;index\&quot;: 0, \&quot;message\&quot;: {\&quot;content\&quot;: \&quot;Alinux is a Linux-based open-source operating system primarily developed and maintained by Alibaba Group, designed specifically for large-scale cloud computing and big data processing environments. The system has been deeply customized and optimized for high concurrency, low latency, and resource utilization to meet the complex and massive business demands within Alibaba. Due to its excellent performance and stability, Alinux has gradually been adopted by external enterprises and research institutions, particularly in areas that require handling high-load scenarios. Compared to standard Linux distributions, Alinux may include specific kernel patches, optimization toolsets, and other features developed internally by Alibaba. However, it is worth noting that although the &quot;Ali&quot; in the name may suggest a close relationship with Alibaba, Alinux as a project became a sub-project under the OpenAtom Foundation in 2021, known as OpenAnolis, marking its progression toward community-driven and broader adoption.\&quot;, \&quot;role\&quot;: \&quot;assistant\&quot;}}], \&quot;model\&quot;: \&quot;Qwen1.5\&quot;, \&quot;sentiment\&quot;: [], \&quot;status_code\&quot;: 200, \&quot;time\&quot;: 6.836989402770996, \&quot;usage\&quot;: {\&quot;completion_tokens\&quot;: 180, \&quot;prompt_tokens\&quot;: 176, \&quot;time_dict\&quot;: {\&quot;auto_regression_time\&quot;: 0.03798324399524265, \&quot;speed\&quot;: 26.327398474054736, \&quot;total_generate_time\&quot;: 6.836983919143677}, \&quot;total_tokens\&quot;: 356}}</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code description. This field is empty if no error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>Requests for llm service failed</p>
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

    public static GenerateCopilotStreamResponseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCopilotStreamResponseResponseBody self = new GenerateCopilotStreamResponseResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCopilotStreamResponseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateCopilotStreamResponseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GenerateCopilotStreamResponseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateCopilotStreamResponseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
