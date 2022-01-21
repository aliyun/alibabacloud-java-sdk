// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutReadyFlagResponseBody extends TeaModel {
    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("RequestId")
    public String requestId;

    public static PutReadyFlagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutReadyFlagResponseBody self = new PutReadyFlagResponseBody();
        return TeaModel.build(map, self);
    }

    public PutReadyFlagResponseBody setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public PutReadyFlagResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PutReadyFlagResponseBody setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public PutReadyFlagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
