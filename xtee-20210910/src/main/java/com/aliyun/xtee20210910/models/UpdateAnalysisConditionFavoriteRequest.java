// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateAnalysisConditionFavoriteRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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

    /**
     * <p>The condition value.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;relationship\&quot;:\&quot;and\&quot;,\&quot;list\&quot;:[{\&quot;deepCount\&quot;:1,\&quot;left\&quot;:{\&quot;hasRightVariable\&quot;:true,\&quot;fieldType\&quot;:\&quot;INT\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;leftVariableType\&quot;:\&quot;NATIVE\&quot;,\&quot;name\&quot;:\&quot;DEtest222\&quot;,\&quot;operatorCode\&quot;:\&quot;equals\&quot;},\&quot;right\&quot;:{\&quot;rightVariableType\&quot;:\&quot;constant\&quot;,\&quot;name\&quot;:\&quot;9007199254\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;},\&quot;operatorCode\&quot;:\&quot;equals\&quot;}]}</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>The start time, in milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1752076800000</p>
     */
    @NameInMap("eventBeginTime")
    public Long eventBeginTime;

    /**
     * <p>The event code.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ajnoqe2016</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>The end time, in milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1753891199000</p>
     */
    @NameInMap("eventEndTime")
    public Long eventEndTime;

    /**
     * <p>The field name.</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("fieldName")
    public String fieldName;

    /**
     * <p>The field value.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("fieldValue")
    public String fieldValue;

    /**
     * <p>The primary key ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3144</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The condition name.</p>
     * 
     * <strong>example:</strong>
     * <p>查询条件1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The region code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li>BASIC: basic query.</li>
     * <li>ADVANCE: advanced query.</li>
     * <li>BATCH: batch query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("type")
    public String type;

    public static UpdateAnalysisConditionFavoriteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnalysisConditionFavoriteRequest self = new UpdateAnalysisConditionFavoriteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAnalysisConditionFavoriteRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAnalysisConditionFavoriteRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public UpdateAnalysisConditionFavoriteRequest setEventBeginTime(Long eventBeginTime) {
        this.eventBeginTime = eventBeginTime;
        return this;
    }
    public Long getEventBeginTime() {
        return this.eventBeginTime;
    }

    public UpdateAnalysisConditionFavoriteRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public UpdateAnalysisConditionFavoriteRequest setEventEndTime(Long eventEndTime) {
        this.eventEndTime = eventEndTime;
        return this;
    }
    public Long getEventEndTime() {
        return this.eventEndTime;
    }

    public UpdateAnalysisConditionFavoriteRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public UpdateAnalysisConditionFavoriteRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public UpdateAnalysisConditionFavoriteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAnalysisConditionFavoriteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAnalysisConditionFavoriteRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UpdateAnalysisConditionFavoriteRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
