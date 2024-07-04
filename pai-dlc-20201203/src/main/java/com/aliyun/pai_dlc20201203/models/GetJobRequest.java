// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedDetail")
    public Boolean needDetail;

    public static GetJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobRequest self = new GetJobRequest();
        return TeaModel.build(map, self);
    }

    public GetJobRequest setNeedDetail(Boolean needDetail) {
        this.needDetail = needDetail;
        return this;
    }
    public Boolean getNeedDetail() {
        return this.needDetail;
    }

}
