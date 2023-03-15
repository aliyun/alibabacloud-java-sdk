// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ProductUpdateCmd extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public Long id;

    @NameInMap("requestId")
    public String requestId;

    public static ProductUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        ProductUpdateCmd self = new ProductUpdateCmd();
        return TeaModel.build(map, self);
    }

    public ProductUpdateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ProductUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProductUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ProductUpdateCmd setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
