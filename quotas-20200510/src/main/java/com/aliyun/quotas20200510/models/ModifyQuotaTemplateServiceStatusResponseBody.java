// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyQuotaTemplateServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D47B3A10-CDAC-5412-B2EE-EC9A3DBE9053</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the quota template.</p>
     */
    @NameInMap("TemplateServiceStatus")
    public ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus templateServiceStatus;

    public static ModifyQuotaTemplateServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyQuotaTemplateServiceStatusResponseBody self = new ModifyQuotaTemplateServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyQuotaTemplateServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyQuotaTemplateServiceStatusResponseBody setTemplateServiceStatus(ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus templateServiceStatus) {
        this.templateServiceStatus = templateServiceStatus;
        return this;
    }
    public ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus getTemplateServiceStatus() {
        return this.templateServiceStatus;
    }

    public static class ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus extends TeaModel {
        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-pG****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the quota template. Valid values:</p>
         * <ul>
         * <li>\-1: The quota template is disabled.</li>
         * <li>1: The quota template is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        public static ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus build(java.util.Map<String, ?> map) throws Exception {
            ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus self = new ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus();
            return TeaModel.build(map, self);
        }

        public ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ModifyQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

    }

}
