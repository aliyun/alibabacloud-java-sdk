// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsGuardianAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("GuardianApps")
    public java.util.List<QueryMsGuardianAppsResponseBodyGuardianApps> guardianApps;

    public static QueryMsGuardianAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsGuardianAppsResponseBody self = new QueryMsGuardianAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsGuardianAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsGuardianAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsGuardianAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsGuardianAppsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsGuardianAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsGuardianAppsResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsGuardianAppsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsGuardianAppsResponseBody setGuardianApps(java.util.List<QueryMsGuardianAppsResponseBodyGuardianApps> guardianApps) {
        this.guardianApps = guardianApps;
        return this;
    }
    public java.util.List<QueryMsGuardianAppsResponseBodyGuardianApps> getGuardianApps() {
        return this.guardianApps;
    }

    public static class QueryMsGuardianAppsResponseBodyGuardianApps extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RunMode")
        public String runMode;

        public static QueryMsGuardianAppsResponseBodyGuardianApps build(java.util.Map<String, ?> map) throws Exception {
            QueryMsGuardianAppsResponseBodyGuardianApps self = new QueryMsGuardianAppsResponseBodyGuardianApps();
            return TeaModel.build(map, self);
        }

        public QueryMsGuardianAppsResponseBodyGuardianApps setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryMsGuardianAppsResponseBodyGuardianApps setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsGuardianAppsResponseBodyGuardianApps setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsGuardianAppsResponseBodyGuardianApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMsGuardianAppsResponseBodyGuardianApps setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

    }

}
