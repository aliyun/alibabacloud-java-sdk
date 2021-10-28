// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryHitUserRequest extends TeaModel {
    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("UserId")
    public String userId;

    public static QueryHitUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHitUserRequest self = new QueryHitUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryHitUserRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryHitUserRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryHitUserRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public QueryHitUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
