// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckResourcepackSlrRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    public static CheckResourcepackSlrRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourcepackSlrRequest self = new CheckResourcepackSlrRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourcepackSlrRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

}
