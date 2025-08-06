// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CheckLicenseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Nonce")
    public String nonce;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sign")
    public String sign;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Time")
    public String time;

    public static CheckLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLicenseRequest self = new CheckLicenseRequest();
        return TeaModel.build(map, self);
    }

    public CheckLicenseRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CheckLicenseRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public CheckLicenseRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public CheckLicenseRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public CheckLicenseRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
