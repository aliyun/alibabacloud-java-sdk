// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("PeerCity")
    public String peerCity;

    @NameInMap("PeerLocation")
    @Validation(required = true)
    public String peerLocation;

    @NameInMap("IdcSP")
    @Validation(required = true)
    public String idcSP;

    @NameInMap("PortType")
    public String portType;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public Integer bandwidth;

    @NameInMap("ContactTel")
    public String contactTel;

    @NameInMap("ContactMail")
    public String contactMail;

    @NameInMap("IDCardNo")
    public String IDCardNo;

    @NameInMap("RedundantEccId")
    public String redundantEccId;

    public static CreateExpressCloudConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressCloudConnectionRequest self = new CreateExpressCloudConnectionRequest();
        return TeaModel.build(map, self);
    }

}
