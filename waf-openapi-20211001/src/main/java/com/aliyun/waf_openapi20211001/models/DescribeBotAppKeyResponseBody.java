// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBotAppKeyResponseBody extends TeaModel {
    /**
     * <p>AppKey。</p>
     * 
     * <strong>example:</strong>
     * <p>N1Kiv3AGZm******</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <strong>example:</strong>
     * <p>0C4ADFD4-5B7D-591D-A607-A45C*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBotAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotAppKeyResponseBody self = new DescribeBotAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBotAppKeyResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeBotAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
