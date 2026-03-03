// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class OpenServiceGroupForServiceRequest extends TeaModel {
    @NameInMap("body")
    public OpenServiceGroupForServiceCmd body;

    public static OpenServiceGroupForServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceGroupForServiceRequest self = new OpenServiceGroupForServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenServiceGroupForServiceRequest setBody(OpenServiceGroupForServiceCmd body) {
        this.body = body;
        return this;
    }
    public OpenServiceGroupForServiceCmd getBody() {
        return this.body;
    }

}
