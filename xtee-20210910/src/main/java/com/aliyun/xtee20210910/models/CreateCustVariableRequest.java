// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateCustVariableRequest extends TeaModel {
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
     * <p>{&quot;relationship&quot;:&quot;and&quot;,&quot;list&quot;:[{&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;hasRightVariable&quot;:true,&quot;fieldType&quot;:&quot;INT&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;leftVariableType&quot;:&quot;NATIVE&quot;,&quot;name&quot;:&quot;DEtest222&quot;,&quot;operatorCode&quot;:&quot;equals&quot;},&quot;right&quot;:{&quot;rightVariableType&quot;:&quot;constant&quot;,&quot;name&quot;:&quot;11&quot;,&quot;functionName&quot;:&quot;&quot;},&quot;operatorCode&quot;:&quot;equals&quot;}]}</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>The creation type.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>ip调用次数累计描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The event code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ahqhsw7665,de_agbzfi5134</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>The value type.</p>
     * 
     * <strong>example:</strong>
     * <p>EARLIEST</p>
     */
    @NameInMap("historyValueType")
    public String historyValueType;

    /**
     * <p>The cumulative object.</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("object")
    public String object;

    /**
     * <p>The return type of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("outputs")
    public String outputs;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The subject object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("subject")
    public String subject;

    /**
     * <p>The time slice type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CURRENT</p>
     */
    @NameInMap("timeType")
    public String timeType;

    /**
     * <p>The title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip调用次数累计</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The number of time units.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("twCount")
    public Integer twCount;

    /**
     * <p>The variable type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DISTINCT</p>
     */
    @NameInMap("velocityFC")
    public String velocityFC;

    /**
     * <p>The time slice unit.</p>
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
