// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelInstanceInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>opencompass-vllm07-acc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>eas-m-12345678</p>
     */
    @NameInMap("EasServiceId")
    public String easServiceId;

    /**
     * <strong>example:</strong>
     * <p>rai_content_detection_model</p>
     */
    @NameInMap("EasServiceName")
    public String easServiceName;

    /**
     * <strong>example:</strong>
     * <p>1634122349000</p>
     */
    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("HarmfulCategoryConfigInfoList")
    public java.util.List<GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsSupportImage")
    public Boolean isSupportImage;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsSupportText")
    public Boolean isSupportText;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("ModelCallName")
    public String modelCallName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModelCategoryId")
    public Long modelCategoryId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ModelInstanceId")
    public Long modelInstanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModelSource")
    public Integer modelSource;

    /**
     * <strong>example:</strong>
     * <p>MzJiMDI5MDliODc0MTlkYmI0ZDhlYmExYjczYTIyZTE3Zm********</p>
     */
    @NameInMap("ModelToken")
    public String modelToken;

    /**
     * <strong>example:</strong>
     * <p><a href="http://12345*****.cn-shanghai.aliyuncs.com/api/predict/echo">http://12345*****.cn-shanghai.aliyuncs.com/api/predict/echo</a></p>
     */
    @NameInMap("ModelUrl")
    public String modelUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="http://12345*****.vpc.cn-shanghai.aliyuncs.com/api/predict/demo">http://12345*****.vpc.cn-shanghai.aliyuncs.com/api/predict/demo</a></p>
     */
    @NameInMap("ModelVpcUrl")
    public String modelVpcUrl;

    @NameInMap("PromptAttackInfoList")
    public java.util.List<GetModelInstanceInfoResponseBodyPromptAttackInfoList> promptAttackInfoList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetModelInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelInstanceInfoResponseBody self = new GetModelInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelInstanceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetModelInstanceInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetModelInstanceInfoResponseBody setEasServiceId(String easServiceId) {
        this.easServiceId = easServiceId;
        return this;
    }
    public String getEasServiceId() {
        return this.easServiceId;
    }

    public GetModelInstanceInfoResponseBody setEasServiceName(String easServiceName) {
        this.easServiceName = easServiceName;
        return this;
    }
    public String getEasServiceName() {
        return this.easServiceName;
    }

    public GetModelInstanceInfoResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public GetModelInstanceInfoResponseBody setHarmfulCategoryConfigInfoList(java.util.List<GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList) {
        this.harmfulCategoryConfigInfoList = harmfulCategoryConfigInfoList;
        return this;
    }
    public java.util.List<GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList> getHarmfulCategoryConfigInfoList() {
        return this.harmfulCategoryConfigInfoList;
    }

    public GetModelInstanceInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetModelInstanceInfoResponseBody setIsSupportImage(Boolean isSupportImage) {
        this.isSupportImage = isSupportImage;
        return this;
    }
    public Boolean getIsSupportImage() {
        return this.isSupportImage;
    }

    public GetModelInstanceInfoResponseBody setIsSupportText(Boolean isSupportText) {
        this.isSupportText = isSupportText;
        return this;
    }
    public Boolean getIsSupportText() {
        return this.isSupportText;
    }

    public GetModelInstanceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelInstanceInfoResponseBody setModelCallName(String modelCallName) {
        this.modelCallName = modelCallName;
        return this;
    }
    public String getModelCallName() {
        return this.modelCallName;
    }

    public GetModelInstanceInfoResponseBody setModelCategoryId(Long modelCategoryId) {
        this.modelCategoryId = modelCategoryId;
        return this;
    }
    public Long getModelCategoryId() {
        return this.modelCategoryId;
    }

    public GetModelInstanceInfoResponseBody setModelInstanceId(Long modelInstanceId) {
        this.modelInstanceId = modelInstanceId;
        return this;
    }
    public Long getModelInstanceId() {
        return this.modelInstanceId;
    }

    public GetModelInstanceInfoResponseBody setModelSource(Integer modelSource) {
        this.modelSource = modelSource;
        return this;
    }
    public Integer getModelSource() {
        return this.modelSource;
    }

    public GetModelInstanceInfoResponseBody setModelToken(String modelToken) {
        this.modelToken = modelToken;
        return this;
    }
    public String getModelToken() {
        return this.modelToken;
    }

    public GetModelInstanceInfoResponseBody setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
        return this;
    }
    public String getModelUrl() {
        return this.modelUrl;
    }

    public GetModelInstanceInfoResponseBody setModelVpcUrl(String modelVpcUrl) {
        this.modelVpcUrl = modelVpcUrl;
        return this;
    }
    public String getModelVpcUrl() {
        return this.modelVpcUrl;
    }

    public GetModelInstanceInfoResponseBody setPromptAttackInfoList(java.util.List<GetModelInstanceInfoResponseBodyPromptAttackInfoList> promptAttackInfoList) {
        this.promptAttackInfoList = promptAttackInfoList;
        return this;
    }
    public java.util.List<GetModelInstanceInfoResponseBodyPromptAttackInfoList> getPromptAttackInfoList() {
        return this.promptAttackInfoList;
    }

    public GetModelInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelInstanceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryLabel")
        public String categoryLabel;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CategoryType")
        public Integer categoryType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InputOutputType")
        public Integer inputOutputType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList self = new GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList setInputOutputType(Integer inputOutputType) {
            this.inputOutputType = inputOutputType;
            return this;
        }
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public GetModelInstanceInfoResponseBodyHarmfulCategoryConfigInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetModelInstanceInfoResponseBodyPromptAttackInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryLabel")
        public String categoryLabel;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public Integer securityLevel;

        public static GetModelInstanceInfoResponseBodyPromptAttackInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetModelInstanceInfoResponseBodyPromptAttackInfoList self = new GetModelInstanceInfoResponseBodyPromptAttackInfoList();
            return TeaModel.build(map, self);
        }

        public GetModelInstanceInfoResponseBodyPromptAttackInfoList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetModelInstanceInfoResponseBodyPromptAttackInfoList setCategoryLabel(String categoryLabel) {
            this.categoryLabel = categoryLabel;
            return this;
        }
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        public GetModelInstanceInfoResponseBodyPromptAttackInfoList setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

    }

}
