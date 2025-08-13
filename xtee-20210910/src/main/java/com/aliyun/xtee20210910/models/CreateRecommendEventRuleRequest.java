// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRecommendEventRuleRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Event code.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ahqido8038</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Event name.</p>
     * 
     * <strong>example:</strong>
     * <p>用户昵称文本审核检测结果</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <p>Strategy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;100234\&quot;,\&quot;100235\&quot;]</p>
     */
    @NameInMap("recommendRuleIdsStr")
    public String recommendRuleIdsStr;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6770764</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static CreateRecommendEventRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendEventRuleRequest self = new CreateRecommendEventRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecommendEventRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateRecommendEventRuleRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public CreateRecommendEventRuleRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateRecommendEventRuleRequest setRecommendRuleIdsStr(String recommendRuleIdsStr) {
        this.recommendRuleIdsStr = recommendRuleIdsStr;
        return this;
    }
    public String getRecommendRuleIdsStr() {
        return this.recommendRuleIdsStr;
    }

    public CreateRecommendEventRuleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateRecommendEventRuleRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
