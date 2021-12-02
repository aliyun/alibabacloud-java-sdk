// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListAppInstanceResponseBodyData> data;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAppInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceResponseBody self = new ListAppInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAppInstanceResponseBody setData(java.util.List<ListAppInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppInstanceResponseBodyData> getData() {
        return this.data;
    }

    public ListAppInstanceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListAppInstanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppInstanceResponseBodyData extends TeaModel {
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Health")
        public String health;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Limits")
        public String limits;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("Requests")
        public String requests;

        @NameInMap("RestartCount")
        public Integer restartCount;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        public static ListAppInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceResponseBodyData self = new ListAppInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceResponseBodyData setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListAppInstanceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppInstanceResponseBodyData setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListAppInstanceResponseBodyData setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public ListAppInstanceResponseBodyData setLimits(String limits) {
            this.limits = limits;
            return this;
        }
        public String getLimits() {
            return this.limits;
        }

        public ListAppInstanceResponseBodyData setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public ListAppInstanceResponseBodyData setRequests(String requests) {
            this.requests = requests;
            return this;
        }
        public String getRequests() {
            return this.requests;
        }

        public ListAppInstanceResponseBodyData setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public ListAppInstanceResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListAppInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppInstanceResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
