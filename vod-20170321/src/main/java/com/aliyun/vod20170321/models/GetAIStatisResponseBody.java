// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIStatisResponseBody extends TeaModel {
    @NameInMap("AIStatisList")
    public java.util.List<GetAIStatisResponseBodyAIStatisList> AIStatisList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAIStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIStatisResponseBody self = new GetAIStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIStatisResponseBody setAIStatisList(java.util.List<GetAIStatisResponseBodyAIStatisList> AIStatisList) {
        this.AIStatisList = AIStatisList;
        return this;
    }
    public java.util.List<GetAIStatisResponseBodyAIStatisList> getAIStatisList() {
        return this.AIStatisList;
    }

    public GetAIStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAIStatisResponseBodyAIStatisList extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("StatTime")
        public String statTime;

        @NameInMap("StatTimeUTC")
        public String statTimeUTC;

        public static GetAIStatisResponseBodyAIStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetAIStatisResponseBodyAIStatisList self = new GetAIStatisResponseBodyAIStatisList();
            return TeaModel.build(map, self);
        }

        public GetAIStatisResponseBodyAIStatisList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetAIStatisResponseBodyAIStatisList setStatTime(String statTime) {
            this.statTime = statTime;
            return this;
        }
        public String getStatTime() {
            return this.statTime;
        }

        public GetAIStatisResponseBodyAIStatisList setStatTimeUTC(String statTimeUTC) {
            this.statTimeUTC = statTimeUTC;
            return this;
        }
        public String getStatTimeUTC() {
            return this.statTimeUTC;
        }

    }

}
