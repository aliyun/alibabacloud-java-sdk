// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class QueryAppInfoBySchemeRequest extends TeaModel {
    @NameInMap("schemeCode")
    public String schemeCode;

    public static QueryAppInfoBySchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInfoBySchemeRequest self = new QueryAppInfoBySchemeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppInfoBySchemeRequest setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
        return this;
    }
    public String getSchemeCode() {
        return this.schemeCode;
    }

}
