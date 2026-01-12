// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class BatchCreateSvcMapBindRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MapIds")
    public java.util.List<Long> mapIds;

    @NameInMap("SvcId")
    public Long svcId;

    public static BatchCreateSvcMapBindRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSvcMapBindRequest self = new BatchCreateSvcMapBindRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateSvcMapBindRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public BatchCreateSvcMapBindRequest setMapIds(java.util.List<Long> mapIds) {
        this.mapIds = mapIds;
        return this;
    }
    public java.util.List<Long> getMapIds() {
        return this.mapIds;
    }

    public BatchCreateSvcMapBindRequest setSvcId(Long svcId) {
        this.svcId = svcId;
        return this;
    }
    public Long getSvcId() {
        return this.svcId;
    }

}
