// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileUploadLimitRequest extends TeaModel {
    /**
     * <p>The QPS limit on the files uploaded from the client. Valid values: 100 to 10000.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Limit")
    public Long limit;

    public static UpdateFileUploadLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileUploadLimitRequest self = new UpdateFileUploadLimitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileUploadLimitRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
