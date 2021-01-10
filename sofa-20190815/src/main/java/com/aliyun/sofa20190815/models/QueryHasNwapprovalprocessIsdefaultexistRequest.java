// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasNwapprovalprocessIsdefaultexistRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasNwapprovalprocessIsdefaultexistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasNwapprovalprocessIsdefaultexistRequest self = new QueryHasNwapprovalprocessIsdefaultexistRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasNwapprovalprocessIsdefaultexistRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public QueryHasNwapprovalprocessIsdefaultexistRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
