// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetLiveChannelHistoryResponseBody extends TeaModel {
    @NameInMap("LiveRecord")
    public java.util.List<LiveRecord> liveRecords;

    public static GetLiveChannelHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveChannelHistoryResponseBody self = new GetLiveChannelHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveChannelHistoryResponseBody setLiveRecords(java.util.List<LiveRecord> liveRecords) {
        this.liveRecords = liveRecords;
        return this;
    }
    public java.util.List<LiveRecord> getLiveRecords() {
        return this.liveRecords;
    }

}
