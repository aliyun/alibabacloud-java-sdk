// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListCloneVoiceModelsResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public ListCloneVoiceModelsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=392db13c-8901-4a25-b566-91d0d8114cec</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of variable values in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
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

    public static ListCloneVoiceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoiceModelsResponseBody self = new ListCloneVoiceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloneVoiceModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCloneVoiceModelsResponseBody setData(ListCloneVoiceModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCloneVoiceModelsResponseBodyData getData() {
        return this.data;
    }

    public ListCloneVoiceModelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCloneVoiceModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCloneVoiceModelsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCloneVoiceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloneVoiceModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloneVoiceModelsResponseBodyDataCloneVoiceModels extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Responsive, adaptive tone adjustment, effective complex text processing</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>QwenVc</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListCloneVoiceModelsResponseBodyDataCloneVoiceModels build(java.util.Map<String, ?> map) throws Exception {
            ListCloneVoiceModelsResponseBodyDataCloneVoiceModels self = new ListCloneVoiceModelsResponseBodyDataCloneVoiceModels();
            return TeaModel.build(map, self);
        }

        public ListCloneVoiceModelsResponseBodyDataCloneVoiceModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCloneVoiceModelsResponseBodyDataCloneVoiceModels setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListCloneVoiceModelsResponseBodyDataCloneVoiceModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListCloneVoiceModelsResponseBodyData extends TeaModel {
        /**
         * <p>The list of voice cloning models.</p>
         */
        @NameInMap("CloneVoiceModels")
        public java.util.List<ListCloneVoiceModelsResponseBodyDataCloneVoiceModels> cloneVoiceModels;

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCloneVoiceModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCloneVoiceModelsResponseBodyData self = new ListCloneVoiceModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCloneVoiceModelsResponseBodyData setCloneVoiceModels(java.util.List<ListCloneVoiceModelsResponseBodyDataCloneVoiceModels> cloneVoiceModels) {
            this.cloneVoiceModels = cloneVoiceModels;
            return this;
        }
        public java.util.List<ListCloneVoiceModelsResponseBodyDataCloneVoiceModels> getCloneVoiceModels() {
            return this.cloneVoiceModels;
        }

        public ListCloneVoiceModelsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCloneVoiceModelsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloneVoiceModelsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
