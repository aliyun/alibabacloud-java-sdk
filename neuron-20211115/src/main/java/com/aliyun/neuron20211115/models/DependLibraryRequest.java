// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DependLibraryRequest extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    public static DependLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        DependLibraryRequest self = new DependLibraryRequest();
        return TeaModel.build(map, self);
    }

    public DependLibraryRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

}
