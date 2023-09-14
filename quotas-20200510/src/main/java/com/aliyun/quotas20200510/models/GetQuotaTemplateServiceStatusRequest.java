// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaTemplateServiceStatusRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     */
    @NameInMap("ResourceDirectoryId")
    public String resourceDirectoryId;

    public static GetQuotaTemplateServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaTemplateServiceStatusRequest self = new GetQuotaTemplateServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaTemplateServiceStatusRequest setResourceDirectoryId(String resourceDirectoryId) {
        this.resourceDirectoryId = resourceDirectoryId;
        return this;
    }
    public String getResourceDirectoryId() {
        return this.resourceDirectoryId;
    }

}
