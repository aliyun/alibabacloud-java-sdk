// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceCriteriaRequest extends TeaModel {
    /**
     * <p>The ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the account ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    /**
     * <p>The value of the search condition. Fuzzy match is supported.</p>
     * <blockquote>
     * <p> You can specify the name, ID, public IP address, private IP address, component, port, or IP address of an exposed asset.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("Value")
    public String value;

    public static DescribeExposedInstanceCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceCriteriaRequest self = new DescribeExposedInstanceCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceCriteriaRequest setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeExposedInstanceCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
