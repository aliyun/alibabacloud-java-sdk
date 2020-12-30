// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeleteApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static DeleteApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationRequest self = new DeleteApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
