// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTBizLogConfigsResponseBody extends TeaModel {
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

    @NameInMap("BizLogConfigs")
    public java.util.List<ListDSTBizLogConfigsResponseBodyBizLogConfigs> bizLogConfigs;

    public static ListDSTBizLogConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSTBizLogConfigsResponseBody self = new ListDSTBizLogConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSTBizLogConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSTBizLogConfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDSTBizLogConfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDSTBizLogConfigsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDSTBizLogConfigsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDSTBizLogConfigsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDSTBizLogConfigsResponseBody setBizLogConfigs(java.util.List<ListDSTBizLogConfigsResponseBodyBizLogConfigs> bizLogConfigs) {
        this.bizLogConfigs = bizLogConfigs;
        return this;
    }
    public java.util.List<ListDSTBizLogConfigsResponseBodyBizLogConfigs> getBizLogConfigs() {
        return this.bizLogConfigs;
    }

    public static class ListDSTBizLogConfigsResponseBodyBizLogConfigs extends TeaModel {
        @NameInMap("AdvSetValid")
        public Boolean advSetValid;

        @NameInMap("App")
        public String app;

        @NameInMap("CheckCondition")
        public String checkCondition;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LogBeginRegex")
        public String logBeginRegex;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("LogSample")
        public String logSample;

        @NameInMap("Name")
        public String name;

        public static ListDSTBizLogConfigsResponseBodyBizLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDSTBizLogConfigsResponseBodyBizLogConfigs self = new ListDSTBizLogConfigsResponseBodyBizLogConfigs();
            return TeaModel.build(map, self);
        }

        public ListDSTBizLogConfigsResponseBodyBizLogConfigs setAdvSetValid(Boolean advSetValid) {
            this.advSetValid = advSetValid;
            return this;
        }
        public Boolean getAdvSetValid() {
            return this.advSetValid;
        }

        public ListDSTBizLogConfigsResponseBodyBizLogConfigs setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public ListDSTBizLogConfigsResponseBodyBizLogConfigs setCheckCondition(String checkCondition) {
            this.checkCondition = checkCondition;
            return this;
        }
        public String getCheckCondition() {
            return this.checkCondition;
        }

        public ListDSTBizLogConfigsResponseBodyBizLogConfigs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDSTBizLogConfigsResponseBodyBizLogConfigs setLogBeginRegex(String logBeginRegex) {
            this.logBeginRegex = logBeginRegex;
            return this;
        }
        public String getLogBeginRegex() {
            return this.logBeginRegex;
        }

        public ListDSTBizLogConfigsResponseBodyBizLogConfigs setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public ListDSTBizLogConfigsResponseBodyBizLogConfigs setLogSample(String logSample) {
            this.logSample = logSample;
            return this;
        }
        public String getLogSample() {
            return this.logSample;
        }

        public ListDSTBizLogConfigsResponseBodyBizLogConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
