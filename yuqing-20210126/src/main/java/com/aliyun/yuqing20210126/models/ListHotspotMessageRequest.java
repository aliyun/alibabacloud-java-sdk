// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ListHotspotMessageRequest extends TeaModel {
    @NameInMap("hotspotSearchCondition")
    public HotspotSearchCondition hotspotSearchCondition;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teamHashId")
    public String teamHashId;

    public static ListHotspotMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotspotMessageRequest self = new ListHotspotMessageRequest();
        return TeaModel.build(map, self);
    }

    public ListHotspotMessageRequest setHotspotSearchCondition(HotspotSearchCondition hotspotSearchCondition) {
        this.hotspotSearchCondition = hotspotSearchCondition;
        return this;
    }
    public HotspotSearchCondition getHotspotSearchCondition() {
        return this.hotspotSearchCondition;
    }

    public ListHotspotMessageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotspotMessageRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
