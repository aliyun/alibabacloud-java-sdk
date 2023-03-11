// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSasPmAgentListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the information about servers.</p>
     */
    @NameInMap("SasPmAgentList")
    public java.util.List<DescribeSasPmAgentListResponseBodySasPmAgentList> sasPmAgentList;

    public static DescribeSasPmAgentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSasPmAgentListResponseBody self = new DescribeSasPmAgentListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSasPmAgentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSasPmAgentListResponseBody setSasPmAgentList(java.util.List<DescribeSasPmAgentListResponseBodySasPmAgentList> sasPmAgentList) {
        this.sasPmAgentList = sasPmAgentList;
        return this;
    }
    public java.util.List<DescribeSasPmAgentListResponseBodySasPmAgentList> getSasPmAgentList() {
        return this.sasPmAgentList;
    }

    public static class DescribeSasPmAgentListResponseBodySasPmAgentList extends TeaModel {
        /**
         * <p>The ID of Cloud Assistant.</p>
         */
        @NameInMap("AliyunAssistId")
        public String aliyunAssistId;

        /**
         * <p>The ID of the CloudMonitor agent.</p>
         */
        @NameInMap("AliyunMonitorId")
        public String aliyunMonitorId;

        /**
         * <p>The installation result of Cloud Assistant. Valid values:</p>
         * <br>
         * <p>*   **0**: SUCCESS</p>
         * <p>*   **1**: MISSING_PARAM</p>
         * <p>*   **2**: UNKNOWN_SYSTEM</p>
         * <p>*   **3**: DOWNLOAD_FAILED</p>
         * <p>*   **4**: INSTALL_FAILED</p>
         */
        @NameInMap("AssistInstallResult")
        public Integer assistInstallResult;

        /**
         * <p>The status of Cloud Assistant. Valid values:</p>
         * <br>
         * <p>*   **0**: installing</p>
         * <p>*   **1**: installed</p>
         * <p>*   **2**: installation failed</p>
         * <p>*   **3**: installation timed out</p>
         */
        @NameInMap("AssistInstallStatus")
        public Integer assistInstallStatus;

        /**
         * <p>The installation result of the CloudMonitor agent. Valid values:</p>
         * <br>
         * <p>*   **0**: failed</p>
         * <p>*   **1**: successful</p>
         */
        @NameInMap("MonitorInstallResult")
        public Integer monitorInstallResult;

        /**
         * <p>The status of the CloudMonitor agent. Valid values:</p>
         * <br>
         * <p>*   **0**: installation failed</p>
         * <p>*   **1**: installed</p>
         */
        @NameInMap("MonitorInstallStatus")
        public Integer monitorInstallStatus;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSasPmAgentListResponseBodySasPmAgentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSasPmAgentListResponseBodySasPmAgentList self = new DescribeSasPmAgentListResponseBodySasPmAgentList();
            return TeaModel.build(map, self);
        }

        public DescribeSasPmAgentListResponseBodySasPmAgentList setAliyunAssistId(String aliyunAssistId) {
            this.aliyunAssistId = aliyunAssistId;
            return this;
        }
        public String getAliyunAssistId() {
            return this.aliyunAssistId;
        }

        public DescribeSasPmAgentListResponseBodySasPmAgentList setAliyunMonitorId(String aliyunMonitorId) {
            this.aliyunMonitorId = aliyunMonitorId;
            return this;
        }
        public String getAliyunMonitorId() {
            return this.aliyunMonitorId;
        }

        public DescribeSasPmAgentListResponseBodySasPmAgentList setAssistInstallResult(Integer assistInstallResult) {
            this.assistInstallResult = assistInstallResult;
            return this;
        }
        public Integer getAssistInstallResult() {
            return this.assistInstallResult;
        }

        public DescribeSasPmAgentListResponseBodySasPmAgentList setAssistInstallStatus(Integer assistInstallStatus) {
            this.assistInstallStatus = assistInstallStatus;
            return this;
        }
        public Integer getAssistInstallStatus() {
            return this.assistInstallStatus;
        }

        public DescribeSasPmAgentListResponseBodySasPmAgentList setMonitorInstallResult(Integer monitorInstallResult) {
            this.monitorInstallResult = monitorInstallResult;
            return this;
        }
        public Integer getMonitorInstallResult() {
            return this.monitorInstallResult;
        }

        public DescribeSasPmAgentListResponseBodySasPmAgentList setMonitorInstallStatus(Integer monitorInstallStatus) {
            this.monitorInstallStatus = monitorInstallStatus;
            return this;
        }
        public Integer getMonitorInstallStatus() {
            return this.monitorInstallStatus;
        }

        public DescribeSasPmAgentListResponseBodySasPmAgentList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
