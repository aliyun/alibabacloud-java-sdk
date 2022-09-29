// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDownstreamPbcResponseBody extends TeaModel {
    @NameInMap("result")
    public PbcUpDownstreamResult result;

    @NameInMap("rquestId")
    public String rquestId;

    public static ListDownstreamPbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDownstreamPbcResponseBody self = new ListDownstreamPbcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDownstreamPbcResponseBody setResult(PbcUpDownstreamResult result) {
        this.result = result;
        return this;
    }
    public PbcUpDownstreamResult getResult() {
        return this.result;
    }

    public ListDownstreamPbcResponseBody setRquestId(String rquestId) {
        this.rquestId = rquestId;
        return this;
    }
    public String getRquestId() {
        return this.rquestId;
    }

}
