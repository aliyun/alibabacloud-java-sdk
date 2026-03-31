// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeResultResponseBody extends TeaModel {
    @NameInMap("ModuleDetails")
    public java.util.List<DescribeChargeResultResponseBodyModuleDetails> moduleDetails;

    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("TotalSeCu")
    public Double totalSeCu;

    public static DescribeChargeResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChargeResultResponseBody self = new DescribeChargeResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChargeResultResponseBody setModuleDetails(java.util.List<DescribeChargeResultResponseBodyModuleDetails> moduleDetails) {
        this.moduleDetails = moduleDetails;
        return this;
    }
    public java.util.List<DescribeChargeResultResponseBodyModuleDetails> getModuleDetails() {
        return this.moduleDetails;
    }

    public DescribeChargeResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChargeResultResponseBody setTotalSeCu(Double totalSeCu) {
        this.totalSeCu = totalSeCu;
        return this;
    }
    public Double getTotalSeCu() {
        return this.totalSeCu;
    }

    public static class DescribeChargeResultResponseBodyModuleDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>domainCount</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("SeCu")
        public Double seCu;

        public static DescribeChargeResultResponseBodyModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeChargeResultResponseBodyModuleDetails self = new DescribeChargeResultResponseBodyModuleDetails();
            return TeaModel.build(map, self);
        }

        public DescribeChargeResultResponseBodyModuleDetails setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeChargeResultResponseBodyModuleDetails setSeCu(Double seCu) {
            this.seCu = seCu;
            return this;
        }
        public Double getSeCu() {
            return this.seCu;
        }

    }

}
