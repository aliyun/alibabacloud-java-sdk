// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetResourceControlEventRequest extends TeaModel {
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
    public java.util.List<String> eventIdList;

    public static GetResourceControlEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceControlEventRequest self = new GetResourceControlEventRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceControlEventRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public GetResourceControlEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetResourceControlEventRequest setEventIdList(java.util.List<String> eventIdList) {
        this.eventIdList = eventIdList;
        return this;
    }
    public java.util.List<String> getEventIdList() {
        return this.eventIdList;
    }

}
