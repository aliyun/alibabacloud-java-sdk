// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("List")
    public java.util.List<ListHoneypotResponseBodyList> list;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the management node.</p>
     */
    @NameInMap("PageInfo")
    public ListHoneypotResponseBodyPageInfo pageInfo;

    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListHoneypotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotResponseBody self = new ListHoneypotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHoneypotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHoneypotResponseBody setList(java.util.List<ListHoneypotResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListHoneypotResponseBodyList> getList() {
        return this.list;
    }

    public ListHoneypotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHoneypotResponseBody setPageInfo(ListHoneypotResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHoneypotResponseBodyList extends TeaModel {
        /**
         * <p>The ID of the honeypot.</p>
         */
        @NameInMap("ControlNodeName")
        public String controlNodeName;

        /**
         * <p>PageResult</p>
         */
        @NameInMap("HoneypotId")
        public String honeypotId;

        /**
         * <p>An array that consists of the status information about the honeypot.</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The display name of the image that is used for the honeypot.</p>
         */
        @NameInMap("HoneypotImageId")
        public String honeypotImageId;

        /**
         * <p>The name of the honeypot.</p>
         */
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        /**
         * <p>The information about the honeypot.</p>
         */
        @NameInMap("HoneypotName")
        public String honeypotName;

        /**
         * <p>The status of the honeypot. Valid values:</p>
         * <br>
         * <p>*   **starting**: enabling</p>
         * <p>*   **running**: normal</p>
         * <p>*   **exited**: disabled</p>
         * <p>*   **upgrade**: updating</p>
         * <p>*   **deleting**: deleting</p>
         * <p>*   **resetting**: resetting</p>
         * <p>*   **created**: created</p>
         * <p>*   **stopping**: stopping</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the management node.</p>
         */
        @NameInMap("PresetId")
        public String presetId;

        /**
         * <p>The name of the image that is used for the honeypot.</p>
         */
        @NameInMap("State")
        public java.util.List<String> state;

        public static ListHoneypotResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotResponseBodyList self = new ListHoneypotResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListHoneypotResponseBodyList setControlNodeName(String controlNodeName) {
            this.controlNodeName = controlNodeName;
            return this;
        }
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        public ListHoneypotResponseBodyList setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public ListHoneypotResponseBodyList setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public ListHoneypotResponseBodyList setHoneypotImageId(String honeypotImageId) {
            this.honeypotImageId = honeypotImageId;
            return this;
        }
        public String getHoneypotImageId() {
            return this.honeypotImageId;
        }

        public ListHoneypotResponseBodyList setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public ListHoneypotResponseBodyList setHoneypotName(String honeypotName) {
            this.honeypotName = honeypotName;
            return this;
        }
        public String getHoneypotName() {
            return this.honeypotName;
        }

        public ListHoneypotResponseBodyList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListHoneypotResponseBodyList setPresetId(String presetId) {
            this.presetId = presetId;
            return this;
        }
        public String getPresetId() {
            return this.presetId;
        }

        public ListHoneypotResponseBodyList setState(java.util.List<String> state) {
            this.state = state;
            return this;
        }
        public java.util.List<String> getState() {
            return this.state;
        }

    }

    public static class ListHoneypotResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the image that is used for the honeypot.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotResponseBodyPageInfo self = new ListHoneypotResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
