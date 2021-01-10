// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationIdsRepeatList")
    public java.util.List<String> iterationIdsRepeatList;

    @NameInMap("OverdueFastDev")
    public Boolean overdueFastDev;

    @NameInMap("OverdueMes")
    public String overdueMes;

    @NameInMap("OverdueReason")
    public String overdueReason;

    @NameInMap("ReleaseId")
    public String releaseId;

    public static ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest self = new ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest setIterationIdsRepeatList(java.util.List<String> iterationIdsRepeatList) {
        this.iterationIdsRepeatList = iterationIdsRepeatList;
        return this;
    }
    public java.util.List<String> getIterationIdsRepeatList() {
        return this.iterationIdsRepeatList;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest setOverdueFastDev(Boolean overdueFastDev) {
        this.overdueFastDev = overdueFastDev;
        return this;
    }
    public Boolean getOverdueFastDev() {
        return this.overdueFastDev;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest setOverdueMes(String overdueMes) {
        this.overdueMes = overdueMes;
        return this;
    }
    public String getOverdueMes() {
        return this.overdueMes;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest setOverdueReason(String overdueReason) {
        this.overdueReason = overdueReason;
        return this;
    }
    public String getOverdueReason() {
        return this.overdueReason;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
