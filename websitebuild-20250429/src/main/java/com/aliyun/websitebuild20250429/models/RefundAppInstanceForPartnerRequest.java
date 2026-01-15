// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RefundAppInstanceForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("RefundReason")
    public String refundReason;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RefundAppInstanceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundAppInstanceForPartnerRequest self = new RefundAppInstanceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public RefundAppInstanceForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefundAppInstanceForPartnerRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public RefundAppInstanceForPartnerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
