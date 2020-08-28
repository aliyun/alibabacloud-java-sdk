// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorEntriesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    @NameInMap("Ipv6TranslatorEntryId")
    public String ipv6TranslatorEntryId;

    @NameInMap("EntryName")
    public String entryName;

    @NameInMap("AllocateIpv6Addr")
    public String allocateIpv6Addr;

    @NameInMap("AllocateIpv6Port")
    public Integer allocateIpv6Port;

    @NameInMap("BackendIpv4Addr")
    public String backendIpv4Addr;

    @NameInMap("BackendIpv4Port")
    public Integer backendIpv4Port;

    @NameInMap("TransProtocol")
    public String transProtocol;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeIPv6TranslatorEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorEntriesRequest self = new DescribeIPv6TranslatorEntriesRequest();
        return TeaModel.build(map, self);
    }

}
