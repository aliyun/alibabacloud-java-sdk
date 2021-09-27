// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateQuotaRequest extends TeaModel {
    // 资源配额名称
    @NameInMap("QuotaName")
    public String quotaName;

    // 资源配额类型
    @NameInMap("QuotaType")
    public String quotaType;

    // 资源配额参数
    @NameInMap("QuotaDetail")
    public QuotaDetail quotaDetail;

    public static UpdateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaRequest self = new UpdateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public UpdateQuotaRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public UpdateQuotaRequest setQuotaDetail(QuotaDetail quotaDetail) {
        this.quotaDetail = quotaDetail;
        return this;
    }
    public QuotaDetail getQuotaDetail() {
        return this.quotaDetail;
    }

}
