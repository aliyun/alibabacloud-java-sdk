// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileUploadLimitRequest extends TeaModel {
    /**
     * <p>Sets the QPS limit threshold for client file uploads. Valid values: 100 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Limit")
    public Long limit;

    public static CreateFileUploadLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileUploadLimitRequest self = new CreateFileUploadLimitRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileUploadLimitRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
