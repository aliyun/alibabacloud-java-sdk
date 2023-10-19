// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class PunishRule extends TeaModel {
    @NameInMap("action_code")
    public String actionCode;

    @NameInMap("ends_at")
    public String endsAt;

    @NameInMap("impermanent")
    public Boolean impermanent;

    @NameInMap("starts_at")
    public String startsAt;

    public static PunishRule build(java.util.Map<String, ?> map) throws Exception {
        PunishRule self = new PunishRule();
        return TeaModel.build(map, self);
    }

    public PunishRule setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public PunishRule setEndsAt(String endsAt) {
        this.endsAt = endsAt;
        return this;
    }
    public String getEndsAt() {
        return this.endsAt;
    }

    public PunishRule setImpermanent(Boolean impermanent) {
        this.impermanent = impermanent;
        return this;
    }
    public Boolean getImpermanent() {
        return this.impermanent;
    }

    public PunishRule setStartsAt(String startsAt) {
        this.startsAt = startsAt;
        return this;
    }
    public String getStartsAt() {
        return this.startsAt;
    }

}
