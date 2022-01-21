// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutMeasureDataByProxyResponseBody extends TeaModel {
    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("RequestId")
    public String requestId;

    public static PutMeasureDataByProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureDataByProxyResponseBody self = new PutMeasureDataByProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public PutMeasureDataByProxyResponseBody setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public PutMeasureDataByProxyResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PutMeasureDataByProxyResponseBody setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public PutMeasureDataByProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
