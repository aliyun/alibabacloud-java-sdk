// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDetailRecordRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BatchNo")
    public String batchNo;

    @NameInMap("SaasId")
    public String saasId;

    public static QueryOutboundJobDetailRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDetailRecordRequest self = new QueryOutboundJobDetailRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDetailRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryOutboundJobDetailRecordRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public QueryOutboundJobDetailRecordRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

}
