// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateSubCrowdResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9763624B-5FBB-5E3A-9193-B1ADB554CEAE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SubCrowdId")
    public String subCrowdId;

    public static CreateSubCrowdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCrowdResponseBody self = new CreateSubCrowdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubCrowdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubCrowdResponseBody setSubCrowdId(String subCrowdId) {
        this.subCrowdId = subCrowdId;
        return this;
    }
    public String getSubCrowdId() {
        return this.subCrowdId;
    }

}
