// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ProcessMessageRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static ProcessMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessMessageRequest self = new ProcessMessageRequest();
        return TeaModel.build(map, self);
    }

    public ProcessMessageRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
