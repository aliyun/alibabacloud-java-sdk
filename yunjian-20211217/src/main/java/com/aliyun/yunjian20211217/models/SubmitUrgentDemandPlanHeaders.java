// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class SubmitUrgentDemandPlanHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>262940</p>
     */
    @NameInMap("Yun-User-Id")
    public String yunUserId;

    public static SubmitUrgentDemandPlanHeaders build(java.util.Map<String, ?> map) throws Exception {
        SubmitUrgentDemandPlanHeaders self = new SubmitUrgentDemandPlanHeaders();
        return TeaModel.build(map, self);
    }

    public SubmitUrgentDemandPlanHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SubmitUrgentDemandPlanHeaders setYunUserId(String yunUserId) {
        this.yunUserId = yunUserId;
        return this;
    }
    public String getYunUserId() {
        return this.yunUserId;
    }

}
