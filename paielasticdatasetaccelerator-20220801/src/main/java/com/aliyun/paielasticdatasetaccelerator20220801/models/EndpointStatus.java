// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class EndpointStatus extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public EndpointStatusDetail detail;

    /**
     * <strong>example:</strong>
     * <p>Init Succeed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Phase")
    public String phase;

    public static EndpointStatus build(java.util.Map<String, ?> map) throws Exception {
        EndpointStatus self = new EndpointStatus();
        return TeaModel.build(map, self);
    }

    public EndpointStatus setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EndpointStatus setDetail(EndpointStatusDetail detail) {
        this.detail = detail;
        return this;
    }
    public EndpointStatusDetail getDetail() {
        return this.detail;
    }

    public EndpointStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EndpointStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
