// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserappserviceRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ListHasInspectUserappserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserappserviceRequest self = new ListHasInspectUserappserviceRequest();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserappserviceRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public ListHasInspectUserappserviceRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
