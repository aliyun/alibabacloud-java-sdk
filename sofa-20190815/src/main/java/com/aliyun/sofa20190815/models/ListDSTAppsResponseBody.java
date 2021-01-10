// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Apps")
    public java.util.List<ListDSTAppsResponseBodyApps> apps;

    public static ListDSTAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSTAppsResponseBody self = new ListDSTAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSTAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSTAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDSTAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDSTAppsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDSTAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDSTAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDSTAppsResponseBody setApps(java.util.List<ListDSTAppsResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListDSTAppsResponseBodyApps> getApps() {
        return this.apps;
    }

    public static class ListDSTAppsResponseBodyApps extends TeaModel {
        @NameInMap("BizLogAppCreator")
        public String bizLogAppCreator;

        @NameInMap("BizLogConfigCount")
        public Long bizLogConfigCount;

        @NameInMap("BizLogEnabled")
        public Boolean bizLogEnabled;

        @NameInMap("Collected")
        public Boolean collected;

        @NameInMap("Name")
        public String name;

        public static ListDSTAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListDSTAppsResponseBodyApps self = new ListDSTAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListDSTAppsResponseBodyApps setBizLogAppCreator(String bizLogAppCreator) {
            this.bizLogAppCreator = bizLogAppCreator;
            return this;
        }
        public String getBizLogAppCreator() {
            return this.bizLogAppCreator;
        }

        public ListDSTAppsResponseBodyApps setBizLogConfigCount(Long bizLogConfigCount) {
            this.bizLogConfigCount = bizLogConfigCount;
            return this;
        }
        public Long getBizLogConfigCount() {
            return this.bizLogConfigCount;
        }

        public ListDSTAppsResponseBodyApps setBizLogEnabled(Boolean bizLogEnabled) {
            this.bizLogEnabled = bizLogEnabled;
            return this;
        }
        public Boolean getBizLogEnabled() {
            return this.bizLogEnabled;
        }

        public ListDSTAppsResponseBodyApps setCollected(Boolean collected) {
            this.collected = collected;
            return this;
        }
        public Boolean getCollected() {
            return this.collected;
        }

        public ListDSTAppsResponseBodyApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
