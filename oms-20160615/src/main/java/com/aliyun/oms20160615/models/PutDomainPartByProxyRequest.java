// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutDomainPartByProxyRequest extends TeaModel {
    @NameInMap("Compressed")
    public Boolean compressed;

    @NameInMap("Data")
    public String data;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    public static PutDomainPartByProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDomainPartByProxyRequest self = new PutDomainPartByProxyRequest();
        return TeaModel.build(map, self);
    }

    public PutDomainPartByProxyRequest setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public PutDomainPartByProxyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PutDomainPartByProxyRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PutDomainPartByProxyRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}
