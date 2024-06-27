// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateAnalysisConditionFavoriteRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("condition")
    public String condition;

    @NameInMap("eventBeginTime")
    public Long eventBeginTime;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("eventEndTime")
    public Long eventEndTime;

    @NameInMap("fieldName")
    public String fieldName;

    @NameInMap("fieldValue")
    public String fieldValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

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
