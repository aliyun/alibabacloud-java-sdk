// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateDhcpOptionsSetAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    @NameInMap("DomainNameServers")
    public String domainNameServers;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static UpdateDhcpOptionsSetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDhcpOptionsSetAttributeRequest self = new UpdateDhcpOptionsSetAttributeRequest();
        return TeaModel.build(map, self);
    }

}
