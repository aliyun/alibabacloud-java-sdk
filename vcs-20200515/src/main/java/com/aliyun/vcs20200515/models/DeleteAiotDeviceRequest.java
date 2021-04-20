// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotDeviceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteAiotDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotDeviceRequest self = new DeleteAiotDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAiotDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
