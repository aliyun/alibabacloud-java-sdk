// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetReadyFlagAlertConfigResponseBody extends TeaModel {
    @NameInMap("Compressed")
    public Boolean compressed;

    @NameInMap("Data")
    public String data;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("RequestId")
    public String requestId;

    public static GetReadyFlagAlertConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReadyFlagAlertConfigResponseBody self = new GetReadyFlagAlertConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReadyFlagAlertConfigResponseBody setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public GetReadyFlagAlertConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetReadyFlagAlertConfigResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetReadyFlagAlertConfigResponseBody setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public GetReadyFlagAlertConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
