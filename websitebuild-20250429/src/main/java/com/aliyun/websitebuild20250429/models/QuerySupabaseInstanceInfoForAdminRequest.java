// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QuerySupabaseInstanceInfoForAdminRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QuerySupabaseInstanceInfoForAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySupabaseInstanceInfoForAdminRequest self = new QuerySupabaseInstanceInfoForAdminRequest();
        return TeaModel.build(map, self);
    }

    public QuerySupabaseInstanceInfoForAdminRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QuerySupabaseInstanceInfoForAdminRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QuerySupabaseInstanceInfoForAdminRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
