// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateModelApiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("InvokeEndpoint")
    public String invokeEndpoint;

    /**
     * <strong>example:</strong>
     * <p>mi-xxxxxx</p>
     */
    @NameInMap("ModelApiId")
    public String modelApiId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateModelApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelApiResponseBody self = new CreateModelApiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelApiResponseBody setInvokeEndpoint(String invokeEndpoint) {
        this.invokeEndpoint = invokeEndpoint;
        return this;
    }
    public String getInvokeEndpoint() {
        return this.invokeEndpoint;
    }

    public CreateModelApiResponseBody setModelApiId(String modelApiId) {
        this.modelApiId = modelApiId;
        return this;
    }
    public String getModelApiId() {
        return this.modelApiId;
    }

    public CreateModelApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelApiResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
