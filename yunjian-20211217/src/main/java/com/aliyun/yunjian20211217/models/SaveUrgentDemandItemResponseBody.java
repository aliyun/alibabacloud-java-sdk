// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class SaveUrgentDemandItemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<Long> data;

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
     * <p>2107d95616405752026995105e83b0</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static SaveUrgentDemandItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveUrgentDemandItemResponseBody self = new SaveUrgentDemandItemResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveUrgentDemandItemResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SaveUrgentDemandItemResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public SaveUrgentDemandItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveUrgentDemandItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveUrgentDemandItemResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
