// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDDoSTrafficInfoRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Line")
    public String line;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeScdnDDoSTrafficInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDDoSTrafficInfoRequest self = new DescribeScdnDDoSTrafficInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDDoSTrafficInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDDoSTrafficInfoRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public DescribeScdnDDoSTrafficInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScdnDDoSTrafficInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
