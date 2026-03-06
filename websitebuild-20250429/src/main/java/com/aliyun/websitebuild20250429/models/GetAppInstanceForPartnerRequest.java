// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    public static GetAppInstanceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceForPartnerRequest self = new GetAppInstanceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
