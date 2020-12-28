// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsTopicStatusResponseBodyData data;

    public static OnsTopicStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicStatusResponseBody self = new OnsTopicStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTopicStatusResponseBody setData(OnsTopicStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTopicStatusResponseBodyData getData() {
        return this.data;
    }

    public static class OnsTopicStatusResponseBodyData extends TeaModel {
        @NameInMap("Perm")
        public Integer perm;

        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static OnsTopicStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicStatusResponseBodyData self = new OnsTopicStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTopicStatusResponseBodyData setPerm(Integer perm) {
            this.perm = perm;
            return this;
        }
        public Integer getPerm() {
            return this.perm;
        }

        public OnsTopicStatusResponseBodyData setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public OnsTopicStatusResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
