// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckBizAvailableRequest extends TeaModel {
    @NameInMap("Biz")
    public String biz;

    @NameInMap("Scene")
    public String scene;

    public static CheckBizAvailableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBizAvailableRequest self = new CheckBizAvailableRequest();
        return TeaModel.build(map, self);
    }

    public CheckBizAvailableRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public CheckBizAvailableRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
