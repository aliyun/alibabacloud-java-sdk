// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDateSourceGenerationsRequest extends TeaModel {
    /**
     * <p>The data center where the data source is deployed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The valid state of the data source. Valid values: true and false. The default value of this parameter is true.</p>
     * <br>
     * <p>1.  true indicates that the generations that have not expired and of which the tasks have been executed are returned.</p>
     * <p>2.  false indicates that all generations are returned.</p>
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
