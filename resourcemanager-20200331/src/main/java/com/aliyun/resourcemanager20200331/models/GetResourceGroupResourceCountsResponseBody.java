// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupResourceCountsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The numbers of the resources.</p>
     */
    @NameInMap("ResourceCounts")
    public java.util.List<GetResourceGroupResourceCountsResponseBodyResourceCounts> resourceCounts;

    public static GetResourceGroupResourceCountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupResourceCountsResponseBody self = new GetResourceGroupResourceCountsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupResourceCountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupResourceCountsResponseBody setResourceCounts(java.util.List<GetResourceGroupResourceCountsResponseBodyResourceCounts> resourceCounts) {
        this.resourceCounts = resourceCounts;
        return this;
    }
    public java.util.List<GetResourceGroupResourceCountsResponseBodyResourceCounts> getResourceCounts() {
        return this.resourceCounts;
    }

    public static class GetResourceGroupResourceCountsResponseBodyResourceCounts extends TeaModel {
        /**
         * <p>The number of the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The dimension by which resources are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceGroupId</p>
         */
        @NameInMap("GroupByKey")
        public String groupByKey;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-9gLOoK****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetResourceGroupResourceCountsResponseBodyResourceCounts build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResourceCountsResponseBodyResourceCounts self = new GetResourceGroupResourceCountsResponseBodyResourceCounts();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResourceCountsResponseBodyResourceCounts setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetResourceGroupResourceCountsResponseBodyResourceCounts setGroupByKey(String groupByKey) {
            this.groupByKey = groupByKey;
            return this;
        }
        public String getGroupByKey() {
            return this.groupByKey;
        }

        public GetResourceGroupResourceCountsResponseBodyResourceCounts setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
