// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckConfigRequest extends TeaModel {
    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22222f91-57af-4907-87f1-f9046da*****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource directory member account belongs.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static GetCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConfigRequest self = new GetCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public GetCheckConfigRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
