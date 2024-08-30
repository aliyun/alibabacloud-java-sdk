// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class WorkloadDetails extends TeaModel {
    @NameInMap("DLC")
    public QuotaJob DLC;

    @NameInMap("DSW")
    public QuotaJob DSW;

    @NameInMap("EAS")
    public QuotaJob EAS;

    @NameInMap("Summary")
    public QuotaJob summary;

    public static WorkloadDetails build(java.util.Map<String, ?> map) throws Exception {
        WorkloadDetails self = new WorkloadDetails();
        return TeaModel.build(map, self);
    }

    public WorkloadDetails setDLC(QuotaJob DLC) {
        this.DLC = DLC;
        return this;
    }
    public QuotaJob getDLC() {
        return this.DLC;
    }

    public WorkloadDetails setDSW(QuotaJob DSW) {
        this.DSW = DSW;
        return this;
    }
    public QuotaJob getDSW() {
        return this.DSW;
    }

    public WorkloadDetails setEAS(QuotaJob EAS) {
        this.EAS = EAS;
        return this;
    }
    public QuotaJob getEAS() {
        return this.EAS;
    }

    public WorkloadDetails setSummary(QuotaJob summary) {
        this.summary = summary;
        return this;
    }
    public QuotaJob getSummary() {
        return this.summary;
    }

}
