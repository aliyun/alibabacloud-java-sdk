// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceInfos")
    public ListInstanceResponseBodyInstanceInfos instanceInfos;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setInstanceInfos(ListInstanceResponseBodyInstanceInfos instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }
    public ListInstanceResponseBodyInstanceInfos getInstanceInfos() {
        return this.instanceInfos;
    }

    public ListInstanceResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListInstanceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceResponseBodyInstanceInfosInstanceInfo extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Timestamp")
        public String timestamp;

        public static ListInstanceResponseBodyInstanceInfosInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyInstanceInfosInstanceInfo self = new ListInstanceResponseBodyInstanceInfosInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyInstanceInfosInstanceInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstanceResponseBodyInstanceInfosInstanceInfo setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListInstanceResponseBodyInstanceInfos extends TeaModel {
        @NameInMap("InstanceInfo")
        public java.util.List<ListInstanceResponseBodyInstanceInfosInstanceInfo> instanceInfo;

        public static ListInstanceResponseBodyInstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyInstanceInfos self = new ListInstanceResponseBodyInstanceInfos();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyInstanceInfos setInstanceInfo(java.util.List<ListInstanceResponseBodyInstanceInfosInstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyInstanceInfosInstanceInfo> getInstanceInfo() {
            return this.instanceInfo;
        }

    }

}
