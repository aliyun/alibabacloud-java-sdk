// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetResourceControlEventShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>09C-2PpwIzkpx2zG2fuFrAH55CpJaTK</p>
     */
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("EventIdList")
    public String eventIdListShrink;

    public static GetResourceControlEventShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceControlEventShrinkRequest self = new GetResourceControlEventShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceControlEventShrinkRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public GetResourceControlEventShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetResourceControlEventShrinkRequest setEventIdListShrink(String eventIdListShrink) {
        this.eventIdListShrink = eventIdListShrink;
        return this;
    }
    public String getEventIdListShrink() {
        return this.eventIdListShrink;
    }

}
