// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicePublishersResponseBody extends TeaModel {
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

    @NameInMap("Publishers")
    public java.util.List<QueryMsSgServicePublishersResponseBodyPublishers> publishers;

    public static QueryMsSgServicePublishersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicePublishersResponseBody self = new QueryMsSgServicePublishersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicePublishersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgServicePublishersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgServicePublishersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgServicePublishersResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsSgServicePublishersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServicePublishersResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsSgServicePublishersResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsSgServicePublishersResponseBody setPublishers(java.util.List<QueryMsSgServicePublishersResponseBodyPublishers> publishers) {
        this.publishers = publishers;
        return this;
    }
    public java.util.List<QueryMsSgServicePublishersResponseBodyPublishers> getPublishers() {
        return this.publishers;
    }

    public static class QueryMsSgServicePublishersResponseBodyPublishers extends TeaModel {
        @NameInMap("Alive")
        public Boolean alive;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("CheckSum")
        public String checkSum;

        @NameInMap("ConfigWeight")
        public String configWeight;

        @NameInMap("Content")
        public String content;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Mosn")
        public Boolean mosn;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ServiceIp")
        public String serviceIp;

        @NameInMap("ServicePort")
        public Long servicePort;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("VmMode")
        public Boolean vmMode;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Zone")
        public String zone;

        public static QueryMsSgServicePublishersResponseBodyPublishers build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServicePublishersResponseBodyPublishers self = new QueryMsSgServicePublishersResponseBodyPublishers();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setAlive(Boolean alive) {
            this.alive = alive;
            return this;
        }
        public Boolean getAlive() {
            return this.alive;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setCheckSum(String checkSum) {
            this.checkSum = checkSum;
            return this;
        }
        public String getCheckSum() {
            return this.checkSum;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setConfigWeight(String configWeight) {
            this.configWeight = configWeight;
            return this;
        }
        public String getConfigWeight() {
            return this.configWeight;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setMosn(Boolean mosn) {
            this.mosn = mosn;
            return this;
        }
        public Boolean getMosn() {
            return this.mosn;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setServicePort(Long servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Long getServicePort() {
            return this.servicePort;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setVmMode(Boolean vmMode) {
            this.vmMode = vmMode;
            return this;
        }
        public Boolean getVmMode() {
            return this.vmMode;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public QueryMsSgServicePublishersResponseBodyPublishers setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
