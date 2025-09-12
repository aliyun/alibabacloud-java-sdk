// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetCrowdDatasetRequest extends TeaModel {
    @NameInMap("body")
    public GetCrowdDatasetRequestBody body;

    public static GetCrowdDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdDatasetRequest self = new GetCrowdDatasetRequest();
        return TeaModel.build(map, self);
    }

    public GetCrowdDatasetRequest setBody(GetCrowdDatasetRequestBody body) {
        this.body = body;
        return this;
    }
    public GetCrowdDatasetRequestBody getBody() {
        return this.body;
    }

    public static class GetCrowdDatasetRequestBody extends TeaModel {
        @NameInMap("appId")
        public String appId;

        public static GetCrowdDatasetRequestBody build(java.util.Map<String, ?> map) throws Exception {
            GetCrowdDatasetRequestBody self = new GetCrowdDatasetRequestBody();
            return TeaModel.build(map, self);
        }

        public GetCrowdDatasetRequestBody setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
