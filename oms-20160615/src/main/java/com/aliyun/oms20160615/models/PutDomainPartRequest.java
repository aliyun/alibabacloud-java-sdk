// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutDomainPartRequest extends TeaModel {
    @NameInMap("Compressed")
    public Boolean compressed;

    @NameInMap("Data")
    public String data;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    public static PutDomainPartRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDomainPartRequest self = new PutDomainPartRequest();
        return TeaModel.build(map, self);
    }

    public PutDomainPartRequest setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public PutDomainPartRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PutDomainPartRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PutDomainPartRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}
