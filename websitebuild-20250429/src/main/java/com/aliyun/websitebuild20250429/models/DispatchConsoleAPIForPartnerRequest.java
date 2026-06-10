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
     * <p>Set the operation to perform on the alert. Valid values:</p>
     * <ul>
     * <li><strong>deal</strong>: Handle the alert (fencing)</li>
     * <li><strong>ignore</strong>: Ignore</li>
     * <li><strong>mark_mis_info</strong>: Mark as false positive (add to whitelist)</li>
     * <li><strong>rm_mark_mis_info</strong>: Unmark as false positive (remove from whitelist)</li>
     * <li><strong>offline_handled</strong>: Mark as Completed</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>Error parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;\&quot;]</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>Product code</p>
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
