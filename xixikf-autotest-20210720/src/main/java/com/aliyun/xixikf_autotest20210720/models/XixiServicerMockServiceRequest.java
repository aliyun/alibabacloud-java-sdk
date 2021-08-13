// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class XixiServicerMockServiceRequest extends TeaModel {
    @NameInMap("id")
    public String id;

    public static XixiServicerMockServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        XixiServicerMockServiceRequest self = new XixiServicerMockServiceRequest();
        return TeaModel.build(map, self);
    }

    public XixiServicerMockServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
