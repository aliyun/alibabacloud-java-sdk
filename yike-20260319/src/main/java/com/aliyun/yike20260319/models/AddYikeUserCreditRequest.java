// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class AddYikeUserCreditRequest extends TeaModel {
    /**
     * <p>The number of credits to increase. The value must be greater than 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Credit")
    public Integer credit;

    /**
     * <p>The sub-account user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("YikeUserId")
    public String yikeUserId;

    public static AddYikeUserCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        AddYikeUserCreditRequest self = new AddYikeUserCreditRequest();
        return TeaModel.build(map, self);
    }

    public AddYikeUserCreditRequest setCredit(Integer credit) {
        this.credit = credit;
        return this;
    }
    public Integer getCredit() {
        return this.credit;
    }

    public AddYikeUserCreditRequest setYikeUserId(String yikeUserId) {
        this.yikeUserId = yikeUserId;
        return this;
    }
    public String getYikeUserId() {
        return this.yikeUserId;
    }

}
