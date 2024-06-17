// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDateSourceGenerationsRequest extends TeaModel {
    /**
     * <p>The data center where the data source is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bj_vpc_domain_1</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The valid state of the data source. Valid values: true and false. The default value of this parameter is true.</p>
     * <ol>
     * <li>true indicates that the generations that have not expired and of which the tasks have been executed are returned.</li>
     * <li>false indicates that all generations are returned.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
