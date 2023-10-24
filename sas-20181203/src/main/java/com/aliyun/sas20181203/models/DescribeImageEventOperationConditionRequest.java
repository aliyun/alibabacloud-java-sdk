// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationConditionRequest extends TeaModel {
    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Lang")
    public String lang;

    public static DescribeImageEventOperationConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageEventOperationConditionRequest self = new DescribeImageEventOperationConditionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageEventOperationConditionRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeImageEventOperationConditionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
