// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterScannerListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstalledCount")
    public Integer installedCount;

    @NameInMap("List")
    public java.util.List<DescribeClusterScannerListResponseBodyList> list;

    /**
     * <strong>example:</strong>
     * <p>11C96623-E106-59C9-866D-A6C82911459F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterScannerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterScannerListResponseBody self = new DescribeClusterScannerListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterScannerListResponseBody setInstalledCount(Integer installedCount) {
        this.installedCount = installedCount;
        return this;
    }
    public Integer getInstalledCount() {
        return this.installedCount;
    }

    public DescribeClusterScannerListResponseBody setList(java.util.List<DescribeClusterScannerListResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeClusterScannerListResponseBodyList> getList() {
        return this.list;
    }

    public DescribeClusterScannerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterScannerListResponseBodyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1693446913000</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedUpdate")
        public Boolean needUpdate;

        /**
         * <strong>example:</strong>
         * <p>offline</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>20241111</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WebhookOpen")
        public Integer webhookOpen;

        /**
         * <strong>example:</strong>
         * <p>n</p>
         */
        @NameInMap("WebhookStatus")
        public String webhookStatus;

        public static DescribeClusterScannerListResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterScannerListResponseBodyList self = new DescribeClusterScannerListResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterScannerListResponseBodyList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeClusterScannerListResponseBodyList setNeedUpdate(Boolean needUpdate) {
            this.needUpdate = needUpdate;
            return this;
        }
        public Boolean getNeedUpdate() {
            return this.needUpdate;
        }

        public DescribeClusterScannerListResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterScannerListResponseBodyList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeClusterScannerListResponseBodyList setWebhookOpen(Integer webhookOpen) {
            this.webhookOpen = webhookOpen;
            return this;
        }
        public Integer getWebhookOpen() {
            return this.webhookOpen;
        }

        public DescribeClusterScannerListResponseBodyList setWebhookStatus(String webhookStatus) {
            this.webhookStatus = webhookStatus;
            return this;
        }
        public String getWebhookStatus() {
            return this.webhookStatus;
        }

    }

}
