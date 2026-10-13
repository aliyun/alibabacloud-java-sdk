// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListCustomScriptTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCustomScriptTemplatesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>暂无使用</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>暂无使用</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCustomScriptTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomScriptTemplatesResponseBody self = new ListCustomScriptTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomScriptTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomScriptTemplatesResponseBody setData(ListCustomScriptTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomScriptTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListCustomScriptTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCustomScriptTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomScriptTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomScriptTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomScriptTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomScriptTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomScriptTemplatesResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d31794e2a51f47d2901b4094d88311d7</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        /**
         * <strong>example:</strong>
         * <p>1741338619000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>这是一个大模型机器人</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>e49ad122-15a1-443a-a102-84a78a93be79</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;是否送达\&quot;,\&quot;description\&quot;:\&quot;购买的家电是否已经送达\&quot;,\&quot;valueList\&quot;:\&quot;[\\\&quot;是\\\&quot;,\\\&quot;否\\\&quot;]\&quot;},{\&quot;name\&quot;:\&quot;预约上门时间\&quot;,\&quot;description\&quot;:\&quot;收集客户期望的上门安装时间\&quot;,\&quot;valueList\&quot;:\&quot;[]\&quot;}]</p>
         */
        @NameInMap("LabelsJson")
        public String labelsJson;

        /**
         * <strong>example:</strong>
         * <p>model_002</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>测试场景</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>\n名称：安妮 \n身份：游戏推广员\n背景：通过电话向玩家宣传最新福利活动，确保每一位玩家都能及时掌握信息，享受游戏的乐趣。\n技能：作为游戏客服，向用户推荐限时游戏福利活动，强调福利亮点并告知参与流程。\n约束条件：你需要记住你是安妮，</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;小x&quot;,&quot;gender&quot;:&quot;男&quot;,&quot;age&quot;:18,&quot;role&quot;:&quot;游戏推广员&quot;,&quot;communicationStyle&quot;:[&quot;亲切&quot;],&quot;goals&quot;:&quot;你好&quot;,&quot;background&quot;:&quot;不是很好&quot;,&quot;openingPrompt&quot;:&quot;你好，我是xxx&quot;}</p>
         */
        @NameInMap("PromptJson")
        public String promptJson;

        /**
         * <strong>example:</strong>
         * <p>43972417-0657-452a-81c2-c59d8245a9b2</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        public static ListCustomScriptTemplatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCustomScriptTemplatesResponseBodyDataList self = new ListCustomScriptTemplatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCustomScriptTemplatesResponseBodyDataList setAgentProfileId(String agentProfileId) {
            this.agentProfileId = agentProfileId;
            return this;
        }
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setLabelsJson(String labelsJson) {
            this.labelsJson = labelsJson;
            return this;
        }
        public String getLabelsJson() {
            return this.labelsJson;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setPromptJson(String promptJson) {
            this.promptJson = promptJson;
            return this;
        }
        public String getPromptJson() {
            return this.promptJson;
        }

        public ListCustomScriptTemplatesResponseBodyDataList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

    }

    public static class ListCustomScriptTemplatesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCustomScriptTemplatesResponseBodyDataList> list;

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
         * <p>15</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCustomScriptTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomScriptTemplatesResponseBodyData self = new ListCustomScriptTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomScriptTemplatesResponseBodyData setList(java.util.List<ListCustomScriptTemplatesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCustomScriptTemplatesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCustomScriptTemplatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCustomScriptTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCustomScriptTemplatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
