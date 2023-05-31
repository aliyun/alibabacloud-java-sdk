// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfStrategyRequest extends TeaModel {
    /**
     * <p>The key of the tag that is added to the agent configuration policy.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The extended tag of the agent configuration policy.</p>
     */
    @NameInMap("TagExt")
    public String tagExt;

    /**
     * <p>The value of the tag that is added to the agent configuration policy.</p>
     * <br>
     * <p>*   major</p>
     * <p>*   advanced</p>
     * <p>*   basic</p>
     */
    @NameInMap("TagValue")
    public String tagValue;

    /**
     * <p>The UUID of the server that you want to query.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The UUID of the asset. You can specify a maximum of 500 UUIDs at a time.</p>
     */
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
