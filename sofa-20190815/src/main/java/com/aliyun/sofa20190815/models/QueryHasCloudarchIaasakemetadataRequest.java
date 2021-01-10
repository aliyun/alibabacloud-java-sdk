// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchIaasakemetadataRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasCloudarchIaasakemetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchIaasakemetadataRequest self = new QueryHasCloudarchIaasakemetadataRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchIaasakemetadataRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public QueryHasCloudarchIaasakemetadataRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
