// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetVodDomainCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("SSLProtocol")
    @Validation(required = true)
    public String SSLProtocol;

    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SSLPri")
    public String SSLPri;

    @NameInMap("Region")
    public String region;

    public static SetVodDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainCertificateRequest self = new SetVodDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

}
