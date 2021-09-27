// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListQuotasResponseBody extends TeaModel {
    // 资源配额列表
    @NameInMap("Quotas")
    public java.util.List<Quota> quotas;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static ListQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasResponseBody self = new ListQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotasResponseBody setQuotas(java.util.List<Quota> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<Quota> getQuotas() {
        return this.quotas;
    }

    public ListQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
