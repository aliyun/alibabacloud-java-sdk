// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetDependApplicationsRequest extends TeaModel {
    // listApplicationsParam
    @NameInMap("getDependApplicationsParam")
    public GetDependApplicationsParam getDependApplicationsParam;

    public static GetDependApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDependApplicationsRequest self = new GetDependApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public GetDependApplicationsRequest setGetDependApplicationsParam(GetDependApplicationsParam getDependApplicationsParam) {
        this.getDependApplicationsParam = getDependApplicationsParam;
        return this;
    }
    public GetDependApplicationsParam getGetDependApplicationsParam() {
        return this.getDependApplicationsParam;
    }

}
