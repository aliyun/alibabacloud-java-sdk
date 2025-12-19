// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20250801152639000005</p>
     */
    @NameInMap("BizId")
    public String bizId;

    public static GetAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceRequest self = new GetAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
