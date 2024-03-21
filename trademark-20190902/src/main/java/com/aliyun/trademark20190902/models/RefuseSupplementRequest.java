// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class RefuseSupplementRequest extends TeaModel {
    @NameInMap("SupplementId")
    public Long supplementId;

    public static RefuseSupplementRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseSupplementRequest self = new RefuseSupplementRequest();
        return TeaModel.build(map, self);
    }

    public RefuseSupplementRequest setSupplementId(Long supplementId) {
        this.supplementId = supplementId;
        return this;
    }
    public Long getSupplementId() {
        return this.supplementId;
    }

}
