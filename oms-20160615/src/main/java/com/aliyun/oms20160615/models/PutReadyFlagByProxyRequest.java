// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutReadyFlagByProxyRequest extends TeaModel {
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

    public static PutReadyFlagByProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        PutReadyFlagByProxyRequest self = new PutReadyFlagByProxyRequest();
        return TeaModel.build(map, self);
    }

    public PutReadyFlagByProxyRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public PutReadyFlagByProxyRequest setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public PutReadyFlagByProxyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PutReadyFlagByProxyRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PutReadyFlagByProxyRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}
