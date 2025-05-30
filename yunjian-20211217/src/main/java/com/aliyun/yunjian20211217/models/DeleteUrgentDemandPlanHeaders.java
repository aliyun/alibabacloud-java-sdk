// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeleteUrgentDemandPlanHeaders extends TeaModel {
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

    public static DeleteUrgentDemandPlanHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteUrgentDemandPlanHeaders self = new DeleteUrgentDemandPlanHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteUrgentDemandPlanHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteUrgentDemandPlanHeaders setYunUserId(String yunUserId) {
        this.yunUserId = yunUserId;
        return this;
    }
    public String getYunUserId() {
        return this.yunUserId;
    }

}
