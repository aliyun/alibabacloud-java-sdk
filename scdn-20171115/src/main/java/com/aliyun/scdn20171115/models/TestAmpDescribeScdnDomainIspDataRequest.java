// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class TestAmpDescribeScdnDomainIspDataRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    public static TestAmpDescribeScdnDomainIspDataRequest build(java.util.Map<String, ?> map) throws Exception {
        TestAmpDescribeScdnDomainIspDataRequest self = new TestAmpDescribeScdnDomainIspDataRequest();
        return TeaModel.build(map, self);
    }

    public TestAmpDescribeScdnDomainIspDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public TestAmpDescribeScdnDomainIspDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TestAmpDescribeScdnDomainIspDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
