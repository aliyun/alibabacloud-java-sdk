// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectAkeworkspacegroupRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ListHasInspectAkeworkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectAkeworkspacegroupRequest self = new ListHasInspectAkeworkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public ListHasInspectAkeworkspacegroupRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public ListHasInspectAkeworkspacegroupRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
