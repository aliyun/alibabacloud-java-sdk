// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantEncryptionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantEncryptions")
    public java.util.List<DescribeTenantEncryptionResponseBodyTenantEncryptions> tenantEncryptions;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTenantEncryptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantEncryptionResponseBody self = new DescribeTenantEncryptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantEncryptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantEncryptionResponseBody setTenantEncryptions(java.util.List<DescribeTenantEncryptionResponseBodyTenantEncryptions> tenantEncryptions) {
        this.tenantEncryptions = tenantEncryptions;
        return this;
    }
    public java.util.List<DescribeTenantEncryptionResponseBodyTenantEncryptions> getTenantEncryptions() {
        return this.tenantEncryptions;
    }

    public DescribeTenantEncryptionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTenantEncryptionResponseBodyTenantEncryptions extends TeaModel {
        @NameInMap("EnableEncryption")
        public Boolean enableEncryption;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantMode")
        public String tenantMode;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("TenantStatus")
        public String tenantStatus;

        public static DescribeTenantEncryptionResponseBodyTenantEncryptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantEncryptionResponseBodyTenantEncryptions self = new DescribeTenantEncryptionResponseBodyTenantEncryptions();
            return TeaModel.build(map, self);
        }

        public DescribeTenantEncryptionResponseBodyTenantEncryptions setEnableEncryption(Boolean enableEncryption) {
            this.enableEncryption = enableEncryption;
            return this;
        }
        public Boolean getEnableEncryption() {
            return this.enableEncryption;
        }

        public DescribeTenantEncryptionResponseBodyTenantEncryptions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTenantEncryptionResponseBodyTenantEncryptions setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTenantEncryptionResponseBodyTenantEncryptions setTenantMode(String tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public String getTenantMode() {
            return this.tenantMode;
        }

        public DescribeTenantEncryptionResponseBodyTenantEncryptions setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeTenantEncryptionResponseBodyTenantEncryptions setTenantStatus(String tenantStatus) {
            this.tenantStatus = tenantStatus;
            return this;
        }
        public String getTenantStatus() {
            return this.tenantStatus;
        }

    }

}
