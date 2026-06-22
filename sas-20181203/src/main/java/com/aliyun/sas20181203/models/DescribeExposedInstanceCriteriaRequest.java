// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceCriteriaRequest extends TeaModel {
    /**
     * <p>The ID of the member account in the resource directory.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    /**
     * <p>The value of the query condition. Fuzzy match is supported.</p>
     * <blockquote>
     * <p>This parameter supports queries by asset name, asset ID, public IP address of the asset, private IP address of the asset, exposed component, exposed port, or exposed IP address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testInstanceName</p>
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
