// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class CreateDemandPlanV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public Long data;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static CreateDemandPlanV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandPlanV2ResponseBody self = new CreateDemandPlanV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDemandPlanV2ResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateDemandPlanV2ResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateDemandPlanV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDemandPlanV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDemandPlanV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
