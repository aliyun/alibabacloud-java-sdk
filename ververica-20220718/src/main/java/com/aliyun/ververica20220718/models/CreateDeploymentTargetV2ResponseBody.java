// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateDeploymentTargetV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{ &quot;jobs&quot;: [ { &quot;jid&quot;: &quot;4df35f8e54554b23bf7dcd38a151****&quot;, &quot;name&quot;: &quot;69d001d5-419a-4bfc-9c2e-849cacd3****&quot;, &quot;state&quot;: &quot;RUNNING&quot;, &quot;start-time&quot;: 1659154942068, &quot;end-time&quot;: -1, &quot;duration&quot;: 188161756, &quot;last-modification&quot;: 1659154968305, &quot;tasks&quot;: { &quot;total&quot;: 2, &quot;created&quot;: 0, &quot;scheduled&quot;: 0, &quot;deploying&quot;: 0, &quot;running&quot;: 2, &quot;finished&quot;: 0, &quot;canceling&quot;: 0, &quot;canceled&quot;: 0, &quot;failed&quot;: 0, &quot;reconciling&quot;: 0, &quot;initializing&quot;: 0 } } ] }</p>
     */
    @NameInMap("data")
    public DeploymentTarget data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateDeploymentTargetV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTargetV2ResponseBody self = new CreateDeploymentTargetV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTargetV2ResponseBody setData(DeploymentTarget data) {
        this.data = data;
        return this;
    }
    public DeploymentTarget getData() {
        return this.data;
    }

    public CreateDeploymentTargetV2ResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDeploymentTargetV2ResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDeploymentTargetV2ResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateDeploymentTargetV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeploymentTargetV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
