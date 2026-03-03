// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AddOrQuitPdpLaneForServiceGroupRequest extends TeaModel {
    @NameInMap("body")
    public AddOrQuitLaneCmd body;

    public static AddOrQuitPdpLaneForServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrQuitPdpLaneForServiceGroupRequest self = new AddOrQuitPdpLaneForServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddOrQuitPdpLaneForServiceGroupRequest setBody(AddOrQuitLaneCmd body) {
        this.body = body;
        return this;
    }
    public AddOrQuitLaneCmd getBody() {
        return this.body;
    }

}
