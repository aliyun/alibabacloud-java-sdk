// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskRequest extends TeaModel {
    /**
     * <p>请求参数。</p>
     */
    @NameInMap("body")
    public Object body;

    public static ModifyScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskRequest self = new ModifyScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskRequest setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
