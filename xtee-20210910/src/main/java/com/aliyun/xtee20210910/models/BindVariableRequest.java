// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class BindVariableRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("apiRegionId")
    public String apiRegionId;

    @NameInMap("apiType")
    public String apiType;

    @NameInMap("createType")
    public String createType;

    @NameInMap("defineId")
    public String defineId;

    @NameInMap("defineIds")
    public String defineIds;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("exceptionValue")
    public String exceptionValue;

    @NameInMap("id")
    public Long id;

    @NameInMap("outputField")
    public String outputField;

    @NameInMap("outputType")
    public String outputType;

    @NameInMap("params")
    public String params;

    @NameInMap("paramsList")
    public String paramsList;

    @NameInMap("regId")
    public String regId;

    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    public static BindVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        BindVariableRequest self = new BindVariableRequest();
        return TeaModel.build(map, self);
    }

    public BindVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BindVariableRequest setApiRegionId(String apiRegionId) {
        this.apiRegionId = apiRegionId;
        return this;
    }
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    public BindVariableRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public BindVariableRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public BindVariableRequest setDefineId(String defineId) {
        this.defineId = defineId;
        return this;
    }
    public String getDefineId() {
        return this.defineId;
    }

    public BindVariableRequest setDefineIds(String defineIds) {
        this.defineIds = defineIds;
        return this;
    }
    public String getDefineIds() {
        return this.defineIds;
    }

    public BindVariableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BindVariableRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public BindVariableRequest setExceptionValue(String exceptionValue) {
        this.exceptionValue = exceptionValue;
        return this;
    }
    public String getExceptionValue() {
        return this.exceptionValue;
    }

    public BindVariableRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BindVariableRequest setOutputField(String outputField) {
        this.outputField = outputField;
        return this;
    }
    public String getOutputField() {
        return this.outputField;
    }

    public BindVariableRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public BindVariableRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public BindVariableRequest setParamsList(String paramsList) {
        this.paramsList = paramsList;
        return this;
    }
    public String getParamsList() {
        return this.paramsList;
    }

    public BindVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public BindVariableRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public BindVariableRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
