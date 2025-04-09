// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptPublishHistoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
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
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScriptPublishHistories")
    public ListScriptPublishHistoriesResponseBodyScriptPublishHistories scriptPublishHistories;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListScriptPublishHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptPublishHistoriesResponseBody self = new ListScriptPublishHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptPublishHistoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptPublishHistoriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptPublishHistoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptPublishHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScriptPublishHistoriesResponseBody setScriptPublishHistories(ListScriptPublishHistoriesResponseBodyScriptPublishHistories scriptPublishHistories) {
        this.scriptPublishHistories = scriptPublishHistories;
        return this;
    }
    public ListScriptPublishHistoriesResponseBodyScriptPublishHistories getScriptPublishHistories() {
        return this.scriptPublishHistories;
    }

    public ListScriptPublishHistoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1578965079000</p>
         */
        @NameInMap("PublishTime")
        public Long publishTime;

        /**
         * <strong>example:</strong>
         * <p>29420f65-8f1f-4009-b2f8-f4f7b5d59090</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>1578965079000</p>
         */
        @NameInMap("ScriptVersion")
        public String scriptVersion;

        public static ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList build(java.util.Map<String, ?> map) throws Exception {
            ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList self = new ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList();
            return TeaModel.build(map, self);
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList setPublishTime(Long publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public Long getPublishTime() {
            return this.publishTime;
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList setScriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }
        public String getScriptVersion() {
            return this.scriptVersion;
        }

    }

    public static class ListScriptPublishHistoriesResponseBodyScriptPublishHistories extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList> list;

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

        public static ListScriptPublishHistoriesResponseBodyScriptPublishHistories build(java.util.Map<String, ?> map) throws Exception {
            ListScriptPublishHistoriesResponseBodyScriptPublishHistories self = new ListScriptPublishHistoriesResponseBodyScriptPublishHistories();
            return TeaModel.build(map, self);
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistories setList(java.util.List<ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListScriptPublishHistoriesResponseBodyScriptPublishHistoriesList> getList() {
            return this.list;
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistories setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistories setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListScriptPublishHistoriesResponseBodyScriptPublishHistories setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
