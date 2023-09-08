// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDateSourceGenerationsRequest extends TeaModel {
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>Obtains the data restoration version of a data source.</p>
     */
    @NameInMap("validStatus")
    public Boolean validStatus;

    public static ListDateSourceGenerationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDateSourceGenerationsRequest self = new ListDateSourceGenerationsRequest();
        return TeaModel.build(map, self);
    }

    public ListDateSourceGenerationsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListDateSourceGenerationsRequest setValidStatus(Boolean validStatus) {
        this.validStatus = validStatus;
        return this;
    }
    public Boolean getValidStatus() {
        return this.validStatus;
    }

}
