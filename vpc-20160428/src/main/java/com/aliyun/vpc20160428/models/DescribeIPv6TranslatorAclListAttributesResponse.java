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

    }

    public static class DescribeIPv6TranslatorAclListAttributesResponseAclEntries extends TeaModel {
        @NameInMap("AclEntry")
        @Validation(required = true)
        public java.util.List<DescribeIPv6TranslatorAclListAttributesResponseAclEntriesAclEntry> aclEntry;

        public static DescribeIPv6TranslatorAclListAttributesResponseAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListAttributesResponseAclEntries self = new DescribeIPv6TranslatorAclListAttributesResponseAclEntries();
            return TeaModel.build(map, self);
        }

    }

}
