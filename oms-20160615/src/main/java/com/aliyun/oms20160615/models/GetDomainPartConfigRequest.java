// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainPartConfigRequest extends TeaModel {
    @NameInMap("CompressEnable")
    public Boolean compressEnable;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("Part")
    public String part;

    public static GetDomainPartConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainPartConfigRequest self = new GetDomainPartConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainPartConfigRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    public GetDomainPartConfigRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDomainPartConfigRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public GetDomainPartConfigRequest setPart(String part) {
        this.part = part;
        return this;
    }
    public String getPart() {
        return this.part;
    }

}
