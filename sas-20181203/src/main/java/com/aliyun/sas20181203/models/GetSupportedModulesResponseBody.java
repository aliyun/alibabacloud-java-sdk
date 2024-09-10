// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSupportedModulesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The supported modules. The module information is classified by cloud service provider.</p>
     */
    @NameInMap("SupportedModuleResponse")
    public java.util.List<GetSupportedModulesResponseBodySupportedModuleResponse> supportedModuleResponse;

    public static GetSupportedModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupportedModulesResponseBody self = new GetSupportedModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupportedModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupportedModulesResponseBody setSupportedModuleResponse(java.util.List<GetSupportedModulesResponseBodySupportedModuleResponse> supportedModuleResponse) {
        this.supportedModuleResponse = supportedModuleResponse;
        return this;
    }
    public java.util.List<GetSupportedModulesResponseBodySupportedModuleResponse> getSupportedModuleResponse() {
        return this.supportedModuleResponse;
    }

    public static class GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules extends TeaModel {
        /**
         * <p>The code of the module. Valid values:</p>
         * <ul>
         * <li><strong>HOST</strong>: host</li>
         * <li><strong>CSPM</strong>: configuration assessment</li>
         * <li><strong>SIEM</strong>: CloudSiem</li>
         * <li><strong>TRIAL</strong>: log audit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOST</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The display name of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Configuration assessment</p>
         */
        @NameInMap("ModuleDisp")
        public String moduleDisp;

        public static GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules build(java.util.Map<String, ?> map) throws Exception {
            GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules self = new GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules();
            return TeaModel.build(map, self);
        }

        public GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules setModuleDisp(String moduleDisp) {
            this.moduleDisp = moduleDisp;
            return this;
        }
        public String getModuleDisp() {
            return this.moduleDisp;
        }

    }

    public static class GetSupportedModulesResponseBodySupportedModuleResponse extends TeaModel {
        /**
         * <p>The modules supported by the cloud service provider.</p>
         */
        @NameInMap("SupportedModules")
        public java.util.List<GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules> supportedModules;

        /**
         * <p>The cloud service provider. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>HUAWEICLOUD</strong>:Huawei Cloud</li>
         * <li><strong>Azure</strong>: Microsoft Azure</li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static GetSupportedModulesResponseBodySupportedModuleResponse build(java.util.Map<String, ?> map) throws Exception {
            GetSupportedModulesResponseBodySupportedModuleResponse self = new GetSupportedModulesResponseBodySupportedModuleResponse();
            return TeaModel.build(map, self);
        }

        public GetSupportedModulesResponseBodySupportedModuleResponse setSupportedModules(java.util.List<GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules> supportedModules) {
            this.supportedModules = supportedModules;
            return this;
        }
        public java.util.List<GetSupportedModulesResponseBodySupportedModuleResponseSupportedModules> getSupportedModules() {
            return this.supportedModules;
        }

        public GetSupportedModulesResponseBodySupportedModuleResponse setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
