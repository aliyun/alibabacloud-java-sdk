// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseInstanceRequest extends TeaModel {
    /**
     * <p>business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    public static GetAppSupabaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseInstanceRequest self = new GetAppSupabaseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseInstanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
