// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class QueryMotionShopVideoDetectResultRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static QueryMotionShopVideoDetectResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMotionShopVideoDetectResultRequest self = new QueryMotionShopVideoDetectResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryMotionShopVideoDetectResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryMotionShopVideoDetectResultRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
