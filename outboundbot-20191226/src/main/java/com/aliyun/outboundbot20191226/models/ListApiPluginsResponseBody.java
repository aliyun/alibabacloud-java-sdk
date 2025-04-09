// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListApiPluginsResponseBody extends TeaModel {
    @NameInMap("ApiPlugins")
    public java.util.List<ListApiPluginsResponseBodyApiPlugins> apiPlugins;

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

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApiPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiPluginsResponseBody self = new ListApiPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiPluginsResponseBody setApiPlugins(java.util.List<ListApiPluginsResponseBodyApiPlugins> apiPlugins) {
        this.apiPlugins = apiPlugins;
        return this;
    }
    public java.util.List<ListApiPluginsResponseBodyApiPlugins> getApiPlugins() {
        return this.apiPlugins;
    }

    public ListApiPluginsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApiPluginsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApiPluginsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApiPluginsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApiPluginsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApiPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiPluginsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApiPluginsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApiPluginsResponseBodyApiPlugins extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DraftedConfigJson")
        public String draftedConfigJson;

        /**
         * <strong>example:</strong>
         * <p>1666230851000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1641891940000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>7c0e5b5e-a839-4999-8301-2c7d07a1f16f</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PublishedConfigJson")
        public String publishedConfigJson;

        /**
         * <strong>example:</strong>
         * <p>Drafted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Function</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>e1a3c448-20cf-4586-8aa2-4cdca75f7c20</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListApiPluginsResponseBodyApiPlugins build(java.util.Map<String, ?> map) throws Exception {
            ListApiPluginsResponseBodyApiPlugins self = new ListApiPluginsResponseBodyApiPlugins();
            return TeaModel.build(map, self);
        }

        public ListApiPluginsResponseBodyApiPlugins setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiPluginsResponseBodyApiPlugins setDraftedConfigJson(String draftedConfigJson) {
            this.draftedConfigJson = draftedConfigJson;
            return this;
        }
        public String getDraftedConfigJson() {
            return this.draftedConfigJson;
        }

        public ListApiPluginsResponseBodyApiPlugins setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListApiPluginsResponseBodyApiPlugins setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListApiPluginsResponseBodyApiPlugins setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApiPluginsResponseBodyApiPlugins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApiPluginsResponseBodyApiPlugins setPublishedConfigJson(String publishedConfigJson) {
            this.publishedConfigJson = publishedConfigJson;
            return this;
        }
        public String getPublishedConfigJson() {
            return this.publishedConfigJson;
        }

        public ListApiPluginsResponseBodyApiPlugins setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApiPluginsResponseBodyApiPlugins setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListApiPluginsResponseBodyApiPlugins setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
