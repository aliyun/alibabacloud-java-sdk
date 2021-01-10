// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsTransparentProxyNodeResponseBody extends TeaModel {
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

    @NameInMap("List")
    public java.util.List<QueryMsTransparentProxyNodeResponseBodyList> list;

    public static QueryMsTransparentProxyNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsTransparentProxyNodeResponseBody self = new QueryMsTransparentProxyNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsTransparentProxyNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsTransparentProxyNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsTransparentProxyNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsTransparentProxyNodeResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsTransparentProxyNodeResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsTransparentProxyNodeResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsTransparentProxyNodeResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsTransparentProxyNodeResponseBody setList(java.util.List<QueryMsTransparentProxyNodeResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryMsTransparentProxyNodeResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryMsTransparentProxyNodeResponseBodyList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("MosnVersion")
        public String mosnVersion;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("RealRun")
        public String realRun;

        @NameInMap("SidecarStatus")
        public String sidecarStatus;

        @NameInMap("TransparentProxySwitch")
        public Long transparentProxySwitch;

        public static QueryMsTransparentProxyNodeResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyNodeResponseBodyList self = new QueryMsTransparentProxyNodeResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyNodeResponseBodyList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setMosnVersion(String mosnVersion) {
            this.mosnVersion = mosnVersion;
            return this;
        }
        public String getMosnVersion() {
            return this.mosnVersion;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setRealRun(String realRun) {
            this.realRun = realRun;
            return this;
        }
        public String getRealRun() {
            return this.realRun;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setSidecarStatus(String sidecarStatus) {
            this.sidecarStatus = sidecarStatus;
            return this;
        }
        public String getSidecarStatus() {
            return this.sidecarStatus;
        }

        public QueryMsTransparentProxyNodeResponseBodyList setTransparentProxySwitch(Long transparentProxySwitch) {
            this.transparentProxySwitch = transparentProxySwitch;
            return this;
        }
        public Long getTransparentProxySwitch() {
            return this.transparentProxySwitch;
        }

    }

}
