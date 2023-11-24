// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationConditionRequest extends TeaModel {
    /**
     * <p>The alert type.</p>
     * <br>
     * <p>*   Set the value to **sensitiveFile**.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese.</p>
     * <p>*   **en**: English.</p>
     */
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
