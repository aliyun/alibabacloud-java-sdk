// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewalRequest extends TeaModel {
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    @NameInMap("AutoRenewalCycUnit")
    public Integer autoRenewalCycUnit;

    @NameInMap("AutoRenewalDuration")
    public Integer autoRenewalDuration;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyInstanceAutoRenewalRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewalRequest self = new ModifyInstanceAutoRenewalRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewalRequest setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public ModifyInstanceAutoRenewalRequest setAutoRenewalCycUnit(Integer autoRenewalCycUnit) {
        this.autoRenewalCycUnit = autoRenewalCycUnit;
        return this;
    }
    public Integer getAutoRenewalCycUnit() {
        return this.autoRenewalCycUnit;
    }

    public ModifyInstanceAutoRenewalRequest setAutoRenewalDuration(Integer autoRenewalDuration) {
        this.autoRenewalDuration = autoRenewalDuration;
        return this;
    }
    public Integer getAutoRenewalDuration() {
        return this.autoRenewalDuration;
    }

    public ModifyInstanceAutoRenewalRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
