// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetUserAccessTokenForPartnerRequest extends TeaModel {
    @NameInMap("SiteHost")
    public String siteHost;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2f68fe1e-d9d5-4803-94d0-2fc81032e91d</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static GetUserAccessTokenForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserAccessTokenForPartnerRequest self = new GetUserAccessTokenForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public GetUserAccessTokenForPartnerRequest setSiteHost(String siteHost) {
        this.siteHost = siteHost;
        return this;
    }
    public String getSiteHost() {
        return this.siteHost;
    }

    public GetUserAccessTokenForPartnerRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
