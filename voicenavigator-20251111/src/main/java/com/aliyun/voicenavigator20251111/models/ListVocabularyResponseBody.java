// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListVocabularyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListVocabularyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVocabularyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVocabularyResponseBody self = new ListVocabularyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVocabularyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVocabularyResponseBody setData(ListVocabularyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVocabularyResponseBodyData getData() {
        return this.data;
    }

    public ListVocabularyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVocabularyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVocabularyResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListVocabularyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVocabularyResponseBodyDataVocabularies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1754013825102</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1308144684576655</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>1754013825102</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("WordCount")
        public Integer wordCount;

        public static ListVocabularyResponseBodyDataVocabularies build(java.util.Map<String, ?> map) throws Exception {
            ListVocabularyResponseBodyDataVocabularies self = new ListVocabularyResponseBodyDataVocabularies();
            return TeaModel.build(map, self);
        }

        public ListVocabularyResponseBodyDataVocabularies setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListVocabularyResponseBodyDataVocabularies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVocabularyResponseBodyDataVocabularies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVocabularyResponseBodyDataVocabularies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVocabularyResponseBodyDataVocabularies setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVocabularyResponseBodyDataVocabularies setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public ListVocabularyResponseBodyDataVocabularies setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public ListVocabularyResponseBodyDataVocabularies setWordCount(Integer wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Integer getWordCount() {
            return this.wordCount;
        }

    }

    public static class ListVocabularyResponseBodyData extends TeaModel {
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
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Vocabularies")
        public java.util.List<ListVocabularyResponseBodyDataVocabularies> vocabularies;

        public static ListVocabularyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVocabularyResponseBodyData self = new ListVocabularyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVocabularyResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVocabularyResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVocabularyResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListVocabularyResponseBodyData setVocabularies(java.util.List<ListVocabularyResponseBodyDataVocabularies> vocabularies) {
            this.vocabularies = vocabularies;
            return this;
        }
        public java.util.List<ListVocabularyResponseBodyDataVocabularies> getVocabularies() {
            return this.vocabularies;
        }

    }

}
