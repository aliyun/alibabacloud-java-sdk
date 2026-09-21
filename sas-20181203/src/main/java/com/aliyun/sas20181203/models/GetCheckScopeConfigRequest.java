// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckScopeConfigRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. This parameter is optional. If you do not specify this parameter, an ID is automatically generated.</p>
     * 
     * <strong>example:</strong>
     * <p>435f626256ebf564cf5ba966a539****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The ID of the member accounts in the resource directory.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static GetCheckScopeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckScopeConfigRequest self = new GetCheckScopeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckScopeConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetCheckScopeConfigRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
