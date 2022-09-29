// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetGroupResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static GetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResponseBody self = new GetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupResponseBody setData(GetGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGroupResponseBodyData getData() {
        return this.data;
    }

    public GetGroupResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGroupResponseBodyData extends TeaModel {
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("CampaignId")
        public String campaignId;

        @NameInMap("Column")
        public String column;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Filter")
        public String filter;

        @NameInMap("History")
        public String history;

        @NameInMap("Id")
        public String id;

        @NameInMap("InferenceJobId")
        public String inferenceJobId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public Boolean phoneNumber;

        @NameInMap("Project")
        public String project;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Source")
        public Integer source;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Table")
        public String table;

        @NameInMap("Text")
        public String text;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        @NameInMap("Uri")
        public String uri;

        public static GetGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGroupResponseBodyData self = new GetGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGroupResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public GetGroupResponseBodyData setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public GetGroupResponseBodyData setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public GetGroupResponseBodyData setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public GetGroupResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetGroupResponseBodyData setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public GetGroupResponseBodyData setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public GetGroupResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetGroupResponseBodyData setInferenceJobId(String inferenceJobId) {
            this.inferenceJobId = inferenceJobId;
            return this;
        }
        public String getInferenceJobId() {
            return this.inferenceJobId;
        }

        public GetGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGroupResponseBodyData setPhoneNumber(Boolean phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Boolean getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetGroupResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetGroupResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetGroupResponseBodyData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public GetGroupResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetGroupResponseBodyData setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public GetGroupResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetGroupResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public GetGroupResponseBodyData setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
