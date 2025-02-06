// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSchemeTaskConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public ListSchemeTaskConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("LastDataId")
    public String lastDataId;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public ListSchemeTaskConfigResponseBodyMessages messages;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>4B0A8DCD-0DDF-5E80-8B9C-0A2F68B3403B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCountId")
    public String resultCountId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSchemeTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchemeTaskConfigResponseBody self = new ListSchemeTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchemeTaskConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSchemeTaskConfigResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListSchemeTaskConfigResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSchemeTaskConfigResponseBody setData(ListSchemeTaskConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSchemeTaskConfigResponseBodyData getData() {
        return this.data;
    }

    public ListSchemeTaskConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSchemeTaskConfigResponseBody setLastDataId(String lastDataId) {
        this.lastDataId = lastDataId;
        return this;
    }
    public String getLastDataId() {
        return this.lastDataId;
    }

    public ListSchemeTaskConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSchemeTaskConfigResponseBody setMessages(ListSchemeTaskConfigResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public ListSchemeTaskConfigResponseBodyMessages getMessages() {
        return this.messages;
    }

    public ListSchemeTaskConfigResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSchemeTaskConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSchemeTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchemeTaskConfigResponseBody setResultCountId(String resultCountId) {
        this.resultCountId = resultCountId;
        return this;
    }
    public String getResultCountId() {
        return this.resultCountId;
    }

    public ListSchemeTaskConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContestListObject extends TeaModel {
        @NameInMap("ListObject")
        public java.util.List<?> listObject;

        public static ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContestListObject build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContestListObject self = new ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContestListObject();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContestListObject setListObject(java.util.List<?> listObject) {
            this.listObject = listObject;
            return this;
        }
        public java.util.List<?> getListObject() {
            return this.listObject;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataType")
        public Integer dataType;

        @NameInMap("ListObject")
        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContestListObject listObject;

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

        public static ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest self = new ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest setListObject(ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContestListObject listObject) {
            this.listObject = listObject;
            return this;
        }
        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContestListObject getListObject() {
            return this.listObject;
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest setSymbol(Integer symbol) {
            this.symbol = symbol;
            return this;
        }
        public Integer getSymbol() {
            return this.symbol;
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContests extends TeaModel {
        @NameInMap("AssignConfigContest")
        public java.util.List<ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest> assignConfigContest;

        public static ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContests build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContests self = new ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContests();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContests setAssignConfigContest(java.util.List<ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest> assignConfigContest) {
            this.assignConfigContest = assignConfigContest;
            return this;
        }
        public java.util.List<ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContestsAssignConfigContest> getAssignConfigContest() {
            return this.assignConfigContest;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfig extends TeaModel {
        @NameInMap("AssignConfigContests")
        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContests assignConfigContests;

        public static ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfig self = new ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfig();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfig setAssignConfigContests(ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContests assignConfigContests) {
            this.assignConfigContests = assignConfigContests;
            return this;
        }
        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfigAssignConfigContests getAssignConfigContests() {
            return this.assignConfigContests;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigs extends TeaModel {
        @NameInMap("AssignConfig")
        public java.util.List<ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfig> assignConfig;

        public static ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigs self = new ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigs();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigs setAssignConfig(java.util.List<ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfig> assignConfig) {
            this.assignConfig = assignConfig;
            return this;
        }
        public java.util.List<ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigsAssignConfig> getAssignConfig() {
            return this.assignConfig;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataDataDataConfig extends TeaModel {
        @NameInMap("AssignConfigs")
        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigs assignConfigs;

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
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ResultParam")
        public String resultParam;

        public static ListSchemeTaskConfigResponseBodyDataDataDataConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataDataConfig self = new ListSchemeTaskConfigResponseBodyDataDataDataConfig();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfig setAssignConfigs(ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigs assignConfigs) {
            this.assignConfigs = assignConfigs;
            return this;
        }
        public ListSchemeTaskConfigResponseBodyDataDataDataConfigAssignConfigs getAssignConfigs() {
            return this.assignConfigs;
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfig setDataSets(String dataSets) {
            this.dataSets = dataSets;
            return this;
        }
        public String getDataSets() {
            return this.dataSets;
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfig setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListSchemeTaskConfigResponseBodyDataDataDataConfig setResultParam(String resultParam) {
            this.resultParam = resultParam;
            return this;
        }
        public String getResultParam() {
            return this.resultParam;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataDataSchemeIdList extends TeaModel {
        @NameInMap("SchemeIdList")
        public java.util.List<Long> schemeIdList;

        public static ListSchemeTaskConfigResponseBodyDataDataSchemeIdList build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataSchemeIdList self = new ListSchemeTaskConfigResponseBodyDataDataSchemeIdList();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataSchemeIdList setSchemeIdList(java.util.List<Long> schemeIdList) {
            this.schemeIdList = schemeIdList;
            return this;
        }
        public java.util.List<Long> getSchemeIdList() {
            return this.schemeIdList;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList extends TeaModel {
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>158</p>
         */
        @NameInMap("SchemeId")
        public Long schemeId;

        public static ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList self = new ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataDataSchemeList extends TeaModel {
        @NameInMap("SchemeList")
        public java.util.List<ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList> schemeList;

        public static ListSchemeTaskConfigResponseBodyDataDataSchemeList build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataDataSchemeList self = new ListSchemeTaskConfigResponseBodyDataDataSchemeList();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataDataSchemeList setSchemeList(java.util.List<ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList> schemeList) {
            this.schemeList = schemeList;
            return this;
        }
        public java.util.List<ListSchemeTaskConfigResponseBodyDataDataSchemeListSchemeList> getSchemeList() {
            return this.schemeList;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AsrTaskPriority")
        public Integer asrTaskPriority;

        @NameInMap("AsrVersion")
        public Integer asrVersion;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssignType")
        public Integer assignType;

        /**
         * <strong>example:</strong>
         * <p>1650418039000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateUser")
        public Long createUser;

        @NameInMap("DataConfig")
        public ListSchemeTaskConfigResponseBodyDataDataDataConfig dataConfig;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FinishRate")
        public Double finishRate;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ManualReview")
        public Integer manualReview;

        /**
         * <strong>example:</strong>
         * <p>cdae396590b*****ec40f3476e274fc</p>
         */
        @NameInMap("ModeCustomizationId")
        public String modeCustomizationId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NumberExecuting")
        public Integer numberExecuting;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NumberFail")
        public Integer numberFail;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("NumberSuccess")
        public Integer numberSuccess;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("NumberSum")
        public Integer numberSum;

        @NameInMap("SchemeIdList")
        public ListSchemeTaskConfigResponseBodyDataDataSchemeIdList schemeIdList;

        @NameInMap("SchemeList")
        public ListSchemeTaskConfigResponseBodyDataDataSchemeList schemeList;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SchemeTaskConfigId")
        public Long schemeTaskConfigId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SourceDataType")
        public Integer sourceDataType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>1650418039000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateUser")
        public Long updateUser;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserGroup")
        public String userGroup;

        /**
         * <strong>example:</strong>
         * <p>9f90b3efa2****0a49acec226eafc17</p>
         */
        @NameInMap("VocabId")
        public String vocabId;

        @NameInMap("VocabName")
        public String vocabName;

        public static ListSchemeTaskConfigResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyDataData self = new ListSchemeTaskConfigResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyDataData setAsrTaskPriority(Integer asrTaskPriority) {
            this.asrTaskPriority = asrTaskPriority;
            return this;
        }
        public Integer getAsrTaskPriority() {
            return this.asrTaskPriority;
        }

        public ListSchemeTaskConfigResponseBodyDataData setAsrVersion(Integer asrVersion) {
            this.asrVersion = asrVersion;
            return this;
        }
        public Integer getAsrVersion() {
            return this.asrVersion;
        }

        public ListSchemeTaskConfigResponseBodyDataData setAssignType(Integer assignType) {
            this.assignType = assignType;
            return this;
        }
        public Integer getAssignType() {
            return this.assignType;
        }

        public ListSchemeTaskConfigResponseBodyDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSchemeTaskConfigResponseBodyDataData setCreateUser(Long createUser) {
            this.createUser = createUser;
            return this;
        }
        public Long getCreateUser() {
            return this.createUser;
        }

        public ListSchemeTaskConfigResponseBodyDataData setDataConfig(ListSchemeTaskConfigResponseBodyDataDataDataConfig dataConfig) {
            this.dataConfig = dataConfig;
            return this;
        }
        public ListSchemeTaskConfigResponseBodyDataDataDataConfig getDataConfig() {
            return this.dataConfig;
        }

        public ListSchemeTaskConfigResponseBodyDataData setFinishRate(Double finishRate) {
            this.finishRate = finishRate;
            return this;
        }
        public Double getFinishRate() {
            return this.finishRate;
        }

        public ListSchemeTaskConfigResponseBodyDataData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSchemeTaskConfigResponseBodyDataData setManualReview(Integer manualReview) {
            this.manualReview = manualReview;
            return this;
        }
        public Integer getManualReview() {
            return this.manualReview;
        }

        public ListSchemeTaskConfigResponseBodyDataData setModeCustomizationId(String modeCustomizationId) {
            this.modeCustomizationId = modeCustomizationId;
            return this;
        }
        public String getModeCustomizationId() {
            return this.modeCustomizationId;
        }

        public ListSchemeTaskConfigResponseBodyDataData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListSchemeTaskConfigResponseBodyDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSchemeTaskConfigResponseBodyDataData setNumberExecuting(Integer numberExecuting) {
            this.numberExecuting = numberExecuting;
            return this;
        }
        public Integer getNumberExecuting() {
            return this.numberExecuting;
        }

        public ListSchemeTaskConfigResponseBodyDataData setNumberFail(Integer numberFail) {
            this.numberFail = numberFail;
            return this;
        }
        public Integer getNumberFail() {
            return this.numberFail;
        }

        public ListSchemeTaskConfigResponseBodyDataData setNumberSuccess(Integer numberSuccess) {
            this.numberSuccess = numberSuccess;
            return this;
        }
        public Integer getNumberSuccess() {
            return this.numberSuccess;
        }

        public ListSchemeTaskConfigResponseBodyDataData setNumberSum(Integer numberSum) {
            this.numberSum = numberSum;
            return this;
        }
        public Integer getNumberSum() {
            return this.numberSum;
        }

        public ListSchemeTaskConfigResponseBodyDataData setSchemeIdList(ListSchemeTaskConfigResponseBodyDataDataSchemeIdList schemeIdList) {
            this.schemeIdList = schemeIdList;
            return this;
        }
        public ListSchemeTaskConfigResponseBodyDataDataSchemeIdList getSchemeIdList() {
            return this.schemeIdList;
        }

        public ListSchemeTaskConfigResponseBodyDataData setSchemeList(ListSchemeTaskConfigResponseBodyDataDataSchemeList schemeList) {
            this.schemeList = schemeList;
            return this;
        }
        public ListSchemeTaskConfigResponseBodyDataDataSchemeList getSchemeList() {
            return this.schemeList;
        }

        public ListSchemeTaskConfigResponseBodyDataData setSchemeTaskConfigId(Long schemeTaskConfigId) {
            this.schemeTaskConfigId = schemeTaskConfigId;
            return this;
        }
        public Long getSchemeTaskConfigId() {
            return this.schemeTaskConfigId;
        }

        public ListSchemeTaskConfigResponseBodyDataData setSourceDataType(Integer sourceDataType) {
            this.sourceDataType = sourceDataType;
            return this;
        }
        public Integer getSourceDataType() {
            return this.sourceDataType;
        }

        public ListSchemeTaskConfigResponseBodyDataData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSchemeTaskConfigResponseBodyDataData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListSchemeTaskConfigResponseBodyDataData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSchemeTaskConfigResponseBodyDataData setUpdateUser(Long updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public Long getUpdateUser() {
            return this.updateUser;
        }

        public ListSchemeTaskConfigResponseBodyDataData setUserGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }
        public String getUserGroup() {
            return this.userGroup;
        }

        public ListSchemeTaskConfigResponseBodyDataData setVocabId(String vocabId) {
            this.vocabId = vocabId;
            return this;
        }
        public String getVocabId() {
            return this.vocabId;
        }

        public ListSchemeTaskConfigResponseBodyDataData setVocabName(String vocabName) {
            this.vocabName = vocabName;
            return this;
        }
        public String getVocabName() {
            return this.vocabName;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListSchemeTaskConfigResponseBodyDataData> data;

        public static ListSchemeTaskConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyData self = new ListSchemeTaskConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyData setData(java.util.List<ListSchemeTaskConfigResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSchemeTaskConfigResponseBodyDataData> getData() {
            return this.data;
        }

    }

    public static class ListSchemeTaskConfigResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static ListSchemeTaskConfigResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeTaskConfigResponseBodyMessages self = new ListSchemeTaskConfigResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public ListSchemeTaskConfigResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
