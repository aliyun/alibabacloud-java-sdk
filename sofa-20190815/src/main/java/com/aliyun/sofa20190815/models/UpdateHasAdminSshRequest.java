// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasAdminSshRequest extends TeaModel {
    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("Id")
    public String id;

    public static UpdateHasAdminSshRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasAdminSshRequest self = new UpdateHasAdminSshRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasAdminSshRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasAdminSshRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
