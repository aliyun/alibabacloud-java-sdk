// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class CreateDemandPlanHeaders extends TeaModel {
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

    public static CreateDemandPlanHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandPlanHeaders self = new CreateDemandPlanHeaders();
        return TeaModel.build(map, self);
    }

    public CreateDemandPlanHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateDemandPlanHeaders setYunUserId(String yunUserId) {
        this.yunUserId = yunUserId;
        return this;
    }
    public String getYunUserId() {
        return this.yunUserId;
    }

}
