// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainPartByProxyRequest extends TeaModel {
    @NameInMap("CompressEnable")
    public Boolean compressEnable;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("Part")
    public String part;

    public static GetDomainPartByProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainPartByProxyRequest self = new GetDomainPartByProxyRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainPartByProxyRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    public GetDomainPartByProxyRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDomainPartByProxyRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public GetDomainPartByProxyRequest setPart(String part) {
        this.part = part;
        return this;
    }
    public String getPart() {
        return this.part;
    }

}
