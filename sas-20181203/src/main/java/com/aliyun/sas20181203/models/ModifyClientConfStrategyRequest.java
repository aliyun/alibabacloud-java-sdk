// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfStrategyRequest extends TeaModel {
    /**
     * <p>The client configuration tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>machineResource</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The extended tag.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("TagExt")
    public String tagExt;

    /**
     * <p>The client tag value. Valid values:</p>
     * <ul>
     * <li>major</li>
     * <li>advanced</li>
     * <li>basic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("TagValue")
    public String tagValue;

    /**
     * <p>The UUID of the asset to query. You must specify at least one of the Uuid and Uuids parameters. Otherwise, the API returns a 400 error. The Uuid parameter specifies a single asset.</p>
     * 
     * <strong>example:</strong>
     * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The UUIDs of asset instances. A maximum of 500 UUIDs can be specified at a time. You must specify at least one of the Uuids and Uuid parameters. Otherwise, the API returns a 400 error. The Uuids parameter specifies multiple assets in a batch.</p>
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
