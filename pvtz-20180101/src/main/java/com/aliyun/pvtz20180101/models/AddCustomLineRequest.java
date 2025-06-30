// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddCustomLineRequest extends TeaModel {
    /**
     * <p>This parameter is not available. You can ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>INTRANET</p>
     */
    @NameInMap("DnsCategory")
    public String dnsCategory;

    /**
     * <p>The IPv4 CIDR blocks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ipv4s")
    public java.util.List<String> ipv4s;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the custom line.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is not available. You can ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL</p>
     */
    @NameInMap("ShareScope")
    public String shareScope;

    public static AddCustomLineRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineRequest self = new AddCustomLineRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomLineRequest setDnsCategory(String dnsCategory) {
        this.dnsCategory = dnsCategory;
        return this;
    }
    public String getDnsCategory() {
        return this.dnsCategory;
    }

    public AddCustomLineRequest setIpv4s(java.util.List<String> ipv4s) {
        this.ipv4s = ipv4s;
        return this;
    }
    public java.util.List<String> getIpv4s() {
        return this.ipv4s;
    }

    public AddCustomLineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddCustomLineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddCustomLineRequest setShareScope(String shareScope) {
        this.shareScope = shareScope;
        return this;
    }
    public String getShareScope() {
        return this.shareScope;
    }

}
