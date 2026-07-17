// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveElasticPlanResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ElasticPlan.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <strong>example:</strong>
     * <p>Elastic plan not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static RemoveElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveElasticPlanResponseBody self = new RemoveElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveElasticPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveElasticPlanResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public RemoveElasticPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveElasticPlanResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
