// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppLayoutResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2DCE8D7E-BE3B-54AB-8DAC-32F34BED0763</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppLayoutResponseBody self = new DeleteAppLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
