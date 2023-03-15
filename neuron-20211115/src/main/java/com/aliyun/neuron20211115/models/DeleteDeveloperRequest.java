// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeleteDeveloperRequest extends TeaModel {
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    public static DeleteDeveloperRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeveloperRequest self = new DeleteDeveloperRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeveloperRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

}
