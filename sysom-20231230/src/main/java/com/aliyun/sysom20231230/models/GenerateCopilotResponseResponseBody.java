// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotResponseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>Requests for llm service failed</p>
     */
    @NameInMap("massage")
    public String massage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GenerateCopilotResponseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCopilotResponseResponseBody self = new GenerateCopilotResponseResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCopilotResponseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateCopilotResponseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GenerateCopilotResponseResponseBody setMassage(String massage) {
        this.massage = massage;
        return this;
    }
    public String getMassage() {
        return this.massage;
    }

    public GenerateCopilotResponseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
