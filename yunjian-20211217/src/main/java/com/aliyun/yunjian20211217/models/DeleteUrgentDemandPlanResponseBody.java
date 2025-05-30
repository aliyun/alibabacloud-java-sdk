// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeleteUrgentDemandPlanResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>212cf01016405759151137225e83cd</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static DeleteUrgentDemandPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUrgentDemandPlanResponseBody self = new DeleteUrgentDemandPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUrgentDemandPlanResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DeleteUrgentDemandPlanResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DeleteUrgentDemandPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteUrgentDemandPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteUrgentDemandPlanResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
