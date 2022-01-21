// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetRelationRequest extends TeaModel {
    @NameInMap("RelationTime")
    public Long relationTime;

    @NameInMap("Uid")
    public Long uid;

    public static GetRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRelationRequest self = new GetRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetRelationRequest setRelationTime(Long relationTime) {
        this.relationTime = relationTime;
        return this;
    }
    public Long getRelationTime() {
        return this.relationTime;
    }

    public GetRelationRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
