// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseSecretsRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>v2_</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    public static GetAppSupabaseSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseSecretsRequest self = new GetAppSupabaseSecretsRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseSecretsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetAppSupabaseSecretsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
