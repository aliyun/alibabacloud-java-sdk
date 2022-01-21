// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainPartRequest extends TeaModel {
    @NameInMap("CompressEnable")
    public Boolean compressEnable;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("Part")
    public String part;

    public static GetDomainPartRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainPartRequest self = new GetDomainPartRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainPartRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    public GetDomainPartRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDomainPartRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public GetDomainPartRequest setPart(String part) {
        this.part = part;
        return this;
    }
    public String getPart() {
        return this.part;
    }

}
