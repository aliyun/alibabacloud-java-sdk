// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeleteUrgentDemandItemHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111222</p>
     */
    @NameInMap("Yun-User-Id")
    public String yunUserId;

    public static DeleteUrgentDemandItemHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteUrgentDemandItemHeaders self = new DeleteUrgentDemandItemHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteUrgentDemandItemHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteUrgentDemandItemHeaders setYunUserId(String yunUserId) {
        this.yunUserId = yunUserId;
        return this;
    }
    public String getYunUserId() {
        return this.yunUserId;
    }

}
