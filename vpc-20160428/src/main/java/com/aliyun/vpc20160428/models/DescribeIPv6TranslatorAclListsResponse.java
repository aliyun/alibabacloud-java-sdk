// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Ipv6TranslatorAcls")
    @Validation(required = true)
    public DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAcls ipv6TranslatorAcls;

    public static DescribeIPv6TranslatorAclListsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorAclListsResponse self = new DescribeIPv6TranslatorAclListsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl extends TeaModel {
        @NameInMap("AclId")
        @Validation(required = true)
        public String aclId;

        @NameInMap("AclName")
        @Validation(required = true)
        public String aclName;

        public static DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl self = new DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAcls extends TeaModel {
        @NameInMap("IPv6TranslatorAcl")
        @Validation(required = true)
        public java.util.List<DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl> IPv6TranslatorAcl;

        public static DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAcls self = new DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAcls();
            return TeaModel.build(map, self);
        }

    }

}
