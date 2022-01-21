// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetReadyFlagAlertConfigRequest extends TeaModel {
    @NameInMap("CompressEnable")
    public Boolean compressEnable;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    public static GetReadyFlagAlertConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReadyFlagAlertConfigRequest self = new GetReadyFlagAlertConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetReadyFlagAlertConfigRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    public GetReadyFlagAlertConfigRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetReadyFlagAlertConfigRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}
