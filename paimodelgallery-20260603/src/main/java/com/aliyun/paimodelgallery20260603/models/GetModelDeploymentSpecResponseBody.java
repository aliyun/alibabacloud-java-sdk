// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class GetModelDeploymentSpecResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;containers&quot;: [
     *       {
     *         &quot;image&quot;: &quot;eas-registry-vpc.cn-hangzhou.cr.aliyuncs.com/pai-eas/sglang:v0.5.17&quot;,
     *         &quot;port&quot;: 8000,
     *         &quot;script&quot;: &quot;python -m sglang.launch_server ***  --port 8000&quot;
     *       }
     *     ],
     *     &quot;metadata&quot;: {
     *       &quot;cpu&quot;: 248,
     *       &quot;disk&quot;: 850,
     *       &quot;gpu&quot;: 8,
     *       &quot;instance&quot;: 1,
     *       &quot;memory&quot;: 2744000,
     *       &quot;shm_size&quot;: 512
     *     }
     *   }</p>
     */
    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    /**
     * <strong>example:</strong>
     * <p>B6B54325-C98C-5937-87A3-2F96C07652EC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetModelDeploymentSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelDeploymentSpecResponseBody self = new GetModelDeploymentSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelDeploymentSpecResponseBody setInferenceSpec(java.util.Map<String, ?> inferenceSpec) {
        this.inferenceSpec = inferenceSpec;
        return this;
    }
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    public GetModelDeploymentSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
