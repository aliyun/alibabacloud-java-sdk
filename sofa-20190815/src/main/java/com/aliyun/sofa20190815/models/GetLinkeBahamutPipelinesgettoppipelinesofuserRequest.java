// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgettoppipelinesofuserRequest extends TeaModel {
    @NameInMap("TenantName")
    public String tenantName;

    public static GetLinkeBahamutPipelinesgettoppipelinesofuserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgettoppipelinesofuserRequest self = new GetLinkeBahamutPipelinesgettoppipelinesofuserRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
