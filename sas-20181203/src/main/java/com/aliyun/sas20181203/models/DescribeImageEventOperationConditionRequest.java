// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationConditionRequest extends TeaModel {
    /**
     * <p>The alert type.</p>
     * <ul>
     * <li>Set the value to <strong>sensitiveFile</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sensitiveFile</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
