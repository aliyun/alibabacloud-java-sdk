// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAnalysisExportTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("columns")
    public String columns;

    @NameInMap("conditions")
    public String conditions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventBeginTime")
    public Long eventBeginTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventEndTime")
    public Long eventEndTime;

    @NameInMap("fieldName")
    public String fieldName;

    @NameInMap("fieldValue")
    public String fieldValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fileFormat")
    public String fileFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateAnalysisExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnalysisExportTaskRequest self = new CreateAnalysisExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnalysisExportTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAnalysisExportTaskRequest setColumns(String columns) {
        this.columns = columns;
        return this;
    }
    public String getColumns() {
        return this.columns;
    }

    public CreateAnalysisExportTaskRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public CreateAnalysisExportTaskRequest setEventBeginTime(Long eventBeginTime) {
        this.eventBeginTime = eventBeginTime;
        return this;
    }
    public Long getEventBeginTime() {
        return this.eventBeginTime;
    }

    public CreateAnalysisExportTaskRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public CreateAnalysisExportTaskRequest setEventEndTime(Long eventEndTime) {
        this.eventEndTime = eventEndTime;
        return this;
    }
    public Long getEventEndTime() {
        return this.eventEndTime;
    }

    public CreateAnalysisExportTaskRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public CreateAnalysisExportTaskRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public CreateAnalysisExportTaskRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public CreateAnalysisExportTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateAnalysisExportTaskRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateAnalysisExportTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
