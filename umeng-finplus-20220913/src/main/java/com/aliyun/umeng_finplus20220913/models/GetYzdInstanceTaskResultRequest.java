// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetYzdInstanceTaskResultRequest extends TeaModel {
    @NameInMap("body")
    public GetYzdInstanceTaskResultRequestBody body;

    public static GetYzdInstanceTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYzdInstanceTaskResultRequest self = new GetYzdInstanceTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetYzdInstanceTaskResultRequest setBody(GetYzdInstanceTaskResultRequestBody body) {
        this.body = body;
        return this;
    }
    public GetYzdInstanceTaskResultRequestBody getBody() {
        return this.body;
    }

    public static class GetYzdInstanceTaskResultRequestBody extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("rangeTimeEndTime")
        public String rangeTimeEndTime;

        @NameInMap("rangeTimeStartTime")
        public String rangeTimeStartTime;

        public static GetYzdInstanceTaskResultRequestBody build(java.util.Map<String, ?> map) throws Exception {
            GetYzdInstanceTaskResultRequestBody self = new GetYzdInstanceTaskResultRequestBody();
            return TeaModel.build(map, self);
        }

        public GetYzdInstanceTaskResultRequestBody setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetYzdInstanceTaskResultRequestBody setRangeTimeEndTime(String rangeTimeEndTime) {
            this.rangeTimeEndTime = rangeTimeEndTime;
            return this;
        }
        public String getRangeTimeEndTime() {
            return this.rangeTimeEndTime;
        }

        public GetYzdInstanceTaskResultRequestBody setRangeTimeStartTime(String rangeTimeStartTime) {
            this.rangeTimeStartTime = rangeTimeStartTime;
            return this;
        }
        public String getRangeTimeStartTime() {
            return this.rangeTimeStartTime;
        }

    }

}
