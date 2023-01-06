// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyQuotaTemplateServiceStatusResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The status of the quota template.
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
        // The ID of the resource directory.
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        // The status of the quota template. Valid values:
        // 
        // *   \-1: disabled
        // *   1: enabled
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
