// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceCountsRequest extends TeaModel {
    /**
     * <p>The filter condition.</p>
     */
    @NameInMap("Filter")
    public java.util.List<GetMultiAccountResourceCountsRequestFilter> filter;

    /**
     * <p>The dimension by which resources are queried. Valid values:</p>
     * <ul>
     * <li><p>ResourceType: resource type</p>
     * </li>
     * <li><p>RegionId: region</p>
     * </li>
     * <li><p>ResourceGroupId: resource group</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not configured, the total number of resources that meet the conditions is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ResourceType</p>
     */
    @NameInMap("GroupByKey")
    public String groupByKey;

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

    public static GetMultiAccountResourceCountsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceCountsRequest self = new GetMultiAccountResourceCountsRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceCountsRequest setFilter(java.util.List<GetMultiAccountResourceCountsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<GetMultiAccountResourceCountsRequestFilter> getFilter() {
        return this.filter;
    }

    public GetMultiAccountResourceCountsRequest setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public GetMultiAccountResourceCountsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class GetMultiAccountResourceCountsRequestFilter extends TeaModel {
        /**
         * <p>The key of the filter condition. For more information, see <code>Supported filter parameters</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method.</p>
         * <p>Set the value to Equals, which indicates an exact match.</p>
         * 
         * <strong>example:</strong>
         * <p>Equals</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The values of the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetMultiAccountResourceCountsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountResourceCountsRequestFilter self = new GetMultiAccountResourceCountsRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountResourceCountsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMultiAccountResourceCountsRequestFilter setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetMultiAccountResourceCountsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
