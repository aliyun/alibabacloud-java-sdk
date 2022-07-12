// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTaskRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Request")
    public String request;

    public static SaveTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskRequest self = new SaveTaskRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SaveTaskRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

}
