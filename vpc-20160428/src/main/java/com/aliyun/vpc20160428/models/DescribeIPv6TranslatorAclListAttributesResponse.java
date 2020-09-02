// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    @NameInMap("AclName")
    @Validation(required = true)
    public String aclName;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("AclEntries")
    @Validation(required = true)
    public DescribeIPv6TranslatorAclListAttributesResponseAclEntries aclEntries;

    public static DescribeIPv6TranslatorAclListAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorAclListAttributesResponse self = new DescribeIPv6TranslatorAclListAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setAclEntries(DescribeIPv6TranslatorAclListAttributesResponseAclEntries aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public DescribeIPv6TranslatorAclListAttributesResponseAclEntries getAclEntries() {
        return this.aclEntries;
    }

    public static class DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry extends TeaModel {
        @NameInMap("AclEntryId")
        @Validation(required = true)
        public String aclEntryId;

        @NameInMap("AclEntryIp")
        @Validation(required = true)
        public String aclEntryIp;

        @NameInMap("AclEntryComment")
        @Validation(required = true)
        public String aclEntryComment;

        public static DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry self = new DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry setAclEntryId(String aclEntryId) {
            this.aclEntryId = aclEntryId;
            return this;
        }
        public String getAclEntryId() {
            return this.aclEntryId;
        }

        public DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry setAclEntryIp(String aclEntryIp) {
            this.aclEntryIp = aclEntryIp;
            return this;
        }
        public String getAclEntryIp() {
            return this.aclEntryIp;
        }

        public DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry setAclEntryComment(String aclEntryComment) {
            this.aclEntryComment = aclEntryComment;
            return this;
        }
        public String getAclEntryComment() {
            return this.aclEntryComment;
        }

    }

    public static class DescribeIPv6TranslatorAclListAttributesResponseAclEntries extends TeaModel {
        @NameInMap("AclEntry")
        @Validation(required = true)
        public java.util.List<DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry> aclEntry;

        public static DescribeIPv6TranslatorAclListAttributesResponseAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListAttributesResponseAclEntries self = new DescribeIPv6TranslatorAclListAttributesResponseAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorAclListAttributesResponseAclEntries setAclEntry(java.util.List<DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry> aclEntry) {
            this.aclEntry = aclEntry;
            return this;
        }
        public java.util.List<DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry> getAclEntry() {
            return this.aclEntry;
        }

    }

}
