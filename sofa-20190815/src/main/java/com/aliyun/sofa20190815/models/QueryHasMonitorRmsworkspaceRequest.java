// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasMonitorRmsworkspaceRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasMonitorRmsworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasMonitorRmsworkspaceRequest self = new QueryHasMonitorRmsworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasMonitorRmsworkspaceRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public QueryHasMonitorRmsworkspaceRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
