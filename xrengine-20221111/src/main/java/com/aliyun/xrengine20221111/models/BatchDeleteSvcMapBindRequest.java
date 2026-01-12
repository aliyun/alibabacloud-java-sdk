// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class BatchDeleteSvcMapBindRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static BatchDeleteSvcMapBindRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteSvcMapBindRequest self = new BatchDeleteSvcMapBindRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteSvcMapBindRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public BatchDeleteSvcMapBindRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
