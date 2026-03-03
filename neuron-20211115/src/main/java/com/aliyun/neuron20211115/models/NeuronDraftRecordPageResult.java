// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronDraftRecordPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<NeuronDraftRecord> data;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("total")
    public Integer total;

    public static NeuronDraftRecordPageResult build(java.util.Map<String, ?> map) throws Exception {
        NeuronDraftRecordPageResult self = new NeuronDraftRecordPageResult();
        return TeaModel.build(map, self);
    }

    public NeuronDraftRecordPageResult setData(java.util.List<NeuronDraftRecord> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NeuronDraftRecord> getData() {
        return this.data;
    }

    public NeuronDraftRecordPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NeuronDraftRecordPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
