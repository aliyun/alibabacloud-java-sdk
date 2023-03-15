// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RemoveDependLibraryRequest extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    public static RemoveDependLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDependLibraryRequest self = new RemoveDependLibraryRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDependLibraryRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

}
