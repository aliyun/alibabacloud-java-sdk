// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ListHotspotMessageResponseBody extends TeaModel {
    // 热搜结果信息列表数组
    @NameInMap("hotspotMessages")
    public java.util.List<YuqingHotspotMessage> hotspotMessages;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListHotspotMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotspotMessageResponseBody self = new ListHotspotMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotspotMessageResponseBody setHotspotMessages(java.util.List<YuqingHotspotMessage> hotspotMessages) {
        this.hotspotMessages = hotspotMessages;
        return this;
    }
    public java.util.List<YuqingHotspotMessage> getHotspotMessages() {
        return this.hotspotMessages;
    }

    public ListHotspotMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotspotMessageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
