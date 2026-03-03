// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronProductScopePageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<NeuronProductScope> data;

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

    public static NeuronProductScopePageResult build(java.util.Map<String, ?> map) throws Exception {
        NeuronProductScopePageResult self = new NeuronProductScopePageResult();
        return TeaModel.build(map, self);
    }

    public NeuronProductScopePageResult setData(java.util.List<NeuronProductScope> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NeuronProductScope> getData() {
        return this.data;
    }

    public NeuronProductScopePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NeuronProductScopePageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
