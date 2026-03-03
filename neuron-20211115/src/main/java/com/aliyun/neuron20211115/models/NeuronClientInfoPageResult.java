// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronClientInfoPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<NeuronAppClientInfo> data;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("showApp")
    public Boolean showApp;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("total")
    public Integer total;

    public static NeuronClientInfoPageResult build(java.util.Map<String, ?> map) throws Exception {
        NeuronClientInfoPageResult self = new NeuronClientInfoPageResult();
        return TeaModel.build(map, self);
    }

    public NeuronClientInfoPageResult setData(java.util.List<NeuronAppClientInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NeuronAppClientInfo> getData() {
        return this.data;
    }

    public NeuronClientInfoPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NeuronClientInfoPageResult setShowApp(Boolean showApp) {
        this.showApp = showApp;
        return this;
    }
    public Boolean getShowApp() {
        return this.showApp;
    }

    public NeuronClientInfoPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
