// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListAttributesResponseBody extends TeaModel {
    /**
     * <p>The ACLs.</p>
     */
    @NameInMap("AclEntries")
    public DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntries aclEntries;

    /**
     * <p>The ACL ID.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The name of the ACL.</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeIPv6TranslatorAclListAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorAclListAttributesResponseBody self = new DescribeIPv6TranslatorAclListAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorAclListAttributesResponseBody setAclEntries(DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntries aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntries getAclEntries() {
        return this.aclEntries;
    }

    public DescribeIPv6TranslatorAclListAttributesResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeIPv6TranslatorAclListAttributesResponseBody setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public DescribeIPv6TranslatorAclListAttributesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorAclListAttributesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorAclListAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPv6TranslatorAclListAttributesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry extends TeaModel {
        /**
         * <p>The remarks of the ACL entry.</p>
         */
        @NameInMap("AclEntryComment")
        public String aclEntryComment;

        /**
         * <p>The ID of the ACL entry.</p>
         */
        @NameInMap("AclEntryId")
        public String aclEntryId;

        /**
         * <p>The IP address specified in the ACL entry.</p>
         */
        @NameInMap("AclEntryIp")
        public String aclEntryIp;

        public static DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry self = new DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry setAclEntryComment(String aclEntryComment) {
            this.aclEntryComment = aclEntryComment;
            return this;
        }
        public String getAclEntryComment() {
            return this.aclEntryComment;
        }

        public DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry setAclEntryId(String aclEntryId) {
            this.aclEntryId = aclEntryId;
            return this;
        }
        public String getAclEntryId() {
            return this.aclEntryId;
        }

        public DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry setAclEntryIp(String aclEntryIp) {
            this.aclEntryIp = aclEntryIp;
            return this;
        }
        public String getAclEntryIp() {
            return this.aclEntryIp;
        }

    }

    public static class DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntries extends TeaModel {
        @NameInMap("AclEntry")
        public java.util.List<DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry> aclEntry;

        public static DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntries self = new DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntries setAclEntry(java.util.List<DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry> aclEntry) {
            this.aclEntry = aclEntry;
            return this;
        }
        public java.util.List<DescribeIPv6TranslatorAclListAttributesResponseBodyAclEntriesAclEntry> getAclEntry() {
            return this.aclEntry;
        }

    }

}
