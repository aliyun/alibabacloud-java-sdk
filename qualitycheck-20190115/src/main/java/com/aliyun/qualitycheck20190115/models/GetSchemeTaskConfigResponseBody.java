// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSchemeTaskConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSchemeTaskConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataType")
        public Integer dataType;

        @NameInMap("ListObject")
        public java.util.List<?> listObject;

        /**
         * <strong>example:</strong>
         * <p>callStartTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Symbol")
        public Integer symbol;

        /**
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
        @NameInMap("AssignConfigs")
        public java.util.List<GetSchemeTaskConfigResponseBodyDataDataConfigAssignConfigs> assignConfigs;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("DataSets")
        public String dataSets;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
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
        @NameInMap("Name")
        public String name;

        /**
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
        @NameInMap("AsrTaskPriority")
        public Integer asrTaskPriority;

        @NameInMap("AssignType")
        public Integer assignType;

        @NameInMap("DataConfig")
        public GetSchemeTaskConfigResponseBodyDataDataConfig dataConfig;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("ManualReview")
        public Integer manualReview;

        @NameInMap("ModeCustomizationId")
        public String modeCustomizationId;

        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("SchemeIdList")
        public java.util.List<Long> schemeIdList;

        @NameInMap("SchemeList")
        public java.util.List<GetSchemeTaskConfigResponseBodyDataSchemeList> schemeList;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SchemeTaskConfigId")
        public Long schemeTaskConfigId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SourceDataType")
        public String sourceDataType;

        /**
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
