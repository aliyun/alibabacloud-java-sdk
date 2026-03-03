// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ComponentPageResult extends TeaModel {
    @NameInMap("list")
    public java.util.List<PdpComponent> list;

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

    public static ComponentPageResult build(java.util.Map<String, ?> map) throws Exception {
        ComponentPageResult self = new ComponentPageResult();
        return TeaModel.build(map, self);
    }

    public ComponentPageResult setList(java.util.List<PdpComponent> list) {
        this.list = list;
        return this;
    }
    public java.util.List<PdpComponent> getList() {
        return this.list;
    }

    public ComponentPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ComponentPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
