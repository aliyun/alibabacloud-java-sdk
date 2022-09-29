// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListUpstreamPbcResponseBody extends TeaModel {
    @NameInMap("result")
    public PbcUpDownstreamResult result;

    @NameInMap("rquestId")
    public String rquestId;

    public static ListUpstreamPbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamPbcResponseBody self = new ListUpstreamPbcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpstreamPbcResponseBody setResult(PbcUpDownstreamResult result) {
        this.result = result;
        return this;
    }
    public PbcUpDownstreamResult getResult() {
        return this.result;
    }

    public ListUpstreamPbcResponseBody setRquestId(String rquestId) {
        this.rquestId = rquestId;
        return this;
    }
    public String getRquestId() {
        return this.rquestId;
    }

}
