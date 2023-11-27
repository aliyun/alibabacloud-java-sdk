// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaIdName extends TeaModel {
    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("QuotaName")
    public String quotaName;

    public static QuotaIdName build(java.util.Map<String, ?> map) throws Exception {
        QuotaIdName self = new QuotaIdName();
        return TeaModel.build(map, self);
    }

    public QuotaIdName setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public QuotaIdName setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

}
