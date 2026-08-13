// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveOutputFileToResourceResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("results")
    public java.util.List<SaveOutputFileToResourceResponseBodyResults> results;

    public static SaveOutputFileToResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOutputFileToResourceResponseBody self = new SaveOutputFileToResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOutputFileToResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveOutputFileToResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveOutputFileToResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveOutputFileToResourceResponseBody setResults(java.util.List<SaveOutputFileToResourceResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SaveOutputFileToResourceResponseBodyResults> getResults() {
        return this.results;
    }

    public static class SaveOutputFileToResourceResponseBodyResults extends TeaModel {
        /**
         * <p>失败时返回业务错误码（i18n key）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>失败时返回错误描述（已按请求 locale 国际化）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>产出明细 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleItemId</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <p>成功时返回新建的资源 sourceId</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>操作是否成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static SaveOutputFileToResourceResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            SaveOutputFileToResourceResponseBodyResults self = new SaveOutputFileToResourceResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public SaveOutputFileToResourceResponseBodyResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SaveOutputFileToResourceResponseBodyResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SaveOutputFileToResourceResponseBodyResults setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SaveOutputFileToResourceResponseBodyResults setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public SaveOutputFileToResourceResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
