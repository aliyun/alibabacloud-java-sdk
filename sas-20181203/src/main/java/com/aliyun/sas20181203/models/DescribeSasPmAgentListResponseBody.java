// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSasPmAgentListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8EF3ACC2-9400-5B64-B72D-4A1D35113750</p>
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
         * 
         * <strong>example:</strong>
         * <p>mi-hz034jn***yxhc0</p>
         */
        @NameInMap("AliyunAssistId")
        public String aliyunAssistId;

        /**
         * <p>The ID of the CloudMonitor agent.</p>
         * 
         * <strong>example:</strong>
         * <p>5d5ef6be-54ff-11ed-82cf-8f01475e****</p>
         */
        @NameInMap("AliyunMonitorId")
        public String aliyunMonitorId;

        /**
         * <p>The installation result of Cloud Assistant. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: SUCCESS</li>
         * <li><strong>1</strong>: MISSING_PARAM</li>
         * <li><strong>2</strong>: UNKNOWN_SYSTEM</li>
         * <li><strong>3</strong>: DOWNLOAD_FAILED</li>
         * <li><strong>4</strong>: INSTALL_FAILED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssistInstallResult")
        public Integer assistInstallResult;

        /**
         * <p>The status of Cloud Assistant. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: installing</li>
         * <li><strong>1</strong>: installed</li>
         * <li><strong>2</strong>: installation failed</li>
         * <li><strong>3</strong>: installation timed out</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssistInstallStatus")
        public Integer assistInstallStatus;

        /**
         * <p>The installation result of the CloudMonitor agent. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: failed</li>
         * <li><strong>1</strong>: successful</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorInstallResult")
        public Integer monitorInstallResult;

        /**
         * <p>The status of the CloudMonitor agent. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: installation failed</li>
         * <li><strong>1</strong>: installed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorInstallStatus")
        public Integer monitorInstallStatus;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>87f1724d-075e-48d3-95fd-78c2dd36****</p>
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
