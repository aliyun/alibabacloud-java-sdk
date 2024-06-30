// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaTemplateServiceStatusResponseBody extends TeaModel {
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
    public GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus templateServiceStatus;

    public static GetQuotaTemplateServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaTemplateServiceStatusResponseBody self = new GetQuotaTemplateServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaTemplateServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaTemplateServiceStatusResponseBody setTemplateServiceStatus(GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus templateServiceStatus) {
        this.templateServiceStatus = templateServiceStatus;
        return this;
    }
    public GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus getTemplateServiceStatus() {
        return this.templateServiceStatus;
    }

    public static class GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus extends TeaModel {
        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-pG****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The state of the quota template. Valid values:</p>
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

        public static GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus self = new GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus();
            return TeaModel.build(map, self);
        }

        public GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public GetQuotaTemplateServiceStatusResponseBodyTemplateServiceStatus setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

    }

}
