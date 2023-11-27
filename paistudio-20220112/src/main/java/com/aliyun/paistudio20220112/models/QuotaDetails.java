// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaDetails extends TeaModel {
    @NameInMap("ActualMinQuota")
    public ResourceAmount actualMinQuota;

    @NameInMap("DesiredMinQuota")
    public ResourceAmount desiredMinQuota;

    @NameInMap("RequestedQuota")
    public ResourceAmount requestedQuota;

    @NameInMap("UsedQuota")
    public ResourceAmount usedQuota;

    public static QuotaDetails build(java.util.Map<String, ?> map) throws Exception {
        QuotaDetails self = new QuotaDetails();
        return TeaModel.build(map, self);
    }

    public QuotaDetails setActualMinQuota(ResourceAmount actualMinQuota) {
        this.actualMinQuota = actualMinQuota;
        return this;
    }
    public ResourceAmount getActualMinQuota() {
        return this.actualMinQuota;
    }

    public QuotaDetails setDesiredMinQuota(ResourceAmount desiredMinQuota) {
        this.desiredMinQuota = desiredMinQuota;
        return this;
    }
    public ResourceAmount getDesiredMinQuota() {
        return this.desiredMinQuota;
    }

    public QuotaDetails setRequestedQuota(ResourceAmount requestedQuota) {
        this.requestedQuota = requestedQuota;
        return this;
    }
    public ResourceAmount getRequestedQuota() {
        return this.requestedQuota;
    }

    public QuotaDetails setUsedQuota(ResourceAmount usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public ResourceAmount getUsedQuota() {
        return this.usedQuota;
    }

}
