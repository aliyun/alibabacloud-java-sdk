// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SyncAppInstanceForPartnerShrinkRequest extends TeaModel {
    /**
     * <p>The website instance object data.</p>
     */
    @NameInMap("AppInstance")
    public String appInstanceShrink;

    /**
     * <p>The type of the system event. Valid values: CREATE, UPDATE, and COMPLETE.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The employee ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>The source business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31104757</p>
     */
    @NameInMap("SourceBizId")
    public String sourceBizId;

    /**
     * <p>The source. Set this parameter to MARKET_CLOUD_DREAM.</p>
     * 
     * <strong>example:</strong>
     * <p>MARKET_CLOUD_DREAM</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static SyncAppInstanceForPartnerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAppInstanceForPartnerShrinkRequest self = new SyncAppInstanceForPartnerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncAppInstanceForPartnerShrinkRequest setAppInstanceShrink(String appInstanceShrink) {
        this.appInstanceShrink = appInstanceShrink;
        return this;
    }
    public String getAppInstanceShrink() {
        return this.appInstanceShrink;
    }

    public SyncAppInstanceForPartnerShrinkRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public SyncAppInstanceForPartnerShrinkRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SyncAppInstanceForPartnerShrinkRequest setSourceBizId(String sourceBizId) {
        this.sourceBizId = sourceBizId;
        return this;
    }
    public String getSourceBizId() {
        return this.sourceBizId;
    }

    public SyncAppInstanceForPartnerShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
