// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSchemeTaskConfigResponseBody extends TeaModel {
    /**
     * <p>Result code. <strong>200</strong> means success.</p>
     * <blockquote>
     * <p>Any other value means failure. The caller can use this field to identify the cause.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response data. See the additional notes below.</p>
     */
    @NameInMap("Data")
    public GetSchemeTaskConfigResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Error details if the request failed. Returns successful if the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Use this field to check the result: true means success, false or null means failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetSchemeTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSchemeTaskConfigResponseBody self = new GetSchemeTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSchemeTaskConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSchemeTaskConfigResponseBody setData(GetSchemeTaskConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSchemeTaskConfigResponseBodyData getData() {
        return this.data;
    }

    public GetSchemeTaskConfigResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSchemeTaskConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSchemeTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSchemeTaskConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests extends TeaModel {
        /**
         * <p>Type of the value</p>
         * <ul>
         * <li><p>0: String</p>
         * </li>
         * <li><p>1: Number</p>
         * </li>
         * <li><p>2: List (use list type for all parameter values when using =)</p>
         * </li>
         * <li><p>3: Date</p>
         * </li>
         * <li><p>4: List_Json</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataType")
        public Integer dataType;

        /**
         * <p>List of on-the-fly recording data</p>
         */
        @NameInMap("ListObject")
        public java.util.List<?> listObject;

        /**
         * <p>Check item name</p>
         * 
         * <strong>example:</strong>
         * <p>callStartTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Operator</p>
         * <ul>
         * <li><p>1: ==</p>
         * </li>
         * <li><p>2: &gt;</p>
         * </li>
         * <li><p>3: &lt;</p>
         * </li>
         * <li><p>4: range</p>
         * </li>
         * <li><p>5: &gt;=</p>
         * </li>
         * <li><p>6: &lt;=</p>
         * </li>
         * <li><p>7: !=</p>
         * </li>
         * <li><p>8: null</p>
         * </li>
         * <li><p>9: not null</p>
         * </li>
         * <li><p>10: contains</p>
         * </li>
         * <li><p>11: does not contain</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Symbol")
        public Integer symbol;

        /**
         * <p>Matching value for on-the-fly recording data</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;start\&quot;:\&quot;2022-09-01 00:00:00\&quot;,\&quot;end\&quot;:\&quot;2022-09-30 00:00:00\&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests build(java.util.Map<String, ?> map) throws Exception {
            GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests self = new GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests();
            return TeaModel.build(map, self);
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests setListObject(java.util.List<?> listObject) {
            this.listObject = listObject;
            return this;
        }
        public java.util.List<?> getListObject() {
            return this.listObject;
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests setSymbol(Integer symbol) {
            this.symbol = symbol;
            return this;
        }
        public Integer getSymbol() {
            return this.symbol;
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs extends TeaModel {
        /**
         * <p>Parameter matching configurations for on-the-fly recording</p>
         */
        @NameInMap("AssignConfigContests")
        public java.util.List<GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests> assignConfigContests;

        public static GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs self = new GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs();
            return TeaModel.build(map, self);
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs setAssignConfigContests(java.util.List<GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests> assignConfigContests) {
            this.assignConfigContests = assignConfigContests;
            return this;
        }
        public java.util.List<GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigsAssignConfigContests> getAssignConfigContests() {
            return this.assignConfigContests;
        }

    }

    public static class GetSchemeTaskConfigResponseBodyDataDataConfig extends TeaModel {
        /**
         * <p>Data screening items for on-the-fly recording</p>
         */
        @NameInMap("AssignConfigs")
        public java.util.List<GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs> assignConfigs;

        /**
         * <p>Dataset task. Manage datasets.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("DataSets")
        public String dataSets;

        /**
         * <p>Index number</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>JSON text for filtering conditions used in secondary quality inspection. For details, see the request parameters of the GetResult API.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ResultParam")
        public String resultParam;

        public static GetSchemeTaskConfigResponseBodyDataDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetSchemeTaskConfigResponseBodyDataDataConfig self = new GetSchemeTaskConfigResponseBodyDataDataConfig();
            return TeaModel.build(map, self);
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfig setAssignConfigs(java.util.List<GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs> assignConfigs) {
            this.assignConfigs = assignConfigs;
            return this;
        }
        public java.util.List<GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs> getAssignConfigs() {
            return this.assignConfigs;
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfig setDataSets(String dataSets) {
            this.dataSets = dataSets;
            return this;
        }
        public String getDataSets() {
            return this.dataSets;
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfig setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public GetSchemeTaskConfigResponseBodyDataDataConfig setResultParam(String resultParam) {
            this.resultParam = resultParam;
            return this;
        }
        public String getResultParam() {
            return this.resultParam;
        }

    }

    public static class GetSchemeTaskConfigResponseBodyDataSchemeList extends TeaModel {
        /**
         * <p>Quality inspection scheme name</p>
         * 
         * <strong>example:</strong>
         * <p>质检方案B</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Quality inspection scheme ID</p>
         * 
         * <strong>example:</strong>
         * <p>158</p>
         */
        @NameInMap("SchemeId")
        public Long schemeId;

        public static GetSchemeTaskConfigResponseBodyDataSchemeList build(java.util.Map<String, ?> map) throws Exception {
            GetSchemeTaskConfigResponseBodyDataSchemeList self = new GetSchemeTaskConfigResponseBodyDataSchemeList();
            return TeaModel.build(map, self);
        }

        public GetSchemeTaskConfigResponseBodyDataSchemeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSchemeTaskConfigResponseBodyDataSchemeList setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

    }

    public static class GetSchemeTaskConfigResponseBodyData extends TeaModel {
        /**
         * <p>Task priority:</p>
         * <ul>
         * <li><p>0 (low)</p>
         * </li>
         * <li><p>1 (medium)</p>
         * </li>
         * <li><p>2 (high)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AsrTaskPriority")
        public Integer asrTaskPriority;

        /**
         * <p>Assignment type</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssignType")
        public Integer assignType;

        /**
         * <p>Data configuration</p>
         */
        @NameInMap("DataConfig")
        public GetSchemeTaskConfigResponseBodyDataDataConfig dataConfig;

        /**
         * <p>Quality inspection task ID</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Manual review</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ManualReview")
        public Integer manualReview;

        /**
         * <p>Language model ID</p>
         * 
         * <strong>example:</strong>
         * <p>cdae396590b*****ec40f3476e274fc</p>
         */
        @NameInMap("ModeCustomizationId")
        public String modeCustomizationId;

        /**
         * <p>Language model name</p>
         * 
         * <strong>example:</strong>
         * <p>自定义模型</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>Quality inspection task name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Quality inspection scheme IDs</p>
         */
        @NameInMap("SchemeIdList")
        public java.util.List<Long> schemeIdList;

        /**
         * <p>Quality inspection schemes</p>
         */
        @NameInMap("SchemeList")
        public java.util.List<GetSchemeTaskConfigResponseBodyDataSchemeList> schemeList;

        /**
         * <p>Quality inspection task ID</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SchemeTaskConfigId")
        public Long schemeTaskConfigId;

        /**
         * <p>Quality inspection result type:</p>
         * <ul>
         * <li><p>1: offline voice</p>
         * </li>
         * <li><p>2: offline text</p>
         * </li>
         * <li><p>3: real-time voice</p>
         * </li>
         * <li><p>4: real-time text</p>
         * </li>
         * <li><p>5: contact center secondary quality inspection</p>
         * </li>
         * <li><p>51: call center voice secondary quality inspection</p>
         * </li>
         * <li><p>52: call center text secondary quality inspection</p>
         * </li>
         * <li><p>11: dataset voice</p>
         * </li>
         * <li><p>12: dataset text</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SourceDataType")
        public String sourceDataType;

        /**
         * <p>Enable status. Valid values: 0 (disabled) or 1 (enabled)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetSchemeTaskConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSchemeTaskConfigResponseBodyData self = new GetSchemeTaskConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSchemeTaskConfigResponseBodyData setAsrTaskPriority(Integer asrTaskPriority) {
            this.asrTaskPriority = asrTaskPriority;
            return this;
        }
        public Integer getAsrTaskPriority() {
            return this.asrTaskPriority;
        }

        public GetSchemeTaskConfigResponseBodyData setAssignType(Integer assignType) {
            this.assignType = assignType;
            return this;
        }
        public Integer getAssignType() {
            return this.assignType;
        }

        public GetSchemeTaskConfigResponseBodyData setDataConfig(GetSchemeTaskConfigResponseBodyDataDataConfig dataConfig) {
            this.dataConfig = dataConfig;
            return this;
        }
        public GetSchemeTaskConfigResponseBodyDataDataConfig getDataConfig() {
            return this.dataConfig;
        }

        public GetSchemeTaskConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSchemeTaskConfigResponseBodyData setManualReview(Integer manualReview) {
            this.manualReview = manualReview;
            return this;
        }
        public Integer getManualReview() {
            return this.manualReview;
        }

        public GetSchemeTaskConfigResponseBodyData setModeCustomizationId(String modeCustomizationId) {
            this.modeCustomizationId = modeCustomizationId;
            return this;
        }
        public String getModeCustomizationId() {
            return this.modeCustomizationId;
        }

        public GetSchemeTaskConfigResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetSchemeTaskConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSchemeTaskConfigResponseBodyData setSchemeIdList(java.util.List<Long> schemeIdList) {
            this.schemeIdList = schemeIdList;
            return this;
        }
        public java.util.List<Long> getSchemeIdList() {
            return this.schemeIdList;
        }

        public GetSchemeTaskConfigResponseBodyData setSchemeList(java.util.List<GetSchemeTaskConfigResponseBodyDataSchemeList> schemeList) {
            this.schemeList = schemeList;
            return this;
        }
        public java.util.List<GetSchemeTaskConfigResponseBodyDataSchemeList> getSchemeList() {
            return this.schemeList;
        }

        public GetSchemeTaskConfigResponseBodyData setSchemeTaskConfigId(Long schemeTaskConfigId) {
            this.schemeTaskConfigId = schemeTaskConfigId;
            return this;
        }
        public Long getSchemeTaskConfigId() {
            return this.schemeTaskConfigId;
        }

        public GetSchemeTaskConfigResponseBodyData setSourceDataType(String sourceDataType) {
            this.sourceDataType = sourceDataType;
            return this;
        }
        public String getSourceDataType() {
            return this.sourceDataType;
        }

        public GetSchemeTaskConfigResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
