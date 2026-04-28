// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateModelServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ms-xxxxxx</p>
     */
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceResponseBody self = new CreateModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceResponseBody setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public CreateModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
