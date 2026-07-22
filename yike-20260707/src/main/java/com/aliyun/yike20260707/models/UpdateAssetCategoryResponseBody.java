// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class UpdateAssetCategoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAssetCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetCategoryResponseBody self = new UpdateAssetCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAssetCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
