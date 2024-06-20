// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of protected object groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<DescribeDefenseResourceGroupsResponseBodyGroups> groups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BFEC5C77-049B-5E88-A5B6-CB0C****B66E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceGroupsResponseBody self = new DescribeDefenseResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceGroupsResponseBody setGroups(java.util.List<DescribeDefenseResourceGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeDefenseResourceGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public DescribeDefenseResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseResourceGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDefenseResourceGroupsResponseBodyGroups extends TeaModel {
        /**
         * <p>The description of the protected object group.</p>
         * 
         * <strong>example:</strong>
         * <p>This is test description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the protected object group was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624343180000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The most recent time when the protected object group was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1701656305000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The name of the protected object group.</p>
         * 
         * <strong>example:</strong>
         * <p>apptest</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The names of the protected objects that are added to the protected object group. Separate multiple protected objects with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>example02.aliyun-waf,example01.aliyun-waf</p>
         */
        @NameInMap("ResourceList")
        public String resourceList;

        public static DescribeDefenseResourceGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourceGroupsResponseBodyGroups self = new DescribeDefenseResourceGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourceGroupsResponseBodyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDefenseResourceGroupsResponseBodyGroups setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDefenseResourceGroupsResponseBodyGroups setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseResourceGroupsResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDefenseResourceGroupsResponseBodyGroups setResourceList(String resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public String getResourceList() {
            return this.resourceList;
        }

    }

}
