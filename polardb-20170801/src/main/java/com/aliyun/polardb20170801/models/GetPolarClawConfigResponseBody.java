// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarClawConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;models&quot;: &quot;{\&quot;mode\&quot;:\&quot;merge\&quot;,\&quot;providers\&quot;:{\&quot;bailian\&quot;:{\&quot;models\&quot;:[{\&quot;input\&quot;:[\&quot;text\&quot;,\&quot;image\&quot;],\&quot;name\&quot;:\&quot;qwen3.6-plus\&quot;,\&quot;api\&quot;:\&quot;openai-completions\&quot;,\&quot;id\&quot;:\&quot;qwen3.6-plus\&quot;,\&quot;compat\&quot;:{\&quot;supportsUsageInStreaming\&quot;:true}}],\&quot;baseUrl\&quot;:\&quot;<a href="https://dashscope.aliyuncs.com/compatible-mode/v1%5C%5C%22,%5C%5C%22apiKey%5C%5C%22:%5C%5C%22__OPENCLAW_REDACTED__%5C%5C%22,%5C%5C%22api%5C%5C%22:%5C%5C%22openai-completions%5C%5C%22%7D,%5C%5C%22polardbCustom%5C%5C%22:%7B%5C%5C%22models%5C%5C%22:%5B%7B%5C%5C%22name%5C%5C%22:%5C%5C%22qwen3-max%5C%5C%22,%5C%5C%22api%5C%5C%22:%5C%5C%22openai-completions%5C%5C%22,%5C%5C%22id%5C%5C%22:%5C%5C%22qwen3-max%5C%5C%22%7D%5D,%5C%5C%22baseUrl%5C%5C%22:%5C%5C%22https://dashscope.aliyuncs.com/compatible-mode/v1%5C%5C%22,%5C%5C%22apiKey%5C%5C%22:%5C%5C%22__OPENCLAW_REDACTED__%5C%5C%22,%5C%5C%22api%5C%5C%22:%5C%5C%22openai-completions%5C%5C%22%7D,%5C%5C%22polardb%5C%5C%22:%7B%5C%5C%22models%5C%5C%22:%5B%5D,%5C%5C%22baseUrl%5C%5C%22:%5C%5C%22https://dashscope.aliyuncs.com/compatible-mode/v1%5C%5C%22,%5C%5C%22api%5C%5C%22:%5C%5C%22openai-completions%5C%5C%22%7D%7D%7D">https://dashscope.aliyuncs.com/compatible-mode/v1\\&quot;,\\&quot;apiKey\\&quot;:\\&quot;__OPENCLAW_REDACTED__\\&quot;,\\&quot;api\\&quot;:\\&quot;openai-completions\\&quot;},\\&quot;polardbCustom\\&quot;:{\\&quot;models\\&quot;:[{\\&quot;name\\&quot;:\\&quot;qwen3-max\\&quot;,\\&quot;api\\&quot;:\\&quot;openai-completions\\&quot;,\\&quot;id\\&quot;:\\&quot;qwen3-max\\&quot;}],\\&quot;baseUrl\\&quot;:\\&quot;https://dashscope.aliyuncs.com/compatible-mode/v1\\&quot;,\\&quot;apiKey\\&quot;:\\&quot;__OPENCLAW_REDACTED__\\&quot;,\\&quot;api\\&quot;:\\&quot;openai-completions\\&quot;},\\&quot;polardb\\&quot;:{\\&quot;models\\&quot;:[],\\&quot;baseUrl\\&quot;:\\&quot;https://dashscope.aliyuncs.com/compatible-mode/v1\\&quot;,\\&quot;api\\&quot;:\\&quot;openai-completions\\&quot;}}}</a>&quot;
     * }</p>
     */
    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    /**
     * <strong>example:</strong>
     * <p>005b55a8e870aaf866598e48a6af0bdbfa3fef704770c5e1cbad99648beaa661</p>
     */
    @NameInMap("Hash")
    public String hash;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2026.3.28</p>
     */
    @NameInMap("OpenclawVersion")
    public String openclawVersion;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolarClawConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolarClawConfigResponseBody self = new GetPolarClawConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolarClawConfigResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetPolarClawConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPolarClawConfigResponseBody setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public GetPolarClawConfigResponseBody setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public GetPolarClawConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPolarClawConfigResponseBody setOpenclawVersion(String openclawVersion) {
        this.openclawVersion = openclawVersion;
        return this;
    }
    public String getOpenclawVersion() {
        return this.openclawVersion;
    }

    public GetPolarClawConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
