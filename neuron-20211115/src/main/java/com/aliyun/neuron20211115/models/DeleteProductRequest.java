// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeleteProductRequest extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    public static DeleteProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductRequest self = new DeleteProductRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

}
