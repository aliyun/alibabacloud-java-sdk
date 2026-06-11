// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ClearDynamicTagCacheResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>78C17888****C462E57A95</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ClearDynamicTagCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearDynamicTagCacheResponseBody self = new ClearDynamicTagCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearDynamicTagCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearDynamicTagCacheResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ClearDynamicTagCacheResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
