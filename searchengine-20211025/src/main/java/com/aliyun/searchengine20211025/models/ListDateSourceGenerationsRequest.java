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
     * <p>The valid status. Default value: true.</p>
     * <ol>
     * <li>true: Returns generations for which the task is completed and not expired.</li>
     * <li>false: Returns all generations.</li>
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
