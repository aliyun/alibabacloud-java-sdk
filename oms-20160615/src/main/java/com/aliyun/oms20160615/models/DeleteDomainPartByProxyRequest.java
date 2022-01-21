// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class DeleteDomainPartByProxyRequest extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("Part")
    public String part;

    public static DeleteDomainPartByProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainPartByProxyRequest self = new DeleteDomainPartByProxyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainPartByProxyRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DeleteDomainPartByProxyRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public DeleteDomainPartByProxyRequest setPart(String part) {
        this.part = part;
        return this;
    }
    public String getPart() {
        return this.part;
    }

}
