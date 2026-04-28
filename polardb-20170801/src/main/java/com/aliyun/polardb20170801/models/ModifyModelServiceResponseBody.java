// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyModelServiceResponseBody extends TeaModel {
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
     * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelServiceResponseBody self = new ModifyModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyModelServiceResponseBody setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public ModifyModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyModelServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
