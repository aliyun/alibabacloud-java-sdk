// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6TranslatorEntryId")
    @Validation(required = true)
    public String ipv6TranslatorEntryId;

    @NameInMap("EntryName")
    public String entryName;

    @NameInMap("EntryDescription")
    public String entryDescription;

    @NameInMap("AllocateIpv6Port")
    public Integer allocateIpv6Port;

    @NameInMap("BackendIpv4Addr")
    public String backendIpv4Addr;

    @NameInMap("BackendIpv4Port")
    public Integer backendIpv4Port;

    @NameInMap("TransProtocol")
    public String transProtocol;

    @NameInMap("EntryBandwidth")
    public Integer entryBandwidth;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("AclId")
    public String aclId;

    public static ModifyIPv6TranslatorEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorEntryRequest self = new ModifyIPv6TranslatorEntryRequest();
        return TeaModel.build(map, self);
    }

}
