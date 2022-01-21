// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainPartResponseBody extends TeaModel {
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

    public static GetDomainPartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainPartResponseBody self = new GetDomainPartResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainPartResponseBody setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public GetDomainPartResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetDomainPartResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDomainPartResponseBody setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public GetDomainPartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
