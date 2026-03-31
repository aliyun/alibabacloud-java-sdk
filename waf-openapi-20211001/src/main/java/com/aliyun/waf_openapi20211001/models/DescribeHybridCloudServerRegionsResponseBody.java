// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudServerRegionsResponseBody extends TeaModel {
    /**
     * <p>The information about the regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<DescribeHybridCloudServerRegionsResponseBodyRegions> regions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FBBDE11-C35F-531B-96BA-64CA****C875</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridCloudServerRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudServerRegionsResponseBody self = new DescribeHybridCloudServerRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudServerRegionsResponseBody setRegions(java.util.List<DescribeHybridCloudServerRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeHybridCloudServerRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public DescribeHybridCloudServerRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHybridCloudServerRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The code of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeHybridCloudServerRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudServerRegionsResponseBodyRegions self = new DescribeHybridCloudServerRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudServerRegionsResponseBodyRegions setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeHybridCloudServerRegionsResponseBodyRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
