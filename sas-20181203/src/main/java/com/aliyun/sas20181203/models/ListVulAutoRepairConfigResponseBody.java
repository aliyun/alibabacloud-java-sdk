// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVulAutoRepairConfigResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListVulAutoRepairConfigResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>An array consisting of the existing configurations of vulnerabilities that can be automatically fixed.</p>
     */
    @NameInMap("VulAutoRepairConfigList")
    public java.util.List<ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList> vulAutoRepairConfigList;

    public static ListVulAutoRepairConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVulAutoRepairConfigResponseBody self = new ListVulAutoRepairConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVulAutoRepairConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVulAutoRepairConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVulAutoRepairConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVulAutoRepairConfigResponseBody setPageInfo(ListVulAutoRepairConfigResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListVulAutoRepairConfigResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListVulAutoRepairConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVulAutoRepairConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListVulAutoRepairConfigResponseBody setVulAutoRepairConfigList(java.util.List<ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList> vulAutoRepairConfigList) {
        this.vulAutoRepairConfigList = vulAutoRepairConfigList;
        return this;
    }
    public java.util.List<ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList> getVulAutoRepairConfigList() {
        return this.vulAutoRepairConfigList;
    }

    public static class ListVulAutoRepairConfigResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: **10**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListVulAutoRepairConfigResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVulAutoRepairConfigResponseBodyPageInfo self = new ListVulAutoRepairConfigResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListVulAutoRepairConfigResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListVulAutoRepairConfigResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListVulAutoRepairConfigResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVulAutoRepairConfigResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList extends TeaModel {
        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The configuration ID of the vulnerability.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The reason why the vulnerability can be automatically fixed.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: Linux software vulnerability</p>
         * <p>*   **sys**: Windows system vulnerability</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList self = new ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList();
            return TeaModel.build(map, self);
        }

        public ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListVulAutoRepairConfigResponseBodyVulAutoRepairConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
