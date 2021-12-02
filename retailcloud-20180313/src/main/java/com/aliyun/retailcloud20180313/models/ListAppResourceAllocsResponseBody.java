// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppResourceAllocsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListAppResourceAllocsResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAppResourceAllocsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourceAllocsResponseBody self = new ListAppResourceAllocsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppResourceAllocsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAppResourceAllocsResponseBody setData(java.util.List<ListAppResourceAllocsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppResourceAllocsResponseBodyData> getData() {
        return this.data;
    }

    public ListAppResourceAllocsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListAppResourceAllocsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppResourceAllocsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppResourceAllocsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppResourceAllocsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppResourceAllocsResponseBodyData extends TeaModel {
        @NameInMap("AppEnvId")
        public Long appEnvId;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ResourceDef")
        public String resourceDef;

        public static ListAppResourceAllocsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppResourceAllocsResponseBodyData self = new ListAppResourceAllocsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppResourceAllocsResponseBodyData setAppEnvId(Long appEnvId) {
            this.appEnvId = appEnvId;
            return this;
        }
        public Long getAppEnvId() {
            return this.appEnvId;
        }

        public ListAppResourceAllocsResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAppResourceAllocsResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListAppResourceAllocsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppResourceAllocsResponseBodyData setResourceDef(String resourceDef) {
            this.resourceDef = resourceDef;
            return this;
        }
        public String getResourceDef() {
            return this.resourceDef;
        }

    }

}
