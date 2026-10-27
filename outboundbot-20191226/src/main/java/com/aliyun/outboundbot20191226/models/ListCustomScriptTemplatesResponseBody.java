// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListCustomScriptTemplatesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListCustomScriptTemplatesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Not used.</p>
     * 
     * <strong>example:</strong>
     * <p>Not used</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The message returned by the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Not used.</p>
     * 
     * <strong>example:</strong>
     * <p>Not used</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
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
         * <p>The ID of the custom scenario template.</p>
         * 
         * <strong>example:</strong>
         * <p>d31794e2a51f47d2901b4094d88311d7</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1741338619000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the custom scenario template.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a large language model bot</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID to which the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>e49ad122-15a1-443a-a102-84a78a93be79</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The label description. The value is a string in JSON array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;Delivered\&quot;,\&quot;description\&quot;:\&quot;Whether the purchased home appliance has been delivered\&quot;,\&quot;valueList\&quot;:\&quot;[\\\&quot;Yes\\\&quot;,\\\&quot;No\\\&quot;]\&quot;},{\&quot;name\&quot;:\&quot;Appointment time for on-site service\&quot;,\&quot;description\&quot;:\&quot;Collect the customer\&quot;s expected on-site installation time\&quot;,\&quot;valueList\&quot;:\&quot;[]\&quot;}]</p>
         */
        @NameInMap("LabelsJson")
        public String labelsJson;

        /**
         * <p>The ID of the model used.</p>
         * 
         * <strong>example:</strong>
         * <p>model_002</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The name of the custom scenario template.</p>
         * 
         * <strong>example:</strong>
         * <p>Test scenario</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The prompt in professional mode.</p>
         * 
         * <strong>example:</strong>
         * <p>\nName: Annie \nRole: Game Promoter\nBackground: Promote the latest benefit events to players over the phone to ensure that every player stays informed and enjoys the game.\nSkills: As a game customer service representative, recommend time-limited game benefit events to users, highlight the benefits, and explain how to participate.\nConstraints: You must remember that you are Annie,</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The agent configuration. The value is a string in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Xiao X&quot;,&quot;gender&quot;:&quot;Male&quot;,&quot;age&quot;:18,&quot;role&quot;:&quot;Game Promoter&quot;,&quot;communicationStyle&quot;:[&quot;Friendly&quot;],&quot;goals&quot;:&quot;Hello&quot;,&quot;background&quot;:&quot;Not very good&quot;,&quot;openingPrompt&quot;:&quot;Hello, I am XXX&quot;}</p>
         */
        @NameInMap("PromptJson")
        public String promptJson;

        /**
         * <p>The ID of the scenario associated with the custom scenario template.</p>
         * 
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
        /**
         * <p>The list of custom scenario templates.</p>
         */
        @NameInMap("List")
        public java.util.List<ListCustomScriptTemplatesResponseBodyDataList> list;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of custom scenario templates.</p>
         * 
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
