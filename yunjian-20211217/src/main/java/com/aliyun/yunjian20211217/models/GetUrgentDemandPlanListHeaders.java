// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandPlanListHeaders extends TeaModel {
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

    public static GetUrgentDemandPlanListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandPlanListHeaders self = new GetUrgentDemandPlanListHeaders();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandPlanListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUrgentDemandPlanListHeaders setYunUserId(String yunUserId) {
        this.yunUserId = yunUserId;
        return this;
    }
    public String getYunUserId() {
        return this.yunUserId;
    }

}
