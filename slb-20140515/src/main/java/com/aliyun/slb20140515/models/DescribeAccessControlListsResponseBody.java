// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListsResponseBody extends TeaModel {
    /**
     * <p>A list of ACLs.</p>
     */
    @NameInMap("Acls")
    public DescribeAccessControlListsResponseBodyAcls acls;

    /**
     * <p>The number of ACLs on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The number of the returned page. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of ACLs.</p>
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeAccessControlListsResponseBodyAclsAclTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListsResponseBodyAclsAclTagsTag self = new DescribeAccessControlListsResponseBodyAclsAclTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListsResponseBodyAclsAclTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAccessControlListsResponseBodyAclsAclTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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
         * <p>The ACL ID.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The ACL name.</p>
         */
        @NameInMap("AclName")
        public String aclName;

        /**
         * <p>The IP version that is used by the CLB instance associated with the ACL.</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        /**
         * <p>The time when the CLB instance was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The list of tags added to the network ACL. The value of this parameter must be a STRING list in the JSON format.</p>
         */
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
