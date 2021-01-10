// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasAdminConfigRequest extends TeaModel {
    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("Dummy")
    public String dummy;

    public static QueryHasAdminConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasAdminConfigRequest self = new QueryHasAdminConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasAdminConfigRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public QueryHasAdminConfigRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

}
