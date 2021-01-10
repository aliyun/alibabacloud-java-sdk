// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutFlowtaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static RetryLinkeBahamutFlowtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutFlowtaskRequest self = new RetryLinkeBahamutFlowtaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutFlowtaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
