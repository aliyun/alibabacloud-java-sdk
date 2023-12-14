// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class CancelCollectionRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorksId")
    public String worksId;

    public static CancelCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCollectionRequest self = new CancelCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CancelCollectionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CancelCollectionRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
