// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateCustVariableRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
     * 
     * <strong>example:</strong>
     * <p>{&quot;relationship&quot;:&quot;and&quot;,&quot;list&quot;:[{&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;hasRightVariable&quot;:true,&quot;fieldType&quot;:&quot;INT&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;leftVariableType&quot;:&quot;NATIVE&quot;,&quot;name&quot;:&quot;DEtest222&quot;,&quot;operatorCode&quot;:&quot;equals&quot;},&quot;right&quot;:{&quot;rightVariableType&quot;:&quot;constant&quot;,&quot;name&quot;:&quot;11&quot;,&quot;functionName&quot;:&quot;&quot;},&quot;operatorCode&quot;:&quot;equals&quot;}]}</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Description information.</p>
     * 
     * <strong>example:</strong>
     * <p>ip调用次数累计描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Event code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ahqhsw7665,de_agbzfi5134</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>Value type</p>
     * 
     * <strong>example:</strong>
     * <p>EARLIEST</p>
     */
    @NameInMap("historyValueType")
    public String historyValueType;

    /**
     * <p>Accumulative object</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("object")
    public String object;

    /**
     * <p>Variable return type</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("outputs")
    public String outputs;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Primary object</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("subject")
    public String subject;

    /**
     * <p>Time slice type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CURRENT</p>
     */
    @NameInMap("timeType")
    public String timeType;

    /**
     * <p>Title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip调用次数累计</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>Number of time units</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("twCount")
    public Integer twCount;

    /**
     * <p>Variable type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DISTINCT</p>
     */
    @NameInMap("velocityFC")
    public String velocityFC;

    /**
     * <p>Time slice unit</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY_1</p>
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
