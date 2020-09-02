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

    public DescribeIPv6TranslatorAclListsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPv6TranslatorAclListsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIPv6TranslatorAclListsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorAclListsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorAclListsResponse setIpv6TranslatorAcls(DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAcls ipv6TranslatorAcls) {
        this.ipv6TranslatorAcls = ipv6TranslatorAcls;
        return this;
    }
    public DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAcls getIpv6TranslatorAcls() {
        return this.ipv6TranslatorAcls;
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

        public DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl setAclName(String aclName) {
            this.aclName = aclName;
            return this;
        }
        public String getAclName() {
            return this.aclName;
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

        public DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAcls setIPv6TranslatorAcl(java.util.List<DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl> IPv6TranslatorAcl) {
            this.IPv6TranslatorAcl = IPv6TranslatorAcl;
            return this;
        }
        public java.util.List<DescribeIPv6TranslatorAclListsResponseIpv6TranslatorAclsIPv6TranslatorAcl> getIPv6TranslatorAcl() {
            return this.IPv6TranslatorAcl;
        }

    }

}
