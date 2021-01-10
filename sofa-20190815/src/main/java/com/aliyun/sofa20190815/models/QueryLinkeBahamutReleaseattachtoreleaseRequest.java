// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleaseattachtoreleaseRequest extends TeaModel {
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

    public static QueryLinkeBahamutReleaseattachtoreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleaseattachtoreleaseRequest self = new QueryLinkeBahamutReleaseattachtoreleaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleaseattachtoreleaseRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkeBahamutReleaseattachtoreleaseRequest setOverdueFastDev(Boolean overdueFastDev) {
        this.overdueFastDev = overdueFastDev;
        return this;
    }
    public Boolean getOverdueFastDev() {
        return this.overdueFastDev;
    }

    public QueryLinkeBahamutReleaseattachtoreleaseRequest setOverdueMes(String overdueMes) {
        this.overdueMes = overdueMes;
        return this;
    }
    public String getOverdueMes() {
        return this.overdueMes;
    }

    public QueryLinkeBahamutReleaseattachtoreleaseRequest setOverdueReason(String overdueReason) {
        this.overdueReason = overdueReason;
        return this;
    }
    public String getOverdueReason() {
        return this.overdueReason;
    }

    public QueryLinkeBahamutReleaseattachtoreleaseRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
