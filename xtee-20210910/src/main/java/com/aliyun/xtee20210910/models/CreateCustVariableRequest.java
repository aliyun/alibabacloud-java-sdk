// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateCustVariableRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("condition")
    public String condition;

    @NameInMap("createType")
    public String createType;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("historyValueType")
    public String historyValueType;

    @NameInMap("object")
    public String object;

    @NameInMap("outputs")
    public String outputs;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("subject")
    public String subject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("timeType")
    public String timeType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    @NameInMap("twCount")
    public Integer twCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("velocityFC")
    public String velocityFC;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("velocityTW")
    public String velocityTW;

    public static CreateCustVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustVariableRequest self = new CreateCustVariableRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateCustVariableRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public CreateCustVariableRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateCustVariableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustVariableRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public CreateCustVariableRequest setHistoryValueType(String historyValueType) {
        this.historyValueType = historyValueType;
        return this;
    }
    public String getHistoryValueType() {
        return this.historyValueType;
    }

    public CreateCustVariableRequest setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public CreateCustVariableRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public CreateCustVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateCustVariableRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateCustVariableRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

    public CreateCustVariableRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateCustVariableRequest setTwCount(Integer twCount) {
        this.twCount = twCount;
        return this;
    }
    public Integer getTwCount() {
        return this.twCount;
    }

    public CreateCustVariableRequest setVelocityFC(String velocityFC) {
        this.velocityFC = velocityFC;
        return this;
    }
    public String getVelocityFC() {
        return this.velocityFC;
    }

    public CreateCustVariableRequest setVelocityTW(String velocityTW) {
        this.velocityTW = velocityTW;
        return this;
    }
    public String getVelocityTW() {
        return this.velocityTW;
    }

}
