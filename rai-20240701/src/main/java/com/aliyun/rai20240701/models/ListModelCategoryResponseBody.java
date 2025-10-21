// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListModelCategoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("ModelCategoryInfoList")
    public java.util.List<ListModelCategoryResponseBodyModelCategoryInfoList> modelCategoryInfoList;

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

    public static ListModelCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelCategoryResponseBody self = new ListModelCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelCategoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListModelCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListModelCategoryResponseBody setModelCategoryInfoList(java.util.List<ListModelCategoryResponseBodyModelCategoryInfoList> modelCategoryInfoList) {
        this.modelCategoryInfoList = modelCategoryInfoList;
        return this;
    }
    public java.util.List<ListModelCategoryResponseBodyModelCategoryInfoList> getModelCategoryInfoList() {
        return this.modelCategoryInfoList;
    }

    public ListModelCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListModelCategoryResponseBodyModelCategoryInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("ContentSafeImageSupported")
        public Integer contentSafeImageSupported;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("ContentSafeTextSupported")
        public Integer contentSafeTextSupported;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ModelCategoryId")
        public Long modelCategoryId;

        /**
         * <strong>example:</strong>
         * <p>Qwen2.5-3B-Intruct-PAI-Guard</p>
         */
        @NameInMap("ModelCategoryName")
        public String modelCategoryName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ModelSource")
        public Integer modelSource;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PromptAttackTextSupported")
        public Integer promptAttackTextSupported;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SensitiveTopicTextSupported")
        public Integer sensitiveTopicTextSupported;

        public static ListModelCategoryResponseBodyModelCategoryInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListModelCategoryResponseBodyModelCategoryInfoList self = new ListModelCategoryResponseBodyModelCategoryInfoList();
            return TeaModel.build(map, self);
        }

        public ListModelCategoryResponseBodyModelCategoryInfoList setContentSafeImageSupported(Integer contentSafeImageSupported) {
            this.contentSafeImageSupported = contentSafeImageSupported;
            return this;
        }
        public Integer getContentSafeImageSupported() {
            return this.contentSafeImageSupported;
        }

        public ListModelCategoryResponseBodyModelCategoryInfoList setContentSafeTextSupported(Integer contentSafeTextSupported) {
            this.contentSafeTextSupported = contentSafeTextSupported;
            return this;
        }
        public Integer getContentSafeTextSupported() {
            return this.contentSafeTextSupported;
        }

        public ListModelCategoryResponseBodyModelCategoryInfoList setModelCategoryId(Long modelCategoryId) {
            this.modelCategoryId = modelCategoryId;
            return this;
        }
        public Long getModelCategoryId() {
            return this.modelCategoryId;
        }

        public ListModelCategoryResponseBodyModelCategoryInfoList setModelCategoryName(String modelCategoryName) {
            this.modelCategoryName = modelCategoryName;
            return this;
        }
        public String getModelCategoryName() {
            return this.modelCategoryName;
        }

        public ListModelCategoryResponseBodyModelCategoryInfoList setModelSource(Integer modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public Integer getModelSource() {
            return this.modelSource;
        }

        public ListModelCategoryResponseBodyModelCategoryInfoList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListModelCategoryResponseBodyModelCategoryInfoList setPromptAttackTextSupported(Integer promptAttackTextSupported) {
            this.promptAttackTextSupported = promptAttackTextSupported;
            return this;
        }
        public Integer getPromptAttackTextSupported() {
            return this.promptAttackTextSupported;
        }

        public ListModelCategoryResponseBodyModelCategoryInfoList setSensitiveTopicTextSupported(Integer sensitiveTopicTextSupported) {
            this.sensitiveTopicTextSupported = sensitiveTopicTextSupported;
            return this;
        }
        public Integer getSensitiveTopicTextSupported() {
            return this.sensitiveTopicTextSupported;
        }

    }

}
