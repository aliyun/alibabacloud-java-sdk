// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitDWSTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public InitDWSTaskResponseBodyData data;

    public static InitDWSTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitDWSTaskResponseBody self = new InitDWSTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public InitDWSTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitDWSTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitDWSTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public InitDWSTaskResponseBody setData(InitDWSTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitDWSTaskResponseBodyData getData() {
        return this.data;
    }

    public static class InitDWSTaskResponseBodyData extends TeaModel {
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

        public static InitDWSTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitDWSTaskResponseBodyData self = new InitDWSTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitDWSTaskResponseBodyData setDstCategory(String dstCategory) {
            this.dstCategory = dstCategory;
            return this;
        }
        public String getDstCategory() {
            return this.dstCategory;
        }

        public InitDWSTaskResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public InitDWSTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InitDWSTaskResponseBodyData setLinkman(String linkman) {
            this.linkman = linkman;
            return this;
        }
        public String getLinkman() {
            return this.linkman;
        }

        public InitDWSTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InitDWSTaskResponseBodyData setScenarios(String scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public String getScenarios() {
            return this.scenarios;
        }

        public InitDWSTaskResponseBodyData setSrcCategory(String srcCategory) {
            this.srcCategory = srcCategory;
            return this;
        }
        public String getSrcCategory() {
            return this.srcCategory;
        }

        public InitDWSTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InitDWSTaskResponseBodyData setTaskParamJson(String taskParamJson) {
            this.taskParamJson = taskParamJson;
            return this;
        }
        public String getTaskParamJson() {
            return this.taskParamJson;
        }

    }

}
