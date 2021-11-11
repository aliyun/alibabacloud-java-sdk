// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class PublishSdkRequest extends TeaModel {
    @NameInMap("taskId")
    public java.io.InputStream taskId;

    public static PublishSdkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishSdkRequest self = new PublishSdkRequest();
        return TeaModel.build(map, self);
    }

    public PublishSdkRequest setTaskId(java.io.InputStream taskId) {
        this.taskId = taskId;
        return this;
    }
    public java.io.InputStream getTaskId() {
        return this.taskId;
    }

}
