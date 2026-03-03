// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppMobiPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<NeuronAppMobi> data;

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

    public static NeuronAppMobiPageResult build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppMobiPageResult self = new NeuronAppMobiPageResult();
        return TeaModel.build(map, self);
    }

    public NeuronAppMobiPageResult setData(java.util.List<NeuronAppMobi> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NeuronAppMobi> getData() {
        return this.data;
    }

    public NeuronAppMobiPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NeuronAppMobiPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
