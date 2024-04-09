// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GenerateCopilotResponseResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    @NameInMap("massage")
    public String massage;

    /**
     * <p>Id of the request</p>
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
