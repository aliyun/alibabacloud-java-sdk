// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeUserCreditRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("YikeUserId")
    public String yikeUserId;

    public static GetYikeUserCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeUserCreditRequest self = new GetYikeUserCreditRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeUserCreditRequest setYikeUserId(String yikeUserId) {
        this.yikeUserId = yikeUserId;
        return this;
    }
    public String getYikeUserId() {
        return this.yikeUserId;
    }

}
