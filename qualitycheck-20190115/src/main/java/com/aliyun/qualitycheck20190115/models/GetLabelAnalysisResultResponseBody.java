// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetLabelAnalysisResultResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public GetLabelAnalysisResultResponseBodyData data;

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
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values: true: The call was successful. false: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLabelAnalysisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLabelAnalysisResultResponseBody self = new GetLabelAnalysisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLabelAnalysisResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLabelAnalysisResultResponseBody setData(GetLabelAnalysisResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLabelAnalysisResultResponseBodyData getData() {
        return this.data;
    }

    public GetLabelAnalysisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLabelAnalysisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLabelAnalysisResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren extends TeaModel {
        /**
         * <p>The tag analysis description.</p>
         * 
         * <strong>example:</strong>
         * <p>No valid tag was matched at the current level</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid session</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren build(java.util.Map<String, ?> map) throws Exception {
            GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren self = new GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren();
            return TeaModel.build(map, self);
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren extends TeaModel {
        /**
         * <p>The list of child nodes.</p>
         */
        @NameInMap("Children")
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren> children;

        /**
         * <p>The tag analysis description.</p>
         * 
         * <strong>example:</strong>
         * <p>The user failed to pay 17 CNY for an Amap ride-hailing service within Qwen. After switching to Alipay, the price changed to the original price. Customer service investigated the payment failure, balance, real-name verification, and authorization binding. The issue occurred in the scenario where Qwen calls the Amap ride-hailing service, which belongs to Qwen × Amap</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen × Amap</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren build(java.util.Map<String, ?> map) throws Exception {
            GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren self = new GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren();
            return TeaModel.build(map, self);
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren setChildren(java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildrenChildren> getChildren() {
            return this.children;
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren extends TeaModel {
        /**
         * <p>The list of child nodes.</p>
         */
        @NameInMap("Children")
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren> children;

        /**
         * <p>The tag analysis description.</p>
         * 
         * <strong>example:</strong>
         * <p>The user failed to pay 17 CNY for an Amap ride-hailing service within Qwen. After switching to Alipay, the price changed to the original price. Customer service investigated the payment failure, balance, real-name verification, and authorization binding. The issue occurred in the scenario where Qwen calls the Amap ride-hailing service, which belongs to Qwen × Amap</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen × Amap</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren build(java.util.Map<String, ?> map) throws Exception {
            GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren self = new GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren();
            return TeaModel.build(map, self);
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren setChildren(java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildrenChildren> getChildren() {
            return this.children;
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class GetLabelAnalysisResultResponseBodyDataTagListChildren extends TeaModel {
        /**
         * <p>The list of child nodes.</p>
         */
        @NameInMap("Children")
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren> children;

        /**
         * <p>The tag analysis description.</p>
         * 
         * <strong>example:</strong>
         * <p>The user failed to pay 17 CNY for an Amap ride-hailing service within Qwen. After switching to Alipay, the price changed to the original price. Customer service investigated the payment failure, balance, real-name verification, and authorization binding. The issue occurred in the scenario where Qwen calls the Amap ride-hailing service, which belongs to Qwen × Amap</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen × Amap</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static GetLabelAnalysisResultResponseBodyDataTagListChildren build(java.util.Map<String, ?> map) throws Exception {
            GetLabelAnalysisResultResponseBodyDataTagListChildren self = new GetLabelAnalysisResultResponseBodyDataTagListChildren();
            return TeaModel.build(map, self);
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildren setChildren(java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildrenChildren> getChildren() {
            return this.children;
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildren setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetLabelAnalysisResultResponseBodyDataTagListChildren setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class GetLabelAnalysisResultResponseBodyDataTagList extends TeaModel {
        /**
         * <p>The list of child nodes.</p>
         */
        @NameInMap("Children")
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildren> children;

        /**
         * <p>The tag analysis description.</p>
         * 
         * <strong>example:</strong>
         * <p>The user failed to pay 17 CNY for an Amap ride-hailing service within Qwen. After switching to Alipay, the price changed to the original price. Customer service investigated the payment failure, balance, real-name verification, and authorization binding. The issue occurred in the scenario where Qwen calls the Amap ride-hailing service, which belongs to Qwen × Amap</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen × Amap</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static GetLabelAnalysisResultResponseBodyDataTagList build(java.util.Map<String, ?> map) throws Exception {
            GetLabelAnalysisResultResponseBodyDataTagList self = new GetLabelAnalysisResultResponseBodyDataTagList();
            return TeaModel.build(map, self);
        }

        public GetLabelAnalysisResultResponseBodyDataTagList setChildren(java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagListChildren> getChildren() {
            return this.children;
        }

        public GetLabelAnalysisResultResponseBodyDataTagList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetLabelAnalysisResultResponseBodyDataTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class GetLabelAnalysisResultResponseBodyData extends TeaModel {
        /**
         * <p>The total number of input tokens for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>7371</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The total number of output tokens for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>355</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The tree-structured tag results.</p>
         */
        @NameInMap("TagList")
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagList> tagList;

        /**
         * <p>The total number of tokens for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>7726</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        /**
         * <p>The total number of times the Qwen-Plus model was called for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TyxmPlusCount")
        public Long tyxmPlusCount;

        /**
         * <p>The total number of times the Qwen-Turbo model was called for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TyxmTurboCount")
        public Long tyxmTurboCount;

        public static GetLabelAnalysisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLabelAnalysisResultResponseBodyData self = new GetLabelAnalysisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLabelAnalysisResultResponseBodyData setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetLabelAnalysisResultResponseBodyData setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetLabelAnalysisResultResponseBodyData setTagList(java.util.List<GetLabelAnalysisResultResponseBodyDataTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<GetLabelAnalysisResultResponseBodyDataTagList> getTagList() {
            return this.tagList;
        }

        public GetLabelAnalysisResultResponseBodyData setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public GetLabelAnalysisResultResponseBodyData setTyxmPlusCount(Long tyxmPlusCount) {
            this.tyxmPlusCount = tyxmPlusCount;
            return this;
        }
        public Long getTyxmPlusCount() {
            return this.tyxmPlusCount;
        }

        public GetLabelAnalysisResultResponseBodyData setTyxmTurboCount(Long tyxmTurboCount) {
            this.tyxmTurboCount = tyxmTurboCount;
            return this;
        }
        public Long getTyxmTurboCount() {
            return this.tyxmTurboCount;
        }

    }

}
