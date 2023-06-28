// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Acls")
    public DescribeAccessControlListsResponseBodyAcls acls;

    /**
     * <p>The list of network ACLs.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The name of the network ACL.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of the returned page. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccessControlListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListsResponseBody self = new DescribeAccessControlListsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListsResponseBody setAcls(DescribeAccessControlListsResponseBodyAcls acls) {
        this.acls = acls;
        return this;
    }
    public DescribeAccessControlListsResponseBodyAcls getAcls() {
        return this.acls;
    }

    public DescribeAccessControlListsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeAccessControlListsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessControlListsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessControlListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessControlListsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccessControlListsResponseBodyAclsAclTagsTag extends TeaModel {
        public static DescribeAccessControlListsResponseBodyAclsAclTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListsResponseBodyAclsAclTagsTag self = new DescribeAccessControlListsResponseBodyAclsAclTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAccessControlListsResponseBodyAclsAclTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeAccessControlListsResponseBodyAclsAclTagsTag> tag;

        public static DescribeAccessControlListsResponseBodyAclsAclTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListsResponseBodyAclsAclTags self = new DescribeAccessControlListsResponseBodyAclsAclTags();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListsResponseBodyAclsAclTags setTag(java.util.List<DescribeAccessControlListsResponseBodyAclsAclTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeAccessControlListsResponseBodyAclsAclTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeAccessControlListsResponseBodyAclsAcl extends TeaModel {
        /**
         * <p>The ID of the resource group to which the CLB instance belongs.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        @NameInMap("AclName")
        public String aclName;

        /**
         * <p>The number of network ACLs on the current page.</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeAccessControlListsResponseBodyAclsAclTags tags;

        public static DescribeAccessControlListsResponseBodyAclsAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListsResponseBodyAclsAcl self = new DescribeAccessControlListsResponseBodyAclsAcl();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setAclName(String aclName) {
            this.aclName = aclName;
            return this;
        }
        public String getAclName() {
            return this.aclName;
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setTags(DescribeAccessControlListsResponseBodyAclsAclTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeAccessControlListsResponseBodyAclsAclTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeAccessControlListsResponseBodyAcls extends TeaModel {
        @NameInMap("Acl")
        public java.util.List<DescribeAccessControlListsResponseBodyAclsAcl> acl;

        public static DescribeAccessControlListsResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListsResponseBodyAcls self = new DescribeAccessControlListsResponseBodyAcls();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListsResponseBodyAcls setAcl(java.util.List<DescribeAccessControlListsResponseBodyAclsAcl> acl) {
            this.acl = acl;
            return this;
        }
        public java.util.List<DescribeAccessControlListsResponseBodyAclsAcl> getAcl() {
            return this.acl;
        }

    }

}
