// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotPresetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("List")
    public java.util.List<ListHoneypotPresetResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListHoneypotPresetResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ControlNodeName")
        public String controlNodeName;

        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        @NameInMap("HoneypotPresetId")
        public String honeypotPresetId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PresetName")
        public String presetName;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
