// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class PushResourcePlanHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Yun-User-Id")
    public String yunUserId;

    public static PushResourcePlanHeaders build(java.util.Map<String, ?> map) throws Exception {
        PushResourcePlanHeaders self = new PushResourcePlanHeaders();
        return TeaModel.build(map, self);
    }

    public PushResourcePlanHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PushResourcePlanHeaders setYunUserId(String yunUserId) {
        this.yunUserId = yunUserId;
        return this;
    }
    public String getYunUserId() {
        return this.yunUserId;
    }

}
