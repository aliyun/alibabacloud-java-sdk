// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateInstanceResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6CF1E160-3F36-5E73-A170-C75504F05BBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>reso-2s416t***</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static CreateInstanceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResourceResponseBody self = new CreateInstanceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResourceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
