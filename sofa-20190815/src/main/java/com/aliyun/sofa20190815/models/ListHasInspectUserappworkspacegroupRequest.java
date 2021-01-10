// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserappworkspacegroupRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ListHasInspectUserappworkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserappworkspacegroupRequest self = new ListHasInspectUserappworkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserappworkspacegroupRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public ListHasInspectUserappworkspacegroupRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
