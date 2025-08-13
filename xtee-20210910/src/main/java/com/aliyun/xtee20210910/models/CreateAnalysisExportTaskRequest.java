// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAnalysisExportTaskRequest extends TeaModel {
    /**
     * <p>Sets the language type for the request and response messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>Custom columns</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *                 {
     *                     &quot;fieldName&quot;: &quot;requestId&quot;,
     *                     &quot;fieldTitle&quot;: &quot;RequestId&quot;
     *                 },
     *                 {
     *                     &quot;fieldName&quot;: &quot;eventTime&quot;,
     *                     &quot;fieldTitle&quot;: &quot;事件时间&quot;
     *                 },
     *                 {
     *                     &quot;fieldName&quot;: &quot;accountId&quot;,
     *                     &quot;fieldTitle&quot;: &quot;账号&quot;
     *                 },
     *                 {
     *                     &quot;fieldName&quot;: &quot;deviceId&quot;,
     *                     &quot;fieldTitle&quot;: &quot;设备ID&quot;
     *                 },
     *                 {
     *                     &quot;fieldName&quot;: &quot;eventCode&quot;,
     *                     &quot;fieldTitle&quot;: &quot;事件编码&quot;
     *                 },
     *                 {
     *                     &quot;fieldName&quot;: &quot;ip&quot;,
     *                     &quot;fieldTitle&quot;: &quot;IP&quot;
     *                 },
     *                 {
     *                     &quot;fieldName&quot;: &quot;score&quot;,
     *                     &quot;fieldTitle&quot;: &quot;分值&quot;
     *                 },
     *                 {
     *                     &quot;fieldName&quot;: &quot;tags&quot;,
     *                     &quot;fieldTitle&quot;: &quot;标签&quot;
     *                 },
     *                 {
     *                     &quot;fieldName&quot;: &quot;DEtest222&quot;,
     *                     &quot;fieldTitle&quot;: &quot;测试222&quot;
     *                 }
     *             ]</p>
     */
    @NameInMap("columns")
    public String columns;

    /**
     * <p>Query expression</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *      &quot;fieldName&quot;: null, 
     *       &quot;fieldValue&quot;: null 
     *       }</p>
     */
    @NameInMap("conditions")
    public String conditions;

    /**
     * <p>Start time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1752076800000</p>
     */
    @NameInMap("eventBeginTime")
    public Long eventBeginTime;

    /**
     * <p>Event code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_afghcf6411</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1753891199000</p>
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
     * <p>20</p>
     */
    @NameInMap("fieldValue")
    public String fieldValue;

    /**
     * <p>File format, Excel, CSV</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CSV</p>
     */
    @NameInMap("fileFormat")
    public String fileFormat;

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
     * <p>Export scope: ALL: All, SELECT: Selected rows</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>Type, BASIC: Basic query, ADVANCE: Advanced query, BATCH: Batch query</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
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
