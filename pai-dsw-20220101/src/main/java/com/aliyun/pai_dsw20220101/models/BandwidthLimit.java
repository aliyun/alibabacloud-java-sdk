// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class BandwidthLimit extends TeaModel {
    @NameInMap("EgressRate")
    public String egressRate;

    @NameInMap("EgressWhitelists")
    public java.util.List<String> egressWhitelists;

    @NameInMap("IngressRate")
    public String ingressRate;

    @NameInMap("IngressWhitelists")
    public java.util.List<String> ingressWhitelists;

    public static BandwidthLimit build(java.util.Map<String, ?> map) throws Exception {
        BandwidthLimit self = new BandwidthLimit();
        return TeaModel.build(map, self);
    }

    public BandwidthLimit setEgressRate(String egressRate) {
        this.egressRate = egressRate;
        return this;
    }
    public String getEgressRate() {
        return this.egressRate;
    }

    public BandwidthLimit setEgressWhitelists(java.util.List<String> egressWhitelists) {
        this.egressWhitelists = egressWhitelists;
        return this;
    }
    public java.util.List<String> getEgressWhitelists() {
        return this.egressWhitelists;
    }

    public BandwidthLimit setIngressRate(String ingressRate) {
        this.ingressRate = ingressRate;
        return this;
    }
    public String getIngressRate() {
        return this.ingressRate;
    }

    public BandwidthLimit setIngressWhitelists(java.util.List<String> ingressWhitelists) {
        this.ingressWhitelists = ingressWhitelists;
        return this;
    }
    public java.util.List<String> getIngressWhitelists() {
        return this.ingressWhitelists;
    }

}
