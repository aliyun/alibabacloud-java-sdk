// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveImageBaselineStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9AB5D3DE-6E0F-5633-AA71-4B90C724****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SaveImageBaselineStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveImageBaselineStrategyResponseBody self = new SaveImageBaselineStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveImageBaselineStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
