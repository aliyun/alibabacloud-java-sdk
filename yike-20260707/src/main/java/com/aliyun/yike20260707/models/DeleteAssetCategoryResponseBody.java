// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class DeleteAssetCategoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAssetCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssetCategoryResponseBody self = new DeleteAssetCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAssetCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
