// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcUpDownstreamResult extends TeaModel {
    @NameInMap("pbcItems")
    public java.util.List<PbcRelationItem> pbcItems;

    @NameInMap("requestId")
    public String requestId;

    public static PbcUpDownstreamResult build(java.util.Map<String, ?> map) throws Exception {
        PbcUpDownstreamResult self = new PbcUpDownstreamResult();
        return TeaModel.build(map, self);
    }

    public PbcUpDownstreamResult setPbcItems(java.util.List<PbcRelationItem> pbcItems) {
        this.pbcItems = pbcItems;
        return this;
    }
    public java.util.List<PbcRelationItem> getPbcItems() {
        return this.pbcItems;
    }

    public PbcUpDownstreamResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
