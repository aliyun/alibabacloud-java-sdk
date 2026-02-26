// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceCountsResponseBody extends TeaModel {
    /**
     * <p>The filter condition.</p>
     */
    @NameInMap("Filters")
    public java.util.List<GetMultiAccountResourceCountsResponseBodyFilters> filters;

    /**
     * <p>The dimension by which resources are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceType</p>
     */
    @NameInMap("GroupByKey")
    public String groupByKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFA806B9-7F36-55AB-8B7A-D680C2C5EE57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The numbers of resources.</p>
     */
    @NameInMap("ResourceCounts")
    public java.util.List<GetMultiAccountResourceCountsResponseBodyResourceCounts> resourceCounts;

    /**
     * <p>The search scope. Valid values:</p>
     * <ul>
     * <li><p>ID of a resource directory: Resources within the management account and all members of the resource directory are searched.</p>
     * </li>
     * <li><p>ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.</p>
     * </li>
     * <li><p>ID of a folder: Resources within all members in the folder are searched.</p>
     * </li>
     * <li><p>ID of a member: Resources within the member are searched.</p>
     * </li>
     * </ul>
     * <p>For information about how to obtain the ID of a resource directory, the Root folder, a folder, or a member, see <a href="https://help.aliyun.com/document_detail/159995.html">GetResourceDirectory</a>, <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a>, or <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rd-r4****</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static GetMultiAccountResourceCountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceCountsResponseBody self = new GetMultiAccountResourceCountsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceCountsResponseBody setFilters(java.util.List<GetMultiAccountResourceCountsResponseBodyFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<GetMultiAccountResourceCountsResponseBodyFilters> getFilters() {
        return this.filters;
    }

    public GetMultiAccountResourceCountsResponseBody setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public GetMultiAccountResourceCountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiAccountResourceCountsResponseBody setResourceCounts(java.util.List<GetMultiAccountResourceCountsResponseBodyResourceCounts> resourceCounts) {
        this.resourceCounts = resourceCounts;
        return this;
    }
    public java.util.List<GetMultiAccountResourceCountsResponseBodyResourceCounts> getResourceCounts() {
        return this.resourceCounts;
    }

    public GetMultiAccountResourceCountsResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class GetMultiAccountResourceCountsResponseBodyFilters extends TeaModel {
        /**
         * <p>The key of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the filter condition.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetMultiAccountResourceCountsResponseBodyFilters build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountResourceCountsResponseBodyFilters self = new GetMultiAccountResourceCountsResponseBodyFilters();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountResourceCountsResponseBodyFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMultiAccountResourceCountsResponseBodyFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetMultiAccountResourceCountsResponseBodyResourceCounts extends TeaModel {
        /**
         * <p>The number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::NetworkInterface</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static GetMultiAccountResourceCountsResponseBodyResourceCounts build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountResourceCountsResponseBodyResourceCounts self = new GetMultiAccountResourceCountsResponseBodyResourceCounts();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountResourceCountsResponseBodyResourceCounts setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetMultiAccountResourceCountsResponseBodyResourceCounts setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
