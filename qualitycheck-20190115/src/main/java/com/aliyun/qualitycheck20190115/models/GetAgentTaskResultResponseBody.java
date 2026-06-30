// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAgentTaskResultResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetAgentTaskResultResponseBodyData data;

    /**
     * <p>The error message returned when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F190ADE9-619A-447D-84E3-7E241A5C428E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. You can use this field to determine whether the request was successful:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false/null</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetAgentTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentTaskResultResponseBody self = new GetAgentTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentTaskResultResponseBody setData(GetAgentTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetAgentTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentTaskResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAgentTaskResultResponseBodyDataResponseCustomerPromptResponse extends TeaModel {
        /**
         * <p>The result returned by the large language model.</p>
         * 
         * <strong>example:</strong>
         * <p>175/xl面料摸着很舒服,穿起来看着也挺修身的挺好的好衣服超好看,质量手感没得说一级棒,很满意的一次购物。</p>
         */
        @NameInMap("Text")
        public String text;

        public static GetAgentTaskResultResponseBodyDataResponseCustomerPromptResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyDataResponseCustomerPromptResponse self = new GetAgentTaskResultResponseBodyDataResponseCustomerPromptResponse();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyDataResponseCustomerPromptResponse setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList extends TeaModel {
        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sentences referenced in the reasoning.</p>
         */
        @NameInMap("OriginalUtterances")
        public java.util.List<Integer> originalUtterances;

        /**
         * <p>The reasoning for the judgment.</p>
         * 
         * <strong>example:</strong>
         * <p>通过客服第一句话判断</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>1234561</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList self = new GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList setOriginalUtterances(java.util.List<Integer> originalUtterances) {
            this.originalUtterances = originalUtterances;
            return this;
        }
        public java.util.List<Integer> getOriginalUtterances() {
            return this.originalUtterances;
        }

        public GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAgentTaskResultResponseBodyDataResponseFieldResponse extends TeaModel {
        /**
         * <p>The list of properties.</p>
         */
        @NameInMap("FieldVoList")
        public java.util.List<GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList> fieldVoList;

        public static GetAgentTaskResultResponseBodyDataResponseFieldResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyDataResponseFieldResponse self = new GetAgentTaskResultResponseBodyDataResponseFieldResponse();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyDataResponseFieldResponse setFieldVoList(java.util.List<GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList> fieldVoList) {
            this.fieldVoList = fieldVoList;
            return this;
        }
        public java.util.List<GetAgentTaskResultResponseBodyDataResponseFieldResponseFieldVoList> getFieldVoList() {
            return this.fieldVoList;
        }

    }

    public static class GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList extends TeaModel {
        /**
         * <p>The inspection dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>服务态度</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>Indicates whether a match is found.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMatch")
        public Boolean isMatch;

        /**
         * <p>The sentences referenced in the reasoning.</p>
         */
        @NameInMap("OriginalUtterances")
        public java.util.List<String> originalUtterances;

        /**
         * <p>The reasoning for the judgment.</p>
         * 
         * <strong>example:</strong>
         * <p>通过客服第一句话判断</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        public static GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList self = new GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList setIsMatch(Boolean isMatch) {
            this.isMatch = isMatch;
            return this;
        }
        public Boolean getIsMatch() {
            return this.isMatch;
        }

        public GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList setOriginalUtterances(java.util.List<String> originalUtterances) {
            this.originalUtterances = originalUtterances;
            return this;
        }
        public java.util.List<String> getOriginalUtterances() {
            return this.originalUtterances;
        }

        public GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

    }

    public static class GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponse extends TeaModel {
        /**
         * <p>The list of inspection items.</p>
         */
        @NameInMap("ServiceInspectionVoList")
        public java.util.List<GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList> serviceInspectionVoList;

        public static GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponse self = new GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponse();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponse setServiceInspectionVoList(java.util.List<GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList> serviceInspectionVoList) {
            this.serviceInspectionVoList = serviceInspectionVoList;
            return this;
        }
        public java.util.List<GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponseServiceInspectionVoList> getServiceInspectionVoList() {
            return this.serviceInspectionVoList;
        }

    }

    public static class GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList extends TeaModel {
        /**
         * <p>The label dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>客户意图</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>Indicates whether a match is found.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMatch")
        public Boolean isMatch;

        /**
         * <p>The sentences referenced in the reasoning.</p>
         */
        @NameInMap("OriginalUtterances")
        public java.util.List<String> originalUtterances;

        /**
         * <p>The reasoning for the judgment.</p>
         * 
         * <strong>example:</strong>
         * <p>通过客服第一句话判断</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The list of matched labels.</p>
         */
        @NameInMap("ResultLabels")
        public java.util.List<String> resultLabels;

        public static GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList self = new GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList setIsMatch(Boolean isMatch) {
            this.isMatch = isMatch;
            return this;
        }
        public Boolean getIsMatch() {
            return this.isMatch;
        }

        public GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList setOriginalUtterances(java.util.List<String> originalUtterances) {
            this.originalUtterances = originalUtterances;
            return this;
        }
        public java.util.List<String> getOriginalUtterances() {
            return this.originalUtterances;
        }

        public GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList setResultLabels(java.util.List<String> resultLabels) {
            this.resultLabels = resultLabels;
            return this;
        }
        public java.util.List<String> getResultLabels() {
            return this.resultLabels;
        }

    }

    public static class GetAgentTaskResultResponseBodyDataResponseTagCategoryResponse extends TeaModel {
        /**
         * <p>The list of labels.</p>
         */
        @NameInMap("TagCategoryVoList")
        public java.util.List<GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList> tagCategoryVoList;

        public static GetAgentTaskResultResponseBodyDataResponseTagCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyDataResponseTagCategoryResponse self = new GetAgentTaskResultResponseBodyDataResponseTagCategoryResponse();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyDataResponseTagCategoryResponse setTagCategoryVoList(java.util.List<GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList> tagCategoryVoList) {
            this.tagCategoryVoList = tagCategoryVoList;
            return this;
        }
        public java.util.List<GetAgentTaskResultResponseBodyDataResponseTagCategoryResponseTagCategoryVoList> getTagCategoryVoList() {
            return this.tagCategoryVoList;
        }

    }

    public static class GetAgentTaskResultResponseBodyDataResponse extends TeaModel {
        /**
         * <p>The result of the custom prompt.</p>
         */
        @NameInMap("CustomerPromptResponse")
        public GetAgentTaskResultResponseBodyDataResponseCustomerPromptResponse customerPromptResponse;

        /**
         * <p>The property extraction result.</p>
         */
        @NameInMap("FieldResponse")
        public GetAgentTaskResultResponseBodyDataResponseFieldResponse fieldResponse;

        /**
         * <p>The service quality inspection result.</p>
         */
        @NameInMap("ServiceInspectionResponse")
        public GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponse serviceInspectionResponse;

        /**
         * <p>The tag categorization result.</p>
         */
        @NameInMap("TagCategoryResponse")
        public GetAgentTaskResultResponseBodyDataResponseTagCategoryResponse tagCategoryResponse;

        public static GetAgentTaskResultResponseBodyDataResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyDataResponse self = new GetAgentTaskResultResponseBodyDataResponse();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyDataResponse setCustomerPromptResponse(GetAgentTaskResultResponseBodyDataResponseCustomerPromptResponse customerPromptResponse) {
            this.customerPromptResponse = customerPromptResponse;
            return this;
        }
        public GetAgentTaskResultResponseBodyDataResponseCustomerPromptResponse getCustomerPromptResponse() {
            return this.customerPromptResponse;
        }

        public GetAgentTaskResultResponseBodyDataResponse setFieldResponse(GetAgentTaskResultResponseBodyDataResponseFieldResponse fieldResponse) {
            this.fieldResponse = fieldResponse;
            return this;
        }
        public GetAgentTaskResultResponseBodyDataResponseFieldResponse getFieldResponse() {
            return this.fieldResponse;
        }

        public GetAgentTaskResultResponseBodyDataResponse setServiceInspectionResponse(GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponse serviceInspectionResponse) {
            this.serviceInspectionResponse = serviceInspectionResponse;
            return this;
        }
        public GetAgentTaskResultResponseBodyDataResponseServiceInspectionResponse getServiceInspectionResponse() {
            return this.serviceInspectionResponse;
        }

        public GetAgentTaskResultResponseBodyDataResponse setTagCategoryResponse(GetAgentTaskResultResponseBodyDataResponseTagCategoryResponse tagCategoryResponse) {
            this.tagCategoryResponse = tagCategoryResponse;
            return this;
        }
        public GetAgentTaskResultResponseBodyDataResponseTagCategoryResponse getTagCategoryResponse() {
            return this.tagCategoryResponse;
        }

    }

    public static class GetAgentTaskResultResponseBodyData extends TeaModel {
        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public String inputTokens;

        /**
         * <p>The request ID returned by the large language model service.</p>
         * 
         * <strong>example:</strong>
         * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
         */
        @NameInMap("LlmRequestId")
        public String llmRequestId;

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OutputTokens")
        public String outputTokens;

        /**
         * <p>The result of the computing task.</p>
         */
        @NameInMap("Response")
        public GetAgentTaskResultResponseBodyDataResponse response;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>1: pending</li>
         * <li>2: running</li>
         * <li>3: succeeded</li>
         * <li>4: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A6BEC8D-9A5B-4BE5-8432-4F635E***</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("TotalTokens")
        public String totalTokens;

        /**
         * <p>The number of times the plus model is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TyxmPlusCount")
        public String tyxmPlusCount;

        /**
         * <p>The number of times the turbo model is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TyxmTurboCount")
        public String tyxmTurboCount;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6fa76916-3ce6-45d8-ac64-01b7f31***</p>
         */
        @NameInMap("Vid")
        public String vid;

        public static GetAgentTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResultResponseBodyData self = new GetAgentTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResultResponseBodyData setInputTokens(String inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public String getInputTokens() {
            return this.inputTokens;
        }

        public GetAgentTaskResultResponseBodyData setLlmRequestId(String llmRequestId) {
            this.llmRequestId = llmRequestId;
            return this;
        }
        public String getLlmRequestId() {
            return this.llmRequestId;
        }

        public GetAgentTaskResultResponseBodyData setOutputTokens(String outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public String getOutputTokens() {
            return this.outputTokens;
        }

        public GetAgentTaskResultResponseBodyData setResponse(GetAgentTaskResultResponseBodyDataResponse response) {
            this.response = response;
            return this;
        }
        public GetAgentTaskResultResponseBodyDataResponse getResponse() {
            return this.response;
        }

        public GetAgentTaskResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAgentTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAgentTaskResultResponseBodyData setTotalTokens(String totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public String getTotalTokens() {
            return this.totalTokens;
        }

        public GetAgentTaskResultResponseBodyData setTyxmPlusCount(String tyxmPlusCount) {
            this.tyxmPlusCount = tyxmPlusCount;
            return this;
        }
        public String getTyxmPlusCount() {
            return this.tyxmPlusCount;
        }

        public GetAgentTaskResultResponseBodyData setTyxmTurboCount(String tyxmTurboCount) {
            this.tyxmTurboCount = tyxmTurboCount;
            return this;
        }
        public String getTyxmTurboCount() {
            return this.tyxmTurboCount;
        }

        public GetAgentTaskResultResponseBodyData setVid(String vid) {
            this.vid = vid;
            return this;
        }
        public String getVid() {
            return this.vid;
        }

    }

}
