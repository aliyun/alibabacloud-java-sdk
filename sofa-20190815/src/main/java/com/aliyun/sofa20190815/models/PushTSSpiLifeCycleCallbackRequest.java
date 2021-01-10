// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushTSSpiLifeCycleCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static PushTSSpiLifeCycleCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        PushTSSpiLifeCycleCallbackRequest self = new PushTSSpiLifeCycleCallbackRequest();
        return TeaModel.build(map, self);
    }

    public PushTSSpiLifeCycleCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
