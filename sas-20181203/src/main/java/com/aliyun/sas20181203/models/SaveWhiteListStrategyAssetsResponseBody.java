// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveWhiteListStrategyAssetsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SaveWhiteListStrategyAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveWhiteListStrategyAssetsResponseBody self = new SaveWhiteListStrategyAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveWhiteListStrategyAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
