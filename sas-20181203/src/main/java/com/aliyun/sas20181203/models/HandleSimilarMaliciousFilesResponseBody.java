// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarMaliciousFilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>8C376***AE74FB4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static HandleSimilarMaliciousFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarMaliciousFilesResponseBody self = new HandleSimilarMaliciousFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleSimilarMaliciousFilesResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public HandleSimilarMaliciousFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
