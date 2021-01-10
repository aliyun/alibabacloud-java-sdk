// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutIterationattachtoreleaseRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("OverdueFastDev")
    public Boolean overdueFastDev;

    @NameInMap("OverdueMes")
    public String overdueMes;

    @NameInMap("OverdueReason")
    public String overdueReason;

    @NameInMap("ReleaseId")
    public String releaseId;

    public static ReleaseLinkeBahamutIterationattachtoreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutIterationattachtoreleaseRequest self = new ReleaseLinkeBahamutIterationattachtoreleaseRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutIterationattachtoreleaseRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public ReleaseLinkeBahamutIterationattachtoreleaseRequest setOverdueFastDev(Boolean overdueFastDev) {
        this.overdueFastDev = overdueFastDev;
        return this;
    }
    public Boolean getOverdueFastDev() {
        return this.overdueFastDev;
    }

    public ReleaseLinkeBahamutIterationattachtoreleaseRequest setOverdueMes(String overdueMes) {
        this.overdueMes = overdueMes;
        return this;
    }
    public String getOverdueMes() {
        return this.overdueMes;
    }

    public ReleaseLinkeBahamutIterationattachtoreleaseRequest setOverdueReason(String overdueReason) {
        this.overdueReason = overdueReason;
        return this;
    }
    public String getOverdueReason() {
        return this.overdueReason;
    }

    public ReleaseLinkeBahamutIterationattachtoreleaseRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
