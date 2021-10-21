// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CopyApplicantRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static CopyApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyApplicantRequest self = new CopyApplicantRequest();
        return TeaModel.build(map, self);
    }

    public CopyApplicantRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
