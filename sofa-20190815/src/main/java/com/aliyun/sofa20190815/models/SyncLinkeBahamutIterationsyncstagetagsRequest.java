// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutIterationsyncstagetagsRequest extends TeaModel {
    @NameInMap("End")
    public String end;

    @NameInMap("Start")
    public String start;

    @NameInMap("Type")
    public String type;

    @NameInMap("UnitId")
    public String unitId;

    public static SyncLinkeBahamutIterationsyncstagetagsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutIterationsyncstagetagsRequest self = new SyncLinkeBahamutIterationsyncstagetagsRequest();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutIterationsyncstagetagsRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public SyncLinkeBahamutIterationsyncstagetagsRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public SyncLinkeBahamutIterationsyncstagetagsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SyncLinkeBahamutIterationsyncstagetagsRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
