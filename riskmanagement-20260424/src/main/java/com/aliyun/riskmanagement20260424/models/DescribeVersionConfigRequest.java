// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SdkRequest")
    public DescribeVersionConfigRequestSdkRequest sdkRequest;

    public static DescribeVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigRequest self = new DescribeVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVersionConfigRequest setSdkRequest(DescribeVersionConfigRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public DescribeVersionConfigRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class DescribeVersionConfigRequestSdkRequest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5815612291408486</p>
         */
        @NameInMap("ResourceDirectoryAccountId")
        public Long resourceDirectoryAccountId;

        /**
         * <strong>example:</strong>
         * <p>2409:8a55:3827:cb50:5ad9:d5ff:fe87:f48c</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        public static DescribeVersionConfigRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionConfigRequestSdkRequest self = new DescribeVersionConfigRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public DescribeVersionConfigRequestSdkRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }
        public Long getResourceDirectoryAccountId() {
            return this.resourceDirectoryAccountId;
        }

        public DescribeVersionConfigRequestSdkRequest setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

    }

}
