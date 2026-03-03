// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronBriefAppVersionPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<NeuronBriefAppVersion> data;

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

    public static NeuronBriefAppVersionPageResult build(java.util.Map<String, ?> map) throws Exception {
        NeuronBriefAppVersionPageResult self = new NeuronBriefAppVersionPageResult();
        return TeaModel.build(map, self);
    }

    public NeuronBriefAppVersionPageResult setData(java.util.List<NeuronBriefAppVersion> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NeuronBriefAppVersion> getData() {
        return this.data;
    }

    public NeuronBriefAppVersionPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NeuronBriefAppVersionPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
