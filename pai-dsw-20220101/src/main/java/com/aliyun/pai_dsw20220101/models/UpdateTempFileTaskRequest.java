// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateTempFileTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtExpiredTime")
    public String gmtExpiredTime;

    public static UpdateTempFileTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTempFileTaskRequest self = new UpdateTempFileTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTempFileTaskRequest setGmtExpiredTime(String gmtExpiredTime) {
        this.gmtExpiredTime = gmtExpiredTime;
        return this;
    }
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

}
