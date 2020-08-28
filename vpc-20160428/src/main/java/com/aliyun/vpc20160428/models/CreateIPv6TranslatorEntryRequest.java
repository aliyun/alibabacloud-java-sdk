// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6TranslatorId")
    @Validation(required = true)
    public String ipv6TranslatorId;

    @NameInMap("EntryName")
    public String entryName;

    @NameInMap("EntryDescription")
    public String entryDescription;

    @NameInMap("AllocateIpv6Port")
    @Validation(required = true)
    public Integer allocateIpv6Port;

    @NameInMap("BackendIpv4Addr")
    @Validation(required = true)
    public String backendIpv4Addr;

    @NameInMap("BackendIpv4Port")
    @Validation(required = true)
    public Integer backendIpv4Port;

    @NameInMap("TransProtocol")
    @Validation(required = true)
    public String transProtocol;

    @NameInMap("EntryBandwidth")
    public Integer entryBandwidth;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("AclId")
    public String aclId;

    public static CreateIPv6TranslatorEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorEntryRequest self = new CreateIPv6TranslatorEntryRequest();
        return TeaModel.build(map, self);
    }

}
