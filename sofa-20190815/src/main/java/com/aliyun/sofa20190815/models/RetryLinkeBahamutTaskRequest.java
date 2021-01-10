// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutTaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static RetryLinkeBahamutTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutTaskRequest self = new RetryLinkeBahamutTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
