// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OnlineAppInstanceRequest extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    public static OnlineAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineAppInstanceRequest self = new OnlineAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public OnlineAppInstanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
