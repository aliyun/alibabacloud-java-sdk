// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class DeleteDomainPartResponseBody extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainPartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainPartResponseBody self = new DeleteDomainPartResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainPartResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DeleteDomainPartResponseBody setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public DeleteDomainPartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
