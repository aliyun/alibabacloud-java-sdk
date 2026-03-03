// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ComponentTemplatePageResult extends TeaModel {
    @NameInMap("list")
    public java.util.List<ComponentTemplate> list;

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

    public static ComponentTemplatePageResult build(java.util.Map<String, ?> map) throws Exception {
        ComponentTemplatePageResult self = new ComponentTemplatePageResult();
        return TeaModel.build(map, self);
    }

    public ComponentTemplatePageResult setList(java.util.List<ComponentTemplate> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ComponentTemplate> getList() {
        return this.list;
    }

    public ComponentTemplatePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ComponentTemplatePageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
