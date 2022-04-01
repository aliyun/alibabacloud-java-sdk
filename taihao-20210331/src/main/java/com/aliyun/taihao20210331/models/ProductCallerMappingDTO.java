// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ProductCallerMappingDTO extends TeaModel {
    // gmtCreate
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    // gmtModified
    @NameInMap("gmtModified")
    public Long gmtModified;

    // id
    @NameInMap("id")
    public Long id;

    // productCallerId
    @NameInMap("productCallerId")
    public String productCallerId;

    // productName
    @NameInMap("productName")
    public String productName;

    public static ProductCallerMappingDTO build(java.util.Map<String, ?> map) throws Exception {
        ProductCallerMappingDTO self = new ProductCallerMappingDTO();
        return TeaModel.build(map, self);
    }

    public ProductCallerMappingDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public ProductCallerMappingDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public ProductCallerMappingDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ProductCallerMappingDTO setProductCallerId(String productCallerId) {
        this.productCallerId = productCallerId;
        return this;
    }
    public String getProductCallerId() {
        return this.productCallerId;
    }

    public ProductCallerMappingDTO setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
