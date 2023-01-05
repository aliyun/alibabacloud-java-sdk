// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptPublishHistoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScriptPublishHistories")
    public ListScriptPublishHistoriesResponseBodyScriptPublishHistories scriptPublishHistories;

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

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PublishTime")
        public Long publishTime;

        @NameInMap("ScriptId")
        public String scriptId;

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

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
