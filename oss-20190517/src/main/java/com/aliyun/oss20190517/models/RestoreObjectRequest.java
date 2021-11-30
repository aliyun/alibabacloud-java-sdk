// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RestoreObjectRequest extends TeaModel {
    @NameInMap("body")
    public RestoreRequest body;

    public static RestoreObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreObjectRequest self = new RestoreObjectRequest();
        return TeaModel.build(map, self);
    }

    public RestoreObjectRequest setBody(RestoreRequest body) {
        this.body = body;
        return this;
    }
    public RestoreRequest getBody() {
        return this.body;
    }

}
