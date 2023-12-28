// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class SetQuotaResponseBody extends TeaModel {
    @NameInMap("Quota")
    public Integer quota;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uid")
    public String uid;

    public static SetQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetQuotaResponseBody self = new SetQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public SetQuotaResponseBody setQuota(Integer quota) {
        this.quota = quota;
        return this;
    }
    public Integer getQuota() {
        return this.quota;
    }

    public SetQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetQuotaResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
