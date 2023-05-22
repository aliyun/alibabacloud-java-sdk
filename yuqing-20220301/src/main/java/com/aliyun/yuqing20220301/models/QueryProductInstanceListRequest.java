// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class QueryProductInstanceListRequest extends TeaModel {
    @NameInMap("appCode")
    public String appCode;

    @NameInMap("fromTime")
    public Long fromTime;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("tenantUid")
    public String tenantUid;

    @NameInMap("toTime")
    public Long toTime;

    public static QueryProductInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInstanceListRequest self = new QueryProductInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductInstanceListRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryProductInstanceListRequest setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public QueryProductInstanceListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductInstanceListRequest setTenantUid(String tenantUid) {
        this.tenantUid = tenantUid;
        return this;
    }
    public String getTenantUid() {
        return this.tenantUid;
    }

    public QueryProductInstanceListRequest setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

}
