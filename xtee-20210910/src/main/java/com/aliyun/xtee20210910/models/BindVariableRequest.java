// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class BindVariableRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
     * <p>API region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("apiRegionId")
    public String apiRegionId;

    /**
     * <p>API type</p>
     * 
     * <strong>example:</strong>
     * <p>SELF</p>
     */
    @NameInMap("apiType")
    public String apiType;

    /**
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Associated variable definition primary key ID</p>
     * 
     * <strong>example:</strong>
     * <p>2438</p>
     */
    @NameInMap("defineId")
    public String defineId;

    /**
     * <p>Variable definition IDs, can be multiple. If binding multiple IDs, separate them with commas</p>
     * 
     * <strong>example:</strong>
     * <p>1546, 1547</p>
     */
    @NameInMap("defineIds")
    public String defineIds;

    /**
     * <p>Description information.</p>
     * 
     * <strong>example:</strong>
     * <p>变量描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Event code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_agbzfi5134</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Exception value</p>
     * 
     * <strong>example:</strong>
     * <p>SYS_ERROR</p>
     */
    @NameInMap("exceptionValue")
    public String exceptionValue;

    /**
     * <p>Variable primary key ID</p>
     * 
     * <strong>example:</strong>
     * <p>106875</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Output field path</p>
     * 
     * <strong>example:</strong>
     * <p>BOOLEAN</p>
     */
    @NameInMap("outputField")
    public String outputField;

    /**
     * <p>Output type</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("outputType")
    public String outputType;

    /**
     * <p>Binding input parameter information</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;accountId&quot;:&quot;accountId&quot;,&quot;mobile&quot;:&quot;&quot;}</p>
     */
    @NameInMap("params")
    public String params;

    /**
     * <p>Event parameter mapping 2.0, either params or paramsList must not be empty. List, JSON structure</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;eventFieldName&quot;:&quot;accountId&quot;,&quot;required&quot;:false}]</p>
     */
    @NameInMap("paramsList")
    public String paramsList;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Variable source</p>
     * 
     * <strong>example:</strong>
     * <p>SAF</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>Title</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>变量title</p>
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
