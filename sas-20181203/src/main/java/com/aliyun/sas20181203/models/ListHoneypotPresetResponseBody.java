// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotPresetResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>An array that consists of the honeypot templates.</p>
     */
    @NameInMap("List")
    public java.util.List<ListHoneypotPresetResponseBodyList> list;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListHoneypotPresetResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0C656B33-0D6B-5953-A26A-D766BD75B44A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListHoneypotPresetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotPresetResponseBody self = new ListHoneypotPresetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotPresetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHoneypotPresetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHoneypotPresetResponseBody setList(java.util.List<ListHoneypotPresetResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListHoneypotPresetResponseBodyList> getList() {
        return this.list;
    }

    public ListHoneypotPresetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHoneypotPresetResponseBody setPageInfo(ListHoneypotPresetResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotPresetResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotPresetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotPresetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHoneypotPresetResponseBodyList extends TeaModel {
        /**
         * <p>The name of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>node1</p>
         */
        @NameInMap("ControlNodeName")
        public String controlNodeName;

        /**
         * <p>The display name of the honeypot image.</p>
         * 
         * <strong>example:</strong>
         * <p>Metabase</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The name of the honeypot image.</p>
         * 
         * <strong>example:</strong>
         * <p>metabase</p>
         */
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        /**
         * <p>The ID of the honeypot template.</p>
         * 
         * <strong>example:</strong>
         * <p>3cc04a47-7229-418c-8101-f10a2887****</p>
         */
        @NameInMap("HoneypotPresetId")
        public String honeypotPresetId;

        /**
         * <p>The ID of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>c94eff5b-ea48-4805-8b7f-e04d3509****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The custom name of the honeypot template.</p>
         * 
         * <strong>example:</strong>
         * <p>WebMin-online</p>
         */
        @NameInMap("PresetName")
        public String presetName;

        /**
         * <p>The type of the honeypot template. Valid values:</p>
         * <ul>
         * <li><strong>TEMP</strong>: automatically generated template</li>
         * <li><strong>CUSTOM</strong>: custom template</li>
         * <li><strong>DEFAULT</strong>: default template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("PresetType")
        public String presetType;

        public static ListHoneypotPresetResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotPresetResponseBodyList self = new ListHoneypotPresetResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListHoneypotPresetResponseBodyList setControlNodeName(String controlNodeName) {
            this.controlNodeName = controlNodeName;
            return this;
        }
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        public ListHoneypotPresetResponseBodyList setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public ListHoneypotPresetResponseBodyList setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public ListHoneypotPresetResponseBodyList setHoneypotPresetId(String honeypotPresetId) {
            this.honeypotPresetId = honeypotPresetId;
            return this;
        }
        public String getHoneypotPresetId() {
            return this.honeypotPresetId;
        }

        public ListHoneypotPresetResponseBodyList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListHoneypotPresetResponseBodyList setPresetName(String presetName) {
            this.presetName = presetName;
            return this;
        }
        public String getPresetName() {
            return this.presetName;
        }

        public ListHoneypotPresetResponseBodyList setPresetType(String presetType) {
            this.presetType = presetType;
            return this;
        }
        public String getPresetType() {
            return this.presetType;
        }

    }

    public static class ListHoneypotPresetResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotPresetResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotPresetResponseBodyPageInfo self = new ListHoneypotPresetResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotPresetResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotPresetResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotPresetResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotPresetResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
