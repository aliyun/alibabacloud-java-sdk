// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListsResponseBody extends TeaModel {
    /**
     * <p>The list of network ACLs.</p>
     */
    @NameInMap("Ipv6TranslatorAcls")
    public DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAcls ipv6TranslatorAcls;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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

    public static DescribeIPv6TranslatorAclListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorAclListsResponseBody self = new DescribeIPv6TranslatorAclListsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorAclListsResponseBody setIpv6TranslatorAcls(DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAcls ipv6TranslatorAcls) {
        this.ipv6TranslatorAcls = ipv6TranslatorAcls;
        return this;
    }
    public DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAcls getIpv6TranslatorAcls() {
        return this.ipv6TranslatorAcls;
    }

    public DescribeIPv6TranslatorAclListsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorAclListsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorAclListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPv6TranslatorAclListsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl extends TeaModel {
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

        public static DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl self = new DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl setAclName(String aclName) {
            this.aclName = aclName;
            return this;
        }
        public String getAclName() {
            return this.aclName;
        }

    }

    public static class DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAcls extends TeaModel {
        @NameInMap("IPv6TranslatorAcl")
        public java.util.List<DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl> IPv6TranslatorAcl;

        public static DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAcls self = new DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAcls();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAcls setIPv6TranslatorAcl(java.util.List<DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl> IPv6TranslatorAcl) {
            this.IPv6TranslatorAcl = IPv6TranslatorAcl;
            return this;
        }
        public java.util.List<DescribeIPv6TranslatorAclListsResponseBodyIpv6TranslatorAclsIPv6TranslatorAcl> getIPv6TranslatorAcl() {
            return this.IPv6TranslatorAcl;
        }

    }

}
