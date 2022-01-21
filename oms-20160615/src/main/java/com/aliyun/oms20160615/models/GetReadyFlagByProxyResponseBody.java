// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetReadyFlagByProxyResponseBody extends TeaModel {
    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("Compressed")
    public Boolean compressed;

    @NameInMap("Data")
    public String data;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static GetReadyFlagByProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReadyFlagByProxyResponseBody self = new GetReadyFlagByProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReadyFlagByProxyResponseBody setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public GetReadyFlagByProxyResponseBody setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public GetReadyFlagByProxyResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetReadyFlagByProxyResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetReadyFlagByProxyResponseBody setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public GetReadyFlagByProxyResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetReadyFlagByProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
