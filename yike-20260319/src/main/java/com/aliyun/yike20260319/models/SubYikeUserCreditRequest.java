// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubYikeUserCreditRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Credit")
    public Integer credit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("YikeUserId")
    public String yikeUserId;

    public static SubYikeUserCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        SubYikeUserCreditRequest self = new SubYikeUserCreditRequest();
        return TeaModel.build(map, self);
    }

    public SubYikeUserCreditRequest setCredit(Integer credit) {
        this.credit = credit;
        return this;
    }
    public Integer getCredit() {
        return this.credit;
    }

    public SubYikeUserCreditRequest setYikeUserId(String yikeUserId) {
        this.yikeUserId = yikeUserId;
        return this;
    }
    public String getYikeUserId() {
        return this.yikeUserId;
    }

}
