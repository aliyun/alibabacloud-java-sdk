// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class CreateDemandPlanResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>111223</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>msg</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>1e2b798516402440016572132e1459</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CreateDemandPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandPlanResponseBody self = new CreateDemandPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDemandPlanResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateDemandPlanResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateDemandPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDemandPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDemandPlanResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
