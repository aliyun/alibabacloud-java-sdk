// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class QueryEcoRelationRequest extends TeaModel {
    @NameInMap("RelationTime")
    public String relationTime;

    @NameInMap("Uid")
    public Long uid;

    public static QueryEcoRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEcoRelationRequest self = new QueryEcoRelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryEcoRelationRequest setRelationTime(String relationTime) {
        this.relationTime = relationTime;
        return this;
    }
    public String getRelationTime() {
        return this.relationTime;
    }

    public QueryEcoRelationRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
