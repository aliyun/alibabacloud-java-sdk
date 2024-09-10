// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaPluginStatusResponseBody extends TeaModel {
    /**
     * <p>The installation status of the components that are required for clusters protected by proactive defense for containers.</p>
     */
    @NameInMap("InstallStatus")
    public java.util.List<GetOpaPluginStatusResponseBodyInstallStatus> installStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOpaPluginStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpaPluginStatusResponseBody self = new GetOpaPluginStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpaPluginStatusResponseBody setInstallStatus(java.util.List<GetOpaPluginStatusResponseBodyInstallStatus> installStatus) {
        this.installStatus = installStatus;
        return this;
    }
    public java.util.List<GetOpaPluginStatusResponseBodyInstallStatus> getInstallStatus() {
        return this.installStatus;
    }

    public GetOpaPluginStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOpaPluginStatusResponseBodyInstallStatus extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c60b77fe62093480db6164a3c2fa****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Indicates whether the component is installed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InstallStatus")
        public Boolean installStatus;

        public static GetOpaPluginStatusResponseBodyInstallStatus build(java.util.Map<String, ?> map) throws Exception {
            GetOpaPluginStatusResponseBodyInstallStatus self = new GetOpaPluginStatusResponseBodyInstallStatus();
            return TeaModel.build(map, self);
        }

        public GetOpaPluginStatusResponseBodyInstallStatus setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetOpaPluginStatusResponseBodyInstallStatus setInstallStatus(Boolean installStatus) {
            this.installStatus = installStatus;
            return this;
        }
        public Boolean getInstallStatus() {
            return this.installStatus;
        }

    }

}
