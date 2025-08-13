// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAnalysisConditionFavoriteRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>Condition value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;relationship&quot;:&quot;and&quot;,&quot;list&quot;:[{&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;hasRightVariable&quot;:true,&quot;fieldType&quot;:&quot;INT&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;leftVariableType&quot;:&quot;NATIVE&quot;,&quot;name&quot;:&quot;DEtest222&quot;,&quot;operatorCode&quot;:&quot;equals&quot;},&quot;right&quot;:{&quot;rightVariableType&quot;:&quot;constant&quot;,&quot;name&quot;:&quot;11&quot;,&quot;functionName&quot;:&quot;&quot;},&quot;operatorCode&quot;:&quot;equals&quot;}]}</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>Start time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1751299200000</p>
     */
    @NameInMap("eventBeginTime")
    public Long eventBeginTime;

    /**
     * <p>Event codes, separated by commas</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;de_ahqhsw7665&quot;,&quot;de_agbzfi5134&quot;]</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1753372799000</p>
     */
    @NameInMap("eventEndTime")
    public Long eventEndTime;

    /**
     * <p>Field name</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("fieldName")
    public String fieldName;

    /**
     * <p>Field value</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("fieldValue")
    public String fieldValue;

    /**
     * <p>Condition favorite name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>条件一</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Query type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateAnalysisConditionFavoriteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnalysisConditionFavoriteRequest self = new CreateAnalysisConditionFavoriteRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnalysisConditionFavoriteRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAnalysisConditionFavoriteRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public CreateAnalysisConditionFavoriteRequest setEventBeginTime(Long eventBeginTime) {
        this.eventBeginTime = eventBeginTime;
        return this;
    }
    public Long getEventBeginTime() {
        return this.eventBeginTime;
    }

    public CreateAnalysisConditionFavoriteRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public CreateAnalysisConditionFavoriteRequest setEventEndTime(Long eventEndTime) {
        this.eventEndTime = eventEndTime;
        return this;
    }
    public Long getEventEndTime() {
        return this.eventEndTime;
    }

    public CreateAnalysisConditionFavoriteRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public CreateAnalysisConditionFavoriteRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public CreateAnalysisConditionFavoriteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAnalysisConditionFavoriteRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateAnalysisConditionFavoriteRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
