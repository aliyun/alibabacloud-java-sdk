// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyModelApiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mi-xxxxx</p>
     */
    @NameInMap("ModelApiId")
    public String modelApiId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyModelApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelApiResponseBody self = new ModifyModelApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyModelApiResponseBody setModelApiId(String modelApiId) {
        this.modelApiId = modelApiId;
        return this;
    }
    public String getModelApiId() {
        return this.modelApiId;
    }

    public ModifyModelApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
