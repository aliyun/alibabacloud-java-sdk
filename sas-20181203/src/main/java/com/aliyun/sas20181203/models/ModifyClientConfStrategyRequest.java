// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfStrategyRequest extends TeaModel {
    @NameInMap("Tag")
    public String tag;

    @NameInMap("TagExt")
    public String tagExt;

    @NameInMap("TagValue")
    public String tagValue;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static ModifyClientConfStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientConfStrategyRequest self = new ModifyClientConfStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClientConfStrategyRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ModifyClientConfStrategyRequest setTagExt(String tagExt) {
        this.tagExt = tagExt;
        return this;
    }
    public String getTagExt() {
        return this.tagExt;
    }

    public ModifyClientConfStrategyRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

    public ModifyClientConfStrategyRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public ModifyClientConfStrategyRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
