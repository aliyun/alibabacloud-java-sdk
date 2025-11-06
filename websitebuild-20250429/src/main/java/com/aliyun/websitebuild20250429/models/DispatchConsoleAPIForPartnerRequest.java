// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DispatchConsoleAPIForPartnerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LiveToken")
    public String liveToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;\&quot;]</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("SiteHost")
    public String siteHost;

    public static DispatchConsoleAPIForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        DispatchConsoleAPIForPartnerRequest self = new DispatchConsoleAPIForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public DispatchConsoleAPIForPartnerRequest setLiveToken(String liveToken) {
        this.liveToken = liveToken;
        return this;
    }
    public String getLiveToken() {
        return this.liveToken;
    }

    public DispatchConsoleAPIForPartnerRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public DispatchConsoleAPIForPartnerRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DispatchConsoleAPIForPartnerRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DispatchConsoleAPIForPartnerRequest setSiteHost(String siteHost) {
        this.siteHost = siteHost;
        return this;
    }
    public String getSiteHost() {
        return this.siteHost;
    }

}
