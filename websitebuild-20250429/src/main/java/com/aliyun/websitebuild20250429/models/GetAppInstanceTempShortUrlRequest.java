// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceTempShortUrlRequest extends TeaModel {
    /**
     * <p>The business ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    public static GetAppInstanceTempShortUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceTempShortUrlRequest self = new GetAppInstanceTempShortUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceTempShortUrlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
