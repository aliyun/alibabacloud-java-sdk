// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeliveryItemDetailSynHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Yun-User-Id")
    public String yunUserId;

    public static DeliveryItemDetailSynHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeliveryItemDetailSynHeaders self = new DeliveryItemDetailSynHeaders();
        return TeaModel.build(map, self);
    }

    public DeliveryItemDetailSynHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeliveryItemDetailSynHeaders setYunUserId(String yunUserId) {
        this.yunUserId = yunUserId;
        return this;
    }
    public String getYunUserId() {
        return this.yunUserId;
    }

}
