// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectDashboardResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetFileProtectDashboardResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileProtectDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectDashboardResponseBody self = new GetFileProtectDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileProtectDashboardResponseBody setData(GetFileProtectDashboardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileProtectDashboardResponseBodyData getData() {
        return this.data;
    }

    public GetFileProtectDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileProtectDashboardResponseBodyData extends TeaModel {
        /**
         * <p>The total number of enabled rules.</p>
         */
        @NameInMap("EnableRuleCount")
        public Integer enableRuleCount;

        /**
         * <p>The total number of servers on which the Security Center agent is installed.</p>
         */
        @NameInMap("PluginCount")
        public Integer pluginCount;

        /**
         * <p>The total number of servers on which the Security Center agent is offline.</p>
         */
        @NameInMap("PluginOfflineCount")
        public Integer pluginOfflineCount;

        /**
         * <p>The total number of servers on which the Security Center agent is online.</p>
         */
        @NameInMap("PluginOnlineCount")
        public Integer pluginOnlineCount;

        public static GetFileProtectDashboardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectDashboardResponseBodyData self = new GetFileProtectDashboardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileProtectDashboardResponseBodyData setEnableRuleCount(Integer enableRuleCount) {
            this.enableRuleCount = enableRuleCount;
            return this;
        }
        public Integer getEnableRuleCount() {
            return this.enableRuleCount;
        }

        public GetFileProtectDashboardResponseBodyData setPluginCount(Integer pluginCount) {
            this.pluginCount = pluginCount;
            return this;
        }
        public Integer getPluginCount() {
            return this.pluginCount;
        }

        public GetFileProtectDashboardResponseBodyData setPluginOfflineCount(Integer pluginOfflineCount) {
            this.pluginOfflineCount = pluginOfflineCount;
            return this;
        }
        public Integer getPluginOfflineCount() {
            return this.pluginOfflineCount;
        }

        public GetFileProtectDashboardResponseBodyData setPluginOnlineCount(Integer pluginOnlineCount) {
            this.pluginOnlineCount = pluginOnlineCount;
            return this;
        }
        public Integer getPluginOnlineCount() {
            return this.pluginOnlineCount;
        }

    }

}
