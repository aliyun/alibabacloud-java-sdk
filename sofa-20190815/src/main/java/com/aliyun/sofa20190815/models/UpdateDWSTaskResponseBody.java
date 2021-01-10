// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDWSTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public UpdateDWSTaskResponseBodyData data;

    public static UpdateDWSTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDWSTaskResponseBody self = new UpdateDWSTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDWSTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDWSTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDWSTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateDWSTaskResponseBody setData(UpdateDWSTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDWSTaskResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateDWSTaskResponseBodyData extends TeaModel {
        @NameInMap("DstCategory")
        public String dstCategory;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("Linkman")
        public String linkman;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scenarios")
        public String scenarios;

        @NameInMap("SrcCategory")
        public String srcCategory;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskParamJson")
        public String taskParamJson;

        public static UpdateDWSTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDWSTaskResponseBodyData self = new UpdateDWSTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDWSTaskResponseBodyData setDstCategory(String dstCategory) {
            this.dstCategory = dstCategory;
            return this;
        }
        public String getDstCategory() {
            return this.dstCategory;
        }

        public UpdateDWSTaskResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateDWSTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateDWSTaskResponseBodyData setLinkman(String linkman) {
            this.linkman = linkman;
            return this;
        }
        public String getLinkman() {
            return this.linkman;
        }

        public UpdateDWSTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDWSTaskResponseBodyData setScenarios(String scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public String getScenarios() {
            return this.scenarios;
        }

        public UpdateDWSTaskResponseBodyData setSrcCategory(String srcCategory) {
            this.srcCategory = srcCategory;
            return this;
        }
        public String getSrcCategory() {
            return this.srcCategory;
        }

        public UpdateDWSTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateDWSTaskResponseBodyData setTaskParamJson(String taskParamJson) {
            this.taskParamJson = taskParamJson;
            return this;
        }
        public String getTaskParamJson() {
            return this.taskParamJson;
        }

    }

}
